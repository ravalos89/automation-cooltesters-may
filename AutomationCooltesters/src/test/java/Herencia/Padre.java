package Herencia;

// Superclase
public class Padre {

    // Estados
    public String colorOjos;
    public String colorPiel;
    public String tipoCabello;
    public double altura;
    public String tipoSangre;
    public boolean enfermedad;

    // Crear constructor con el IDE automatico
    /*
    Click derecho clase -> Generate -> Constructor y seleccionamos todas las variables
     */

    public Padre(String colorOjos, String colorPiel, String tipoCabello, double altura, String tipoSangre, boolean enfermedad) {
        this.colorOjos = colorOjos;
        this.colorPiel = colorPiel;
        this.tipoCabello = tipoCabello;
        this.altura = altura;
        this.tipoSangre = tipoSangre;
        this.enfermedad = enfermedad;
    }

    // Comportamientos
    public boolean hacerEjercicio(boolean haceEjercicio){
        return haceEjercicio;
    }

    public boolean esExtrovertido(boolean var){
        return var;
    }

    public boolean alimentacionSaludable(boolean alimentacion){
        return alimentacion;
    }

}
