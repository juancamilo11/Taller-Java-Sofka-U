package dev.j3c.practice7;

import javax.swing.*;
import java.util.InputMismatchException;

public class MainClass {

    private static double inputNumber() {
        Double number = null;   //Wrapper class (Autoboxing operation)
        do {
            try {
                number = Double.parseDouble(JOptionPane.showInputDialog("Enter one number greater or equal to cero: "));
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(null,"Exception caught: " + e1.getMessage());
            } catch(InputMismatchException e2) {
                JOptionPane.showMessageDialog(null,"Exception caught: " + e2.getMessage());
            }
        } while(number == null);
        return(number);
    }

    private static boolean isValid(double theNumber) {
        return (theNumber >= 0) ? true: false;
    }

    public static void main(String[] args) {
        Double number = null;
        do {
            number = MainClass.inputNumber();
        } while(number == null || !MainClass.isValid(number));
        System.out.println("The number: " + number + " is valid");
    }


}
