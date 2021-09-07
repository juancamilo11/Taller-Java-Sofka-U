package dev.j3c.practice6;

public class MainClass {
    
    public static void main(String[] args) {
        System.out.println("The list of the odd numbers from 1 to 100 (both included) is: \n");
        System.out.print("1" + " ");
        for (int num = 3 ; num < 100 ; num++) {
            if(num%2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.print("100" + " ");
    }


}
