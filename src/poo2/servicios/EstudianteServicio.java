/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2.servicios;

import java.util.Scanner;
import poo2.objetos.Estudiante;

/**
 *
 * @author lucia
 * Crea un método para calcular la nota media de un grupo de estudiantes y otro 
 * para mostrar por pantalla los estudiantes que tienen una nota media superior.
 */
public class EstudianteServicio {
    private Estudiante [] nuevo;
    private Scanner leer = new Scanner(System.in);
    private int num;
    
    public Estudiante [] ingreso (){
        System.out.println("Indique la cantidad de estudiantes");
        num = leer.nextInt();
        nuevo = new Estudiante [num];
        for (int i = 0; i < nuevo.length; i++) {
            nuevo [i] = crearEstudiante ();
        }
        return nuevo;
    }
    
    public Estudiante crearEstudiante (){
        System.out.println("Indique el nombre del estudiante");
        String nombre = leer.next();
        System.out.println("Indique la edad");
        int edad = leer.nextInt();
        System.out.println("Indique la nota media");
        double nota_media=leer.nextDouble();
        return new Estudiante(nombre, edad, nota_media);
    }
    
    public double NotaMedia (){
        double media=0;
        for (int i = 0; i <nuevo.length; i++) {
          media +=nuevo[i].getNota_media();
        }
        
        media=media/nuevo.length;
        return media;
    }
    public void MostrarAltos (double media){
        System.out.println("Los alumnos cuya nota media es mayor a la media grupal son: ");
        for (int i = 0; i < nuevo.length; i++) {
            if (nuevo [i].getNota_media() >= media)
                System.out.println(nuevo[i].getNombre());
        }
    }
    
    
}
