package llanquihue.tour.model;

public class Tour {

    private String nombreTour;
    private String lugar;
    private double precio;

    public Tour(String nombreTour, String lugar, double precio){
        this.nombreTour = nombreTour;
        this.lugar = lugar;
        this.precio = precio;
    }

    public String getNombreTour() {
        return nombreTour;
    }

    public void setNombreTour(String nombreTour) {
        this.nombreTour = nombreTour;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  "Nombre Tour: " + nombreTour + ", Lugar: " + lugar + ", Precio: " + precio;
    }
}
