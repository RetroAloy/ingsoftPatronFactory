package edu.patito.factory;

import ico.fes.factory.Articulo;

/**
 *
 * @author Adrian Enrique Valdivia Cabañas
 */
public class Tableta implements Articulo {
    public String color;
    public String dimensionesDePantalla;
    public String resolucionCamara;
    public String modelo;

    public Tableta() {
    }

    public Tableta(String color, String dimensionesDePantalla, String resolucionCamara, String modelo) {
        this.color = color;
        this.dimensionesDePantalla = dimensionesDePantalla;
        this.resolucionCamara = resolucionCamara;
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDimensionesDePantalla() {
        return dimensionesDePantalla;
    }

    public void setDimensionesDePantalla(String dimensionesDePantalla) {
        this.dimensionesDePantalla = dimensionesDePantalla;
    }

    public String getResolucionCamara() {
        return resolucionCamara;
    }

    public void setResolucionCamara(String resolucionCamara) {
        this.resolucionCamara = resolucionCamara;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Tableta{" + "color=" + color + ", dimensionesDePantalla=" + dimensionesDePantalla + ", resolucionCamara=" + resolucionCamara + ", modelo=" + modelo + '}';
    }
}
