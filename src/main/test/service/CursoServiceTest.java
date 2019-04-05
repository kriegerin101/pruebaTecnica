package service;

import com.autentia.pruebatecnica.controller.CursoBean;
import com.autentia.pruebatecnica.domain.Curso;
import com.autentia.pruebatecnica.data.CursoRepository;
import com.autentia.pruebatecnica.service.CursoService;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class CursoServiceTest {

    private final CursoRepository cursoRepository = mock(CursoRepository.class);
    private final CursoService sut = new CursoService();

    @Before
    public void init(){
        sut.setCursoRepository(cursoRepository);
    }

    @Test
    public void shouldReturnACourseList(){

        List<Curso> emptyList = Arrays.asList();
        when(cursoRepository.selectCursos()).thenReturn(emptyList);

        List<Curso> expectedCourses = sut.getCursos();

        assertEquals(emptyList, expectedCourses);

    }

    @Test
    public void shouldAddANewCourse(){

        Curso curso = new Curso();

        sut.addCurso(curso);

        verify(cursoRepository, times(1)).addCurso(curso);

    }

}
