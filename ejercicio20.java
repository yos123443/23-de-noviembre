import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroPaquete = 0;
        int validos = 0;
        String estado;

        while (true) {
            numeroPaquete++;

            System.out.print("Paquete " + numeroPaquete +
                             " (valido/corrupto): ");
            estado = sc.nextLine();

            if (estado.equalsIgnoreCase("corrupto")) {
                System.out.println("Paquete corrupto: " + numeroPaquete);
                break;
            }

            if (estado.equalsIgnoreCase("valido")) {
                validos++;
            } else {
                System.out.println("Estado no reconocido.");
                numeroPaquete--;
            }
        }

        System.out.println("Paquetes validos procesados: " + validos);

        sc.close();
    }
}