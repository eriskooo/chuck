package sk.lorman.chuck.temp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sk.lorman.chuck.service.ChuckService;

@Component
public class DataLoader implements CommandLineRunner {

    private final ChuckService chuckService ;
    private String meno;

    public DataLoader(ChuckService chuckService, @Qualifier("meno") String meno) {
        this.chuckService = chuckService;
        this.meno = meno;
    }


    @Override
    public void run(String... args) throws Exception {

        System.out.println("chuck service at start = " + chuckService);
        System.out.println("meno : " + meno);

    }
}
