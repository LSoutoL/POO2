/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2.servicios;

import java.util.Scanner;
import poo2.objetos.Persona;

/**
 *
 * @author lucia
 * En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
 * Método esMayorDeEdad(): indica si la persona es mayor de edad. La función 
 * devuelve un booleano.
 * 
 * Metodo crearPersona(): el método crear persona, le pide los valores de los 
 * atributos al usuario y después se le asignan a sus respectivos atributos para 
 * llenar el objeto Persona. Además, comprueba que el sexo introducido sea 
 * correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje.
 * 
 * Método calcularIMC(): calculara si la persona está en su peso ideal 
 * (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor 
 * menor que 20, significa que la persona está por debajo de su peso ideal 
 * y la función devuelve un -1. Si la fórmula da por resultado un número entre 
 * 20 y 25 (incluidos), significa que la persona está en su peso ideal 
 * y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un 
 * valor mayor que 25 significa que la persona tiene sobrepeso, y la 
 * función devuelve un 1
 */
public class PersonaServicio {
    private Persona nueva;
    private Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona (){
        System.out.println("Indique el nombre de la persona");
        String nombre=leer.next();
        System.out.println("indique su edad");
        int edad = leer.nextInt();
        System.out.println("Indique su sexo: H (hombre), M (mujer) u O (otro)");
        String sexo = leer.next();
        while ((!sexo.equals("H")) && (!sexo.equals("M")) && (!sexo.equals("O"))){
            System.out.println("Valor incorrecto. Indique H (hombre), M (mujer) u O (otro)");
            sexo=leer.next();
        }
        System.out.println("Indique su peso (en kg)");
        double peso = leer.nextDouble();
        System.out.println("Indique la altura (en metros)");
        double altura = leer.nextDouble();
        return new Persona(nombre, edad, sexo, peso, altura);
    }
    public boolean esMayorDeEdad (int edad){
        boolean mayor = true;
        if (edad<18){
             mayor=false;
        }
        return mayor;
    }
    public int calcularIMC( double peso, double altura){
        double calculo= peso/Math.pow(altura,2);
        int IMC = 2;
        
        if (calculo>25.0){
            IMC=1;
        } else if ((calculo>=20.0) && (calculo<=25.0)){
            IMC=0;
        } else if (calculo<20.0){
            IMC=-1;
        }
        return IMC;
    }
    public void porcenEdad (boolean [] edades){
        int mayor=0;
        int menor=0;
        for (int i = 0; i < 4; i++) {
            if (edades [i]==true){
                mayor++;
            } else if (edades [i]==false){
                menor++;
            }
        }
        System.out.println("El porcentaje de mayores de edad es: " + ((mayor*100)/4)+ "%");
        System.out.println("El porcentaje de menores de edad es: " + ((menor*100)/4)+ "%");
    }
    public void porcenIMC (int [] IMC){
        int bajo=0;
        int peso=0;
        int sobre=0;
        for (int i = 0; i < 4; i++) {
            switch (IMC [i]) {
                case -1:
                    bajo++;
                    break;
                case 0:
                    peso++;
                    break;
                case 1:
                    sobre++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("El porcentaje de personas con su peso ideal es: " + ((peso*100)/4) + "%");
        System.out.println("El porcentaje de personas con bajopeso es: " + ((bajo*100)/4)+ "%");
        System.out.println("El porcentaje de personas con sobrepeso es: " + ((sobre*100/4))+ "%");
    }
    
}
