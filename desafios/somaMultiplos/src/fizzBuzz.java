import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        if(numero%3==0 && numero%5 == 0){
            System.out.println("FizzBuzz");
        } else if (numero%3 == 0){
            System.out.println("Fizz");
        } else if (numero%5 == 0) {System.out.println("Buzz");} else {System.out.println(numero);}
    }
}
