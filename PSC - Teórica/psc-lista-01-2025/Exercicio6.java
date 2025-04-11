import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        String nome;
        int idade;
        float altura;
        Scanner en = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        nome = en.nextLine();
        System.out.print("Digite a sua idade: ");
        idade = en.nextInt();
        System.out.print("Digite a sua altura em cm: ");
        altura = en.nextFloat();
        System.out.printf("Perfil:\nNome: %s\nIdade: %d Anos\nAltura: %.2fcm\n", nome, idade, altura);
        en.close();
    }
}
