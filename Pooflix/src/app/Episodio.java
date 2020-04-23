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



    public int numero;
    public String nombre; 
    public int duracionEnMinutos; 
    public String descripcion; 


     
   

    public void reproducir(){
        System.out.println("Reproduciendo episodio " + this.numero + " " + this.nombre);
    }

}

