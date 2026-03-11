import java.util.Scanner;

public class decisao {
    public static void main(String[] args) {

        System.out.println("Digite um número inteiro:");
        Scanner s = new Scanner(System.in);
        int numero = s.nextInt();

        if(numero > 0){
            System.out.println("O número é positivo.");
        }
        else if(numero < 0){
            System.out.println("O número é negativo.");
        }
        else{
            System.out.println("O número é zero.");
        }
    }
    
}
