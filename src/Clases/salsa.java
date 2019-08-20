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
public class salsa {
    public String tipoS;
    public int cantidadIngredientesS;
    public int porcionesS;
    public String nombreS;

    public salsa() {
    tipoS="espesa";
    cantidadIngredientesS=7;
    porcionesS=45;
    nombreS="avanero";
    
    }

    public salsa(String tipoS, int cantidadIngredientesS, int porcionesS, String nombreS) {
        this.tipoS = tipoS;
        this.cantidadIngredientesS = cantidadIngredientesS;
        this.porcionesS = porcionesS;
        this.nombreS = nombreS;
    }
    
}
