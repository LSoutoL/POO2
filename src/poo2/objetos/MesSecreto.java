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
public class MesSecreto {
    private String [] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};; 
    private String mesSecreto = meses[(int) (Math.random()*12)];

    public MesSecreto() {

    }

    public String getMesSecreto() {
        return mesSecreto;
    }
 
    
}
