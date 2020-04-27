package app;

import java.util.List;

public class Actor extends Persona implements INominable {

    /***********
     * Constructor
     ***********/
    public Actor(String nombre, int edad) {
        this.setNombre(nombre);
        this.setEdad(edad);
    }

    /***********
     * EL TIPO ACTOR DEBE IMPLEMENTAR LOS METODOS ABSTRACTOS HEREDADOS
     ***********/
    public boolean ganoPreviamente() {
        /// aca va la logica para ver si esta en una base de datos de ganadores previos
        return true;
    }

    public void reproducirTrailerNominacion() {
        // CODIGO
        System.out.println("Reproduciendo trailer de escenas de" + this.getNombre());
    }

    public void sacarSelfie(List<Actor> otrosActor) {
        // CODIGO
    }

    public void decirDiscurso() {
        System.out.println("el actor/actriz " + this.getNombre() + " Ha ganado y  dice discurso");
    }

    @Override
    public boolean estaNominada() {
        INominable getNominados;
        System.out.println(this.getNombre()+ " está nominado");
        return true;
    }

}

