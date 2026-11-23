import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double transferencia;
        int registros = 0;

        while (true) {
            System.out.print("Ingrese transferencia: S/ ");
            transferencia = sc.nextDouble();

            registros++;

            if (transferencia > 100000) {
                System.out.println("Transferencia detectada: S/ " + transferencia);
                break;
            }
        }

        System.out.println("Registros procesados: " + registros);

        sc.close();
    }
}