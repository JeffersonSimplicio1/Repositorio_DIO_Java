public class RodarAplicacao {
        public static void main(String[] args) {
            
            Carro carro1 = new Carro();

            carro1 .setCor("Azul");
            carro1.setModelo("BMW Serie 3");
            carro1.setCapacidadeTanque(59);

            System.out.println(carro1.getModelo());
            System.out.println(carro1.getCor());
            System.out.println(carro1.getCapacidadeTanque());
            double valorCombustivel;
            System.out.println(carro1.totalValorTanque ( valorCombustivel = 6.39));
        }
}
