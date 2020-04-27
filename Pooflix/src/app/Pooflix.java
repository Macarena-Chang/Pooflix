package app;

import java.util.ArrayList;
import java.util.List;

public class Pooflix {
    /***********
     * ATRIBUTOS
     ***********/
    private List<Pelicula> peliculas = new ArrayList<>();
    private List<Serie> series = new ArrayList<>();
     //Va a guardar todos los objetos que implementen la interface INominable
     List<INominable> nominados = new ArrayList<>();


    /******************
     * GETTERS Y SETTERS
     *******************/

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public List<Serie> getSeries() {
        return series;
    }

    public void setSeries(List<Serie> series) {
        this.series = series;
    }

    public List<INominable> getNominados() {
        return nominados;
    }

    public void setNominados(List<INominable> nominados) {
        this.nominados = nominados;
    }




    /**
     * Busca serie s en lista series y si hay coincidencia devuelve objeto tipo serie
     * @param titulo
     * @return objeto tipo Serie
     */
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


    /**
     * INICIALIZA THE SHINING
    */
    public void inicializarTheShining(){
        Director kubrick = new Director("Stanley Kubrick",70);
        Pelicula theShining = new Pelicula("The Shining",10.0,146,1980,kubrick);
        Actor actorPeli = new Actor("Jack",60);
        theShining.getElenco().add(actorPeli);        
        this.peliculas.add(theShining);
        

    }


