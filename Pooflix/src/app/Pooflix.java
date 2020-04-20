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
        
        //GENEROS
        Genero generoSitCom = new Genero();
        generoSitCom.descripcion="A sitcom is a genre of comedy centered on a fixed set of characters who carry over from episode to episode.";
        generoSitCom.nombre="Sitcom";

        Genero mockumentary = new Genero();
        mockumentary.nombre = "Mockumentary";
        mockumentary.descripcion = "A mockumentary or docucomedy is a type of movie or television show depicting fictional events but presented as a documentary";

        //CLASIFICACION
        Clasificacion masDe13 = new Clasificacion();
        masDe13.tipo = "Para mayores de 13 años";
        masDe13.edadMin = 13;
        masDe13.descripcion ="Contiene.......";
        
       // Serie 1 FRIENDS
        Serie serie1 = new Serie();
        serie1.nombre = "Friends";
        serie1.descripcion="Rachel Green, a sheltered but friendly woman, flees her wedding day and wealthy yet unfulfilling life, and finds childhood friend Monica Geller...";       
        serie1.calificacion= 9.8;
        serie1.genero = generoSitCom;
        serie1.clasificacion = masDe13;
        serie1.anio= 1994;        
        this.series.add(serie1);

        //Serie 1 Friends ELENCO
        Actor courteneyCox = new Actor();
        courteneyCox.nombre= "Courteney Cox";
        courteneyCox.edad = 51;
        serie1.elenco.add(courteneyCox);

        Actor jenniferAniston = new Actor();
        jenniferAniston.nombre= "Jennifer Aniston";
        jenniferAniston.edad = 51;
        serie1.elenco.add(jenniferAniston);

        Actor matthewPerry = new Actor();
        matthewPerry.nombre="Matthew Perry";
        matthewPerry.edad=50;
        serie1.elenco.add(matthewPerry);

        Actor mattLeBlanc = new Actor();
        mattLeBlanc.nombre="Matt LeBlanc";
        mattLeBlanc.edad=52;
        serie1.elenco.add(mattLeBlanc);

        Actor lisaKudrow = new Actor();
        lisaKudrow.nombre="Lisa Kudrow";
        lisaKudrow.edad=56;
        serie1.elenco.add(lisaKudrow);





        // Serie 1 TEMPORADAS FRIENDS
        Temporada serie1T1 = new Temporada();
        serie1T1.numero = 1;
        Temporada serie1T2 = new Temporada();
        serie1T2.numero = 2;

        serie1.temporadas.add(serie1T1);
        serie1.temporadas.add(serie1T2);

        // Serie 1 EPISODIOS FRIENDS TEMPORADA 1
        Episodio serie1T1E1 = new Episodio();
        serie1T1E1.nombre = "The pilot";
        serie1T1E1.numero = 1;
        serie1T1E1.descripcion = "Rachel Green entra a Central Perk usando un vestido de novia. Rachel les explica que dejó a su prometido en el altar.";
        serie1T1E1.duracionEnMinutos = 25;
        serie1T1.episodios.add(serie1T1E1);

        Episodio  serie1T1E2 = new Episodio();
        serie1T1E2.nombre = "The One with the Sonogram at the End";
        serie1T1E2.numero = 2;
        serie1T1E2.descripcion="Ross recibe la noticia de su exesposa Carol de que será padre del niño que espera.";
        serie1T1E2.duracionEnMinutos=20;
        serie1T1.episodios.add(serie1T1E2);

        Episodio serie1T1E3 = new Episodio();
        serie1T1E3.nombre ="The One with the Thumb";
        serie1T1E3.descripcion="Lizzy buys a soda for Phoebe, who, upon opening the can, discovers a severed thumb floating in the soda. The soda company gives Phoebe $7,000.";
        serie1T1E3.duracionEnMinutos=22;
        serie1T1E3.numero = 3;
        serie1T1.episodios.add(serie1T1E3);

        Episodio serie1T1E4 = new Episodio();
        serie1T1E4.nombre = "The One with George Stephanopoulos";
        serie1T1E4.numero = 4;
        serie1T1E4.descripcion="A pizza delivery guy (Sean Whalen) arrives, although he brings them the wrong pizza; the one he brought was meant for G. Stephanopoulos ";
        serie1T1E4.duracionEnMinutos=28;
        serie1T1.episodios.add(serie1T1E4);

        Episodio serie1T1E5 = new Episodio();
        serie1T1E5.nombre = "The One with the East German Laundry Detergent";
        serie1T1E5.numero = 5;
        serie1T1E3.descripcion="Descripcion del episodio 5 Temporada 1 de FRIENDS";
        serie1T1E3.duracionEnMinutos=20;
        serie1T1.episodios.add(serie1T1E5);


        // Serie 1 EPISODIOS FRIENDS TEMPORADA 2
        Episodio serie1T2E1 = new Episodio();
        serie1T2E1.nombre = "The One with Ross's New Girlfriend";
        serie1T2E1.numero = 1;
        serie1T2E1.descripcion="Rachel sees Ross arrive with his new girlfriend, paleontologist and former graduate school classmate Julie.";
        serie1T2E1.duracionEnMinutos=30;
        serie1T2.episodios.add(serie1T2E1);

        Episodio serie1T2E2 = new Episodio();
        serie1T2E2.nombre = "The One with the Breast Milk";
        serie1T2E2.descripcion="Descripcion del episodio 2 temporada 2 FRIENDS";
        serie1T2E2.duracionEnMinutos= 25;
        serie1T2E2.numero = 2;
        serie1T2.episodios.add(serie1T2E2);

        Episodio serie1T2E3 = new Episodio();
        serie1T2E3.nombre = "The One Where Heckles Dies";
        serie1T2E3.numero = 3;
        serie1T2.episodios.add(serie1T2E3);

        Episodio serie1T2E4 = new Episodio();
        serie1T2E4.nombre = "The One with Phoebe's Husband";
        serie1T2E4.numero = 4;
        serie1T2.episodios.add(serie1T2E4);

        Episodio serie1T2E5 = new Episodio();
        serie1T2E5.nombre = "The One with Five Steaks and an Eggplant";
        serie1T2E5.numero = 5;
        serie1T2.episodios.add(serie1T2E5);
        


        // serie 2 THE OFFICE
        //CAST THE OFFICE
        Actor steveCarrel = new Actor();
        steveCarrel.nombre="Steve Carell";
        steveCarrel.edad=57;

        Actor jennaFischer = new Actor();
        jennaFischer.nombre="Jenna Fischer";
        jennaFischer.edad=46;



        Serie serie2 = new Serie();
        serie2.nombre = "The Office";
        serie2.descripcion="The Office is an American mockumentary sitcom television series that depicts the everyday lives of office employees in the Scranton, Pennsylvania";
        serie2.calificacion=9.5;
        serie2.genero= mockumentary;
        serie2.clasificacion = masDe13;
        serie2.anio=2005;
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
        serie2T1E1.descripcion="Michael Scott, the regional manager at the Scranton branch of Dunder Mifflin, a distribution company dealing in paper products that is currently under threat of facing downsizing.";
        serie2T1E1.duracionEnMinutos=22;
        serie2T1.episodios.add(serie2T1E1);

        Episodio serie2T1E2 = new Episodio();
        serie2T1E2.nombre = "Diversity Day";
        serie2T1E2.descripcion="The staff to undergo a racial diversity seminar.";
        serie2T1E2.duracionEnMinutos= 26;
        serie2T1E2.numero = 2;
        serie2T1.episodios.add(serie2T1E2);

        Episodio serie2T1E3 = new Episodio();
        serie2T1E3.nombre = "Health Care";
        serie2T1E3.descripcion="Jim and Pam organize the Games of the First Dunder Mifflin Olympiad.";
        serie2T1E3.duracionEnMinutos= 24;
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
        serie2T2E1.descripcion="Se entregan los premios Dundies";
        serie2T2E1.duracionEnMinutos=25;
        serie2T2E1.numero = 1;
        serie2T2.episodios.add(serie2T2E1);

        Episodio serie2T2E2 = new Episodio();
        serie2T2E2.nombre = "Sexual Harassment";
        serie2T2E2.numero = 2;
        serie2T2E2.descripcion="Todd Packer  offends the staff with crude gossip about an upper management scandal.";
        serie2T2E2.duracionEnMinutos=25;
        serie2T2.episodios.add(serie2T2E2);

        Episodio serie2T2E3 = new Episodio();
        serie2T2E3.nombre = "Office Olympics";
        serie2T2E3.numero = 3;
        
        serie2T2.episodios.add(serie2T2E3);

        Episodio serie2T2E4 = new Episodio();
        serie2T2E4.nombre ="The Fire";
        serie2T2E4.numero = 4;
        serie2T2.episodios.add(serie2T2E4);

        Episodio serie2T2E5 = new Episodio();
        serie2T2E5.nombre = "Halloween";
        serie2T2E5.numero = 5;
        serie2T2.episodios.add(serie2T2E5);

        
    }

}