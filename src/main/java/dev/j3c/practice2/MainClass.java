package dev.j3c.practice2;

import javax.swing.*;
import java.util.InputMismatchException;

public class MainClass {

    private static double inputNumber() {
        Double number = null;   //Wrapper class (Autoboxing operation)
        do {
            try {
                number = Double.parseDouble(JOptionPane.showInputDialog("Enter one number for comparison: "));
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(null,"Exception caught: " + e1.getMessage());
            } catch(InputMismatchException e2) {
                JOptionPane.showMessageDialog(null,"Exception caught: " + e2.getMessage());
            }
        } while(number == null);
        return(number);
    }

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
        do {
            double firstNumber = MainClass.inputNumber(),
                    secondNumber = MainClass.inputNumber();
            JOptionPane.showMessageDialog(null, MainClass.compareInputNumbers(firstNumber, secondNumber));
        } while (true); //It'll repeat indefinitely
    }


}
