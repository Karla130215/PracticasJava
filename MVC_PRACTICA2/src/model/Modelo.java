/** Datos de estas practicas:
 * Nombre:Karla Elizabeth Gonzalez Mondragon
 * Fecha:24/06/2022
 * Tema:MVC ---MODELO
 * Unidad:Unidad 1
 * Practica 16
 *
 * */
package model;

public class Modelo {

    private int numero1;
    private int numero2;
    private int numero3;
    private int numero4;
    private int resultado;

    //se crean setter y getter de los atributos
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

    public int getNumero3() {
        return numero3;
    }

    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }

    public int getNumero4() {
        return numero4;
    }

    public void setNumero4(int numero4) {
        this.numero4 = numero4;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    //se crean los metodos que se utilizaran
    //suma,resta,multiplicacion,divicion,reciduo

    public int sumar() {
        this.resultado = this.numero1 + this.numero2 + this.numero3 + this.numero4;
        return resultado;
    }

    public int restar() {
        this.resultado = this.numero1 - this.numero2 - this.numero3 - this.numero4;
        return resultado;
    }

    public int multiplicacion() {
        this.resultado = this.numero1 * this.numero2 * this.numero3 * this.numero4;
        return resultado;
    }

    public int divicion() {
        this.resultado = this.numero1 / this.numero2 / this.numero3 / this.numero4;
        return resultado;
    }

    public int reciduo() {
        this.resultado = this.numero1 % this.numero2 % this.numero3 % this.numero4;
        return resultado;
    }
}
