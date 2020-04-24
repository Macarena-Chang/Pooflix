package app;

public class Clasificacion {
    /***********
     * ATRIBUTOS
     ***********/
    private String tipo;
    private int edadMin;
    private String descripcion;

    /***********
     * Constructor
     ***********/

    public Clasificacion(String tipo, int edadMin, String descripcion) {
        this.tipo = tipo;
        this.edadMin = edadMin;
        this.descripcion = descripcion;
    }

    /******************
     * GETTERS Y SETTERS
     *******************/

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}