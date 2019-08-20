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
public class muebles {
    public String tipoMu;
    public double pesoMu;
    public String colorMu;
    public String materialMu;

    public muebles() {
        tipoMu="comedor";
        pesoMu=16.5;
        colorMu="cafe";
        materialMu="madera";
    }

    public muebles(String tipoMu, double pesoMu, String colorMu, String materialMu) {
        this.tipoMu = tipoMu;
        this.pesoMu = pesoMu;
        this.colorMu = colorMu;
        this.materialMu = materialMu;
    }
    

}
