import java.util.Scanner;

public class somatorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int soma = 0;
        int i = N;

        while(i>0){
            if(i>0){
                soma = soma + i;
                --i;

            } else {System.out.println("0");}
            
        }
        System.out.println(soma);
    }
}
