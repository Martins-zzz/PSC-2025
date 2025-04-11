import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        int n;
        boolean primo = true;
        System.out.println("Digite um número inteiro positivo: ");
        n = en.nextInt();
        if (n < 2) {
            primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        if (primo) {
            System.out.println(n + " é um número primo.");
        } else {
            System.out.println(n + " não é um número primo.");
        }
        en.close();
    }
}