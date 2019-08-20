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
public class cremas {
    public String tipoC;
    public double cantidadC;
    public String utilidaC;
    public String marcaC;

    public cremas() {
        tipoC="corporal";
        cantidadC=700;
        utilidaC="cuerpo";
        marcaC="lubriderm";

    }

    public cremas(String tipoC, double cantidadC, String utilidaC, String marcaC) {
        this.tipoC = tipoC;
        this.cantidadC = cantidadC;
        this.utilidaC = utilidaC;
        this.marcaC = marcaC;
    }
    
}
