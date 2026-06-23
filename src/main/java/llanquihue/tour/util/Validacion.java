package llanquihue.tour.util;

public class Validacion {

    public static boolean validarRut(String rut) {

        if (rut == null)
            return false;

        return (!rut.matches("[0-9]+-[0-9kK]"));
    }
}