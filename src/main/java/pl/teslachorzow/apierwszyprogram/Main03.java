package pl.teslachorzow.apierwszyprogram;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class Main03 {
    public static void main(String[] args) {

        ChuckNorrisQuotes jokes = new ChuckNorrisQuotes();
        System.out.print("1-");
        System.out.println(jokes.getRandomQuote());
        System.out.print("2-");
        System.out.println(jokes.getRandomQuote());
        System.out.print("3-");
        System.out.println(jokes.getRandomQuote());

    }

}

