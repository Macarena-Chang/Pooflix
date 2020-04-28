package app;

import java.util.List;


import app.personas.Actor;

public interface INominable {
    /***************
     **** METODOS****
     ***************/

     //Las interfaces No tienen BODY     

    boolean ganoPreviamente();

    void reproducirTrailerNominacion();

    void sacarSelfie(List<Actor> otrosActor);

    boolean estaNominada();

}