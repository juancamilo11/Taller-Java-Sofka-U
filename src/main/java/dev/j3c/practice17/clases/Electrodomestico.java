package dev.j3c.practice17.clases;

import dev.j3c.practice17.enums.EColoresElectrod;
import dev.j3c.practice17.enums.EPreciosConsEnerg;

public class Electrodomestico {
    private double precioBase = 100;
    private EColoresElectrod color = EColoresElectrod.colorBlanco;
    private EPreciosConsEnerg consumoEnergetico = EPreciosConsEnerg.precioTipoF;
    private double peso = 5;

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

    private void comprobarConsumoEnergetivo(char letra) {
        if(!this.consumoEnergetico.verificarConsumo(letra)) {
            this.consumoEnergetico = EPreciosConsEnerg.precioTipoF;
        } else {
            this.consumoEnergetico = EPreciosConsEnerg.getPrecioPorLetra(letra);
        }
    }

    private void comprobarColor(String color) {
        if(!this.color.verificarColor(color)) {
            this.color = EColoresElectrod.colorBlanco;
        } else {
            this.color = EColoresElectrod.getColorElectrod(color);
        }
    }

    public double precioFinal() {
        double precioFinal = this.precioBase + this.consumoEnergetico.getPrecioAsociado();
        return precioFinal;
    }
}
