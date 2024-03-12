import java.util.Scanner;

public class Evaluador {
    public static void main(String[] args) {
        int calificacion;
        Scanner nota = new Scanner(System.in);
        System.out.println("dime tu nota: ");
        calificacion = nota.nextInt();

        //comparaciones

        if (calificacion < 1 || calificacion > 10) {
            System.out.println("valor no valido");

        }else{
            if(calificacion <= 3){
            System.out.println("No aprobado");

        }else if (calificacion > 3 && calificacion <= 5 ){
            System.out.println("Insuficiente");

        }else if (calificacion > 5 && calificacion <= 8){
            System.out.println("aceptable");

        }else if (calificacion == 10){
            System.out.println("excelente");
            }
        }

        //case que fracaso

        /*switch (calificacion){
            case (calificacion < 3) -> System.out.println("no aprobado");
            case (calificacion > 3 && calificacion <= 5) -> System.out.printf("Insuficiente");
            case (calificacion > 5 && calificacion <= 8) -> System.out.println("aceptable");
            case (calificacion == 10) -> System.out.println("Excelente");
        }*/



    }
}
