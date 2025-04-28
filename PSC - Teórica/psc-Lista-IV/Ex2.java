import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        String nome, senha;
        do{
            System.out.println("Digite o nome de usuario: ");
            nome = en.nextLine();
            System.out.println("Digite a senha de usuario: ");
            senha = en.nextLine();
            if(nome.equals(senha)){
                System.out.println("ERRO! SENHA E NOME DE USUARIO IGUAIS");
            }
        }while(nome.equals(senha));
        System.out.println("Obrigado!");
        en.close();
    }
}