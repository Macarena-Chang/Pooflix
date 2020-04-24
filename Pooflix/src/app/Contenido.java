package app;

import java.util.ArrayList;
import java.util.List;



public abstract class  Contenido {
    /***********
     * ATRIBUTOS
     ***********/
    private String nombre;
    private String descripcion;
    private Double calificacion;
    private Genero genero;
    private Clasificacion clasificacion;
    private int anio;
    private List<Actor> elenco = new ArrayList<>();

    /******************
     * GETTERS Y SETTERS
     *******************/
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    public Double getCalificacion() {
        return this.calificacion;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Genero getGenero() {
        return this.genero;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;

    }

    public Clasificacion getClasificacion() {
        return this.clasificacion;
    }

    public List<Actor> getElenco() {
        return elenco;
    }

    public void setElenco(List<Actor> elenco) {
        this.elenco = elenco;
    }

}