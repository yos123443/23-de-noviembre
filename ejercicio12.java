import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre;
        int asistentes = 0;

        while (true) {
            System.out.print("Nombre del estudiante (FIN para terminar): ");
            nombre = sc.nextLine();

            if (nombre.equalsIgnoreCase("FIN")) {
                break;
            }

            asistentes++;
        }

        System.out.println("Total de asistentes: " + asistentes);

        sc.close();
    }
}