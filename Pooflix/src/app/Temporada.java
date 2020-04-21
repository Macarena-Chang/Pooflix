package app;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    public int numero;
    public List<Episodio> episodios = new ArrayList<>();
    public List<Webisode> webisodes = new ArrayList<>(); 
    

    public Episodio getEpisodio( int nro){
        //recorrer episodios (lista)
        //si el nro de episodio del ciclo es igual a "nro"
        //devolver ese episodio

        for (Episodio episo : this.episodios) {
            if(episo.numero == nro){
                
                return episo;
            }
        }
        return null; 
    }

    public Webisode getWebisode(int nro){
        for(Webisode epi : this.webisodes){
            if(epi.numero == nro){

                return epi;

            }
            
        } 
        return null;
    }
    }  