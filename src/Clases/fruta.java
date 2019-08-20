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
public class fruta {
    public String tipoF;
    public double tamanioF;
    public double pesoF;
    public String colorF;

    public fruta() {
        tipoF="citrica";
        tamanioF=12;
        pesoF=5;
        colorF="naranja";
    }

    public fruta(String tipoF, double tamanioF, double pesoF, String colorF) {
        this.tipoF = tipoF;
        this.tamanioF = tamanioF;
        this.pesoF = pesoF;
        this.colorF = colorF;
    }
    
}
