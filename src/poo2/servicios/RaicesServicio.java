/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2.servicios;

import java.util.Scanner;
import poo2.objetos.Raices;

/**
 *
 * @author lucia
 * Luego, en RaicesServicio las operaciones que se podrán realizar son las 
 * siguientes:
 * 
 * Método getDiscriminante(): devuelve el valor del discriminante (double). 
 * El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
 * 
 * Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, 
 * para que esto ocurra, el discriminante debe ser mayor o igual que 0.
 * 
 * Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución,
 * para que esto ocurra, el discriminante debe ser igual que 0.
 * 
 * Método obtenerRaices(): llama a tieneRaices() y si devolvió́ true, imprime 
 * las 2 posibles soluciones.
 * 
 * Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una 
 * única raíz. Es en el caso en que se tenga una única solución posible.
 * 
 * Método calcular(): esté método llamará tieneRaices() y a tieneRaiz(), y 
 * mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con 
 * los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros 
 * métodos y en caso de no existir solución, se mostrará un mensaje.
 * 
 * Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
 */
public class RaicesServicio {
    private Scanner leer = new Scanner(System.in);
    Raices nueva;
    private double discriminante;
    private boolean raices;
    private boolean raiz;
    
    
    public Raices crearRaiz (){
    System.out.println("Ingrese los tres coeficientes de la ecuacion cuadratica cuyas raices desea averiguar");
    double a=leer.nextDouble();
    double b = leer.nextDouble();
    double c=leer.nextDouble();
    return new Raices(a, b, c);    
    }
    
    public double getDiscriminante (double a, double b, double c){
    
    discriminante= Math.pow(b, 2)-4*a*c;
    return discriminante;
    }
    public boolean tieneRaices (){
        raices=false;
        if (discriminante>0){
            raices=true;
        } 
        return raices;
    }
    public boolean tieneRaiz (){
        raiz =false;
        if (discriminante==0){
            raiz=true;
        }
        return raiz;
    }
    public void obtenerRaices (double a, double b, double c){
        raices=tieneRaices();
        if (raices==true){
            System.out.println("Las soluciones posibles son: ");
            System.out.println("raiz 1: " + (-b + Math.sqrt((Math.pow(b,2)-(4*a*c)))/(2*a)));
            System.out.println("raiz 2: " + (-b - Math.sqrt((Math.pow(b,2)-(4*a*c)))/(2*a)));
        }
    }
    public void obtenerRaiz (double a, double b, double c){
        raiz = tieneRaiz();
        if (raiz==true){
            System.out.println("La unica solucion posible es:");
            System.out.println((-b + Math.sqrt((Math.pow(b,2)-(4*a*c)))/(2*a)));
        }
    }
    public void calcular (double a, double b, double c){
        raices=tieneRaices();
        raiz=tieneRaiz();
        if (raices==true){
        obtenerRaices(a,b,c);
        } else if (raiz==true){
        obtenerRaiz(a,b,c);            
        }
    }
}
