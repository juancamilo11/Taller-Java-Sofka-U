package dev.j3c.practice18.interfaces;

public interface Entregable {
    //entregar(): cambia el atributo prestado a true.
    //    ▪ devolver(): cambia el atributo prestado a false.
    //    ▪ isEntregado(): devuelve el estado del atributo prestado.
    //    ▪ Método compareTo (Object a), compara las horas estimadas en
    //    los videojuegos y en las series el numero de temporadas. Como
    //    parámetro que tenga un objeto, no es necesario que implementes
    //    la interfaz Comparable. Recuerda el uso de los casting de objetos.

    void devolver();
    boolean isEntregado();
    int compareTo(Object a);
}
