/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2.objetos;

/**
 *
 * @author lucia
 * Vamos a realizar una clase llamada Raices, donde representaremos los valores 
 * de una ecuación de 2º grado. Tendremos los 3 coeficientes como atributos, 
 * llamémosles a, b y c. Hay que insertar estos 3 valores para construir el 
 * objeto a través de un método constructor.
 */
public class Raices {
    private double a;
    private double b;
    private double c;

    public Raices() {
    }

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
     
    
    
}
