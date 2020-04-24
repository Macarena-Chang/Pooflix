package app;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido {

    /***********
     * Constructor
     ***********/
    public Serie(String nombre, Double calificacion, Genero genero, Clasificacion clasificacion, int anio) {
        this.setNombre(nombre);
        this.setCalificacion(calificacion);
        this.setGenero(genero);
        this.setClasificacion(clasificacion);
        this.setAnio(anio);
    }

    /***********
     * ATRIBUTOS
     ***********/
    private List<Temporada> temporadas = new ArrayList<>();

    /******************
     * GETTERS Y SETTERS
     *******************/
    public List<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(List<Temporada> temporadas) {
        this.temporadas = temporadas;
    }
    

    /***************
     **** METODOS****
     ***************/
    /**
     * Recorre cada temporada, si el numero de temporada coincide con nro, devuelve esa temporada
     * @param nro
     * @return objeto temporada que coincida con numero ingresado
     */
    public Temporada getTemporada(int nro) {
        for (Temporada tempo : this.temporadas) {
            if (tempo.getNumero() == nro) {

                return tempo;

            }
        }

        return null;
    }

}