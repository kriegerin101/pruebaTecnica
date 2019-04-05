package java.com.autentia.pruebatecnica.service;

import com.autentia.pruebatecnica.domain.Profesor;
import com.autentia.pruebatecnica.service.ProfesorService;
import com.autentia.pruebatecnica.data.ProfesorRepository;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.*;
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

        List<Profesor> emptyList = Arrays.asList(new Profesor());
        when(profesorRepository.selectProfesores()).thenReturn(emptyList);

        List<Profesor> expectedCourses = sut.getProfesores();

        assertThat(emptyList, equalTo(expectedCourses));

    }

}
