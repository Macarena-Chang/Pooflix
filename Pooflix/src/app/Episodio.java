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
    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }
    private String nombre; 
    private int duracionEnMinutos; 
    private String descripcion; 

    //GETTER /Setter->Get -> devolver el valor de un atributo. El Set va a ponerle.
    public void setDuracionEnMinutos(int duracionEnMinutos){
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public int getDuracionEnMinutos(){
        return this.duracionEnMinutos;
    }
    
    public String getNombre(){
         return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }


    /*public int getNumero(){
        return this.numero;
    }*/
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

