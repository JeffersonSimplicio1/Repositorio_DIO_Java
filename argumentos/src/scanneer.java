
import java.util.Scanner;
import java.util.Locale;

public class scanneer {
    public static void main (String[] args) {
        
    
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Qual a sua altura? ");
            double altura = scanner.nextDouble();

    System.out.println ("Digite seu nome: ");
            String nome = scanner.next();

    System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

    System.out.println("Qual a sua idade? ");
            int idade = scanner.nextInt();

    System.out.println("Seu nome é: "+ nome + " " + sobrenome);
    System.out.println("Sua idade é: " + idade);
    System.out.println("Você tem " + altura + " cm de altura" );

    }




}
