package packed;

public class pack {

    static public int x1 = 7;
    static protected int x2 = 8;
    static int x3 = 9;
    static private int x4 = 10;

}
//import packed.pack;

class test extends pack {

    public static void main(String[] args) {
        pack p = new pack();
        //System.out.println(pack.x2);
//Ejercicio
//        int i = 1;
//        switch (i) {
//
//            case 0:
//
//                System.out.println("zero");
//                break;
//
//            case 1:
//
//                System.out.println("uno");
//                break;
//            case 2:
//
//                System.out.println("dos");
//                break;
//                
//            default:
//                      System.out.println("nada");
//   }

//Ejercicio 
Integer eye =new Integer(42);
Double d =new Double(42.0);
int i=42;
double dd=42.0;
        System.out.println(i==eye);
        System.out.println(eye.equals(d));
        System.out.println(eye==42);
        System.out.println(i==42);
        System.out.println(i==dd);






    }
}
