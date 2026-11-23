import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int produccion, total = 0, horas = 0;

        while (true) {
            System.out.print("Produccion de la hora (0 para terminar): ");
            produccion = sc.nextInt();

            if (produccion == 0) {
                break;
            }

            total += produccion;
            horas++;
        }

        System.out.println("Total producido: " + total);
        System.out.println("Horas registradas: " + horas);

        sc.close();
    }
}