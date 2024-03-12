import java.util.*;

public class AAA {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            System.out.println("¡Bienvenido al juego del color que hace perder!");

            System.out.println("Ingrese el número de jugadores:");
            int numJugadores = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            List<String> jugadores = new ArrayList<>();
            for (int i = 1; i <= numJugadores; i++) {
                System.out.println("Ingrese el nombre del jugador " + i + ":");
                jugadores.add(scanner.nextLine());
            }

            System.out.println("Ingrese el color que hace perder:");
            String colorPerdedor = scanner.nextLine();

            int jugadorPerdedor = random.nextInt(numJugadores);
            System.out.println("El jugador que elija el color " + colorPerdedor + " perderá.");

            while (true) {
                for (int i = 0; i < numJugadores; i++) {
                    String jugador = jugadores.get(i);
                    System.out.println(jugador + ", es tu turno.");
                    System.out.println("¿Qué color eliges?");
                    String colorElegido = scanner.nextLine();

                    if (colorElegido.equalsIgnoreCase(colorPerdedor)) {
                        if (i == jugadorPerdedor) {
                            System.out.println("¡Has perdido! Elegiste el color que hace perder.");
                        } else {
                            System.out.println("¡Has ganado! Otro jugador eligió el color que hace perder.");
                        }
                        scanner.close();
                        return;
                    }
                }
            }
        }
    }