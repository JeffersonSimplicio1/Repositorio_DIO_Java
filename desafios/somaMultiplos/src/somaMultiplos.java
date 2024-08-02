import java.util.Scanner;

public class somaMultiplos {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int N = scanner.nextInt();
        int soma = 0;
        int i = 0;

        while (soma <= N ) {
            if(soma%A == 0){
                 i = soma + i;
                 soma++;
                
            } if (soma%A != 0) {
                soma++;
                
            }
            
        }
        System.out.println(i);
    }
}
