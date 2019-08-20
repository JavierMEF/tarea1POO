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
public class arboles {
    public String tipoA;
    public double alturaA;
    public String colorA;
    public String fruto;
    public arboles(){
        tipoA= "";
        alturaA=45.3;
        colorA= "rojo";
        fruto= "no";
}

    public arboles(String tipoA, double alturaA, String colorA, String fruto) {
        this.tipoA = tipoA;
        this.alturaA = alturaA;
        this.colorA = colorA;
        this.fruto = fruto;
    }
    
    
}
