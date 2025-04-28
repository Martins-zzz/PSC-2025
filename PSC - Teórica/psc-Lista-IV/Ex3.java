import java.util.Scanner;

public class Ex3
{
	public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        String str;
        float f;
        int i;
        char c;
        do{
            System.out.println("Digite o Nome:");
            str = en.nextLine();
            if(str.length() < 3){
                System.out.println("Nome invalido!");
            }
        }while(str.length() < 3);
        
        do{
            System.out.println("Digite a Idade:");
             i = en.nextInt();
             en.nextLine(); // Consumir \n restante
            if(i < 0 || i > 150){
                System.out.println("Idade invalida!");
            }
        }while(i < 0 || i > 150);
        
        do{
            f = en.nextFloat();
            en.nextLine(); // Consumir \n restante
            if(f < 0){
                System.out.println("Salario invalido!");
            }
        }while(f < 0);
        
        do{
            System.out.println("Digite o Sexo:");
             c = en.next().charAt(0);
            if(c != 'f' && c != 'm'){
                System.out.println("Sexo invalido!");
            }
        }while(c != 'f' && c != 'm');
        
        do{
            System.out.println("Digite o Estado Civil:");
             c = en.next().charAt(0);
            if(c != 's' && c != 'c' && c != 'd' && c != 'v'){
                System.out.println("Estado Civil invalido!");
            }
        }while(c != 's' && c != 'c' && c != 'd' && c != 'v');
        
        System.out.println("Obrigado");
        en.close();
	}
}