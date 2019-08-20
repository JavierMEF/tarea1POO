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
public class comida {
    public String tipoC;
    public int cantidadIngredientesC;
    public int porcionesC;
    public String nombreC;

    public comida() {
        tipoC="saludable";
        cantidadIngredientesC=8;
        porcionesC=5;
        nombreC="ensalada";
    }

    public comida(String tipoC, int cantidadIngredientesC, int porcionesC, String nombreC) {
        this.tipoC = tipoC;
        this.cantidadIngredientesC = cantidadIngredientesC;
        this.porcionesC = porcionesC;
        this.nombreC = nombreC;
    }
    
}
