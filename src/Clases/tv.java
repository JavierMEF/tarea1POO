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
public class tv {
    public String marcaTv;
    public String modeloTv;
    public int anioTv;
    public String colorTv;

    public tv() {
        marcaTv="samsung";
        modeloTv="13521a";
        anioTv=2019;
        colorTv="negra";
    }

    public tv(String marcaTv, String modeloTv, int anioTv, String colorTv) {
        this.marcaTv = marcaTv;
        this.modeloTv = modeloTv;
        this.anioTv = anioTv;
        this.colorTv = colorTv;
    }
    
}
