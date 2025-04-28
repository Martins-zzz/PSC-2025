import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        int nota = 11;
        do{
            System.out.println("Digite uma nota: ");
            nota = en.nextInt();
            if(nota <= 0 || nota >= 10){
                System.out.println("Nota invalida!.");
            }
        }while(nota <= 0 || nota >= 10);
        System.out.println("Obrigado!");
        en.close();
	}
}