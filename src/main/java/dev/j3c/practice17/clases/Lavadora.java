package dev.j3c.practice17.clases;

public class Lavadora extends Electrodomestico{
    //u atributo es carga, además de los atributos heredados.
    //        ▪ Por defecto, la carga es de 5 kg. Usa una constante para ello.
    private double carga = 5;

    //▪ Los constructores que se implementarán serán:
    //            ▪ Un constructor por defecto.
    //            ▪ Un constructor con el precio y peso. El resto por defecto.
    //            ▪ Un constructor con la carga y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.

    public Lavadora() {
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    //▪ Los métodos que se implementara serán:
    //            ▪ Método get de carga.
    //            ▪ precioFinal():, si tiene una carga mayor de 30 kg, aumentara el precio 50 , sino es así no se incrementara el precio. Llama al método padre y añade el código necesario. Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.
    public double getCarga() {
        return this.carga;
    }

    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if(this.carga > 30) precioFinal += 50;
        return precioFinal;
    }

}
