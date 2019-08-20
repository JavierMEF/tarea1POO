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
public class celulares {
    public String tipoC;
    public double tamanioC;
    public double pesoC;
    public String colorC;

    public celulares() {
        tipoC="smarphone";
        tamanioC=12.5;
        pesoC=5.5;
        colorC="negro";
    }

    public celulares(String tipoC, double tamanioC, double pesoC, String colorC) {
        this.tipoC = tipoC;
        this.tamanioC = tamanioC;
        this.pesoC = pesoC;
        this.colorC = colorC;
    }
    
}
