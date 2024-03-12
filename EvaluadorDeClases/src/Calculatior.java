import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

            // yo y dios escribimos este codigo
            // en este momento solo dios sabe que esta escrito
            // no me pregunten a mi

public class Calculatior {
    public static void main(String[] args) {

        System.out.println("Calculadora Fracasada, Selecciona una operacion\n1.- Suma\n2.- Resta\n3.- Multiplicacion\n4.- Division\n5.- Raiz cuadrada\n6.- Potencia\n0.- Cerrar");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch  (opcion){

            case 1:{ //caso Suma
                System.out.println("ingresa un valor: ");
                Integer suma = scanner.nextInt();
                System.out.println("ingresa un segundo Valor");
                Integer suma2 = scanner.nextInt();
                Integer total = suma + suma2;
                System.out.println(total);
                break;
            }

            case 2:{ //caso resta
                System.out.println("ingresa un valor: ");
                Integer suma = scanner.nextInt();
                System.out.println("ingresa un segundo Valor");
                Integer suma2 = scanner.nextInt();
                Integer total = suma - suma2;
                System.out.println(total);
                break;

            }

            case 3:{ //caso Multiplicacion
                System.out.println("ingresa un valor: ");
                Integer suma = scanner.nextInt();
                System.out.println("ingresa un segundo Valor");
                Integer suma2 = scanner.nextInt();
                Integer total = suma * suma2;
                System.out.println(total);
                break;
            }

            case 4:{ //caso Division
                System.out.println("ingresa un valor: ");
                Integer suma = scanner.nextInt();
                System.out.println("ingresa un segundo Valor");
                Integer suma2 = scanner.nextInt();
                Integer total = suma / suma2;
                System.out.println(total);
                break;
            }

            case 5:{ //caso Raiz Cuadrada
                System.out.println("ingresa un valor: ");
                double suma = scanner.nextDouble();
                double total = Math.sqrt(suma);
                System.out.println(total);
                break;
            }

            case 6:{ //caso Potencia

                System.out.println("ingresa un valor base: ");
                double suma = scanner.nextDouble();
                System.out.println("ingresa un segundo Valor exponente");
                double  suma2 = scanner.nextInt();
                double total = Math.pow(suma , suma2);
                System.out.println(total);
                break;
            }

            case 0:{ //caso nos vimos
                System.out.println("no vimo");
            }
        }

    }
}


