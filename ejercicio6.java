import java.util.Scanner;
import java.util.Random;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();

        int secreto = aleatorio.nextInt(100) + 1;
        int numero, intentos = 0;

        while (true) {
            System.out.print("Adivine el numero (1-100): ");
            numero = sc.nextInt();

            intentos++;

            if (numero == secreto) {
                System.out.println("¡Felicidades! Adivinaste.");
                break;
            } else if (numero < secreto) {
                System.out.println("El numero es mayor.");
            } else {
                System.out.println("El numero es menor.");
            }
        }

        System.out.println("Intentos utilizados: " + intentos);

        sc.close();
    }
}