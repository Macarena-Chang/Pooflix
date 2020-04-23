package app;

public class Episodio {


    /* Constructor de 3 parametros
    accesor: public
    nombreClase:nombre de la clase que se quiere instanciar.
    parametros: los parametros pueden tener cualquier orden y nombre; 
    */
    public Episodio(int numero, String nombre, int duracionEnMinutos){
        this.numero = numero;
        this.nombre = nombre; 
        this.duracionEnMinutos = duracionEnMinutos;
    }



    private int numero;
    public String nombre; 
    public int duracionEnMinutos; 
    private String descripcion; 

    //GETTER /Setter->Get -> devolver el valor de un atributo. El Set va a ponerle.
    public int getNumero(){
        return this.numero;
    }
    //Setter
    //siempre tipo void
    //sirve para poner el valor
    public void setNumero(int numero){
        this.numero = numero;
    }


    public String getDescripcion(String descripcion){
        return this.descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion; 
    }
     
   

    public void reproducir(){
        System.out.println("Reproduciendo episodio " + this.numero + " " + this.nombre);
    }

}

