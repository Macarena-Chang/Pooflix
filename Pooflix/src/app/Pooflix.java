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


        Episodio episodioReusandoVariable = new Episodio (1, "The pilot",25);
        
        //episodioReusandoVariable.nombre = "The pilot";
        //episodioReusandoVariable.numero = 1;
        episodioReusandoVariable.descripcion = "Rachel Green entra a Central Perk usando un vestido de novia. Rachel les explica que dejó a su prometido en el altar.";
        //episodioReusandoVariable.duracionEnMinutos = 25;
        temporadaReusandoVariable.episodios.add(episodioReusandoVariable);
        
        episodioReusandoVariable = new Episodio(2,"The One with the Sonogram at the End",20);        
        //episodioReusandoVariable.nombre = "The One with the Sonogram at the End";
        //episodioReusandoVariable.numero = 2;
        episodioReusandoVariable.descripcion = "Ross recibe la noticia de su exesposa Carol de que será padre del niño que espera.";
       //episodioReusandoVariable.duracionEnMinutos = 20;
        temporadaReusandoVariable.episodios.add(episodioReusandoVariable);

        episodioReusandoVariable = new Episodio(3,"The One with the Thumb",22);
       // episodioReusandoVariable.nombre = "The One with the Thumb";
        episodioReusandoVariable.descripcion = "Lizzy buys a soda for Phoebe, who, upon opening the can, discovers a severed thumb floating in the soda. The soda company gives Phoebe $7,000.";
        //episodioReusandoVariable.duracionEnMinutos = 22;
        //episodioReusandoVariable.numero = 3;
        temporadaReusandoVariable.episodios.add(episodioReusandoVariable);

        //
        //SERIE 1 FRIENDS TEMPORADA 2
        //
        temporadaReusandoVariable = new Temporada();
        temporadaReusandoVariable.numero = 2;         
        serie1.temporadas.add( temporadaReusandoVariable);

        episodioReusandoVariable = new Episodio(1,"The One with Ross's New Girlfriend",30);
        //episodioReusandoVariable.nombre = "The One with Ross's New Girlfriend";
        //episodioReusandoVariable.numero = 1;
        episodioReusandoVariable.descripcion = "Rachel sees Ross arrive with his new girlfriend, paleontologist and former graduate school classmate Julie.";
       // episodioReusandoVariable.duracionEnMinutos = 30;
        temporadaReusandoVariable.episodios.add(episodioReusandoVariable);

        episodioReusandoVariable = new Episodio(2,"The One with the Breast Milk", 25);
        //episodioReusandoVariable.nombre = "The One with the Breast Milk";
        episodioReusandoVariable.descripcion = "Descripcion del episodio 2 temporada 2 FRIENDS";
        //episodioReusandoVariable.duracionEnMinutos = 25;
        //episodioReusandoVariable.numero = 2;
        temporadaReusandoVariable.episodios.add(episodioReusandoVariable);


        episodioReusandoVariable = new Episodio(3,"The One Where Heckles Dies",23);
       // episodioReusandoVariable.nombre = "The One Where Heckles Dies";
       // episodioReusandoVariable.numero = 3;
        episodioReusandoVariable.descripcion="Descripcion del episodio 3 temp 2 FRIENDS";
        //episodioReusandoVariable.duracionEnMinutos=23;
        temporadaReusandoVariable.episodios.add(episodioReusandoVariable);
    }

   public void inicializarTheOffice(){

        // GENEROS     
        Genero mockumentary = new Genero();
        mockumentary.nombre = "Mockumentary";
        mockumentary.descripcion = "A mockumentary or docucomedy is a type of movie or television show depicting fictional events but presented as a documentary";
         // CLASIFICACION
         Clasificacion masDe13 = new Clasificacion();
         masDe13.tipo = "PG";
         masDe13.edadMin = 13;
         masDe13.descripcion = "Parental guidance suggested – Some material may not be suitable for pre-teenagers.";
                 

        // serie 2 THE OFFICE
        Serie serie2 = new Serie();
        serie2.nombre = "The Office";
        serie2.descripcion = "The Office is an American mockumentary sitcom television series that depicts the everyday lives of office employees in the Scranton, Pennsylvania";
        serie2.calificacion = 9.5;
        serie2.genero = mockumentary;
        serie2.clasificacion = masDe13;
        serie2.anio = 2005;
        this.series.add(serie2); 



        // CAST THE OFFICE
        Actor actorTheOffice = new Actor();
        actorTheOffice.nombre = "Steve Carell";
        actorTheOffice.edad = 57;
        serie2.elenco.add(actorTheOffice);

        actorTheOffice = new Actor();
        actorTheOffice.nombre = "Jenna Fischer";
        actorTheOffice.edad = 46;
        serie2.elenco.add(actorTheOffice);
        //
        // serie 2 THE OFFICE TEMPORADA 1 
        //
        Temporada temporadaTheOffice = new Temporada();
        temporadaTheOffice.numero = 1;
        serie2.temporadas.add(temporadaTheOffice);

        Episodio episodioTheOffice = new Episodio(1,"Pilot",22);
       // episodioTheOffice.nombre = "Pilot";
        //episodioTheOffice.numero = 1;
        episodioTheOffice.descripcion = "Michael Scott, the regional manager at the Scranton branch of Dunder Mifflin, a distribution company dealing in paper products that is currently under threat of facing downsizing.";
        //episodioTheOffice.duracionEnMinutos = 22;
        temporadaTheOffice.episodios.add(episodioTheOffice);

        episodioTheOffice = new Episodio(2, "Diversity Day" , 26);
       // episodioTheOffice.nombre = "Diversity Day";
        episodioTheOffice.descripcion = "The staff to undergo a racial diversity seminar.";
       // episodioTheOffice.duracionEnMinutos = 26;
      //  episodioTheOffice.numero = 2;
        temporadaTheOffice.episodios.add(episodioTheOffice);

        episodioTheOffice = new Episodio(3,"Health Care",24);
       // episodioTheOffice.nombre = "Health Care";
        episodioTheOffice.descripcion = "Jim and Pam organize the Games of the First Dunder Mifflin Olympiad.";
        //episodioTheOffice.duracionEnMinutos = 24;
        //episodioTheOffice.numero = 3;
        temporadaTheOffice.episodios.add(episodioTheOffice);

        //AGREGO EL WEBISODE
        Webisode web1 = new Webisode(4,"The Mentor Webisode",8,"https://www.youtube.com/watch?v=mxHtJfplt1U");
        //web1.numero=4;
        //web1.nombre="The Mentor Webisode";
        //web1.duracionEnMinutos = 8;
        web1.descripcion="Angela becomes Erin's mentor in this EXCLUSIVE Webisode";
       // web1.url="https://www.youtube.com/watch?v=mxHtJfplt1U";
       temporadaTheOffice.episodios.add(web1);
        
        
        //
        // serie 2 THE OFFICE TEMPORADA 2 
        //  
        temporadaTheOffice = new Temporada();
        temporadaTheOffice.numero = 2;
        serie2.temporadas.add(temporadaTheOffice);

        episodioTheOffice = new Episodio(1,"The Dundies",25);
      //  episodioTheOffice.nombre = "The Dundies";
        episodioTheOffice.descripcion = "Se entregan los premios Dundies";
       // episodioTheOffice.duracionEnMinutos = 25;
       // episodioTheOffice.numero = 1;
        temporadaTheOffice.episodios.add(episodioTheOffice);

        episodioTheOffice = new Episodio(2, "Sexual Harassment",25);
       // episodioTheOffice.nombre = "Sexual Harassment";
        //episodioTheOffice.numero = 2;
        episodioTheOffice.descripcion = "Todd Packer  offends the staff with crude gossip about an upper management scandal.";
       // episodioTheOffice.duracionEnMinutos = 25;
        temporadaTheOffice.episodios.add(episodioTheOffice);

        episodioTheOffice = new Episodio(3,"Office Olympics",25);
        //episodioTheOffice.nombre = "Office Olympics";
        //episodioTheOffice.numero = 3;
        episodioTheOffice.descripcion="Descripcion episodio 3 temp 2 THE OFFICE";
        //episodioTheOffice.duracionEnMinutos = 25;
        temporadaTheOffice.episodios.add(episodioTheOffice);
    }    


}
