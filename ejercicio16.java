import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double medida;
        int revisadas = 0;

        while (true) {
            System.out.print("Ingrese medida de la pieza: ");
            medida = sc.nextDouble();

            revisadas++;

            if (medida < 10 || medida > 20) {
                System.out.println("Medida incorrecta: " + medida);
                break;
            }
        }

        System.out.println("Piezas revisadas: " + revisadas);

        sc.close();
    }
}