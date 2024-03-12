import java.util.Arrays;
import java.util.Scanner;

public class TablaArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Tamaño array
        System.out.println("Dame el largo del array");
        int cantidad = sc.nextInt();
        int [] tablaArrayDinamica = new int [cantidad];


        for (int i = 0; i < cantidad; i++){
            System.out.println("agregame numeritos");
            int contenido = sc.nextInt();
            tablaArrayDinamica[i] = contenido;
        }
        //imprimo el array
        System.out.println("El contenido de la tabla Dinamica es");
        System.out.println(Arrays.toString(tablaArrayDinamica));


    }
}
