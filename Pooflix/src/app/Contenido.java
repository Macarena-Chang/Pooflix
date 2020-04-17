package app;

import java.util.ArrayList;
import java.util.List;

public class Contenido {
    public String nombre;
    public String descripcion; 
    public Double calificacion; 
    public Genero genero;
    public Clasificacion clasificacion;
    public int anio;
    
    public List <Actor> elenco = new ArrayList<>(); 
}