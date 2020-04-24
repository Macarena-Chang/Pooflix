package app;

public class Genero {

    public Genero(String nombre, String descripcion){
        this.nombre=nombre;
        this.descripcion = descripcion;
    }

    private String nombre;
    private String descripcion;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public String getDescripcion(){
        return this.descripcion;
    }



   
    
}