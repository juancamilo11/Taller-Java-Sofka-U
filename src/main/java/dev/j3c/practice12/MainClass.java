package dev.j3c.practice12;

import java.util.Scanner;

public class MainClass {

    private static String inputWord() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String sentence = reader.nextLine();
        return sentence;
    }

    public static void compareWords(String fWord,String sWord) {
        int vowelCount = 0;
        if(fWord.equals(sWord)){
            System.out.println("Las palabras ingresadas son iguales");;
        } else {
            int minLength = (fWord.length() < sWord.length())? fWord.length() : sWord.length();
            for (int index = 0; index < minLength; index++) {
                if (fWord.charAt(index) != sWord.charAt(index)) {
                    System.out.println("\nEn el caracter número " + (index + 1) + ", las letras son diferentes: ");
                    System.out.println("\tEn la primera palabra hay un: '" + fWord.charAt(index));
                    System.out.println("\tEn la segunda palabra hay un: '" + sWord.charAt(index));
                }
            }
        }
    }

    public static void main(String[] args) {
        String firstWord = MainClass.inputWord();
        String secondWord = MainClass.inputWord();
        if(firstWord.length() > 0 && secondWord.length() > 0) {
            MainClass.compareWords(firstWord,secondWord);
        } else {
            System.out.println("Ingrese una cadena válida.");
        }
    }

}
