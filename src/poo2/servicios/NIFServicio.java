/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2.servicios;

import java.util.Scanner;
import poo2.objetos.NIF;

/**
 *
 * @author lucia
 */
public class NIFServicio {
    private Scanner leer = new Scanner(System.in);
    private NIF nuevo;
    
    public NIF crearNIF (){
      System.out.println("Ingrese su numero de DNI");
      long DNI= leer.nextLong();
      String letra= calcularletra(DNI);
    return new NIF (DNI, letra);
    }
    public String calcularletra (long DNI){
        while (DNI>=23){
            DNI-=23;
        }
        int num=(int)DNI;
        String [] digitos = new String [23];
        digitos[0]="T";
        digitos[1]="R";
        digitos[2]="W";
        digitos[3]="A";
        digitos[4]="G";
        digitos[5]="M";
        digitos[6]="Y";
        digitos[7]="F";
        digitos[8]="P";
        digitos[9]="D";
        digitos[10]="X";
        digitos[11]="B";
        digitos[12]="N";
        digitos[13]="J";
        digitos[14]="Z";
        digitos[15]="S";
        digitos[16]="Q";
        digitos[17]="V";
        digitos[18]="H";
        digitos[19]="L";
        digitos[20]="C";
        digitos[21]="K";
        digitos[22]="E";
        String letra=digitos[num];
        return letra;
    }
    public void mostrar(long DNI, String letra){
        System.out.println("Su NIF es");
        System.out.println(DNI + "-" + letra);
    }

}
