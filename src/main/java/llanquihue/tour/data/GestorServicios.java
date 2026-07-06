package llanquihue.tour.data;

import llanquihue.tour.model.*;

public class GestorServicios {

    public void mostrarServicios(){

        RutaGastronomica ruta1 = new RutaGastronomica("Ruta del Salmón", 4, 5);
        RutaGastronomica ruta2 = new RutaGastronomica("Ruta de los sabores", 3,3);

        PaseoLacustre paseo1 = new PaseoLacustre("Lago Llanquihue",2, "Catamarán");
        PaseoLacustre paseo2 = new PaseoLacustre("Lago Todos los Santos", 2, "Lancha");

        ExcursionCultural excursion1 = new ExcursionCultural("City Tour Patrimonial", 4,"Llanquihue");
        ExcursionCultural excursion2 = new ExcursionCultural("Museo Colonial Alemán", 2, "Frutillar");

        System.out.println(ruta1);
        System.out.println(ruta2);

        System.out.println(paseo1);
        System.out.println(paseo2);

        System.out.println(excursion1);
        System.out.println(excursion2);
    }
}
