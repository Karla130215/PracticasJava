/** Datos de estas practicas:
 * Nombre:Karla Elizabeth Gonzalez Mondragon
 * Fecha:23/06/2022
 * Tema:MVC ---MODELO
 * Unidad:Unidad 1
 * Practica 16
 *
 * */
package model;


public class Modelo {
    private int numero1,numero2,resultado;
//Creacion de setter y getter de los atributos
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    //creacion de metodos para la interfaz
    
    public int sumar(){
        this.resultado=this.numero1+this.numero2;
        return this.resultado;
    }
    public int restar(){
        this.resultado=this.numero1-this.numero2;
    return this.resultado;
    }
    
    
}
