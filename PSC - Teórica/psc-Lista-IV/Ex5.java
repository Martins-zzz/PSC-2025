import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        float A = 0, B = 0, cA = 0, cB = 0, Ai = 0, Bi = 0;
        do{
            System.out.println("Insira o valor da cidade A: ");
            A = en.nextFloat();
            System.out.println("Insira o valor de cidade B: ");
            B = en.nextFloat();
            if (A <= 0 || B <= 0) {
                System.out.println("Valores invalidos, tente novamente.");
            }
        }while(A <= 0 || B <= 0);
        do{
            System.out.println("Insira o crescimento da cidade A: ");
            cA = en.nextFloat();
            System.out.println("Insira o crescimento da cidade B: ");
            cB = en.nextFloat();
            if (cA <= 0 || cB <= 0) {
                System.out.println("Valores invalidos, tente novamente.");
            }
        }while(cA <= 0 || cB <= 0);

        if(cA <= cB) {
            System.out.println("Cidade A nunca vai superar cidade B.");
            en.close();
            return;
        }
        if(A > B) {
            System.out.println("Cidade A ja e maior que cidade B.");
            en.close();
            return;
        }
        

        int t = 0;
        Ai = A  * cA;
        Bi = B * cB;
        while (A < B) {
            t++;
            A += Ai;
            B += Bi;
            Ai = A * cA;
            Bi = B * cB;
        }
        System.out.println("Tempo necessario para A superar B: "+ t + " Anos");
        System.out.println("A: " + A + " B: " + B);
        

        en.close();
    }
}