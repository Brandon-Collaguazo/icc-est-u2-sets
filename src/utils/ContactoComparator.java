package utils;

import java.util.Comparator;

import models.Contacto;

public class ContactoComparator implements Comparator<Contacto> {

    @Override
    public int compare(Contacto o1, Contacto o2) {
        //Primero el apellido orden alfabeetico
        int comparacionApellido = o1.getApellido().compareToIgnoreCase(o2.getApellido());
        if(comparacionApellido != 0) {
            return comparacionApellido;
        }
        //Segundo si son iguales comparo por el nombre orden alfabetico
        int comparacionNombre = o1.getNombre().compareToIgnoreCase(o2.getNombre());
        if(comparacionNombre != 0) {
            return comparacionNombre;
        }
        return 0;
    }
    
}
