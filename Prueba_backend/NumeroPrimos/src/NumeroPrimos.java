public class NumeroPrimos {
    public static void main(String[] args) {

        boolean primo;
        System.out.println("Son numeros primos del 1 al 10: \n");
        // Estructura for
        for (int numero = 2; numero <= 10; numero ++) {
            primo = true;
            for (int i = numero -1; i > 1; i--) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println(numero + " es primo");
            }
        }


    }
}
