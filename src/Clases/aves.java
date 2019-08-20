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
public class aves {
    public String tipoAV;
    public double tamanioAV;
    public double pesoAV;
    public String colorAV;
    public aves(){
        tipoAV="voladora";
        tamanioAV=15.2;
        pesoAV=3.4;
        colorAV="gris";
        
    }

    public aves(String tipoAV, double tamanioAV, double pesoAV, String colorAV) {
        this.tipoAV = tipoAV;
        this.tamanioAV = tamanioAV;
        this.pesoAV = pesoAV;
        this.colorAV = colorAV;
    }
    
}
