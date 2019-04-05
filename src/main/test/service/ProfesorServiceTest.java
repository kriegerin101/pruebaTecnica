package service;

import com.autentia.pruebatecnica.controller.ProfesorBean;
import com.autentia.pruebatecnica.domain.Profesor;
import com.autentia.pruebatecnica.service.ProfesorService;
import com.autentia.pruebatecnica.data.ProfesorRepository;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class ProfesorServiceTest {

    private final ProfesorRepository profesorRepository = mock(ProfesorRepository.class);
    private final ProfesorService sut = new ProfesorService();

    @Before
    public void init(){
        sut.setProfesorRepository(profesorRepository);
    }

    @Test
    public void shouldReturnATeachersList(){

        List<Profesor> emptyList = Arrays.asList();
        when(profesorRepository.selectProfesores()).thenReturn(emptyList);

        List<Profesor> expectedCourses = sut.getProfesores();

        assertEquals(emptyList, expectedCourses);

    }

}
