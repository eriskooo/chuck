package sk.lorman.chuck.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class ChuckServiceImplTest {

    @Mock
    private ChuckNorrisQuotes quotes;

    @InjectMocks
    private ChuckServiceImpl chuckService;

    @Test
    public void getJoke() {
        Mockito.when(quotes.getRandomQuote()).thenReturn("joke");
        assertThat(chuckService.getJoke()).isNotNull();
    }
}