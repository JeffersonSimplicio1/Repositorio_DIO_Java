import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

    
        System.out.println("Escreva um numero que voce queira fatorar: ");
        int fatorial = scanner.nextInt();

        int multiplicaçao = 1;

        System.out.print(fatorial + "! = ");

        for( int i=fatorial; i >=1 ; i-- ){

            multiplicaçao = multiplicaçao * i;



        }
        System.out.println(multiplicaçao);
















    }
}
