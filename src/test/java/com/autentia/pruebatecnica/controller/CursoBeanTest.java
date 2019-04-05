package com.autentia.pruebatecnica.controller;

import com.autentia.pruebatecnica.controller.CursoBean;
import com.autentia.pruebatecnica.domain.Curso;
import com.autentia.pruebatecnica.service.CursoService;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import java.util.Arrays;
import java.util.List;

public class CursoBeanTest {

    private final CursoService cursoService = mock(CursoService.class);
    private final CursoBean sut = new CursoBean();

    @Before
    public void init() {
        sut.setCursoService(cursoService);
    }

    @Test
    public void shouldReturnACourseList(){

        List<Curso> emptyList = Arrays.asList(new Curso());
        when(cursoService.getCursos()).thenReturn(emptyList);
        sut.setUp();

        List<Curso> expectedCourses = sut.getCursos();

        assertThat(emptyList, equalTo(expectedCourses));
    }


    @Test
    public void shouldPassCourseToServiceToAdd(){
        Curso curso = new Curso();
        sut.setCurso(curso);

        sut.insertarCurso();

        verify(cursoService).addCurso(curso);

    }
}
