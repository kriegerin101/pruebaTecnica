package controller;

import com.autentia.pruebatecnica.controller.CursoBean;
import com.autentia.pruebatecnica.domain.Curso;
import com.autentia.pruebatecnica.service.CursoService;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class CursoBeanTest {

    private final CursoService cursoService = mock(CursoService.class);
    private final CursoBean sut = new CursoBean();

    @Before
    private void init() {
        sut.setCursoService(cursoService);
    }

    @Test
    public void shouldReturnACourseList(){

        List<Curso> emptyList = Arrays.asList();
        when(cursoService.getCursos()).thenReturn(emptyList);
        sut.setUp();

        List<Curso> expectedCourses = sut.getCursos();

        assertEquals(emptyList, expectedCourses);
    }


    @Test
    public void shouldPassCourseToAddToService(){
        Curso curso = new Curso();
        sut.setCurso(curso);

        sut.insertarCurso();

        verify(cursoService).addCurso(curso);

    }
}
