import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        int c1 = 0, c2 = 0, c3 = 0, menu = 0;
        Scanner en = new Scanner(System.in);
        while(menu != 6){
            System.out.println("1. Candidato: Jair Rodriguez");
            System.out.println("2. Candidato: Carloz Luz");
            System.out.println("3. Candidato: Neves Rocha");
            System.out.println("4. Nulo");
            System.out.println("5. Branco");
            menu = en.nextInt();
            switch(menu){
                case 1: 
                    c1++;
                    System.out.println("Voto em Jair Rodriguez.");
                    break;
                case 2:
                    c2++;
                    System.out.println("Voto em Carloz Luz.");
                    break;
                case 3:
                    c3++;
                    System.out.println("Voto em Neves Rocha.");
                    break;
                case 4:
                    System.out.println("Voto nulo.");
                    break;
                case 5:
                    System.out.println("Voto em branco.");
                    break;
                case 6:
                    System.out.println("Encerrando a votação.");
                    break;
                default:
                    System.out.println("Opção inválida, Tente novamente.");
                    break;
            }
        }
        if(c1>c2 && c1>c3){
            System.out.println("Vencedor Candidato Jair Rodriguez - " + c1 + " votos.");
        } else if(c2>c1 && c2>c3){
            System.out.println("Vencedor Candidato Carloz Luz - " + c2 + " votos.");
        } else if(c3>c1 && c3>c2){
            System.out.println("Vencedor Candidato Neves Rocha - " + c3 + " votos.");
        } else {
            System.out.println("Empate entre os candidatos.");
        }
        en.close();
        
    }
}
