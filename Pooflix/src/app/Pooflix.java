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

        // Serie 1 FRIENDS
        Serie serie1 = new Serie();
        serie1.nombre = "Friends";
        this.series.add(serie1);
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
        serie1T1.episodios.add(serie1T1E1);

        Episodio  serie1T1E2 = new Episodio();
        serie1T1E2.nombre = "The One with the Sonogram at the End";
        serie1T1E2.numero = 2;
        serie1T1.episodios.add(serie1T1E2);

        Episodio serie1T1E3 = new Episodio();
        serie1T1E3.nombre ="The One with the Thumb";
        serie1T1E3.numero = 3;
        serie1T1.episodios.add(serie1T1E3);

        Episodio serie1T1E4 = new Episodio();
        serie1T1E4.nombre = "The One with George Stephanopoulos";
        serie1T1E4.numero = 4;
        serie1T1.episodios.add(serie1T1E4);

        Episodio serie1T1E5 = new Episodio();
        serie1T1E5.nombre = "The One with the East German Laundry Detergent";
        serie1T1E5.numero = 5;
        serie1T1.episodios.add(serie1T1E5);


        // Serie 1 EPISODIOS FRIENDS TEMPORADA 2
        Episodio serie1T2E1 = new Episodio();
        serie1T2E1.nombre = "The One with Ross's New Girlfriend";
        serie1T2E1.numero = 1;
        serie1T2.episodios.add(serie1T2E1);

        Episodio serie1T2E2 = new Episodio();
        serie1T2E2.nombre = "The One with the Breast Milk";
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
        serie1T2E5.nombre = 	"The One with Five Steaks and an Eggplant";
        serie1T2E5.numero = 5;
        serie1T2.episodios.add(serie1T2E5);
        


        // serie 2 THE OFFICE
        Serie serie2 = new Serie();
        serie2.nombre = "The Office";
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
        serie2T1.episodios.add(serie2T1E1);

        Episodio serie2T1E2 = new Episodio();
        serie2T1E2.nombre = "Diversity Day";
        serie2T1E2.numero = 2;
        serie2T1.episodios.add(serie2T1E2);

        Episodio serie2T1E3 = new Episodio();
        serie2T1E3.nombre = "Health Care";
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
        serie2T2E1.numero = 1;
        serie2T2.episodios.add(serie2T2E1);

        Episodio serie2T2E2 = new Episodio();
        serie2T2E2.nombre = "Sexual Harassment";
        serie2T2E2.numero = 2;
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