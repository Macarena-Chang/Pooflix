package app;

import java.util.ArrayList;
import java.util.Scanner;
import app.personas.*;

public class App {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // Creamos objeto miPooflix (de tipo Pooflix)
        Pooflix miPooflix = new Pooflix();

        System.out.println("Iniciando Catalogo");

        miPooflix.inicializarCatalogo();

        // CODIGO PARA BUSCAR Y REPRODUCIR EN SERIE FRIENDS
        /*
          Serie ft = miPooflix.buscarSerie("Friends");
          miPooflix.buscarSerie("Friends");
         
          miPooflix.buscarSerie("Friends");
          
          Temporada laMejorTemporada = fr.getTemporada(2);
          
          Episodio elTop; elTop = laMejorTemporada.getEpisodio(1);
          
          elTop.reproducir()
          */
         

        // CODIGO PARA BUSCAR Y REPRODUCIR EN SERIE THE OFFICE
        Serie office = miPooflix.buscarSerie("The Office");
        miPooflix.buscarSerie("The Office");

        Temporada temporadaElegida = office.getTemporada(1);
        Episodio episodioElegido = temporadaElegida.getEpisodio(3);
        episodioElegido.reproducir();

        // PARA BUSCAR Y REPRODUCIR WEBISODIO
        Episodio elMejorWebsodio = temporadaElegida.getEpisodio(2);
        elMejorWebsodio.reproducir();

        System.out.println("Empezando otra cosa");

        Episodio epiDemo;

        int posicion = 0;

        // En base a un numero de posicion de episodio, obtenerlo de la lista
        System.out.println("Ingrese la posicion para buscar episodio en la lista");
        posicion = Teclado.nextInt();
        Teclado.nextLine();

        // ahora epiDemo apunta a objeto Websodio. Puedo hacerlo porque es una variable
        // de una clase en comun.
        // En tiempo de ejecucion el programa va a saber si está apuntando a objeto
        // Episodio o Websodio.
        epiDemo = temporadaElegida.getEpisodioAtPosicion(posicion);

        epiDemo.reproducir();

        // 1- preguntar de que tipo es. Usando el operador "instanceof"
        // 2-castearlo al tipo correspondiente (aka "transformarlo") usando el operador
        // de Casteo. Asi podemos usar el metodo de Webisodio
        if (epiDemo instanceof Webisode) { // operador instanceof

            Webisode webi = (Webisode) epiDemo; // operador de casteo. transforma referencia, devuelve de tipo webisode

            webi.enviarAlertaDeQueEstaOnline(); // este es un metodo de Webisode

        } else {
            System.out.println("No hay que hacer mas nada con un Episodio");
        }

        // para usar el metodo de Actor decirDiscurso tengo que usar instanceOf y
        // castearlo
        miPooflix.inicializarListaNominados();

        miPooflix.reproducirTrailersDeNominacion();

        // Ganador da discurso si es un ACTOR
        INominable ganador;
        ganador = miPooflix.getNominados().get(4);

        if (ganador instanceof Actor) {

            Actor actorDiceDiscurso = (Actor) ganador;
            actorDiceDiscurso.decirDiscurso();
        } else {
            System.out.print("No es un actor por lo tanto no da un discurso.");
        }


        
        // USANDO Metodo estaNominada() (que esta en actor Y pelicula)
        String peliOActorIngresado;
        System.out.println("Ingrese el actor/actriz o pelicula que desea consultar en lista de Nominaciones");
        peliOActorIngresado = Teclado.nextLine();
        miPooflix.estaNominadoo(peliOActorIngresado);

        System.out.println("Ingrese el actor/actriz o pelicula que desea consultar en lista de Nominaciones");
        peliOActorIngresado = Teclado.nextLine();
        miPooflix.estaNominadoo(peliOActorIngresado);


        System.out.println("Ingrese el actor/actriz o pelicula que desea consultar en lista de Nominaciones");
        peliOActorIngresado = Teclado.nextLine();
        miPooflix.estaNominadoo(peliOActorIngresado);

        

        int lala;
        lala = 2;

    }

}