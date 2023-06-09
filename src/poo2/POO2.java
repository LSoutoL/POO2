/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

import java.util.Scanner;
import poo2.objetos.Ascensor;
import poo2.objetos.Coche;
import poo2.objetos.CuentaBancaria;
import poo2.objetos.Estudiante;
import poo2.objetos.Mascota;
import poo2.objetos.MesSecreto;
import poo2.objetos.NIF;
import poo2.objetos.Operacion;
import poo2.objetos.Persona;
import poo2.objetos.Puntos;
import poo2.objetos.Raices;
import poo2.servicios.AscensorServicio;
import poo2.servicios.CocheServicio;
import poo2.servicios.CuentaBancariaServicio;
import poo2.servicios.EstudianteServicio;
import poo2.servicios.MesSecretoServicio;
import poo2.servicios.NIFServicio;
import poo2.servicios.OperacionServicio;
import poo2.servicios.PersonaServicio;
import poo2.servicios.PuntosServicio;
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
        
        /*NIFServicio servicio = new NIFServicio ();
        NIF nuevo = servicio.crearNIF();
        servicio.mostrar();*/
       
        /*CocheServicio servicio = new CocheServicio();
        Coche [] autos = new Coche [3];
        for (int i = 0; i < 3; i++) {
            autos [i] = servicio.crearCoche();
        }
        for (int i = 0; i < 3; i++) {
            servicio.mostrarCoche(autos[i].getMarca(), autos[i].getModelo(), autos [i].getPrecio());
        }*/
        
        /*EstudianteServicio service = new EstudianteServicio ();
        Estudiante [] misestudiantes = service.ingreso();
        double media = service.NotaMedia();
        System.out.println("La nota media grupal de los alumnos es: " + media);
        service.MostrarAltos(media);*/
        
        /*Mascota nueva = new Mascota ();
        nueva.crearMascota();
        nueva.cumplirAnios();
        nueva.MostrarDatos();*/
        
        //Crea un programa que cree un objeto "Ascensor" con un "maximoPisos" de 10. 
        //Simula el comportamiento del ascensor moviéndolo hacia arriba y hacia abajo, 
        //yendo a un piso específico, y mostrando en pantalla el piso actual después de cada movimiento.
        /*Scanner leer = new Scanner(System.in);
        AscensorServicio movimiento = new AscensorServicio();
        Ascensor nuevo = movimiento.CrearAscensor();
        int opcion;
        do {
            System.out.println("Indique el movimiento que desea realizar");
            System.out.println("1. subir un piso");
            System.out.println("2. bajar un piso");
            System.out.println("3. ir a un piso determinado");
            System.out.println("4. mostrar piso actual");
            System.out.println("5. salir");
            opcion = leer.nextInt();
            switch (opcion){
            case 1: movimiento.subir(nuevo.getPisoActual(), nuevo);
            break;
            case 2: movimiento.bajar(nuevo.getPisoActual(), nuevo);
            break;
            case 3: System.out.println("Indique a que piso desea ir");
            int piso = leer.nextInt();
            movimiento.IrA(piso, nuevo);
            break;
            case 4: System.out.println("Su piso actual es: " +nuevo.getPisoActual());
        }
        }while (opcion!=5);*/
        
        /*MesSecretoServicio servicio = new MesSecretoServicio();
        MesSecreto nuevo = new MesSecreto();
        servicio.AdivineMes(nuevo.getMesSecreto());*/
        
        /*PuntosServicio servicio = new PuntosServicio();
        Puntos nuevo = servicio.crearPuntos();
        System.out.println("La distancia entre los puntos es " + servicio.distancia(nuevo.getX1(), nuevo.getX2(), nuevo.getY1(), nuevo.getY2()));*/
        
        /*OperacionServicio servicio = new OperacionServicio();
        Operacion nuevo = servicio.crearOperacion();
        System.out.println("La suma de los numeros  es " + servicio.sumar(nuevo.getNumero1(), nuevo.getNumero2()));
        System.out.println("La resta de los numeros  es " + servicio.restar(nuevo.getNumero1(), nuevo.getNumero2()));
        System.out.println("La multiplicacion de los numeros  es " + servicio.multiplicar(nuevo.getNumero1(), nuevo.getNumero2()));
        System.out.println("La division de los numeros  es " + servicio.dividir(nuevo.getNumero1(), nuevo.getNumero2()));*/
    }
    
}
