import java.util.Random;

public class numerosAleatorios {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        int [] numerosAleatorios = new int [20];
        int i=0;

        for (i=0; i < numerosAleatorios.length; i++){

            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;

        }
        System.out.print("Numeros Aleatórios: ");

        for (int numero : numerosAleatorios) {

            System.out.print(numero + " ");
            
        }
        System.out.println("\n");
        System.out.print("Sucessores dos numeros Aleatórios: ");
        for (int numero : numerosAleatorios) {

            System.out.print(numero + 1 + " ");
            
        }




    }
}