    /**
     * INICIALIZA SERIE FRIENDS
     * SE PODRIA PONER  EN inicializarCatalogo pero lo hacemos aparte para mantener orden.
     * */
    public void inicializarFriends() {

        // GENERO
        Genero generoSitCom = new Genero("Sitcom","A sitcom is a genre of comedy centered on a fixed set of characters who carry over from episode to episode." );
        
        // CLASIFICACION
        Clasificacion allAges = new Clasificacion("G",0,"All ages admitted.");

        // Serie 1 FRIENDS
        Serie serie1 = new Serie("Friends", 9.8 , generoSitCom ,allAges, 1994);
        serie1.setDescripcion("Rachel Green, a sheltered but friendly woman, flees her wedding day and wealthy yet unfulfilling life, and finds childhood friend Monica Geller..."); 
        this.series.add(serie1);

        // Serie 1 Friends CREANDO ACTORES Y SUMANDOLOS A LISTA ELENCO
        Actor actorReusandoVariable = new Actor("Courteney Cox",51);
        serie1.getElenco().add(actorReusandoVariable);      

        actorReusandoVariable = new Actor("Jennifer Aniston",51);
        serie1.getElenco().add(actorReusandoVariable);

        actorReusandoVariable = new Actor("Matthew Perry",50);
        serie1.getElenco().add(actorReusandoVariable);      

        actorReusandoVariable = new Actor( "Matt LeBlanc",52);
        serie1.getElenco().add(actorReusandoVariable);   

        actorReusandoVariable = new Actor("Lisa Kudrow",56);
        serie1.getElenco().add(actorReusandoVariable);   



        /*****************************
         * SERIE 1 FRIENDS TEMPORADA 1
         ****************************/
        //Creando temporada y sumandola a la lista temporadas
        Temporada temporadaReusandoVariable = new Temporada();
        temporadaReusandoVariable.setNumero(1);
        serie1.getTemporadas().add(temporadaReusandoVariable);        
        
        //Creando episodios y sumandola a la lista episodios
        Episodio episodioReusandoVariable = new Episodio (1, "The pilot",25);
        episodioReusandoVariable.setDescripcion("Rachel Green entra a Central Perk usando un vestido de novia. Rachel les explica que dejó a su prometido en el altar.");
        temporadaReusandoVariable.getEpisodios().add(episodioReusandoVariable);
        
        
        episodioReusandoVariable = new Episodio (2, "The One with the Sonogram at the End",20);
        episodioReusandoVariable.setDescripcion("Ross recibe la noticia de su exesposa Carol de que será padre del niño que espera.");
        temporadaReusandoVariable.getEpisodios().add(episodioReusandoVariable);
        

        episodioReusandoVariable = new Episodio (3, "The one with the thumb",22);
        episodioReusandoVariable.setDescripcion("Lizzy buys a soda for Phoebe, who, upon opening the can, discovers a severed thumb floating in the soda. The soda company gives Phoebe $7,000.");
        temporadaReusandoVariable.getEpisodios().add(episodioReusandoVariable);

        /*****************************
         * SERIE 1 FRIENDS TEMPORADA 2
         ****************************/
        temporadaReusandoVariable = new Temporada();
        temporadaReusandoVariable.setNumero(2);           
        serie1.getTemporadas().add( temporadaReusandoVariable);

        
        episodioReusandoVariable = new Episodio (1, "The One with Ross's New Girlfriend",30);
        episodioReusandoVariable.setDescripcion("Rachel sees Ross arrive with his new girlfriend, paleontologist and former graduate school classmate Julie.");
        temporadaReusandoVariable.getEpisodios().add(episodioReusandoVariable);

        episodioReusandoVariable = new Episodio(2,"The One with the Breast Milk", 25);
        episodioReusandoVariable.setDescripcion("Descripcion del episodio 2 temporada 2 FRIENDS");
        temporadaReusandoVariable.getEpisodios().add(episodioReusandoVariable);


        episodioReusandoVariable = new Episodio(3,"The One Where Heckles Dies",23);
        episodioReusandoVariable.setDescripcion("Descripcion del episodio 3 temp 2 FRIENDS");
        temporadaReusandoVariable.getEpisodios().add(episodioReusandoVariable);
    }

  
    /**
     * INICIALIZA SERIE THE OFFICE
     * SE PODRIA PONER en inicializarCatalogo pero lo hacemos aparte para mantener orden.
     * */
    public void inicializarTheOffice(){

        // GENERO  
        Genero mockumentary = new Genero("Mockumentary","A mockumentary or docucomedy is a type of movie or television show depicting fictional events but presented as a documentary" );
        
        // CLASIFICACION
        Clasificacion masDe13 = new Clasificacion("PG",13,"Parental guidance suggested – Some material may not be suitable for pre-teenagers.");
     

        //Serie 2 The Office
        Serie serie2 = new Serie("The Office", 9.5 , mockumentary , masDe13, 2005);
        serie2.setDescripcion("The Office is an American mockumentary sitcom television series that depicts the everyday lives of office employees in the Scranton, Pennsylvania");
        this.series.add(serie2); 

        
        //Serie 2 THE OFFICE CREANDO ACTORES Y SUMANDOLOS A LISTA ELENCO
        Actor actorTheOffice = new Actor("Steve Carell",57);       
        serie2.getElenco().add(actorTheOffice);

        actorTheOffice = new Actor("Jenna Fischer",46);        
        serie2.getElenco().add(actorTheOffice);



        /*******************************
         * SERIE 2 THE OFFICE TEMPORADA 1
         ******************************/
        //Creando temporada y sumandola a la lista temporadas
        Temporada temporadaTheOffice = new Temporada();
        temporadaTheOffice.setNumero(1);
        serie2.getTemporadas().add(temporadaTheOffice);

        //Creando episodio y sumandola a la lista episodios
        Episodio episodioTheOffice = new Episodio(1,"Pilot",22);
        episodioTheOffice.setDescripcion("Michael Scott, the regional manager at the Scranton branch of Dunder Mifflin, a distribution company dealing in paper products that is currently under threat of facing downsizing.");
        temporadaTheOffice.getEpisodios().add(episodioTheOffice);

        episodioTheOffice = new Episodio(2, "Diversity Day" , 26);
        episodioTheOffice.setDescripcion("The staff to undergo a racial diversity seminar.");
        temporadaTheOffice.getEpisodios().add(episodioTheOffice);

        episodioTheOffice = new Episodio(3,"Health Care",24);
        episodioTheOffice.setDescripcion("Jim and Pam organize the Games of the First Dunder Mifflin Olympiad.");
        temporadaTheOffice.getEpisodios().add(episodioTheOffice);

        //CREANDO WEBISODE
        Webisode web1 = new Webisode(4,"The Mentor Webisode",8,"https://www.youtube.com/watch?v=mxHtJfplt1U");
        web1.setDescripcion("Angela becomes Erin's mentor in this EXCLUSIVE Webisode");
        temporadaTheOffice.getEpisodios().add(web1);
        

        /*******************************
         * SERIE 2 THE OFFICE TEMPORADA 2
         ******************************/ 
        temporadaTheOffice = new Temporada();
        temporadaTheOffice.setNumero(2);
        serie2.getTemporadas().add(temporadaTheOffice);

        episodioTheOffice = new Episodio(1,"The Dundies",25);
        episodioTheOffice.setDescripcion( "Se entregan los premios Dundies");
        temporadaTheOffice.getEpisodios().add(episodioTheOffice);

        episodioTheOffice = new Episodio(2, "Sexual Harassment",25);
        episodioTheOffice.setDescripcion( "Se entregan los premios Dundies");
        temporadaTheOffice.getEpisodios().add(episodioTheOffice);

        episodioTheOffice = new Episodio(3,"Office Olympics",25);
        episodioTheOffice.setDescripcion( "Descripcion episodio 3 temp 2 THE OFFICE");
        temporadaTheOffice.getEpisodios().add(episodioTheOffice);
    }

    public void inicializarListaNominados() {

        for (Pelicula peli : this.peliculas) {
            this.nominados.add(peli);
            for (Actor actor : peli.getElenco())
                this.nominados.add(actor);

        }
        for (Serie serie : this.series) {
            for (Actor actor : serie.getElenco())
                this.nominados.add(actor);

        }
    }
       
    public void reproducirTrailersDeNominacion() {
        for (INominable nominado : nominados) {

            nominado.reproducirTrailerNominacion();
        }
    }




}
