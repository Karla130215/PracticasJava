
package figura_1;

abstract class Figura_1 {
protected String nombre;
   public Figura_1(String nombre){ this.nombre = nombre;  }
  public abstract void dibuja();
 }

 class Circulo extends Figura_1 {
   public Circulo() {    super("Circulo");  }
  public void dibuja() {
   System.out.println(nombre +"= Dibujando un Circulo");
  }
 }
 public class Cuadro  extends Figura_1 {
  public Cuadro() {    super("Cuadro");  }
   public void dibuja() {
   System.out.println(nombre +"= Dibujando un Cuadro");
 }
   public static void main(String[] args){
     Figura_1[] figuras = new Figura_1[2];
     figuras[0] = new Circulo();
     figuras[1] = new Cuadro();
     for (int i = 0; i < figuras.length; i++) {
       figuras[i].dibuja();
     }
   }

    
}
