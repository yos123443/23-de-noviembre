import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int venta, total = 0, cantidad = 0;

        while (true) {
            System.out.print("Entradas vendidas: ");
            venta = sc.nextInt();

            if (venta <= 0) {
                System.out.println("Venta no valida.");
                continue;
            }

            total += venta;
            cantidad++;

            if (total >= 500) {
                break;
            }
        }

        System.out.println("Total vendido: " + total);
        System.out.println("Numero de ventas: " + cantidad);

        sc.close();
    }
}