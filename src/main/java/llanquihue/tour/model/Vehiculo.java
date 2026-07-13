package llanquihue.tour.model;

import llanquihue.tour.interfaces.Registrable;

public class Vehiculo implements Registrable {

    private String patente;
    private String tipo;

    public Vehiculo(String patente, String modelo){
        this.patente = patente;
        this.tipo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public void mostrarResumen(){
        System.out.println("Vehículo: " + tipo + ", " + patente);
    }
}
