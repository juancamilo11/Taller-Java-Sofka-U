package dev.j3c.practice8;

import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class MainClass {

    private static String inputDayOfTheWeek() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Ingrese un día de la semana: ");
        String dayOfTheWeek = reader.nextLine();
        return(dayOfTheWeek);
    }

    private static String getDayType(String dayOfTheWeek) {
        String message;
        switch(dayOfTheWeek.toLowerCase()) {
            case "lunes":     message = "Lunes es un día laboral";      break;
            case "martes":    message = "Martes es un día laboral";     break;
            case "miercoles": message = "Miercoles es un día laboral";  break;
            case "jueves":    message = "Jueves es un día laboral";     break;
            case "viernes":   message = "Viernes es un día laboral";    break;
            case "sabado":    message = "Sabado NO es un día laboral";  break;
            case "Domingo":   message = "Domingo NO es un día laboral"; break;
            default:          message = "Día ingresado no válido";      break;
        }
        return message;
    }

    public static void main(String[] args) {
        String dayOfTheWeek = MainClass.inputDayOfTheWeek();
        System.out.println(MainClass.getDayType(dayOfTheWeek));
    }


}
