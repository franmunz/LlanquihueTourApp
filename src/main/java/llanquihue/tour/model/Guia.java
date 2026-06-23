package llanquihue.tour.model;

public class Guia extends Persona{

    private String especialidad;

    public Guia(String nombre, String rut, Direccion direccion, String especialidad){
        super(nombre, rut, direccion);
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Nombre Guia: " + getNombre() + ", Especialidad: " + especialidad;
    }
}
