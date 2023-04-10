/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2.objetos;

/**
 *
 * @author lucia
 * Crear una clase NIF que se usará para mantener DNIs con su correspondiente 
 * letra (NIF). Los atributos serán el número de DNI (entero largo) y la letra 
 * (String o char) que le corresponde.
 */
public class NIF {
    protected long DNI;
    protected String letra;

    public NIF() {
    }

    public NIF(long DNI, String letrta) {
        this.DNI = DNI;
        this.letra = letra;
    }
    
    
}
