package llanquihue.tour.model;

public class RutaGastronomica extends ServicioTuristico{

    private int numeroDeParadas;

    public RutaGastronomica(String nombre, int duracionHoras, int numeroDeParadas){
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Ruta Gastronómica");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() + "Número de paradas: " + numeroDeParadas;
    }
}
