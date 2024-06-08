package MarioBros;

public class Main {
    public static void main(String[] args){
        Personajes mario = new Personajes(1.50, true, "rojo", true);
        mario.volar();
        mario.correr();

        Personajes luigi = new Personajes(1.70, true, "verde");
        luigi.correr();
        luigi.saltar();
        luigi.nombrePersonaje = "Luigi";
        luigi.soyPersonaje();

        Personajes bowser = new Personajes(3.0, "Bowser", "verde");
        bowser = new Personajes(3, false, "verde"); // opcion 1
        bowser.tienePoder = false; // opcion 2
        bowser.soyPersonaje();
    }
}
