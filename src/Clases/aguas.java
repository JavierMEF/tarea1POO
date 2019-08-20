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
public class aguas {
    public String tipoAg;
    public int cantidadIngredientesAg;
    public int porcionesAg;
    public String nombreAg;

    public aguas() {
        tipoAg="fresca";
        cantidadIngredientesAg=3;
        porcionesAg=100;
        nombreAg="agua de limon";
    }

    public aguas(String tipoAg, int cantidadIngredientesAg, int porcionesAg, String nombreAg) {
        this.tipoAg = tipoAg;
        this.cantidadIngredientesAg = cantidadIngredientesAg;
        this.porcionesAg = porcionesAg;
        this.nombreAg = nombreAg;
    }
    
}
