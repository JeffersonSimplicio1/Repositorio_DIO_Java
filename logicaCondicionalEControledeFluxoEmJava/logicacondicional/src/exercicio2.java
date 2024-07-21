import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.println("Escreva o nome do dia da semana: ...");
        
        String dia = scanner.next();

        switch (dia) {
            case "domingo": System.out.println("1");
                
                break;
            case "segunda": System.out.println("2");
                
                break;
                case "terça": System.out.println("3");
                
                break;
            case "quarta": System.out.println("4");
                
                break;
                case "quinta": System.out.println("5");
                
                break;
            case "sexta": System.out.println("6");
                
                break;
            case "sabado": System.out.println("7");
                
                break;
            
        
            default: System.out.println("Valor indefinido");
                break;
        }
    }
}
