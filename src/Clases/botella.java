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
public class botella {
    public String tipoB;
    public double tamanioB;
    public double pesoB;
    public String colorB;

    public botella() {
        tipoB="plastico";
        tamanioB=16.2;
        pesoB=2.5;
        colorB="cristalina";
    }

    public botella(String tipoB, double tamanioB, double pesoB, String colorB) {
        this.tipoB = tipoB;
        this.tamanioB = tamanioB;
        this.pesoB = pesoB;
        this.colorB = colorB;
    }
    
    
}

