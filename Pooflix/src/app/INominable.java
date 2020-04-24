package app;

import java.util.List;

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