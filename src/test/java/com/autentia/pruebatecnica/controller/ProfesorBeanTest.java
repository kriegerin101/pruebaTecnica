package com.autentia.pruebatecnica.controller;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import com.autentia.pruebatecnica.domain.Profesor;
import com.autentia.pruebatecnica.service.ProfesorService;
import org.junit.Test;
import static org.mockito.Mockito.*;
import java.util.Arrays;
import java.util.List;

public class ProfesorBeanTest {

    private final ProfesorService profesorService = mock(ProfesorService.class);
    private final ProfesorBean sut = new ProfesorBean();

    @Test
    public void shouldReturnATeacherList(){
        sut.setProfesorService(profesorService);

        List<Profesor> emptyList = Arrays.asList(new Profesor());
        when(profesorService.getProfesores()).thenReturn(emptyList);

        List<Profesor> expectedTeachers = sut.getProfesores();

        assertThat(emptyList, equalTo(expectedTeachers));
    }
}
