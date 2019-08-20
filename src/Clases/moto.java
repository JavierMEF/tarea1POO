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
public class moto {
    public String marcaM;
    public String modeloM;
    public int cantidadruedasM;
    public String colorM;

    public moto() {
    marcaM="honda";
    modeloM="cobra21";
    cantidadruedasM=2;
    colorM="azul";
    }

    public moto(String marcaM, String modeloM, int cantidadruedasM, String colorM) {
        this.marcaM = marcaM;
        this.modeloM = modeloM;
        this.cantidadruedasM = cantidadruedasM;
        this.colorM = colorM;
    }
    
}
