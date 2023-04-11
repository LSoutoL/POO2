/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2.objetos;

import java.util.Scanner;

/**
 *
 * @author lucia
 * Crea una clase "Mascota" con las propiedades "nombre", "edad", "raza" y 
 * "tipo" (perro, gato, etc.).
 * Crea un constructor para inicializar los valores de las propiedades y 
 * un método para mostrar por pantalla la información de la mascota.
 * Crea un método "cumplirAnios" que aumente en uno la edad de la mascota.
 */
public class Mascota {
    private String nombre;
    private int edad;
    private String tipo;
    private String raza;

    public Mascota(String nombre, int edad, String tipo, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
        this.raza = raza;
    }

    public Mascota() {
    }
    
    public Mascota crearMascota (){
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique el nombre de su mascota");
        nombre=leer.next();
        System.out.println("Indique la edad");
        edad=leer.nextInt();
        System.out.println("Indique el tipo de animal (perro, gato, etc.)");
        tipo=leer.next();
        while (!tipo.equals("perro") && !tipo.equals("gato") && !tipo.equals("conejo")){
            System.out.println("Lo siento, no registramos ese tipo de animales todavia. Intentelo nuevamente.");
            System.out.println("Indique el tipo de animal (perro, gato, etc.)");
            tipo=leer.next();
        }       
        System.out.println("Indique la raza");
        raza=leer.next();
        return new Mascota(nombre, edad, tipo, raza);
    }
    public int cumplirAnios (){
        this.edad++;
        return edad;
    }
    
    public void MostrarDatos (){
        System.out.println("NOMBRE " + nombre);
        System.out.println("EDAD " + edad);
        System.out.println("TIPO DE ANIMAL " + tipo);
        System.out.println("RAZA " + raza);
    }
}
