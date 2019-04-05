package java.com.autentia.pruebatecnica.service;

import com.autentia.pruebatecnica.domain.Curso;
import com.autentia.pruebatecnica.data.CursoRepository;
import com.autentia.pruebatecnica.service.CursoService;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.*;
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

        List<Curso> emptyList = Arrays.asList(new Curso());
        when(cursoRepository.selectCursos()).thenReturn(emptyList);

        List<Curso> expectedCourses = sut.getCursos();

        assertThat(emptyList, equalTo(expectedCourses));
    }

    @Test
    public void shouldCallRepositoryToAddCourse(){

        Curso curso = new Curso();

        sut.addCurso(curso);

        verify(cursoRepository, times(1)).addCurso(curso);

    }

}
