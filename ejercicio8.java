import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String codigo;
        int cantidad, revisados = 0;
        int posicion = -1;

        System.out.print("Cantidad de codigos: ");
        cantidad = sc.nextInt();

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese codigo: ");
            codigo = sc.next();

            revisados++;

            if (codigo.equals("ABC123")) {
                posicion = i;
                break;
            }
        }

        if (posicion != -1) {
            System.out.println("Codigo encontrado.");
            System.out.println("Posicion: " + posicion);
        } else {
            System.out.println("Codigo no encontrado.");
        }

        System.out.println("Codigos revisados: " + revisados);

        sc.close();
    }
}