public class Usuario {
    public static void main(String[] args) throws Exception {
         SmartTV smartTv = new SmartTV();

    System.out.println("Tv ligada? " + smartTv.ligada);
    System.out.println("...");
    System.out.println("Ligar TV!");
    System.out.println("...");

    smartTv.ligar ();
    System.out.println("Novo Status -> Tv Ligada? " + smartTv.ligada);
    System.out.println("Canal Atual? " + smartTv.canal);
    System.out.println("Volume Atual? " + smartTv.volume);

    System.out.println("...");
    System.out.println("Diminuir volume: ");
    System.out.println("...");

    smartTv.diminuirVolume();
         smartTv.diminuirVolume();
         smartTv.diminuirVolume();
         smartTv.diminuirVolume();
         smartTv.diminuirVolume();

    System.out.println("Volume atual: " + smartTv.volume);
    System.out.println("...");
    System.out.println("Mudar canal: ");
    System.out.println("...");

    smartTv.aumentarCanal();
    smartTv.aumentarCanal();
    smartTv.aumentarCanal();
    smartTv.aumentarCanal();
    smartTv.aumentarCanal();
    smartTv.aumentarCanal();

    System.out.println("Novo Status -> Qual o canal atual? " + smartTv.canal);
    System.out.println("...");
    System.out.println("Mudar para canal especifico: ");
    System.out.println("...");

    smartTv.mudarCanal(13);

    System.out.println("Novo Status -> Qual o canal atual? " + smartTv.canal);





    

    }
}
