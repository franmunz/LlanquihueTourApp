package llanquihue.tour.data;

import llanquihue.tour.interfaces.Registrable;
import llanquihue.tour.model.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class GestorDatos {

    private ArrayList<Tour> tours;
    private ArrayList<Guia> guias;
    private ArrayList<Operador> operadores;
    private ArrayList<Cliente> clientes;
    private ArrayList<Registrable> entidades;

    public GestorDatos() {
        this.tours = new ArrayList<>();
        this.guias = new ArrayList<>();
        this.operadores = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.entidades = new ArrayList<>();
    }

    public void cargarDesdeArchivo(String ruta) {

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] p = linea.split(";");

                for(int i = 0; i < p.length; i++){
                    p[i] = p[i].trim();
                }

                switch (p[0]) {

                    case "TOUR":
                        agregarTour(new Tour(p[1], p[2], Double.parseDouble(p[3])));
                        break;

                    case "GUIA":
                        agregarGuia(new Guia(
                                p[1],
                                p[2],
                                new Direccion(p[3], p[4]),
                                p[5]));

                        break;

                    case "OPERADOR":
                        agregarOperador(new Operador(
                                p[1],
                                p[2],
                                new Direccion(p[3], p[4]),
                                p[5]));
                        break;

                    case "CLIENTE":
                        agregarCliente(new Cliente(
                                p[1],
                                p[2],
                                new Direccion(p[3],p[4] ),
                                buscarTourPorNombre(p[5])));
                        break;
                }
            }

        } catch (Exception e) {
            System.out.println("Error al cargar archivo: " + e.getMessage());
        }
    }



    public void agregarTour(Tour t) {
        tours.add(t);
    }

    public void agregarGuia(Guia g) {
        guias.add(g);
        entidades.add(g);
    }

    public void agregarOperador(Operador o) {
        operadores.add(o);
    }
    public void agregarCliente(Cliente c) {
        clientes.add(c);
    }
    public void agregarVehiculo(Vehiculo v) {
        entidades.add(v);
    }

    public void agregarColaborador(ColaboradorExterno c) {
        entidades.add(c);
    }

    public ArrayList<Tour> listarTours() {
        return tours;
    }

    public ArrayList<Guia> listarGuias() {
        return guias;
    }

    public ArrayList<Operador> listarOperadores() {
        return operadores;
    }
    public ArrayList<Cliente> listarClientes() {
        return clientes;
    }


    public Tour buscarTourPorNombre(String nombre) {

        for (Tour t : tours) {

            if (t.getNombreTour().trim().equalsIgnoreCase(nombre.trim())) {
                return t;
            }
        }
        return null;
    }

    public ArrayList<Tour> filtrarPorLugar(String lugar) {

        ArrayList<Tour> resultado = new ArrayList<>();

        for (Tour t : tours) {
            if (t.getLugar().trim().equalsIgnoreCase(lugar.trim())) {
                resultado.add(t);
            }
        }

        return resultado;
    }

    public ArrayList<Tour> filtrarPorPrecioMax(double precioMax) {

        ArrayList<Tour> resultado = new ArrayList<>();

        for (Tour t : tours) {
            if (t.getPrecio() <= precioMax) {
                resultado.add(t);
            }
        }

        return resultado;
    }

    public void mostrarEntidades(){

        entidades.add(new Guia("Ana Perez", "20856754-3", new Direccion("San Pedro", "Puerto Varas"), "Trekking"));
        entidades.add(new Vehiculo("AB-1234", "Minibús"));
        entidades.add(new ColaboradorExterno("Carlos Díaz", "Chófer"));
        {
            for (Registrable r : entidades){
                r.mostrarResumen();

                if (r instanceof Guia g){
                    System.out.println("-> Especialidad: " + g.getEspecialidad());

                } else if (r instanceof Vehiculo v){
                    System.out.println("-> Tipo: " + v.getTipo());

                } else if (r instanceof ColaboradorExterno c){
                    System.out.println("-> Colaborador: " + c.getRol());
                }

            }
        }
    }
}




