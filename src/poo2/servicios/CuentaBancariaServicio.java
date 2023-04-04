/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2.servicios;

import java.util.Scanner;
import poo2.objetos.CuentaBancaria;

/**
 *
 * @author lucia
 */
public class CuentaBancariaServicio {
    private Scanner leer = new Scanner(System.in);
    CuentaBancaria cuenta;
 
    public CuentaBancaria crearCuenta (){
        int num_cuenta = (int) (Math.random()*1000);
        System.out.println("Indique su numero de DNI");
        int DNI = leer.nextInt();
        cuenta = new CuentaBancaria(num_cuenta, DNI, 0);
        return cuenta;
    }
    public CuentaBancaria ingresar (double saldoActual){
        System.out.println("Indique el monto que desea ingresar");
        double nuevo = leer.nextDouble();
        saldoActual+= nuevo;
        return this.cuenta;
    }
    public CuentaBancaria retirar (double saldoActual){
        System.out.println("Indique el monto que desea retirar");
        double retira = leer.nextDouble();
        if (saldoActual-retira>=0){
            saldoActual-=retira;
        } else saldoActual=0;
        return this.cuenta;
    }
    public CuentaBancaria ExtraccionRapida (double saldoActual){
      saldoActual-= saldoActual*0.20;
      cuenta.setSaldoActual(saldoActual);
      return this.cuenta;
    }
    public void consultarSaldo (double saldoActual){
        System.out.println("Su saldo actual es: " + saldoActual);
    }
    public void consultarDatos (int num_cuenta, long DNI, double saldoActual){
        System.out.println("Numero de cuenta: " + num_cuenta);
        System.out.println("Numero de D.N.I.: "+ DNI);
        System.out.println("Saldo actual: " + saldoActual);        
    }
}
