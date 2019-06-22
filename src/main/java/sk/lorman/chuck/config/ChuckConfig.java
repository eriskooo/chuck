package sk.lorman.chuck.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:my.yml")
public class ChuckConfig {

    @Bean
    @Qualifier("meno")
    public String getMeno() {
        return meno;
    }

    @Value("${meno}")
    private String meno;

    @Value("${pr}")
    private String pr;

    @Bean
    @Qualifier("pr")
    public String getPr() {
        return pr;
    }

    @Bean
    public ChuckNorrisQuotes getChuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
