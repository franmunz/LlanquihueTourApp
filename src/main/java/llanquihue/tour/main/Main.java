package llanquihue.tour.main;

import llanquihue.tour.model.*;
import llanquihue.tour.data.GestorDatos;
import llanquihue.tour.data.GestorServicios;
import llanquihue.tour.gui.VentanaLlanquihue;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        new VentanaLlanquihue();

        GestorDatos datos = new GestorDatos();
        datos.cargarDesdeArchivo("datos.txt");

        System.out.println("=== TOURS ===");
        for (Tour t : datos.listarTours()) {
            System.out.println(t);
        }

        System.out.println("\n=== CLIENTES ===");
        for (Cliente c : datos.listarClientes()) {
            System.out.println(c);
        }

        System.out.println("\n=== GUIAS ===");
        for (Guia g : datos.listarGuias()) {
            System.out.println(g);
        }

        System.out.println("\n=== OPERADORES ===");
        for (Operador o : datos.listarOperadores()) {
            System.out.println(o);
        }

        System.out.println("\n=== FILTRO POR LUGAR ===");
        for (Tour t : datos.filtrarPorLugar("Puerto Varas")) {
            System.out.println(t);
        }

        System.out.println("\n=== FILTRO POR PRECIO <= 20000 ===");
        for (Tour t : datos.filtrarPorPrecioMax(22000)) {
            System.out.println(t);
        }

        System.out.println("\n=== BUSCAR TOUR ===");
        Tour encontrado = datos.buscarTourPorNombre("City Tour");

        if (encontrado != null) {
            System.out.println(encontrado);
        } else {
            System.out.println("No encontrado");
        }

        System.out.println("\n=== SERVICIOS TURISTICOS ===\n");

        GestorServicios gestor = new GestorServicios();

        List<ServicioTuristico> lista = gestor.obtenerServicios();

        for(ServicioTuristico servicio : lista){
            servicio.mostrarInformacion();
            System.out.println("----------------");
        }

        GestorDatos entidades = new GestorDatos();
        entidades.mostrarEntidades();


    }

}
