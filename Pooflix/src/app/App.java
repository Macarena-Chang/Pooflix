package app;

import java.util.Scanner;

public class App {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Pooflix miPooflix = new Pooflix();

        System.out.println("Iniciando Catalogo");

        miPooflix.inicializarCatalogo();

        /*
         * Serie fr = miPooflix.buscarSerie("Friends");
         * 
         * miPooflix.buscarSerie("Friends");
         * 
         * Temporada laMejorTemporada = fr.getTemporada(2);
         * 
         * Episodio elTop; elTop = laMejorTemporada.getEpisodio(1);
         * 
         * elTop.reproducir();
         */

        Serie office = miPooflix.buscarSerie("The Office");
        miPooflix.buscarSerie("The Office");

        Temporada temporadaElegida = office.getTemporada(1);
        Episodio episodioElegido = temporadaElegida.getEpisodio(3);
         episodioElegido.reproducir();

        Episodio elMejorWebsodio = temporadaElegida.getEpisodio(4);
        elMejorWebsodio.reproducir();

        System.out.println("Empezando otra cosa");

        Episodio epiDemo;

        int posicion = 0;

        /// En base a un numero de posicion de episodio, obtenerlo de la lista
        System.out.println("Ingrese la posicion");

        posicion = Teclado.nextInt();

        // ahora epiDemo apunta a objeto Websodio. Lo logro porque es una variable de
        // una clase en comun
        // En tiempo de ejecucion el programa va a saber si está apuntando a objeto
        // Episodio o a objeto Websodio
        epiDemo = temporadaElegida.getEpisodioAtPosicion(posicion);

        epiDemo.reproducir();
        // primero preguntar de que tipo es. Usando el operador "instanceof"
        // segundo castearlo al tipo correspondiente (aka "transformarlo")
        // usando el operador de Casteo.
       if (epiDemo instanceof Webisode) { // operador instanceof
            
           Webisode webi = (Webisode) epiDemo; // operador de casteo. transforma referencia, devuelve de tipo webisode

            webi.enviarAlertaDeQueEstaOnline(); //este es un metodo de Webisode
     
        }
        else{
            System.out.println("No hay que hacer mas nada con un Episodio");
        }

        int lala;

        lala = 0;
       
        Webisode webi = (Webisode) epiDemo;
    }

}