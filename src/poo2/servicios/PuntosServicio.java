/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2.servicios;

import java.util.Scanner;
import poo2.objetos.Puntos;

/**
 *
 * @author lucia
 */
public class PuntosServicio {
    Puntos nuevo;
    Scanner leer = new Scanner(System.in);
    public Puntos crearPuntos (){
        System.out.println("Indique la ubicacion del primer punto en el eje X");
        double x1=leer.nextInt();
        System.out.println("Indique la ubicacion del primer punto en el eje Y");
        double y1=leer.nextInt();
        System.out.println("Indique la ubicacion del segundo punto en el eje X");
        double x2=leer.nextInt();
        System.out.println("Indique la ubicacion del segundo punto en el eje Y");
        double y2=leer.nextInt();
        return new Puntos(x1, y1, x2, y2);
    }
    
    public double distancia (double x1, double x2, double y1, double y2){
        double distancia = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1), 2));
        return distancia;
    }
}
