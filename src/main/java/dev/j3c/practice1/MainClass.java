package dev.j3c.practice1;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

    private static String compareInputNumbers(double firstNumber, double secondNumber) {
        double difference = firstNumber - secondNumber;
        String result = "The first number: " + firstNumber + " is greater than the second one: " + secondNumber;
        if(difference > 0) {
            result = "The first number: " + firstNumber + " is less than the second one: " + secondNumber;
        } else if (difference < 0) {
            result = "The first number: " + firstNumber + " and the second number: " + secondNumber + " are the same.";
        }
        return result;
    }

    public static void main(String[] args) {
        double firstNumber = 10.4,
                secondNumber = -3.23;
        JOptionPane.showMessageDialog(null, MainClass.compareInputNumbers(firstNumber, secondNumber));
    }


}
