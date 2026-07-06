package llanquihue.tour.model;

public class ServicioTuristico {

    private String nombre;
    private int duracionHoras;

    public ServicioTuristico (String nombre, int duracionHoras){
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    @Override
    public String toString() {
        return "Nombre: "+ nombre + ", " + "Duración de horas: " + duracionHoras + ", ";
    }
}
