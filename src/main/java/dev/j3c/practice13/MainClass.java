package dev.j3c.practice13;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        String datePattern = "yyyy/MM/dd HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);
        String currentDate = simpleDateFormat.format(new Date());
        System.out.println("La fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS) es: " + currentDate);
    }

}
