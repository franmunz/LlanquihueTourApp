package llanquihue.tour.main;

import llanquihue.tour.data.GestorDatos;
import llanquihue.tour.model.Tour;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        GestorDatos gestor = new GestorDatos();

        ArrayList<Tour> tours = gestor.cargarTours();

        System.out.println("TODOS LOS TOURS");

        for (Tour t : tours) {
            System.out.println(t);
        }

        System.out.println("TOURS GASTRONOMICOS");

        for (Tour t : tours) {

            if (t.getTipo().equals("Gastronomía")) {
                System.out.println(t);
            }

        }

    }
}