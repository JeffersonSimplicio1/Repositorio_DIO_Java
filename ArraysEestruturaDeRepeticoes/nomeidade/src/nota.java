import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

     double nota;
            
        System.out.println("Nota: ");
            nota = scanner.nextDouble();
        
        while (nota < 0 || nota > 10) {
            System.out.println("Nota Invalida! Digite a sua nota novamente");
            nota = scanner.nextDouble();
        
        
        }
        System.out.println("Programa finalizado!");
    }
}
