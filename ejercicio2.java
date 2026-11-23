import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String claveCorrecta = "12345";
        String clave;
        int intento;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese la contraseña: ");
            clave = sc.nextLine();

            if (clave.equals(claveCorrecta)) {
                System.out.println("Acceso concedido.");
                System.out.println("Intento: " + i);
                break;
            }

            System.out.println("Contraseña incorrecta.");

            if (i == 5) {
                System.out.println("Acceso denegado.");
            }
        }

        sc.close();
    }
}