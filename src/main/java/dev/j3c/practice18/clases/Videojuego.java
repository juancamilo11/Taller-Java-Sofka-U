package dev.j3c.practice18.clases;

public class Videojuego {
    //▪ Sus atributos son titulo, horas estimadas, entregado, genero y compañia.
    //▪ Por defecto, las horas estimadas serán de 10 horas y entregado false. El resto de
    //    atributos serán valores por defecto según el tipo del atributo.

    private String titulo;
    private int horasEstimadas = 10;
    private boolean entregado = false;
    private String genero;
    private String compania;

    //▪ Los constructores que se implementaran serán:
    //    ▪ Un constructor por defecto.
    //    ▪ Un constructor con el titulo y horas estimadas. El resto por defecto.
    //    ▪ Un constructor con todos los atributos, excepto de entregado.

    public Videojuego(){
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    //▪ Los métodos que se implementara serán:
    //    ▪ Métodos get de todos los atributos, excepto de entregado.
    //    ▪ Métodos set de todos los atributos, excepto de entregado.
    //    ▪ Sobrescribe los métodos toString.


    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return this.horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return this.compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "Videojuego[" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                ']';
    }
}
