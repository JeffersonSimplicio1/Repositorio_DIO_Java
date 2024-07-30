public class ordemInversa {
    public static void main(String[] args) throws Exception {
        
        String [] vetor = {"jefferson", "regina", "cibele", "rosa", "clara", "benjamin", "andre", "eduardo", "lala", "mirelle"};
        int cont = 0;

        System.out.println("Nomes: ");

       while (cont < (vetor.length)) {
            System.out.println((cont+1) + " " + vetor[cont]);
            cont++;

            
        } 
        
        System.out.println("-------------------------------");
        

        for (cont = (vetor.length)-1; cont >=0; cont--)
        {
                System.out.println(vetor[cont] + " ");

        }


    }
}
