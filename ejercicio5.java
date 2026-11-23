import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 1000;
        double monto;
        int opcion, operaciones = 0;

        while (true) {
            System.out.println("\n--- CAJERO AUTOMATICO ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.print("Seleccione: ");

            opcion = sc.nextInt();

            if (opcion == 4) {
                break;
            }

            switch (opcion) {
                case 1:
                    System.out.println("Saldo: S/ " + saldo);
                    operaciones++;
                    break;

                case 2:
                    System.out.print("Monto a depositar: ");
                    monto = sc.nextDouble();

                    if (monto > 0) {
                        saldo += monto;
                        operaciones++;
                    }
                    break;

                case 3:
                    System.out.print("Monto a retirar: ");
                    monto = sc.nextDouble();

                    if (monto > 0 && monto <= saldo) {
                        saldo -= monto;
                        operaciones++;
                    } else {
                        System.out.println("Monto no valido.");
                    }
                    break;

                default:
                    System.out.println("Opcion incorrecta.");
            }
        }

        System.out.println("Operaciones realizadas: " + operaciones);
        System.out.println("Sesion cerrada.");

        sc.close();
    }
}