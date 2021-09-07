package dev.j3c.practice4;

import javax.swing.*;
import java.util.InputMismatchException;

public class MainClass {

    private static double inputPrice() {
        Double price = null;   //Wrapper class (Autoboxing operation)
        do {
            try {
                price = Double.parseDouble(JOptionPane.showInputDialog("Enter the price of an item calculating the final price by adding its IVA: "));
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(null,"Exception caught: " + e1.getMessage());
            } catch(InputMismatchException e2) {
                JOptionPane.showMessageDialog(null,"Exception caught: " + e2.getMessage());
            }
        } while(price == null || price < 0);
        return(price);
    }

    private static double calculateFinalPrice(double price) {
        return (price + (price * 0.21));
    }

    public static void main(String[] args) {
        do {
            double price = MainClass.inputPrice();
            JOptionPane.showMessageDialog(null, "The item's final price is: $" + MainClass.calculateFinalPrice(price));
        } while (true); //It'll repeat indefinitely
    }


}
