public class Metodos {
    public static void main(String[] args){

        invokeHelloWorldMethods(); // Invocar
        int sumaMethod = suma(2,2);
        int sumaMethod2 = suma(1000,200);
        int sumaMethod6 = suma(1000,200, 200);
        double sumaMethod3 = suma(1000.1,200.2);
        double sumaMethod4 = suma(10.5,20.2);
        System.out.println(sumaMethod);
        System.out.println(sumaMethod2);
    }

    /*
    Reglas de los metodos
    1- Siempre vive dentro de una clase
    2- Un metodo siempre regresa un valor con exception
    del VOID
    3- Un metodo se puede invocar dentro de otro metodo
    4- Un metodo se puede sobrecargar (Overloading)
    5- Siempre debe tener un header
     */

    /*
    @author: Ricardo avalos / ricardo.avalos@cooltesters.com / ravalos
    @date: 01052024
    @description: blabaabab
    @param: int x = Valor entero para sumar
    @param: int y = Valor entero para sumar
    @version: 1
    @updates: Se sobrecargo el metodo
    @dateUpdates:
     */
    public static int suma(int x, int y){
        int laSumaTotal = x+y;
        return laSumaTotal;
    }

    public static int suma(int x, int y, int z){
        int laSumaTotal = x+y;
        return laSumaTotal;
    }

    public static double suma(double x, double y){
        double laSumaTotal = x+y;
        return laSumaTotal;
    }

    public static void helloWorld(){
        System.out.println("Hello World");
    }

    public static void holaMundo(){
        System.out.println("Hola Mundo");
    }

    public static void invokeHelloWorldMethods(){
        helloWorld();
        holaMundo();
    }


}
