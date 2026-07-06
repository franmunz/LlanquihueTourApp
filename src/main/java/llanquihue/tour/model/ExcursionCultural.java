package llanquihue.tour.model;

public class ExcursionCultural extends ServicioTuristico{

    private String lugarHistorico;

    public ExcursionCultural(String nombre, int duracionHoras, String lugarHistorico){
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Lugar Histórico");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() + "Lugar Histórico: " + lugarHistorico;
    }
}
