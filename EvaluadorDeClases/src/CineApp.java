import java.util.Scanner;

public class CineApp {

    public static void main(String[] args) {

        // Usuario debe ingresar su edad.

        Scanner scan = new Scanner(System.in);

        System.out.println("¡Bienvenido a CineApp! Por favor, introduzca su edad para evaluar el costo de su " +
                "boleto: ");
        int edad = scan.nextInt();
        scan.nextLine();

        /*
        - "3.500$" para edades normales.
        - "60% de descuento" para edades por debajo de 5 años.
        - "55% de descuento" para edades mayores a 60 años.
        */

        // Creación de variable precio boleto.

        double precioBoleto = 3500;

        if(edad < 0 || edad > 120) {
            System.out.println("Edad inválida. Intente nuevamente.");
        } else {
            if(edad < 5) {
                System.out.println("Para menores de 5 años contamos con un 60% de descuento. Por ello, el costo del " +
                        "boleto es de: $" + (precioBoleto * 0.4));
            } else if (edad > 60) {
                System.out.println("Para mayores de 60 años contamos con un 55% de descuento. Por ello, el costo del " +
                        "boleto es de: $" + (precioBoleto * 0.45));
            } else {
                System.out.println("El costo del boleto es de: $" + precioBoleto);
                System.out.println("¿Cuántos boletos desea comprar?");
                int cantidadBoletos = scan.nextInt();
                scan.nextLine();

                double precioTotal = cantidadBoletos * precioBoleto * 0.7;

                if (cantidadBoletos >= 2) {
                    System.out.println("A partir de 2 boletos existe un descuento del 30% en el total. Por lo " +
                            "tanto, el costo final es de: " + precioTotal);
                }
            }
        }
    }
}