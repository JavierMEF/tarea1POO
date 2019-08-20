/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author fran_
 */
public class reloj {
    public String marcaRj;
    public String modeloRj;
    public int anioRj;
    public String colorRj;

    public reloj() {
        marcaRj="rolex";
        modeloRj="xxe3";
        anioRj=1988;
        colorRj="plata";
    }

    public reloj(String marcaRj, String modeloRj, int anioRj, String colorRj) {
        this.marcaRj = marcaRj;
        this.modeloRj = modeloRj;
        this.anioRj = anioRj;
        this.colorRj = colorRj;
    }
    
}
