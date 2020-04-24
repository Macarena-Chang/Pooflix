package app;

public class Pelicula extends Contenido {
    /***********
     * Constructor
     ***********/

    public Pelicula(String nombre, Double calificacion,int duracionEnMinutos, int anio, Director director) {
        this.setNombre(nombre);
        this.setCalificacion(calificacion);
        //this.setGenero(genero);
        //this.setClasificacion(clasificacion);
        this.setDuracionEnMinutos(duracionEnMinutos);
        this.setAnio(anio);
        this.setDirector(director);

    }  


    /***********
     * ATRIBUTOS
     ***********/
    private Director director;
    private int duracionEnMinutos;
    

    /******************
     * GETTERS Y SETTERS
     *******************/
    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }
}