package app;

public class Genero {

    /***********
     * Constructor
     ***********/
    public Genero(String nombre, String descripcion){
        this.nombre=nombre;
        this.descripcion = descripcion;
    }


    /***********
     * ATRIBUTOS
     ***********/
    private String nombre;
    private String descripcion;


     /******************
     * GETTERS Y SETTERS
     *******************/

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