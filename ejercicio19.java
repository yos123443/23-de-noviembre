import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pedido, procesados = 0;
        String estado;

        while (true) {
            System.out.print("Numero de pedido: ");
            pedido = sc.nextInt();
            sc.nextLine();

            System.out.print("Estado (normal/urgente): ");
            estado = sc.nextLine();

            procesados++;

            if (estado.equalsIgnoreCase("urgente")) {
                System.out.println("Pedido urgente: " + pedido);
                break;
            }
        }

        System.out.println("Pedidos procesados: " + procesados);

        sc.close();
    }
}