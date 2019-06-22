package sk.lorman.chuck.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckServiceImpl implements ChuckService {

    private ChuckNorrisQuotes quotes;

    public ChuckServiceImpl(ChuckNorrisQuotes quotes) {
        this.quotes = quotes;
    }

    @Override
    public String getJoke() {
        System.out.println("getting joke from " + this);
        return quotes.getRandomQuote();
    }
}
