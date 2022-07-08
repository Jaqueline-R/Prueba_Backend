import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        Scanner pali = new Scanner(System.in);
        String date;
        char [] palindromo;
        int izq, der;
        System.out.println("Ingrese la palabra");
        date = pali.nextLine();
        palindromo = date.toCharArray();
        izq = 0;
        der = palindromo.length - 1;

        while (izq < der) {
            if (palindromo[izq] == palindromo[der]) {
                der --;
                izq ++;
            } else {
                System.out.println("La palabra ingresada no es palindromo");
                break;
            }
        }
        if (izq == der) {
            System.out.println("La palabra es un palindromo");
        }
    }
}
