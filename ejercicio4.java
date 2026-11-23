import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();

        int divisor = 0;

        if (numero > 1) {
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    divisor = i;
                    break;
                }
            }
        }

        if (numero > 1 && divisor == 0) {
            System.out.println("El numero es primo.");
            System.out.println("No tiene divisores encontrados.");
        } else {
            System.out.println("El numero no es primo.");
            System.out.println("Primer divisor: " + divisor);
        }

        sc.close();
    }
}