package llanquihue.tour.model;

public class Cliente extends Persona {

    private Tour tour;

    public Cliente(String nombre, String rut, Direccion direccion, Tour tour) {
        super(nombre, rut, direccion);
        this.tour = tour;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    @Override
    public String toString() {

        String tourNombre = (tour != null)
                ? tour.getNombreTour()
                : "SIN TOUR ASIGNADO";

        return super.toString() + "\nTour adquirido: " + tourNombre;
    }
}