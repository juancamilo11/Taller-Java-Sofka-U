package dev.j3c.practice5;

import javax.swing.*;
import java.util.InputMismatchException;

public class MainClass {
    
    public static void main(String[] args) {
        int num = 2;
        System.out.println("The list of the odd numbers from 1 to 100 (both included) is: \n");
        System.out.print("1" + " ");
        while (num <= 100) {
            if(num %2 != 0) {
                System.out.print(num + " ");
            }
            num++;
        }
        System.out.print("100" + " ");
    }


}
