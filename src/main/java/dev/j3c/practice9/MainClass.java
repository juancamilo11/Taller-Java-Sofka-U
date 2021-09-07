package dev.j3c.practice9;

public class MainClass {

    public static void main(String[] args) {
        String quote = "La sonrisa sera la mejor arma contra la tristeza";
        quote = quote.replace('a','e');
        quote += ", y la buena actitud será tu mejor arma contra los momentos difíciles.";
        System.out.println(quote);
    }
}
