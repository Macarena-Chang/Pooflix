package app;

public class Webisode extends Episodio{

    //Como hicimos un constructor en episodio y no declaramos el explicito
    //tenemos que definir un constructor exxplicito
    
    public Webisode(int numero, String nombre, int duracionEnMinutos, String url){
        super(numero,nombre,duracionEnMinutos); //hay que llamar el que creamos en Episodio. Implicito porque no tiene parametros 
        this.url = url;
    }


    //numero heredado de EPISODIO 
    //nombre heredado de EPISODIO 
    //int duracionEnMinutos heredado de EPISODIO 
    //String descripcion heredado de EPISODIO 
    private String url; 
    public void setUrl(String url){
        this.url =url;
    }
    
    public String getUrl(){
        return this.url;
    }


    @Override //anotacion que indica que el metodo se sobre - escribe(redifinicion)
    public void reproducir() {

        System.out.println("Reproduciendo websodio ... " + "Nombre: " + this.getNombre() + "  La url es : " + this.url);

    }

        /**
     * "envia" un mail de alerta cuando la serie este online. Este metodo NO esta en
     * EPISODIO.
     */
    public void enviarAlertaDeQueEstaOnline() {
        // mandaria un mail a los usuarios avisando que ya esta disponible para ver.
        System.out.println("Enviando mail con url " + this.url);
    }


}