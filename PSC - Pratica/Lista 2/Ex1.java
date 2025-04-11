import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        String senha = "Lirililarila", s = "senha";
        Scanner sc = new Scanner(System.in);

        while (!senha.equals(s)) {
            System.out.println("Digite a senha: ");
            s = sc.nextLine();

            if(senha.equals(s)) {
                System.out.println("Acesso permitido!");
            } else {
                System.out.println("Acesso negado!");
            }
        }
        sc.close();
    }
}