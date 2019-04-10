package com.autentia.pruebatecnica.data;

import com.autentia.pruebatecnica.config.AppConfig;
import com.autentia.pruebatecnica.domain.Profesor;
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
public class ProfesorRepositoryIT {

    @Autowired
    private ProfesorRepository sut;

    @Test
    public void shouldShowTeachers(){

        List<Profesor> teachers = sut.selectProfesores();

        assertThat(teachers.size(), greaterThan(0));

    }


}
