package controller;

import com.autentia.pruebatecnica.controller.ProfesorBean;
import com.autentia.pruebatecnica.domain.Profesor;
import com.autentia.pruebatecnica.service.ProfesorService;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class ProfesorBeanTest {

    private final ProfesorService profesorService = mock(ProfesorService.class);
    private final ProfesorBean sut = new ProfesorBean();

    @Test
    public void shouldReturnATeacherList(){
        sut.setProfesorService(profesorService);

        List<Profesor> emptyList = Arrays.asList();
        when(profesorService.getProfesores()).thenReturn(emptyList);

        List<Profesor> expectedTeachers = sut.getProfesores();

        assertEquals(emptyList, expectedTeachers);
    }
}
