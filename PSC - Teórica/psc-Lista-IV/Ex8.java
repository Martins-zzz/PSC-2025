import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args){
        int i = 0, soma = 0;
        int[] n = new int[5];
        Scanner en = new Scanner(System.in);
        while(i < 5){
            System.out.print("Insira um numero: ");
            n[i] = en.nextInt();
            soma += n[i];
            i++;
        }
        System.out.println(i);
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + soma / i);
        en.close();
    }
}
