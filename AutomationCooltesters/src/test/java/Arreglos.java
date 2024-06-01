public class Arreglos {
    public static void main(String[] args){

        // Arreglo unidimensional
        String[] dias = {"L", "M", "Mi","J", "V", "S", "D", "X"};
        System.out.println(dias[6]+dias[1]);

        for(int i=0; i < dias.length; i++){
            System.out.println(dias[i]);
        }

        // Arreglo bidimensional
        String[][] datosPersonales = new String[8][8];
        datosPersonales[0][0] = "Ricardo Avalos";
        datosPersonales[0][1] = "Soltero";
        datosPersonales[1][1] = "Rene Orozco";
        datosPersonales[1][3] = "1234669797";
        datosPersonales[3][1] = "Genesis";
        System.out.println(datosPersonales[0][0] + " "+datosPersonales[0][1]);
        System.out.println(datosPersonales[0][1]);
    }
}
