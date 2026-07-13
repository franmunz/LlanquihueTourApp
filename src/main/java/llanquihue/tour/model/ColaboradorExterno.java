package llanquihue.tour.model;

import llanquihue.tour.interfaces.Registrable;

public class ColaboradorExterno implements Registrable {

    private String nombre;
    private String rol;

    public ColaboradorExterno(String nombre, String rol){
        this.nombre = nombre;
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    @Override
    public void mostrarResumen(){
        System.out.println("Colaborador: " + nombre + " | Empresa: " + rol);
    }
}
