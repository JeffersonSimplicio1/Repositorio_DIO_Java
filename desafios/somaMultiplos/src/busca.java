import java.util.Scanner;

public class busca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
        System.out.println("Digite um número para buscar no array:");
        int numero = scanner.nextInt();

        boolean encontrado = false; // Variável para marcar se o número foi encontrado

        // Loop para buscar o número no array
        for (int cont = 0; cont < elementos.length; cont++) {
            if (elementos[cont] == numero) {
                System.out.println("Achei o número " + numero + " na posição " + cont);
                encontrado = true;
                break;
            }
        }

        // Se o número não foi encontrado, imprime a mensagem correspondente
        if (!encontrado) {
            System.out.println("Número " + numero + " não encontrado!");
        }

        scanner.close();
    }
}