package app;

public class App {
    public static void main(String[] args) throws Exception {
        Pooflix miPooflix = new Pooflix();

        System.out.println("Iniciando Catalogo");

        miPooflix.inicializarCatalogo();
        
       
        Serie fr = miPooflix.buscarSerie("Friends");

        miPooflix.buscarSerie("Friends");

        Temporada laMejorTemporada = fr.getTemporada(2);    

       Episodio elTop;
       elTop = laMejorTemporada.getEpisodio(1);

       elTop.reproducir();

       /*Reproduciendo episodio de THE OFFICE

       Serie office = miPooflix.buscarSerie("The Office");
       miPooflix.buscarSerie("The Office");

       Temporada temporadaElegida = office.getTemporada(2);
       Episodio episodioElegido = temporadaElegida.getEpisodio(3);

       episodioElegido.reproducir();

       */


  
    

    }
    



}