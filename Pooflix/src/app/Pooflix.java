package app;

import java.util.ArrayList;
import java.util.List;

public class Pooflix {
    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();

    // devuelve objeto tipo serie y recibe parametro de tipo serie
    // return tipo null -----> un objeto nulo.
    // devuelve variable s por cada coincidencia

    public Serie buscarSerie(String titulo) {
        for (Serie s : this.series) {
            if (s.nombre.equals(titulo))
                return s;
        }
        return null;
    }

    public void inicializarCatalogo() {
        this.inicializarFriends();
        this.inicializarTheOffice();

        
    }

    public void inicializarFriends() {

        // GENERO
        Genero generoSitCom = new Genero();
        generoSitCom.descripcion = "A sitcom is a genre of comedy centered on a fixed set of characters who carry over from episode to episode.";
        generoSitCom.nombre = "Sitcom";
        // CLASIFICACION
        Clasificacion allAges = new Clasificacion();
        allAges.tipo = "G";
        allAges.edadMin = 0;
        allAges.descripcion = "All ages admitted.";

        // Serie 1 FRIENDS
        Serie serie1 = new Serie();
        serie1.nombre = "Friends";
        serie1.descripcion = "Rachel Green, a sheltered but friendly woman, flees her wedding day and wealthy yet unfulfilling life, and finds childhood friend Monica Geller...";
        serie1.calificacion = 9.8;
        serie1.genero = generoSitCom;
        serie1.clasificacion = allAges;
        serie1.anio = 1994;
        this.series.add(serie1);

        // Serie 1 Friends ELENCO 
        Actor actorReusandoVariable = new Actor();
        actorReusandoVariable.nombre = "Courteney Cox";
        actorReusandoVariable.edad = 51;
        serie1.elenco.add(actorReusandoVariable);

        actorReusandoVariable = new Actor();
        actorReusandoVariable.nombre = "Jennifer Aniston";
        actorReusandoVariable.edad = 51;
        serie1.elenco.add(actorReusandoVariable);

        actorReusandoVariable = new Actor();
        actorReusandoVariable.nombre = "Matthew Perry";
        actorReusandoVariable.edad = 50;
        serie1.elenco.add(actorReusandoVariable);

        actorReusandoVariable = new Actor();
        actorReusandoVariable.nombre = "Matt LeBlanc";
        actorReusandoVariable.edad = 52;
        serie1.elenco.add(actorReusandoVariable);

        actorReusandoVariable = new Actor();
        actorReusandoVariable.nombre = "Lisa Kudrow";
        actorReusandoVariable.edad = 56;
        serie1.elenco.add(actorReusandoVariable);
        //
        // Serie 1 FRIENDS TEMPORADA 1 
        //
        Temporada temporadaReusandoVariable = new Temporada();
        temporadaReusandoVariable.numero = 1;
        serie1.temporadas.add(temporadaReusandoVariable);

        Episodio episodioReusandoVariable = new Episodio();
        episodioReusandoVariable.nombre = "The pilot";
        episodioReusandoVariable.numero = 1;
        episodioReusandoVariable.descripcion = "Rachel Green entra a Central Perk usando un vestido de novia. Rachel les explica que dejó a su prometido en el altar.";
        episodioReusandoVariable.duracionEnMinutos = 25;
        temporadaReusandoVariable.episodios.add(episodioReusandoVariable);
        
        episodioReusandoVariable = new Episodio();        
        episodioReusandoVariable.nombre = "The One with the Sonogram at the End";
        episodioReusandoVariable.numero = 2;
        episodioReusandoVariable.descripcion = "Ross recibe la noticia de su exesposa Carol de que será padre del niño que espera.";
        episodioReusandoVariable.duracionEnMinutos = 20;
        temporadaReusandoVariable.episodios.add(episodioReusandoVariable);

        episodioReusandoVariable = new Episodio();
        episodioReusandoVariable.nombre = "The One with the Thumb";
        episodioReusandoVariable.descripcion = "Lizzy buys a soda for Phoebe, who, upon opening the can, discovers a severed thumb floating in the soda. The soda company gives Phoebe $7,000.";
        episodioReusandoVariable.duracionEnMinutos = 22;
        episodioReusandoVariable.numero = 3;
        temporadaReusandoVariable.episodios.add(episodioReusandoVariable);

        //
        //SERIE 1 FRIENDS TEMPORADA 2
        //
        temporadaReusandoVariable = new Temporada();
        temporadaReusandoVariable.numero = 2;         
        serie1.temporadas.add( temporadaReusandoVariable);

        episodioReusandoVariable = new Episodio();
        episodioReusandoVariable.nombre = "The One with Ross's New Girlfriend";
        episodioReusandoVariable.numero = 1;
        episodioReusandoVariable.descripcion = "Rachel sees Ross arrive with his new girlfriend, paleontologist and former graduate school classmate Julie.";
        episodioReusandoVariable.duracionEnMinutos = 30;
        temporadaReusandoVariable.episodios.add(episodioReusandoVariable);

        episodioReusandoVariable = new Episodio();
        episodioReusandoVariable.nombre = "The One with the Breast Milk";
        episodioReusandoVariable.descripcion = "Descripcion del episodio 2 temporada 2 FRIENDS";
        episodioReusandoVariable.duracionEnMinutos = 25;
        episodioReusandoVariable.numero = 2;
        temporadaReusandoVariable.episodios.add(episodioReusandoVariable);


        episodioReusandoVariable = new Episodio();
        episodioReusandoVariable.nombre = "The One Where Heckles Dies";
        episodioReusandoVariable.numero = 3;
        episodioReusandoVariable.descripcion="Descripcion del episodio 3 temp 2 FRIENDS";
        temporadaReusandoVariable.episodios.add(episodioReusandoVariable);
    }

