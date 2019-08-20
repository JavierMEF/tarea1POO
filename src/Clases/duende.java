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
public class duende {
    public String tipoD;
    public double tamanioD;
    public double pesoD;
    public String colorD;

    public duende() {
        tipoD="bosque";
        tamanioD=12.2;
        pesoD=5;
        colorD="verde";
    }

    public duende(String tipoD, double tamanioD, double pesoD, String colorD) {
        this.tipoD = tipoD;
        this.tamanioD = tamanioD;
        this.pesoD = pesoD;
        this.colorD = colorD;
    }
    
}
