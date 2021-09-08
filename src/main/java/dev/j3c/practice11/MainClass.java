package dev.j3c.practice11;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

    private static String inputSentence() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Ingrese una frase para contar sus caracteres y contar sus vocales: ");
        String sentence = reader.nextLine();
        return sentence;
    }

    public static int getVowelCount(String sentence,char vowel) {
        int vowelCount = 0;
        for (int index = 0; index < sentence.length(); index++) {
            if (sentence.charAt(index) == vowel) {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public static void main(String[] args) {
        String sentence = MainClass.inputSentence();
        if(sentence.length() > 0) {
            System.out.println("\nLa longitud de la cadena es, incluyendo los espacios es: " + sentence.length());
            System.out.println("La cantidad de 'a' en la cadena es: " + MainClass.getVowelCount(sentence,'a'));
            System.out.println("La cantidad de 'e' en la cadena es: " + MainClass.getVowelCount(sentence,'e'));
            System.out.println("La cantidad de 'i' en la cadena es: " + MainClass.getVowelCount(sentence,'i'));
            System.out.println("La cantidad de 'o' en la cadena es: " + MainClass.getVowelCount(sentence,'o'));
            System.out.println("La cantidad de 'u' en la cadena es: " + MainClass.getVowelCount(sentence,'u'));
        } else {
            System.out.println("Ingrese una cadena válida.");
        }
    }

}
