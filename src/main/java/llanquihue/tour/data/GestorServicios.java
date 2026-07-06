package llanquihue.tour.data;

import llanquihue.tour.model.*;
import java.util.ArrayList;
import java.util.List;

public class GestorServicios {

    private List<ServicioTuristico> servicios;

    public GestorServicios() {
        servicios = new ArrayList<>();
        cargarServicios();
    }

    private void cargarServicios() {

        servicios.add(new RutaGastronomica("Ruta del Salmón", 4, 5));
        servicios.add(new RutaGastronomica("Ruta de los sabores", 3, 3));
        servicios.add(new PaseoLacustre("Lago Llanquihue", 2, "Catamarán"));
        servicios.add(new PaseoLacustre("Lago Todos los Santos", 2, "Lancha"));
        servicios.add(new ExcursionCultural("City Tour Patrimonial", 4, "Llanquihue"));
        servicios.add(new ExcursionCultural("Museo Colonial Alemán", 2, "Frutillar"));
    }

    public List<ServicioTuristico> obtenerServicios() {
        return servicios;
    }
}
