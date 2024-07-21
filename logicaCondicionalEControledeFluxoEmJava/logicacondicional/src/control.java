import java.util.Scanner;

public class control {
    public static void main(String[] args) {        
          Scanner scanner = new Scanner(System.in);

    System.out.println("Vamos Calcular a sua media e saber se você esta aprovado ou reprovado.");

    System.out.println("Qual foi a sua primeira nota? ");
          double nota1 = scanner.nextDouble();

    System.out.println("Qual foi a sua segunda nota? ");
          double nota2 = scanner.nextDouble();

            double media = (nota1 + nota2)/2;

    System.out.println("Sua media é: " + media);

    if(media >= 6){System.out.println("Você esta Aprovado, Parabéns =D");} else if (media < 6 && media >=5 ){System.out.println("Você esta na recuperação, esse é o momento de se dedicar e estudar um pouco mais.");} else {System.out.println("Você esta reprovado, proximo ano dedique-se mais");}

     }

}

    