    public void inicializarTheOffice(){

        // GENEROS     
        Genero mockumentary = new Genero();
        mockumentary.nombre = "Mockumentary";
        mockumentary.descripcion = "A mockumentary or docucomedy is a type of movie or television show depicting fictional events but presented as a documentary";
         // CLASIFICACION
         Clasificacion masDe13 = new Clasificacion();
         masDe13.tipo = "Para mayores de 13 años";
         masDe13.edadMin = 13;
         masDe13.descripcion = "Contiene.......";



          

        // serie 2 THE OFFICE
        // CAST THE OFFICE
        Actor steveCarrel = new Actor();
        steveCarrel.nombre = "Steve Carell";
        steveCarrel.edad = 57;

        Actor jennaFischer = new Actor();
        jennaFischer.nombre = "Jenna Fischer";
        jennaFischer.edad = 46;
        Serie serie2 = new Serie();
        serie2.nombre = "The Office";
        serie2.descripcion = "The Office is an American mockumentary sitcom television series that depicts the everyday lives of office employees in the Scranton, Pennsylvania";
        serie2.calificacion = 9.5;
        serie2.genero = mockumentary;
        serie2.clasificacion = masDe13;
        serie2.anio = 2005;
        serie2.elenco.add(steveCarrel);
        serie2.elenco.add(jennaFischer);
        this.series.add(serie2);

        // serie 2 THE OFFICE TEMPORADAS
        Temporada serie2T1 = new Temporada();
        serie2T1.numero = 1;
        serie2.temporadas.add(serie2T1);

        Temporada serie2T2 = new Temporada();
        serie2T2.numero = 2;
        serie2.temporadas.add(serie2T2);

        // Serie 2 EPISODIOS THE OFFICE TEMPORADA 1

        Episodio serie2T1E1 = new Episodio();
        serie2T1E1.nombre = "Pilot";
        serie2T1E1.numero = 1;
        serie2T1E1.descripcion = "Michael Scott, the regional manager at the Scranton branch of Dunder Mifflin, a distribution company dealing in paper products that is currently under threat of facing downsizing.";
        serie2T1E1.duracionEnMinutos = 22;
        serie2T1.episodios.add(serie2T1E1);

        Episodio serie2T1E2 = new Episodio();
        serie2T1E2.nombre = "Diversity Day";
        serie2T1E2.descripcion = "The staff to undergo a racial diversity seminar.";
        serie2T1E2.duracionEnMinutos = 26;
        serie2T1E2.numero = 2;
        serie2T1.episodios.add(serie2T1E2);

        Episodio serie2T1E3 = new Episodio();
        serie2T1E3.nombre = "Health Care";
        serie2T1E3.descripcion = "Jim and Pam organize the Games of the First Dunder Mifflin Olympiad.";
        serie2T1E3.duracionEnMinutos = 24;
        serie2T1E3.numero = 3;
        serie2T1.episodios.add(serie2T1E3);

        Episodio serie2T1E4 = new Episodio();
        serie2T1E4.nombre = "The Alliance";
        serie2T1E4.numero = 4;
        serie2T1.episodios.add(serie2T1E4);

        Episodio serie2T1E5 = new Episodio();
        serie2T1E5.nombre = "Basketball";
        serie2T1E5.numero = 5;
        serie2T1.episodios.add(serie2T1E5);

        // Serie 2 EPISODIOS THE OFFICE TEMPORADA 2
        Episodio serie2T2E1 = new Episodio();
        serie2T2E1.nombre = "The Dundies";
        serie2T2E1.descripcion = "Se entregan los premios Dundies";
        serie2T2E1.duracionEnMinutos = 25;
        serie2T2E1.numero = 1;
        serie2T2.episodios.add(serie2T2E1);

        Episodio serie2T2E2 = new Episodio();
        serie2T2E2.nombre = "Sexual Harassment";
        serie2T2E2.numero = 2;
        serie2T2E2.descripcion = "Todd Packer  offends the staff with crude gossip about an upper management scandal.";
        serie2T2E2.duracionEnMinutos = 25;
        serie2T2.episodios.add(serie2T2E2);

        Episodio serie2T2E3 = new Episodio();
        serie2T2E3.nombre = "Office Olympics";
        serie2T2E3.numero = 3;

        serie2T2.episodios.add(serie2T2E3);

        Episodio serie2T2E4 = new Episodio();
        serie2T2E4.nombre = "The Fire";
        serie2T2E4.numero = 4;
        serie2T2.episodios.add(serie2T2E4);

        Episodio serie2T2E5 = new Episodio();
        serie2T2E5.nombre = "Halloween";
        serie2T2E5.numero = 5;
        serie2T2.episodios.add(serie2T2E5);
        

    }
}
