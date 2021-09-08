package dev.j3c.practice17.clases;

import dev.j3c.practice17.enums.EColoresElectrod;
import dev.j3c.practice17.enums.EPreciosConsEnerg;

public class Electrodomestico {
    //atributos son precio base, color, consumo energético (letras entre A y F) y peso. Indican que se podrán heredar.
    //Por defecto, el color será blanco, el consumo energético será F, el precioBase es de 100 y el peso de 5 kg. Usa constantes para ello.
    //Los colores disponibles son blancos, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en minúsculas.

    private double precioBase = 100;
    private EColoresElectrod color = EColoresElectrod.colorBlanco;
    private EPreciosConsEnerg consumoEnergetico = EPreciosConsEnerg.precioTipoF;
    private double peso = 5;

//Un constructor por defecto.
//        ▪ Un constructor con el precio y peso. El resto por defecto.
//        ▪ Un constructor con todos los atributos.


    public Electrodomestico() {
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.comprobarColor(color);
        this.comprobarConsumoEnergetivo(consumoEnergetico);
    }

    public double getPrecioBase() {
        return this.precioBase;
    }

    public EColoresElectrod getColor() {
        return this.color;
    }

    public EPreciosConsEnerg getConsumoEnergetico() {
        return this.consumoEnergetico;
    }

    public double getPeso() {
        return this.peso;
    }

    //comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, sino es correcta
    // usara la letra por defecto. Se invocará al crear el objeto y no será visible.

    private void comprobarConsumoEnergetivo(char letra) {
        if(!this.consumoEnergetico.verificarConsumo(letra)) {
            this.consumoEnergetico = EPreciosConsEnerg.precioTipoF;
        } else {
            this.consumoEnergetico = EPreciosConsEnerg.getPrecioPorLetra(letra);
        }
    }

    //▪ comprobarColor(String color): comprueba que el color es correcto, sino lo es usa el color por defecto.
    // Se invocará al crear el objeto y no será visible.
    private void comprobarColor(String color) {
        if(!this.color.verificarColor(color)) {
            this.color = EColoresElectrod.colorBlanco;
        } else {
            this.color = EColoresElectrod.getColorElectrod(color);
        }
    }

    //precioFinal(): según el consumo energético, aumentara su precio, y según su tamaño, también. Esta es la lista de precios:
    public double precioFinal() {
        double precioFinal = this.precioBase + this.consumoEnergetico.getPrecioAsociado();
        return precioFinal;
    }
}
