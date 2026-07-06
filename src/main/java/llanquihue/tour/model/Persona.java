package llanquihue.tour.model;

public class Persona {

    private String nombre;
    private String rut;
    private Direccion direccion;

    public Persona(String nombre, String rut, Direccion direccion){

        if (!rut.matches("[0-9]+-[0-9kK]")){
            throw new IllegalArgumentException("Formato de RUT no válido.");
        }

        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
    }


    public String getNombre() {
        return nombre;
    }


    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Rut: " + rut + ", Direccion: " + direccion;
    }
}