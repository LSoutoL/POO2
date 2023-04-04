/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2.objetos;

/**
 *
 * @author lucia
 */
public class CuentaBancaria {
    private int num_cuenta;
    private long DNI;
    private double saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int num_cuenta, long DNI, double saldoActual) {
        this.num_cuenta = num_cuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public int getNum_cuenta() {
        return num_cuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setNum_cuenta(int num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
}
