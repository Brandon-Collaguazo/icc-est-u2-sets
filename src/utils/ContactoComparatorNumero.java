package utils;

import java.util.Comparator;

import models.Contacto;

public class ContactoComparatorNumero implements Comparator<Contacto> {

    @Override
    public int compare(Contacto o1, Contacto o2) {
        //Primero: el apellido orden alfabeetico
        int comparacionApellido = o1.getApellido().compareToIgnoreCase(o2.getApellido());
        if(comparacionApellido != 0) {
            return comparacionApellido;
        }
        //Segundo: si son iguales comparo por el nombre orden alfabetico
        int comparacionNombre = o1.getNombre().compareToIgnoreCase(o2.getNombre());
        if(comparacionNombre != 0) {
            return comparacionNombre;
        }

        //Tercero: teléfono orden descendente
        int comparacionTelefono = o2.getTelefono().compareToIgnoreCase(o1.getTelefono());
        if(comparacionTelefono != 0) {
            return comparacionTelefono;
        }
        return 0;
    }

    
}
