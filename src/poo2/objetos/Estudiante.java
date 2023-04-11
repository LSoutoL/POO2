/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2.objetos;

/**
 *
 * @author lucia
 * Crea una clase "Estudiante" con las propiedades "nombre", "edad" y "nota media"
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private double nota_media;

    public Estudiante(String nombre, int edad, double nota_media) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota_media = nota_media;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota_media() {
        return nota_media;
    }
    
    
}
