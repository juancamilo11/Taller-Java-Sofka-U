package dev.j3c.practice15;

import javax.swing.*;
import java.util.Scanner;

public class MainClass {

    private static void showMenu() {
        Scanner reader = new Scanner(System.in);
        char opcElegida;
        do {
            opcElegida = JOptionPane.showInputDialog("****** GESTION CINEMATOGRÁFICA ********\n" +
                    "    \t1-NUEVO ACTOR\n" +
                    "    \t2-BUSCAR ACTOR\n" +
                    "    \t3-ELIMINAR ACTOR\n" +
                    "    \t4-MODIFICAR ACTOR\n" +
                    "    \t5-VER TODOS LOS ACTORES\n" +
                    "    \t6-VER PELICULAS DE LOS ACTORES\n" +
                    "    \t7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                    "    \t8-SALIR\n").charAt(0);
            if(opcElegida < '1' || opcElegida > '8') JOptionPane.showMessageDialog(null,"Opción Incorrecta.");
        } while(opcElegida != '8');
    }

    public static void main(String[] args) {
        MainClass.showMenu();
    }

}
