package app;

import java.util.ArrayList;
import java.util.List;

public class Pooflix {
    /***********
     * ATRIBUTOS
     ***********/
    private List<Pelicula> peliculas = new ArrayList<>();
    private List<Serie> series = new ArrayList<>();


    // devuelve objeto tipo serie y recibe parametro de tipo serie
    // return tipo null -----> un objeto nulo.
    // devuelve variable s por cada coincidencia

    public Serie buscarSerie(String titulo) {
        for (Serie s : this.series) {
            if (s.getNombre().equals(titulo))
                return s;
        }
        return null;
    }

    public void inicializarCatalogo() {
        this.inicializarFriends();
        this.inicializarTheOffice();
        this.inicializarTheShining();
        
        
        
    }

    public void inicializarTheShining(){
        Director kubrick = new Director("Stanley Kubrick",70);
        Pelicula theShining = new Pelicula("The Shining",10.0,146,1980,kubrick);
        this.peliculas.add(theShining);

    }

    public void inicializarFriends() {

        // GENERO
        Genero generoSitCom = new Genero("Sitcom","A sitcom is a genre of comedy centered on a fixed set of characters who carry over from episode to episode." );
        //generoSitCom.descripcion = "A sitcom is a genre of comedy centered on a fixed set of characters who carry over from episode to episode.";
        //generoSitCom.nombre = "Sitcom";
        // CLASIFICACION
        Clasificacion allAges = new Clasificacion("G",0,"All ages admitted.");
        //allAges.setTipo("G");
        //allAges.setEdadMin(0);
        //allAges.setDescripcion("All ages admitted.");

        // Serie 1 FRIENDS
        Serie serie1 = new Serie("Friends", 9.8 , generoSitCom ,allAges, 1994);
       //serie1.nombre = "Friends";
        serie1.setDescripcion("Rachel Green, a sheltered but friendly woman, flees her wedding day and wealthy yet unfulfilling life, and finds childhood friend Monica Geller...");
        //serie1.calificacion = 9.8;
        //serie1.genero = generoSitCom;
        //serie1.clasificacion = allAges;C
        //serie1.anio = 1994;
        
        this.series.add(serie1);

        // Serie 1 Friends ELENCO 
        Actor actorReusandoVariable = new Actor("Courteney Cox",51);
        //actorReusandoVariable.nombre = "Courteney Cox";
        //actorReusandoVariable.edad = 51;
        serie1.getElenco().add(actorReusandoVariable);

        actorReusandoVariable = new Actor("Jennifer Aniston",51);
       // actorReusandoVariable.nombre = "Jennifer Aniston";
       // actorReusandoVariable.edad = 51;
        serie1.getElenco().add(actorReusandoVariable);

        actorReusandoVariable = new Actor("Matthew Perry",50);
       // actorReusandoVariable.nombre = "Matthew Perry";
        //actorReusandoVariable.edad = 50;
        serie1.getElenco().add(actorReusandoVariable);

        actorReusandoVariable = new Actor( "Matt LeBlanc",52);
       // actorReusandoVariable.nombre = "Matt LeBlanc";
        //actorReusandoVariable.edad = 52;
        serie1.getElenco().add(actorReusandoVariable);

        actorReusandoVariable = new Actor("Lisa Kudrow",56);
        //actorReusandoVariable.nombre = "Lisa Kudrow";
        //actorReusandoVariable.edad = 56;
        serie1.getElenco().add(actorReusandoVariable);
        //
        // Serie 1 FRIENDS TEMPORADA 1 
        //
        Temporada temporadaReusandoVariable = new Temporada();
        temporadaReusandoVariable.setNumero(1);
        serie1.getTemporadas().add(temporadaReusandoVariable);


        Episodio episodioReusandoVariable = new Episodio (1, "The pilot",25);
        //episodioReusandoVariable.nombre = "The pilot";
        //episodioReusandoVariable.numero = 1;
        episodioReusandoVariable.setDescripcion("Rachel Green entra a Central Perk usando un vestido de novia. Rachel les explica que dejó a su prometido en el altar.");
        //episodioReusandoVariable.descripcion = "Rachel Green entra a Central Perk usando un vestido de novia. Rachel les explica que dejó a su prometido en el altar.";
        //episodioReusandoVariable.setDuracionEnMinutos(25);
        temporadaReusandoVariable.getEpisodios().add(episodioReusandoVariable);
        
        
        episodioReusandoVariable = new Episodio (2, "The One with the Sonogram at the End",20);
        //episodioReusandoVariable.nombre = "The One with the Sonogram at the End";
        //episodioReusandoVariable.numero = 2;
        episodioReusandoVariable.setDescripcion("Ross recibe la noticia de su exesposa Carol de que será padre del niño que espera.");
        //episodioReusandoVariable.descripcion = "Ross recibe la noticia de su exesposa Carol de que será padre del niño que espera.";
       //episodioReusandoVariable.duracionEnMinutos = 20;
       temporadaReusandoVariable.getEpisodios().add(episodioReusandoVariable);
        

       episodioReusandoVariable = new Episodio (3, "The one with the thumb",22);
       // episodioReusandoVariable.nombre = "The One with the Thumb";

        //episodioReusandoVariable.descripcion = "Lizzy buys a soda for Phoebe, who, upon opening the can, discovers a severed thumb floating in the soda. The soda company gives Phoebe $7,000.";
        episodioReusandoVariable.setDescripcion("Lizzy buys a soda for Phoebe, who, upon opening the can, discovers a severed thumb floating in the soda. The soda company gives Phoebe $7,000.");
        //episodioReusandoVariable.setDuracionEnMinutos(22);
        //episodioReusandoVariable.duracionEnMinutos = 22;
        //episodioReusandoVariable.numero = 3;
        temporadaReusandoVariable.getEpisodios().add(episodioReusandoVariable);

        //
        //SERIE 1 FRIENDS TEMPORADA 2
        //
        temporadaReusandoVariable = new Temporada();
        temporadaReusandoVariable.setNumero(2);           
        serie1.getTemporadas().add( temporadaReusandoVariable);

        
        episodioReusandoVariable = new Episodio (1, "The One with Ross's New Girlfriend",30);
        //episodioReusandoVariable = new Episodio(1,"Rachel sees Ross arrive with his new girlfriend, paleontologist and former graduate school classmate Julie.",30);
        //episodioReusandoVariable.nombre = "The One with Ross's New Girlfriend";
        //episodioReusandoVariable.numero = 1;
        episodioReusandoVariable.setDescripcion("Rachel sees Ross arrive with his new girlfriend, paleontologist and former graduate school classmate Julie.");
        //episodioReusandoVariable.setDuracionEnMinutos(30);
        //episodioReusandoVariable.descripcion = "Rachel sees Ross arrive with his new girlfriend, paleontologist and former graduate school classmate Julie.";
       // episodioReusandoVariable.duracionEnMinutos = 30;
        temporadaReusandoVariable.getEpisodios().add(episodioReusandoVariable);

        episodioReusandoVariable = new Episodio(2,"The One with the Breast Milk", 25);
        //episodioReusandoVariable.nombre = "The One with the Breast Milk";
        episodioReusandoVariable.setDescripcion("Descripcion del episodio 2 temporada 2 FRIENDS");
        //episodioReusandoVariable.setDuracionEnMinutos(25);
        //episodioReusandoVariable.descripcion = "Descripcion del episodio 2 temporada 2 FRIENDS";
        //episodioReusandoVariable.duracionEnMinutos = 25;
        //episodioReusandoVariable.numero = 2;
        temporadaReusandoVariable.getEpisodios().add(episodioReusandoVariable);


        episodioReusandoVariable = new Episodio(3,"The One Where Heckles Dies",23);
       // episodioReusandoVariable.nombre = "The One Where Heckles Dies";
       // episodioReusandoVariable.numero = 3;
       episodioReusandoVariable.setDescripcion("Descripcion del episodio 3 temp 2 FRIENDS");
       //episodioReusandoVariable.setDuracionEnMinutos(23);
        //episodioReusandoVariable.descripcion="Descripcion del episodio 3 temp 2 FRIENDS";
        //episodioReusandoVariable.duracionEnMinutos=23;
        temporadaReusandoVariable.getEpisodios().add(episodioReusandoVariable);
    }

