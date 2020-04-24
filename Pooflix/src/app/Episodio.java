package app;

public class Episodio {

    /*
     ********************* CONSTRUCTOR****************
      Constructor de 3 parametros accesor: public
     * nombreClase:nombre de la clase que se quiere instanciar.
     * parametros: losparametros pueden tener cualquier orden y nombre
     * *********************************************
     */
    public Episodio(int numero, String nombre, int duracionEnMinutos) {
        this.numero = numero;
        this.nombre = nombre;
        this.duracionEnMinutos = duracionEnMinutos;
    }

    /***********
     * ATRIBUTOS
     ***********/
    private int numero;
    private String nombre;
    private int duracionEnMinutos;
    private String descripcion;

    /*******************
     * GETTERS Y SETTERS
     *******************/

    // Setter
    // siempre tipo void
    // sirve para poner el valor
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    // GETTER -> devolver el valor de un atributo
    public int getNumero() {
        return this.numero;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public int getDuracionEnMinutos() {
        return this.duracionEnMinutos;
    }

    public String getDescripcion(String descripcion) {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    

    /**
     * METODO PARA HACER EL PRINT
     */

    public void reproducir() {
        System.out.println("Reproduciendo episodio " + this.numero + " " + this.nombre);
    }

}
