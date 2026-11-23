import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre;
        int puntaje;

        while (true) {
            System.out.print("Nombre del participante: ");
            nombre = sc.nextLine();

            System.out.print("Puntaje obtenido: ");
            puntaje = sc.nextInt();
            sc.nextLine();

            if (puntaje >= 100) {
                System.out.println("Ganador: " + nombre);
                System.out.println("Puntaje final: " + puntaje);
                break;
            }
        }

        sc.close();
    }
}