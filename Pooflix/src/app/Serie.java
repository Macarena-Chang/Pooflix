package app;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido {

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


    /**
     * METODO
     * 
     */
    public Temporada getTemporada(int nro) {
        // recorrer cada temporada
        // si el nro de temporada del ciclo es igual a "nro"
        // devolver esa temporada

        for (Temporada tempo : this.temporadas) {
            if (tempo.getNumero() == nro) {

                return tempo;

            }
        }

        return null;
    }

}