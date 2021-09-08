package dev.j3c.practice17.clases;

public class Televisor extends Electrodomestico{
    //Sus atributos son resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos heredados.
    //▪ Por defecto, la resolución será de 20 pulgadas y el sintonizador será false.
    private double resolucion = 20;
    private boolean sintonizadorTDT = false;

    //▪ Los constructores que se implementarán serán:
    //            ▪ Un constructor por defecto.
    //            ▪ Un constructor con el precio y peso. El resto por defecto.
    //            ▪ Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.


    public Televisor() {
    }

    public Televisor(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Televisor(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    //▪ Los métodos que se implementara serán:
    //            ▪ Método get de resolución y sintonizador TDT.
    //            ▪ precioFinal(): si tiene una resolución mayor de 40 pulgadas, se incrementara el precio un 30% y si tiene un sintonizador TDT incorporado, aumentara 50
    //              Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.


    public double getResolucion() {
        return this.resolucion;
    }

    public boolean isSintonizadorTDT() {
        return this.sintonizadorTDT;
    }

    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if(this.resolucion > 40) precioFinal += precioFinal * 0.3;
        if(this.sintonizadorTDT) precioFinal += 50;
        return precioFinal;
    }
}
