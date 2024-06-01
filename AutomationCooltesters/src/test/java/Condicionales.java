public class Condicionales {

    public static void main(String[] args){

        /*
        Estructura condicional

        - IF *
        - IF ELSE *
        - NESTED IF *
        - IF ELSE IF *
        - SWITCH
         */

        int velocidadActual = 90; // KM/h
        int limiteVelocidad = 80; // KM/h
        boolean carretera = false;

        if(carretera==true){
            // block code
            limiteVelocidad = 100; // Sobreescribi mi variable
            // Detector de velocidad permitida
            if(velocidadActual>limiteVelocidad){ // TRUE
                System.out.println("MULTA");
            }else{ // FALSE
                System.out.println("CONTINUA TU CAMINO");
            }
        } else if(velocidadActual>limiteVelocidad){ // TRUE - No estamos en carretera
            System.out.println("MULTA");
        }else{ // FALSE
            System.out.println("CONTINUA TU CAMINO");
        }

        // Actividad 1 - Agregar la condicion de Zona escolar dentro del programa.

        // SWITCH

        int temperatura = 0;

        switch(temperatura){
            case 30:
            case 35:
                System.out.println("Clima caliente");
                break;
            case 10:
            case 0:
                System.out.println("Clima Frio");
                break;
            default:
                System.out.println("Clima no registrado");
                break;
        }

    }
}
