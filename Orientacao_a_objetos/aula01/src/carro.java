public class Carro {
    
        String cor, modelo;
        int capacidadeTanque;

        void setCor(String cor) {   
            this.cor = cor;

        }

        String getCor(){
            return cor;
        }

        void setModelo (String modelo){
            this.modelo = modelo;
        }

        String getModelo() {
            return modelo;
        }

        void setCapacidadeTanque(double capacidadeTanque){
            this.capacidadeTanque = (int) capacidadeTanque;
        }

        int getCapacidadeTanque(){
            return capacidadeTanque;
        }

        double totalValorTanque (double valorCombustivel) {
            return capacidadeTanque = (int) valorCombustivel;

        }
       
    }


