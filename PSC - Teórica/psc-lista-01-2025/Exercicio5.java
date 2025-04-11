import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        String nome;
        Scanner en = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        nome = en.nextLine();
        System.out.println("Seu nome é: " + nome + ".");
        en.close();
    }
}
