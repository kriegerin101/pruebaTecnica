package com.autentia.pruebatecnica.data;

import com.autentia.pruebatecnica.config.AppConfig;
import com.autentia.pruebatecnica.domain.Curso;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
@TestPropertySource ("classpath:application-test.properties")
@Transactional
public class CursoRepositoryIT {

    @Autowired
    private CursoRepository sut;
    private Curso curso = new Curso();

    @Before
    public void init() {

        curso.setActivo(true);
        curso.setId(58);
        curso.setTitulo("Prueba");
        curso.setNivel("Intermedio");
        curso.setHoras(30);
        curso.setProfesor(88);
    }

    @Test
    public void shouldAddACourse(){

        sut.addCurso(curso);

        List<Curso> actualCourses = sut.selectCursos();

        assertThat(curso, equalTo(actualCourses.get(actualCourses.size()-1)));
    }

    @Test
    public void shouldSelectCourses(){

        sut.addCurso(curso);

        List<Curso> courses = sut.selectCursos();

        assertThat(courses.size(), greaterThan(0));
    }

    @Test
    public void shouldSelectOnlyActiveCourses(){

        curso.setActivo(false);

        sut.addCurso(curso);

        List<Curso> courses = sut.selectCursos();

        assertThat(courses, not(hasItem(curso)));

    }

}
