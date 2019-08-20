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
public class computadora {
    public int ramCm;
    public double pesoCm;
    public String colorCm;
    public int almacenamientoCm;

    public computadora() {
        ramCm=16;
        pesoCm=15.5;
        colorCm="gris";
        almacenamientoCm=600;
    }

    public computadora(int ramCm, double pesoCm, String colorCm, int almacenamientoCm) {
        this.ramCm = ramCm;
        this.pesoCm = pesoCm;
        this.colorCm = colorCm;
        this.almacenamientoCm = almacenamientoCm;
    }
    

}
