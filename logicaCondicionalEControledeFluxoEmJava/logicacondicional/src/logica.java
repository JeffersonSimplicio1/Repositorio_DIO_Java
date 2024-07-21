public class logica {
    public static void main(String[] args) throws Exception {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        boolean a = b1&&b2;
        boolean b = b1&&b3;
        boolean c =b2||b3;
        boolean d =b2||b4;
        boolean e =b1^b3;   
        boolean f =b4^b1;
        boolean g =!b1;
        boolean h =!b2;
        
    
    System.out.println(a);
    System.out.println(b);
    System.out.println("...");
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);
    System.out.println(g);
    System.out.println(h);
    }
}
