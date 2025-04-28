import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args){
        int i = 0;
        int[] n = new int[5];
        Scanner en = new Scanner(System.in);
        while(i < 5){
            System.out.print("Insira um numero: ");
            n[i] = en.nextInt();
            i++;
        }
        System.out.println("Maior numero: " + Math.max(n[0], n[1]));
        en.close();
    }
}
