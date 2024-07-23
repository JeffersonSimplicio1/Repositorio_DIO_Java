import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        
       Scanner scanner =new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPar = 0;
        int quantImpar = 0;




        System.out.println("Escreva a quantidade de numero que você deseja testar: ");
         quantNumeros = scanner.nextInt();

        int count = 0;

        do{
            System.out.println("Numero: ");
            numero = scanner.nextInt();
            
            if (numero % 2 == 0) { quantPar++;
                
            } else {
                quantImpar++;

            }
            
            
            
            count++;
        } while(count < quantNumeros);

        System.out.println("Você escreveu " + quantPar + " numeros pares");
        System.out.println("Você escreveu " + quantImpar + " numeros impares");














    }
}