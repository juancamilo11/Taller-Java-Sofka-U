package dev.j3c.practice17;

import dev.j3c.practice17.clases.Electrodomestico;
import dev.j3c.practice17.clases.Lavadora;
import dev.j3c.practice17.clases.Televisor;

import javax.swing.*;
import java.util.Arrays;

public class Principal {



    private static void llenarArreglo(Electrodomestico[] vecElectrodomesticos) {
        vecElectrodomesticos[0] = new Televisor(100, "blanco", 'C', 10, 55,false);
        vecElectrodomesticos[1] = new Lavadora(150, "rosado", 'E', 200, 45);
        vecElectrodomesticos[2] = new Electrodomestico(200, "azul", 'D', 100);
        vecElectrodomesticos[3] = new Electrodomestico(50, "gris", 'M', 50);
        vecElectrodomesticos[4] = new Televisor(80, "amarillo", 'C', 10, 55,false);
        vecElectrodomesticos[5] = new Lavadora(100, "negro", 'G', 100, 80);
        vecElectrodomesticos[6] = new Lavadora(300, "cian", 'F', 250, 60);
        vecElectrodomesticos[7] = new Electrodomestico(70, "negro", 'F', 20);
        vecElectrodomesticos[8] = new Lavadora(120, "blanco", 'A', 150, 100);
        vecElectrodomesticos[9] = new Electrodomestico(90, "rojo", 'I', 50);
    }

    private static void imprimirElectrodomesticos(Electrodomestico[] vecElectrodomesticos) {
        double precioElectrod = 0, precioTelevisores = 0, precioLavadoras = 0, precioTotal = 0;
        for (int i = 0; i < vecElectrodomesticos.length; i++) {
            if(vecElectrodomesticos[i] instanceof Televisor) precioElectrod += vecElectrodomesticos[i].precioFinal();
            else if(vecElectrodomesticos[i] instanceof Lavadora) precioLavadoras += vecElectrodomesticos[i].precioFinal();
            else if(vecElectrodomesticos[i] instanceof Electrodomestico) precioTelevisores += vecElectrodomesticos[i].precioFinal();
            precioTotal += vecElectrodomesticos[i].precioFinal();
        }
        System.out.println("El precio final de los electrodomésticos es de: " + precioTotal +
                " (" + precioElectrod + "," + precioLavadoras + "," + precioTelevisores + ") para electrodomésticos, "
                + precioLavadoras + " para lavadoras y " + precioTelevisores + " para televisores.");
    }

    public static void main(String[] args) {
        //Ahora crea una clase ejecutable que realice lo siguiente:
        //        ▪ Crea un array de Electrodomesticos de 10 posiciones.
        //        ▪ Asigna a cada posición un objeto de las clases anteriores con los valores que desees.
        //        ▪ Ahora, recorre este array y ejecuta el método precioFinal().
        //        ▪ Deberás mostrar el precio de cada clase, es decir, el precio de todas las televisiones por un lado, el de las lavadoras por otro y la suma de los Electrodomesticos (puedes crear objetos Electrodomestico, pero recuerda que Television y Lavadora también son electrodomésticos). Recuerda el uso operador instanceof.
        //    Por ejemplo, si tenemos un Electrodomestico con un precio final de 300, una lavadora de 200 y una televisión de 500, el resultado final sera de 1000 (300+200+500) para electrodomésticos, 200 para lavadora y 500 para televisión.
        Electrodomestico[] vecElectrodomesticos = new Electrodomestico[10];
        Principal.llenarArreglo(vecElectrodomesticos);
        Principal.imprimirElectrodomesticos(vecElectrodomesticos);

    }


}
