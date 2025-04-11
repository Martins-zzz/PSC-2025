import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        float saldo = 0;
        char opcao = 's';
        Scanner en = new Scanner(System.in);
        while(opcao != 'd'){
            System.out.println("Digite a opção desejada:");
            System.out.println("a. Consultar saldo");
            System.out.println("b. Saque");
            System.out.println("c. Depositar");
            System.out.println("d. Sair");
            opcao = en.next().charAt(0);
            switch(opcao){
                case 'a':
                    System.out.printf("Seu saldo é: %.2f\n", saldo);
                    break;
                case 'b':
                    System.out.println("Digite o valor a sacar: ");
                    float saque = en.nextFloat();
                    if(saque > saldo){
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso.");
                    }
                    break;
                case 'c':
                    System.out.println("Digite o valor a depositar: ");
                    float deposito = en.nextFloat();
                    saldo += deposito;
                    System.out.println("Depósito realizado com sucesso.");
                    break;
                case 'd':
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        en.close();
    }
}
