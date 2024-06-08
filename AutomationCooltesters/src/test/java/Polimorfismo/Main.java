package Polimorfismo;

public class Main {
    public static void main(String[] args){

        // Abstraccion

        /*
        Vehicle = Car, Bike, Scooter, Walking.
         */

        /*
        Polimorfismo

        clase o capacidad del objeto de adoptar muchas instancias o formas.
         */

        Animal ricardo = new Humano();
        //ricardo.speak();

        ricardo = new Perro();
        ricardo.speak();

        ricardo = new Gato();
        ricardo.speak();
    }
}
