import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Olá, Eu posso te ajudar a descobrir qual o mês do ano de acordo com o numero que você escolher.");
        System.out.println("Vamos começar!!");
        System.out.println("Escreva um numero de entre 1 e 12");

        int numero = scanner.nextInt();

        System.out.println("O numero que você escolheu foi " + numero + ". Ele correspode ao mes de ");

        if (numero == 1) {
            System.out.println("Janeiro");
        } else if (numero == 2) {
            System.out.println("Fevereiro");
        } else if (numero == 3) {
            System.out.println("Março");
        } else if (numero == 4) {
            System.out.println("Abril");
        } else if (numero == 5) {
            System.out.println("Maio");
        } else if (numero == 6) {
            System.out.println("Junho");
        } else if (numero == 7) {
            System.out.println("Julho");
        } else if (numero == 8) {
            System.out.println("Agosto");
        } else if (numero == 9) {
            System.out.println("Setembro");
        } else if (numero == 10) {
            System.out.println("Outubro");
        } else if (numero == 11) {
            System.out.println("Novembro");
        } else if (numero == 12) {
            System.out.println("Dezembro");
        }

        if (numero == 1) {
            System.out.println("O mes correspondente ao numero que você informou é um mês de ferias");
        } else if (numero == 7) {
            System.out.println("O mes correspondente ao numero que você informou é um mês de ferias");
        } else if (numero == 12) {
            System.out.println("O mes correspondente ao numero que você informou é um mês de ferias");
        }

    }

}
