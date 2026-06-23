package llanquihue.tour.model;

public class Operador extends Persona{

    private String servicio;

    public Operador(String nombre, String rut, Direccion direccion, String servicio){
        super(nombre, rut, direccion);
        this.servicio = servicio;
    }

    @Override
    public String toString() {
        return "Nombre Operador: " + getNombre() + ", Tipo de Servicio: " + servicio;
    }
}
