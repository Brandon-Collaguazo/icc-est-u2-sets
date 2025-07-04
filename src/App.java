import java.util.Set;

import controllers.ContactoController;
import controllers.Ejercicios;
import controllers.Sets;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Brandon Collaguazo");
        Sets sets = new Sets();
        //runHashSet(sets);
        //runHashSetLinked(sets);
        //runHashSetTree(sets);
        //runTreeSetComparation(sets);
        //runTreeSetComparationInverso(sets);
        //ContactoController contactoController = new ContactoController();
        Ejercicios ejercicios = new Ejercicios();
    }

    public static void runHashSet(Sets sets) {
        Set<String> elementos = sets.construirHashSet();
        System.out.println("===HASH SET===");
        for(String elemento : elementos) {
            System.out.println(elemento);
        }
    }

    public static void runHashSetLinked(Sets sets) {
        Set<String> elementos = sets.construirLinkedListHashSet();
        System.out.println("===LINKED HASHSET===");
        for(String elemento : elementos) {
            System.out.println(elemento);
        }
    }

    public static void runHashSetTree(Sets sets) {
        Set<String> elementos = sets.construirTreeSet();
        System.out.println("===TREE HASHSET===");
        for(String elemento : elementos) {
            System.out.println(elemento);
        }
    }

    public static void runTreeSetComparation(Sets sets) {
        Set<String> elementos = sets.construirTreeSetConComparador();
        System.out.println("===TreeSet con Comparator===");
        System.out.println("Elementos del TreeSet (ordenado por longitud y luego alfabétcimente)");
        for(String elemento : elementos) {
            System.out.println(elemento);
        }
    }

    public static void runTreeSetComparationInverso(Sets sets) {
        Set<String> elementos = sets.construirTreeSetConComparadorInverso();
        System.out.println("===TreeSet con Comparator Inverso===");
        System.out.println("Elementos del TreeSet (ordenado por longitud y luego alfabétcimente, e invertido)");
        for(String elemento : elementos) {
            System.out.println(elemento);
        }
    }
}
