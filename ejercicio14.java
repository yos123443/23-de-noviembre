public class ejercicio14 {
    public static void main(String[] args) {

        for (int i = 1; ; i++) {

            if (i % 17 == 0 && i % 23 == 0) {
                System.out.println("Numero encontrado: " + i);
                break;
            }
        }
    }
}