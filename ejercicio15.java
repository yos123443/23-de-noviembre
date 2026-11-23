import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String producto;
        int stock, validos = 0;

        while (true) {
            System.out.print("Nombre del producto: ");
            producto = sc.nextLine();

            System.out.print("Ingrese stock: ");
            stock = sc.nextInt();
            sc.nextLine();

            if (stock < 0) {
                System.out.println("Producto con error: " + producto);
                break;
            }

            validos++;
        }

        System.out.println("Registros validos: " + validos);

        sc.close();
    }
}