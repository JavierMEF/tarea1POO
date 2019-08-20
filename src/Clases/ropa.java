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
public class ropa {
    public String tipoR;
    public double pesoR;
    public String colorR;
    public String materialR;

    public ropa() {
        tipoR="camisa";
        pesoR=5.5;
        colorR="azul";
        materialR="algodon";
    }

    public ropa(String tipoR, double pesoR, String colorR, String materialR) {
        this.tipoR = tipoR;
        this.pesoR = pesoR;
        this.colorR = colorR;
        this.materialR = materialR;
    }
    
}
