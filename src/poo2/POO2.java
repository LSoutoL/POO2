/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

import java.util.Scanner;
import poo2.objetos.CuentaBancaria;
import poo2.objetos.NIF;
import poo2.objetos.Persona;
import poo2.objetos.Raices;
import poo2.servicios.CuentaBancariaServicio;
import poo2.servicios.NIFServicio;
import poo2.servicios.PersonaServicio;
import poo2.servicios.RaicesServicio;

/**
 *
 * @author lucia
 */
public class POO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*CuentaBancariaServicio scuenta = new CuentaBancariaServicio ();
        CuentaBancaria micuenta = scuenta.crearCuenta();
        scuenta.consultarDatos(micuenta.getNum_cuenta(), micuenta.getDNI(), micuenta.getSaldoActual());
        scuenta.ingresar(micuenta.getSaldoActual());
        scuenta.consultarSaldo(micuenta.getSaldoActual());
        scuenta.retirar(micuenta.getSaldoActual());
        scuenta.ExtraccionRapida(micuenta.getSaldoActual());*/
        
        /*A continuación, en la clase main hacer lo siguiente:
        * Crear 4 objetos de tipo Persona con distintos valores, a continuación, 
        * llamaremos todos los métodos para cada objeto, deberá comprobar si la 
        * persona está en su peso ideal, tiene sobrepeso o está por debajo de su 
        * peso ideal e indicar para cada objeto si la persona es mayor de edad.
        * Por último, guardaremos los resultados de los métodos calcularIMC y 
        * esMayorDeEdad en distintas variables(arrays), para después calcular un 
        * porcentaje de esas 4 personas cuantas están por debajo de su peso, 
        * cuantas en su peso ideal y cuantos, por encima, y también calcularemos 
        * un porcentaje de cuantos son mayores de edad y cuantos menores. 
        * Para esto, podemos crear unos métodos adicionales.*/
        
        /*PersonaServicio servicio = new PersonaServicio ();
        Persona p1 = servicio.crearPersona();
        Persona p2 = servicio.crearPersona();
        Persona p3 = servicio.crearPersona();
        Persona p4 = servicio.crearPersona();
        
        boolean [] edades = new boolean [4];
        int [] IMC = new int [4];
        edades [0] = servicio.esMayorDeEdad(p1.getEdad());
        IMC [0]= servicio.calcularIMC(p1.getPeso(), p1.getAltura());
        edades [1] = servicio.esMayorDeEdad(p2.getEdad());
        IMC [1]= servicio.calcularIMC(p2.getPeso(),p2.getAltura());
        edades [2] = servicio.esMayorDeEdad(p3.getEdad());
        IMC [2]= servicio.calcularIMC(p3.getPeso(), p3.getAltura());
        edades [3]= servicio.esMayorDeEdad(p4.getEdad());
        IMC [3]= servicio.calcularIMC(p4.getPeso(), p4.getAltura());
        
        servicio.porcenEdad(edades);
        servicio.porcenIMC(IMC);*/
        
        /*RaicesServicio servicio= new RaicesServicio();
        Raices nueva=servicio.crearRaiz();
        servicio.getDiscriminante(nueva.getA(),nueva.getB(),nueva.getC());
        servicio.calcular(nueva.getA(), nueva.getB(), nueva.getC());*/
        
        NIFServicio servicio = new NIFServicio ();
        NIF nuevo = servicio.crearNIF();
        servicio.mostrar();
       
        
        
    }
    
}
