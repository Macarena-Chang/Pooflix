package app;

import java.util.List;

public class Pelicula extends Contenido implements INominable {
    /***********
     * Constructor
     ***********/

    public Pelicula(String nombre, Double calificacion, int duracionEnMinutos, int anio, Director director) {
        this.setNombre(nombre);
        this.setCalificacion(calificacion);
        // this.setGenero(genero);
        // this.setClasificacion(clasificacion);
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

    /***************
     **** METODOS****
     ***************/

    @Override
    public boolean ganoPreviamente() {
        // ACA PONER LOGICA DE GANAR
        return false;
    }

    @Override
    public void reproducirTrailerNominacion() {
        // ACA METODO PARA REPRODUCIR TRAILER
        System.out.println("Reproduciendo trailer de pelicula" + this.getNombre());
    }

    @Override
    public void sacarSelfie(List<Actor> otrosActor) {
        // ACA METODO PARA SACAR SELFIE
        

    }

    public boolean estaNominada(){
        return true;
    }
}