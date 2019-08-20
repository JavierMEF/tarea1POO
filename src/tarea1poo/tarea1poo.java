/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1poo;
import Clases.aguas;
import Clases.arboles;
import Clases.auto;
import Clases.aves;
import Clases.botella;
import Clases.celulares;
import Clases.comida;
import Clases.computadora;
import Clases.cremas;
import Clases.duende;
import Clases.fruta;
import Clases.gato;
import Clases.jugos;
import Clases.moto;
import Clases.muebles;
import Clases.perro;
import Clases.reloj;
import Clases.ropa;
import Clases.salsa;
import Clases.tv;
/**
 *
 * @author fran_
 */
public class tarea1poo {
    public static void main(String[] args) {
        aguas ag = new aguas("plastico", 12, 1, "pepino");
        ag.tipoAg="fresca";
        ag.cantidadIngredientesAg=4;
        ag.porcionesAg=2;
        ag.nombreAg="coco";
        
        arboles ar = new arboles("desconocido", 18, "marron","ninguno");
        ar.tipoA="frutal";
        ar.alturaA=19;
        ar.colorA="verde";
        ar.fruto="manzana";
        
        auto au = new auto("mazda", "78s", 8, "rojo");
            au.marcaA="honda";
            au.modeloA="jsa";
            au.cantidadPuertasA=4;
            au.colorA="blanco";
        aves av = new aves("no voladora", 16, 10, "negro blanco");
            av.tipoAV="voladora";
            av.pesoAV=12;
            av.tamanioAV=14;
            av.colorAV="marron";
        botella bo = new botella("aluminio", 19.5, 15.3, "aluminio");
            bo.tipoB="vidrio";
            bo.pesoB=18.2;
            bo.tamanioB=24;
            bo.colorB="verde";
        celulares ce = new celulares("smarphone", 15.3, 2.6, "verde");
            ce.tipoC="tamagochi";
            ce.pesoC=13.2;
            ce.tamanioC=15;
            ce.colorC="azul";
        comida co = new comida("casera", 3, 7, "mole");
            co.tipoC="chatarra";
            co.porcionesC=6;
            co.cantidadIngredientesC=9;
            co.nombreC="pollo frito";
        computadora com = new computadora(2, 2.2, "negra", 1000);
            com.ramCm=64;
            com.pesoCm=18.5;
            com.colorCm="blanca";
            com.almacenamientoCm=100000;
        cremas cr = new cremas("corporal", 14, "para la cara", "avon");
            cr.tipoC="para tacos";
            cr.cantidadC=18;
            cr.utilidaC="para la comida";
            cr.marcaC="lala";
        duende du = new duende("pantano", 12, 13, "cafe");
            du.tipoD="fuego";
            du.pesoD=10;
            du.tamanioD=18;
            du.colorD="rojo";
        fruta fr = new fruta("grano", 15, 12, "verde");
            fr.tipoF="exoticas";
            fr.pesoF=18;
            fr.tamanioF=12;
            fr.colorF="rojo";
        gato  g = new gato("2 veces al dia", 18, "blanco", 12);
         g.comidadG="4 veces al dia";
         g.aniosG=20;
         g.pesoG=15;
         g.colorG="negro";
        jugos ju = new jugos("procesado", 12, 355, "durazno");
            ju.tipoJ="natural";
            ju.porcionesJ=12;
            ju.cantidadIngredientesJ=10;
            ju.nombreJ="jugo de mango";
        moto mo = new moto("daimon", "89", 2, "negra");
            mo.marcaM="yamaja";
            mo.modeloM="dar3";
            mo.cantidadruedasM=2;
            mo.colorM="morada";
        muebles mu = new muebles("silla", 14, "negra", "metal");
            mu.tipoMu="sala";
            mu.pesoMu=19;
            mu.colorMu="gris";
            mu.materialMu="cuero";
        perro p = new perro("2 veces al dia", 15, "cafe", 2);
            p.comidadP="4 veces al dia";
            p.pesoP=18;
            p.aniosP=6;
            p.colorP="marron";
        reloj re = new reloj("china", "sadfe2", 15, "negro");
            re.marcaRj="europea";
            re.anioRj=1936;
            re.colorRj="dorado";
            re.modeloRj="ty3";
        ropa ro = new ropa("chamarra",2, "negra", "cuero");
            ro.tipoR="pantalon";
            ro.colorR="mesclilla";
            ro.materialR="mesclilla";
            ro.pesoR=12;
        salsa sa = new salsa("picante", 5, 10, "avanero");
            sa.tipoS="de la que no pica";
            sa.cantidadIngredientesS=5;
            sa.porcionesS=3;
            sa.nombreS="guacamole";
        tv tv = new tv("haisen", "fgcs2", 2016, "gris");
            tv.marcaTv="lg";
            tv.modeloTv="2018";
            tv.anioTv=2018;
            tv.colorTv="negra";
    
    
    }
}
