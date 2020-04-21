package app;

public class Webisode extends Episodio{
    //numero heredado de EPISODIO 
    //nombre heredado de EPISODIO 
    //int duracionEnMinutos heredado de EPISODIO 
    //String descripcion heredado de EPISODIO 
    public String url; 


    public void reproducir() {

        System.out.println("Reproduciendo websodio ... " + "Nombre: " + this.nombre + "  La url es : " + this.url);

    }

}