   public void inicializarTheOffice(){

        // GENEROS     
        Genero mockumentary = new Genero("Mockumentary","A mockumentary or docucomedy is a type of movie or television show depicting fictional events but presented as a documentary" );
        //mockumentary.nombre = "Mockumentary";
        //mockumentary.descripcion = "A mockumentary or docucomedy is a type of movie or television show depicting fictional events but presented as a documentary";
         // CLASIFICACION
         Clasificacion masDe13 = new Clasificacion("PG",13,"Parental guidance suggested – Some material may not be suitable for pre-teenagers.");
         //masDe13.setTipo("PG");
         //masDe13.setEdadMin(13);
         //masDe13.setDescripcion("");
                 

        // serie 2 THE OFFICE
        Serie serie2 = new Serie("The Office", 9.5 , mockumentary , masDe13, 2005);
        //Serie serie2 = new Serie();
       // serie2.nombre = "The Office";
        serie2.setDescripcion("The Office is an American mockumentary sitcom television series that depicts the everyday lives of office employees in the Scranton, Pennsylvania");
        //serie2.calificacion = 9.5;
        //serie2.genero = mockumentary;
        //serie2.clasificacion = masDe13;
        //serie2.anio = 2005;        
        this.series.add(serie2); 



        // CAST THE OFFICE
        Actor actorTheOffice = new Actor("Steve Carell",57);
       // actorTheOffice.nombre = "Steve Carell";
        //actorTheOffice.edad = 57;
        serie2.getElenco().add(actorTheOffice);

        actorTheOffice = new Actor("Jenna Fischer",46);
        //actorTheOffice.nombre = "Jenna Fischer";
        //actorTheOffice.edad = 46;
        serie2.getElenco().add(actorTheOffice);
        //
        // serie 2 THE OFFICE TEMPORADA 1 
        //
        Temporada temporadaTheOffice = new Temporada();
        temporadaTheOffice.setNumero(1);
        serie2.getTemporadas().add(temporadaTheOffice);

        Episodio episodioTheOffice = new Episodio(1,"Pilot",22);
       // episodioTheOffice.nombre = "Pilot";
        //episodioTheOffice.numero = 1;
        episodioTheOffice.setDescripcion("Michael Scott, the regional manager at the Scranton branch of Dunder Mifflin, a distribution company dealing in paper products that is currently under threat of facing downsizing.");
       // episodioTheOffice.setDuracionEnMinutos(22);
        //episodioTheOffice.descripcion = "Michael Scott, the regional manager at the Scranton branch of Dunder Mifflin, a distribution company dealing in paper products that is currently under threat of facing downsizing.";
        //episodioTheOffice.duracionEnMinutos = 22;
        temporadaTheOffice.getEpisodios().add(episodioTheOffice);

        episodioTheOffice = new Episodio(2, "Diversity Day" , 26);
       // episodioTheOffice.nombre = "Diversity Day";
       episodioTheOffice.setDescripcion("The staff to undergo a racial diversity seminar.");
      // episodioTheOffice.setDuracionEnMinutos(26);
        //episodioTheOffice.descripcion = "The staff to undergo a racial diversity seminar.";
       // episodioTheOffice.duracionEnMinutos = 26;
      //  episodioTheOffice.numero = 2;
        temporadaTheOffice.getEpisodios().add(episodioTheOffice);

        episodioTheOffice = new Episodio(3,"Health Care",24);
       // episodioTheOffice.nombre = "Health Care";
       episodioTheOffice.setDescripcion("Jim and Pam organize the Games of the First Dunder Mifflin Olympiad.");
       //episodioTheOffice.setDuracionEnMinutos(24);
       // episodioTheOffice.descripcion = "Jim and Pam organize the Games of the First Dunder Mifflin Olympiad.";
        //episodioTheOffice.duracionEnMinutos = 24;
        //episodioTheOffice.numero = 3;
        temporadaTheOffice.getEpisodios().add(episodioTheOffice);

        //AGREGO EL WEBISODE
        Webisode web1 = new Webisode(4,"The Mentor Webisode",8,"https://www.youtube.com/watch?v=mxHtJfplt1U");
        //web1.numero=4;
        //web1.nombre="The Mentor Webisode";
        //web1.duracionEnMinutos = 8;
        //web1.setUrl("https://www.youtube.com/watch?v=mxHtJfplt1U");
        //web1.setDuracionEnMinutos(8);
        web1.setDescripcion("Angela becomes Erin's mentor in this EXCLUSIVE Webisode");
        //web1.descripcion="Angela becomes Erin's mentor in this EXCLUSIVE Webisode";
       // web1.url="https://www.youtube.com/watch?v=mxHtJfplt1U";
       temporadaTheOffice.getEpisodios().add(web1);
        
        
        //
        // serie 2 THE OFFICE TEMPORADA 2 
        //  
        temporadaTheOffice = new Temporada();
        temporadaTheOffice.setNumero(2);
        serie2.getTemporadas().add(temporadaTheOffice);

        episodioTheOffice = new Episodio(1,"The Dundies",25);
      //  episodioTheOffice.nombre = "The Dundies";
        episodioTheOffice.setDescripcion( "Se entregan los premios Dundies");
        //episodioTheOffice.descripcion = "Se entregan los premios Dundies";
       // episodioTheOffice.duracionEnMinutos = 25;
       // episodioTheOffice.numero = 1;
        temporadaTheOffice.getEpisodios().add(episodioTheOffice);

        episodioTheOffice = new Episodio(2, "Sexual Harassment",25);
       // episodioTheOffice.nombre = "Sexual Harassment";
        //episodioTheOffice.numero = 2; 
        episodioTheOffice.setDescripcion( "Se entregan los premios Dundies");
        //episodioTheOffice.descripcion = "Todd Packer  offends the staff with crude gossip about an upper management scandal.";
       // episodioTheOffice.duracionEnMinutos = 25;
        temporadaTheOffice.getEpisodios().add(episodioTheOffice);

        episodioTheOffice = new Episodio(3,"Office Olympics",25);
        //episodioTheOffice.nombre = "Office Olympics";
        //episodioTheOffice.numero = 3;        
        episodioTheOffice.setDescripcion( "Descripcion episodio 3 temp 2 THE OFFICE");
        //episodioTheOffice.descripcion="Descripcion episodio 3 temp 2 THE OFFICE";
        //episodioTheOffice.duracionEnMinutos = 25;
        temporadaTheOffice.getEpisodios().add(episodioTheOffice);
    }    


}
