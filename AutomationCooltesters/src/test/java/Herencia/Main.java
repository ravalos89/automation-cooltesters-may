package Herencia;

public class Main {
    public static void main(String[] args){
        /* Tipos de herencia
        1- Jerarquica
        2- lineal
        3- arbol
         */

        /* Caracteristicas
        - Superclases(Es la clase padre) y subclases(clase hijo)
        - una clase solo puede tener una clase padre o superclase pero N clases hijo o subclases
        - Keyword: Extends
         */

        Padre juan = new Padre("Negros", "Morena", "Ondulado", 1.65, "O+", true);
        Padre elizabeth = new Padre("Cafe claros", "Blanca", "Ondulado", 1.60, "O+", true);

        juan.alimentacionSaludable(false);
        elizabeth.alimentacionSaludable(true);
        juan.hacerEjercicio(true);
        //juan.jugarFutbol();

        Hijo ricardo = new Hijo("Cafe oscuro", "blanca", "Ondulado", 1.74, "O+", false);
        ricardo.hacerEjercicio(true);
        ricardo.jugarFutbol();

        Nieto ricardito = new Nieto("Cafe Oscuro", "Morena", "Liso", 1.2, "O+", false);
        ricardito.esExtrovertido(true);
        ricardito.jugarFutbol();


    }
}
