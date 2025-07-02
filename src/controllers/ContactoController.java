package controllers;

import java.util.Set;
import java.util.TreeSet;

import models.Contacto;
import utils.ContactoComparator;
import utils.ContactoComparatorNumero;

public class ContactoController {

    public ContactoController() {
        runTreeContacto();
        reunTreeContactoNumero();
    }

    private void runTreeContacto() {
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparator());
        // Agregamos algunos contactos
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        
        System.out.println("Contacto orden alfabetico apellido - nombre");
        for(Contacto contacto : agenda) {
            System.out.println(contacto.getNombre() + " " + contacto.getApellido() + " - " + contacto.getTelefono());
        }
    }

    private void reunTreeContactoNumero() {
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparatorNumero());
        // Agregamos algunos contactos
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        
        System.out.println("===Contactos orden alfabetico apellido - nombre - telefono(des)");
        for(Contacto contacto : agenda) {
            System.out.println(contacto.getNombre() + " " + contacto.getApellido() + " - " + contacto.getTelefono());
        }
    }
}
