package dev.j3c.practice3;

import javax.swing.*;
import java.util.InputMismatchException;

public class MainClass {

    private static double inputRadius() {
        Double radius = null;   //Wrapper class (Autoboxing operation)
        do {
            try {
                radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of the radius for calculating its area: "));
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(null,"Exception caught: " + e1.getMessage());
            } catch(InputMismatchException e2) {
                JOptionPane.showMessageDialog(null,"Exception caught: " + e2.getMessage());
            }
        } while(radius == null || radius < 0);
        return(radius);
    }

    private static double calculateCircleArea(double radius) {
        return (Math.PI * Math.pow(radius,2));
    }

    public static void main(String[] args) {
        do {
            double radius = MainClass.inputRadius();
            JOptionPane.showMessageDialog(null, "The circle area is: " + MainClass.calculateCircleArea(radius) + " m^2");
        } while (true); //It'll repeat indefinitely
    }


}
