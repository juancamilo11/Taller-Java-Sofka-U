package dev.j3c.practice18.clases;

public class Serie {
    //atributos son título, numero de temporadas, entregado, género y creador.
    //Por defecto, el número de temporadas es de 3 temporadas y entregado false.
    //El resto de atributos serán valores por defecto según el tipo del atributo.
    private String titulo;
    private int numTemporadas = 3;
    private boolean entregado = false;
    private String genero;
    private String creador;

    //▪ Un constructor por defecto.
    //    ▪ Un constructor con el titulo y creador. El resto por defecto.
    //    ▪ Un constructor con todos los atributos, excepto de entregado.

    public Serie(){

    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int numTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numTemporadas = numTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public int getNumTemporadas() {
        return this.numTemporadas;
    }

    public String getGenero() {
        return this.genero;
    }

    public String getCreador() {
        return this.creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie [" +
                "titulo='" + titulo  +
                ", numTemporadas=" + numTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero +
                ", creador='" + creador +
                ']';
    }
}
