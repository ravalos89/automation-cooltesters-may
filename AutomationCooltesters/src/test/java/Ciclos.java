public class Ciclos {
    public static void main(String[] args){
        /*
        While
        Do while
        For
         */

        // contador hasta 100
        int num = 1;

        while(num<= 100){
            // Block code
            System.out.println(num);
            num++;
        }

        // cuantas veces se tiene que sumar un mismo numero para llegar a 100
        int numeroSumar = 1;
        int sumTotal = 0;
        int count = 0;

        do{
            sumTotal = sumTotal+numeroSumar;
            ++count;
        } while(sumTotal < 100);

        System.out.println("El numero " + numeroSumar + " se sumo: " + count + " veces");

        int numeroFor = 100;
        for(int i=1;i<=numeroFor;i++){
            System.out.println("El numero For es "+ i);
        }
    }
}
