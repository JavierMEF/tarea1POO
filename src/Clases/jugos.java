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
public class jugos {
    public String tipoJ;
    public int cantidadIngredientesJ;
    public int porcionesJ;
    public String nombreJ;

    public jugos() {
        tipoJ="saludable";
        cantidadIngredientesJ=1;
        porcionesJ=1;
        nombreJ="jugo de naranja";
    }

    public jugos(String tipoJ, int cantidadIngredientesJ, int porcionesJ, String nombreJ) {
        this.tipoJ = tipoJ;
        this.cantidadIngredientesJ = cantidadIngredientesJ;
        this.porcionesJ = porcionesJ;
        this.nombreJ = nombreJ;
    }
    
}
