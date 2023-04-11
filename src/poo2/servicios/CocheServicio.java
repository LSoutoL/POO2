/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2.servicios;

import java.util.Scanner;
import poo2.objetos.Coche;

/**
 *
 * @author lucia
 */
public class CocheServicio {
    public Coche crearCoche () {
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique la marca de su automovil");
        String marca = leer.next();
        System.out.println("Indique el modelo");
        String modelo = leer.next();
        System.out.println("Indique el precio");
        int precio = leer.nextInt();
        return new Coche(marca, modelo, precio);
    }
    public void mostrarCoche (String marca, String modelo, int precio){
        System.out.println("Su automovil posee estas caracteristicas:");
        System.out.println("MARCA " + marca);
        System.out.println("MODELO " + modelo);
        System.out.println("PRECIO " + precio);
    }
}
