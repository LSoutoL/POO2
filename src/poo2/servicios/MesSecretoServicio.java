/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2.servicios;

import java.util.Scanner;
import poo2.objetos.MesSecreto;

/**
 *
 * @author lucia
 * El programa debe pedir al usuario que adivine el mes secreto. Si el
 * usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
 * el mes secreto. Un ejemplo de ejecución del programa podría ser este:
 * Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
 * No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
 * ¡Ha acertado!
 */
public class MesSecretoServicio {
        MesSecreto nuevo = new MesSecreto ();
        Scanner leer = new Scanner(System.in);
    public void AdivineMes (String mesSecreto){
        System.out.println("Adivine el mes secreto");
        String mes = leer.next();
        while (!mes.equalsIgnoreCase(mesSecreto)){
            System.out.println("No ha acertado. Cristian Castro le da una pista:");
            estaciones(mesSecreto);
            System.out.println("Intentelo nuevamente: ");
            mes=leer.next();
           
        }
        System.out.println("Ha acertado! Cristian Castro lo felicita");
    }
    
    public void estaciones (String mesSecreto){
        if (mesSecreto.equals("enero")|| (mesSecreto.equals("febrero")) || (mesSecreto.equals("diciembre"))){
            System.out.println("'Porque este amor es azul como el mar azul'");
        } else if (mesSecreto.equals("abril")|| (mesSecreto.equals("mayo")) || (mesSecreto.equals("marzo"))) {
            System.out.println("'Lloran las rosas'");
        } else if (mesSecreto.equals("julio")|| (mesSecreto.equals("agosto")) || (mesSecreto.equals("junio"))){
            System.out.println("'Solo ha quedado un frio inmenso'");
        } else if (mesSecreto.equals("octubre")|| (mesSecreto.equals("noviembre")) || (mesSecreto.equals("septiembre"))){
            System.out.println("'Hojas de arboles creciendo'");
        }
        
        
    }
}
