import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota, suma = 0, mayor = 0, menor = 20;
        int cantidad = 0;

        while (true) {
            System.out.print("Ingrese una nota (20 para terminar): ");
            nota = sc.nextDouble();

            if (nota == 20) {
                break;
            }

            if (nota < 0 || nota > 20) {
                System.out.println("Nota no valida.");
                continue;
            }

            suma += nota;
            cantidad++;

            if (nota > mayor) mayor = nota;
            if (nota < menor) menor = nota;
        }

        System.out.println("Notas registradas: " + cantidad);

        if (cantidad > 0) {
            System.out.println("Promedio: " + suma / cantidad);
            System.out.println("Nota maxima: " + mayor);
            System.out.println("Nota minima: " + menor);
        }

        sc.close();
    }
}