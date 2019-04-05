package java.com.autentia.pruebatecnica.data;

import com.autentia.pruebatecnica.data.CursoRepository;
import com.autentia.pruebatecnica.domain.Curso;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import java.util.Arrays;
import java.util.List;

@ContextConfiguration
@TestPropertySource ("application-test.properties")
@RunWith(SpringJUnit4ClassRunner.class)

public class CursoRepositoryIT {

    final CursoRepository sut;

    public void shouldAddACourse(){


    }
    public void shouldShowACourse(){


    }



}
