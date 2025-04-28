import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite o primeiro numero inteiro: ");
        int num1 = en.nextInt();
        System.out.print("Digite o segundo numero inteiro: ");
        int num2 = en.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("Números no intervalo entre " + num1 + " e " + num2 + ":");
        for (int i = num1 + 1; i < num2; i++) {
            System.out.println(i);
        }

        en.close();
    }
}
