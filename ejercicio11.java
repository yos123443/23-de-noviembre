import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tiempo, registros = 0;

        while (true) {
            System.out.print("Tiempo de respuesta (ms): ");
            tiempo = sc.nextInt();

            registros++;

            if (tiempo > 5000) {
                System.out.println("Tiempo critico: " + tiempo + " ms");
                break;
            }
        }

        System.out.println("Registros procesados: " + registros);

        sc.close();
    }
}