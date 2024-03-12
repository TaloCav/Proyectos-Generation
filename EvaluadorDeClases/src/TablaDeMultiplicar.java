import java.util.Scanner;

public class TablaDeMultiplicar {
    public static void main(String[] args) {

        //variable
        Scanner sc = new Scanner(System.in);
        int adi = 10;

        //numero para multiplicar

        System.out.println("Dame un numero pa multiplicar shoro");
        int numero = sc.nextInt();

        //bucle petazo
        while (adi >= 0){
            int tablaMultiplicar = numero * adi;
            System.out.println(numero + " x " + adi + " = " + tablaMultiplicar);
            adi--;
        }

    }
}
