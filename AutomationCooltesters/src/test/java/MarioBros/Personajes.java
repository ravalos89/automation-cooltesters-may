package MarioBros;

public class Personajes{

    // Estados (variables de instancia)
    private double tamano;
    boolean tieneSombrero;
    String color;
    boolean tienePoder;
    String nombrePersonaje;

    // Constructor
    public Personajes(double tamano, boolean tieneSombrero, String color, boolean tienePoder){
        this.tamano = tamano;
        this.tieneSombrero=tieneSombrero;
        this.color = color;
        this.tienePoder = tienePoder;
    }

    public Personajes(double tamano, boolean tieneSombrero, String color){
        this.tamano = tamano;
        this.tieneSombrero=tieneSombrero;
        this.color = color;
        this.tienePoder = false;
    }

    public Personajes(double tamano, String nombrePersonaje, String color){
        this.tamano = tamano;
        this.nombrePersonaje=nombrePersonaje;
        this.color = color;
        this.tienePoder = false;
    }

    // Comportamientos (Metodos)
    public void saltar(){
        System.out.println("El personaje salta");
    }

    public void comerHongo(){
        System.out.println("Personaje crece");
    }

    public void estrella(){
        System.out.println("Personaje adquiere poder");
    }

    public void correr(){
        System.out.println("Personaje corriendo");
    }

    public void volar(){
        System.out.println("Personaje volando");
    }

    public void soyPersonaje(){
        System.out.println("Soy "+nombrePersonaje);
    }

}
