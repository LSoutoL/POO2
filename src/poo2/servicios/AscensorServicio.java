/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2.servicios;

import java.util.Scanner;
import poo2.objetos.Ascensor;

/**
 *
 * @author lucia
 * Crea un método "subir" que aumente en uno el valor de la propiedad 
 * "pisoActual" si aún no se ha alcanzado el "maximoPisos". 
 * Crea un método "bajar" que disminuya en uno el valor de la propiedad 
 * "pisoActual" si no se ha alcanzado el piso "0".
 * Crea un método "irA" que reciba como parámetro el número de piso al que se 
 * desea ir y que modifique la propiedad "pisoActual" para que tenga ese valor.
 */
public class AscensorServicio {
    private Ascensor nuevo;
    private int maximoPisos;
    
    public Ascensor CrearAscensor (){
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique la cantidad de pisos que recorre su ascensor");
        maximoPisos = leer.nextInt();
        System.out.println("Indique el piso en que se encuentra actualmente");
        int pisoActual=leer.nextInt();
        while ((pisoActual<0) && (pisoActual>maximoPisos)){
            System.out.println("Error. El piso debe ser mayor a cero y menor al ultimo piso. Intentelo nuevamente.");
            System.out.println("Indique el piso en que se encuentra actualmente");
            pisoActual=leer.nextInt();
        }
        return new Ascensor(pisoActual,maximoPisos);
    }
    
    public void subir (int pisoActual, Ascensor nuevo){
        if ((pisoActual + 1) <= maximoPisos){
        pisoActual++;
        nuevo.setPisoActual(pisoActual);
        } else System.out.println("Error. Supera el maximo de pisos.");
        nuevo=new Ascensor(pisoActual, maximoPisos);
    }
    public void bajar (int pisoActual, Ascensor nuevo){
        if ((pisoActual - 1) >= 0){
        pisoActual--;
        nuevo.setPisoActual(pisoActual);
        } else System.out.println("Error. Por debajo del minimo de pisos.");
        nuevo=new Ascensor(pisoActual, maximoPisos);
    }
    
    public void IrA (int piso, Ascensor nuevo){
     if ((piso>0) && (piso<maximoPisos)){ 
     nuevo.setPisoActual(piso);
     nuevo=new Ascensor(piso, maximoPisos);
     } else System.out.println("Error. El piso supera el maximo o se encuentra debajo del minimo");
    }
    
}
