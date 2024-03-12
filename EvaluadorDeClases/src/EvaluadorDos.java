import java.text.DecimalFormat;
import java.util.*;

public class EvaluadorDos {
    public static void main(String[] args) {

        // Utiliza un HashMap para almacenar las calificaciones de los estudiantes, donde la llave es el nombre del estudiante
        // y el valor es un ArrayList de notas.

        Map<String, List<Double>> calificaciones = new HashMap<>();

        // Solicita al usuario que ingrese la cantidad de alumnos y la cantidad de notas por alumno.

        int numAlumnos = 0;
        int cantNotas = 0;
        Scanner scan = new Scanner(System.in);

        // Validamos número de estudiantes poisitivo.

        do {
            try {
                System.out.println("¡Bienvenido, profesor! Para acceder a las acciones del programa, necesitamos que ingrese " +
                        "la cantidad de estudiantes que va a evaluar: ");
                numAlumnos = scan.nextInt();

                if (numAlumnos < 1) {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("La cantidad de estudiantes debe ser un número positivo.");
            }
        } while(numAlumnos < 1);

        // Validamos número de notas positiva.

        do {
            try {
                System.out.println("A continuación necesito que señale cuántas notas se van a ingresar por cada estudiante: ");
                cantNotas = scan.nextInt();

                if (cantNotas < 1) {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("La cantidad de notas debe ser un número positivo.");
            }
        } while(cantNotas < 1);

        // Solicita el nombre de cada alumno y las notas correspondientes, almacenándolas en el HashMap.

        for (int i = 0; i < numAlumnos; i++) {
            scan.nextLine();
            System.out.println("Ingrese nombre del estudiante, por favor: ");
            String nombreAlumno = scan.nextLine();
            List<Double> notasDelEstudiante = new ArrayList<>();

            // Evaluamos notas recibidas en un rango de 0-10.

            for (int j = 0; j < cantNotas; j++) {
                Double nota = 0.0;
                do {
                    try {
                        System.out.println("Ingrese nota número " + (j+1) + ": ");
                        nota = scan.nextDouble();

                        if (nota < 0 || nota > 10) {
                            throw new InputMismatchException();
                        } else {
                            notasDelEstudiante.add(nota);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("La nota del estudiante debe encontrarse entre 0-10.");
                    }
                } while (nota < 0 || nota > 10);
            }
            calificaciones.put(nombreAlumno, notasDelEstudiante);
        }

        // Mostramos menú de opciones al usuario.

        int eleccion;

        do {
            System.out.println("¿Qué desea realizar?\n" +
                    "1 - Mostrar promedio de notas por estudiante.\n" +
                    "2 - Mostrar estado de aprobación por estudiante.\n" +
                    "3 - Mostrar si la nota del estudiante está por encima o debajo del promedio de clase.\n" +
                    "0 - Salir del menú.");
            eleccion = scan.nextInt();

            switch (eleccion) {
                case 1: // Mostrar promedio de notas por estudiante.
                    for (Map.Entry<String, List<Double>> estudiante : calificaciones.entrySet()) {
                        Double notaMax = Collections.max(estudiante.getValue());
                        Double notaMin = Collections.min(estudiante.getValue());
                        Double promedio = estudiante.getValue().stream()
                                .mapToDouble(Double::doubleValue)
                                .average()
                                .orElse(0.0);
                        DecimalFormat df = new DecimalFormat("#.00");
                        promedio = Double.valueOf(df.format(promedio));

                        System.out.println("Estudiante: " + estudiante.getKey() + ".\nNota Máxima: " + notaMax);
                        System.out.println("Nota Mínima: " + notaMin);
                        System.out.println("Promedio de Notas: " + promedio + "\n");
                    }
                    break;

                case 2: // Mostrar estado de aprobación por estudiante.
                    for (Map.Entry<String, List<Double>> estudiante : calificaciones.entrySet()) {
                        Double promedio = estudiante.getValue().stream()
                                .mapToDouble(Double::doubleValue)
                                .average()
                                .orElse(0.0);
                        DecimalFormat df = new DecimalFormat("#.00");
                        promedio = Double.valueOf(df.format(promedio));

                        if (promedio <= 3) {
                            System.out.println("Estudiante no aprobado.\n");

                        } else if (promedio > 3 && promedio <= 5) {
                            System.out.println("Insuficiente para aprobar. Necesita recuperación.\n");

                        } else if (promedio > 5 && promedio <= 9) {
                            System.out.println("Estudiante aprobado.\n");

                        } else if (promedio == 10) {
                            System.out.println("Estudiante excelente.\n");
                        }
                    }
                    break;

                case 3: // Mostrar si la nota del estudiante está por encima o debajo del promedio de clase.
                    Double promedioCurso = 0.0;
                    for (Map.Entry<String, List<Double>> estudiante : calificaciones.entrySet()) {
                        Double promedio = estudiante.getValue().stream()
                                .mapToDouble(Double::doubleValue)
                                .average()
                                .orElse(0.0);
                        DecimalFormat df = new DecimalFormat("#.00");
                        promedio = Double.valueOf(df.format(promedio));
                        promedioCurso += promedio;
                    }

                    promedioCurso /= numAlumnos;

                    System.out.println("El promedio del curso es " + promedioCurso);
                    System.out.println("El estado del promedio de los estudiantes se describe a continuación: ");

                    for (Map.Entry<String, List<Double>> estudiante : calificaciones.entrySet()) {
                        Double promedio = estudiante.getValue().stream()
                                .mapToDouble(Double::doubleValue)
                                .average()
                                .orElse(0.0);
                        DecimalFormat df = new DecimalFormat("#.00");
                        promedio = Double.valueOf(df.format(promedio));

                        if (promedio > promedioCurso) {
                            System.out.println("Estudiante sobre el promedio del curso.\n");

                        } else {
                            System.out.println("Estudiante bajo el promedio del curso.\n");
                        }
                    }
                    break;
            }
        } while (eleccion != 0); // Salida del menú.
    }
}