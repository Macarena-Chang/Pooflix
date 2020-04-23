package app;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    public int numero;
    public List<Episodio> episodios = new ArrayList<>();

    public Episodio getEpisodio( int nro){
        //recorrer episodios (lista)
        //si el nro de episodio del ciclo es igual a "nro"
        //devolver ese episodio

        for (Episodio episo : this.episodios) {
            if(episo.getNumero() == nro){
                
                return episo;
            }
        }
        return null; 
    }

    /**
     * Obtiene un episodio en base a la posiucion dentro del ArrayList.Recordar que
     * los Arraylist la primer posicion es 0
     * *no recorre la lista, directamente toma la posicion
     *  @param pos
     *  @return
     */
    public Episodio getEpisodioAtPosicion(int pos){
        return this.episodios.get(pos);
    }

    public List<Webisode> obtenerWebsodios() {
        List<Webisode> lista = new ArrayList<>();
        for (Episodio epi : this.episodios) {
            if (epi instanceof Webisode)
                lista.add((Webisode) epi);
        }
        return lista;
    }



    
    }  