/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2.servicios;

import java.util.Scanner;
import poo2.objetos.Operacion;

/**
 *
 * @author lucia
 */
public class OperacionServicio {
    Operacion nuevo;
    Scanner leer = new Scanner  (System.in);
    public Operacion crearOperacion(){
        System.out.println("Ingrese dos numeros");
        int numero1= leer.nextInt();
        int numero2= leer.nextInt();
        return new Operacion(numero1, numero2);
    }
    public int sumar (int numero1, int numero2){
        int suma = numero1 + numero2;
        return suma;
    }
    public int restar (int numero1, int numero2){
        int resta = numero1 - numero2;
        return resta;
    }
    public double dividir (int numero1, int numero2){
        double division;
        if (numero2==0){
            division=0;
            System.out.println("Error.");    
        } else division = numero1/numero2;
        return division;
    }
    public int multiplicar (int numero1, int numero2){
        int multi;
        if (numero2==0 || numero1==0){
            multi=0;
            System.out.println("Error.");    
        } else multi = numero1*numero2;
        return multi;
    }
}
