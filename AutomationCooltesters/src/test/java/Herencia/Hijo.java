package Herencia;

public class Hijo extends Padre{

    public boolean divorciado;

    public Hijo(String colorOjos, String colorPiel, String tipoCabello, double altura, String tipoSangre, boolean enfermedad) {
        super(colorOjos, colorPiel, tipoCabello, altura, tipoSangre, enfermedad);
    }

    public void jugarFutbol(){
        System.out.println("Jugar Futbol");
    }

}
