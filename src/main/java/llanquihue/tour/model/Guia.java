package llanquihue.tour.model;

import llanquihue.tour.interfaces.Registrable;

public class Guia extends Persona implements Registrable {

    private String especialidad;

    public Guia(String nombre, String rut, Direccion direccion, String especialidad){
        super(nombre, rut, direccion);
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Nombre Guia: " + getNombre() + ", Especialidad: " + especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public void mostrarResumen(){
        System.out.println("Guía: " + getNombre() + " | Especialidad: " + especialidad);
    }

}
