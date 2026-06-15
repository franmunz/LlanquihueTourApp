package llanquihue.tour.data;

import llanquihue.tour.model.Tour;
import java.io.*;
import java.util.ArrayList;

public class GestorDatos {

    public ArrayList<Tour> cargarTours(){

        ArrayList<Tour> lista = new ArrayList<>();

        try{
            File archivo = new File(getClass().getClassLoader().getResource("tours.txt").getFile());

            BufferedReader br = new BufferedReader(new FileReader(archivo));

            String linea;

            while((linea = br.readLine()) != null){

                String[] datos = linea.split(";");

                String nombre = datos[0];
                String tipo = datos[1];
                int precio = Integer.parseInt(datos[2]);

                Tour tour = new Tour(nombre, tipo, precio);

                lista.add(tour);
            }

            br.close();

        } catch (Exception e){
            System.out.println("Error al leer archivo " + e.getMessage());
        }

        return lista;

    }
}
