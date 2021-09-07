package dev.j3c.practice14;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

    private static Integer inputNumber() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Ingrese un número entero menor que 1000: ");
        Integer number = reader.nextInt();   //Wrapper class (Autoboxing operation)
        return number;
    }

    private static void printNumbers(int num) {
        for (int i=num ; i<=1000 ; i+=2) {
            System.out.print(i + " ");
        }
    }

//14. Crear un programa que pida un numero por teclado y que imprima por pantalla
//    los números desde el numero introducido hasta 1000 con saltos de 2 en 2.
    public static void main(String[] args) {
        Integer number = MainClass.inputNumber();
        if(number != null || number > 1000) {
            MainClass.printNumbers(number);
        } else {
            System.out.println("Ingrese un número válido.");
        }
    }

}
