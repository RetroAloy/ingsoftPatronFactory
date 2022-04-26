package edu.patito.factory;

import ico.fes.factory.Articulo;

/**
 *
 * @author Adrian Enrique Valdivia Cabañas
 */
public class Smartphone implements Articulo {
    public String tipoMarca;
    public String dimensionesPantalla;
    public String resolucionCamara;
    public String color;

    public Smartphone() {
    }

    public Smartphone(String tipoMarca, String dimensionesPantalla, String resolucionCamara, String color) {
        this.tipoMarca = tipoMarca;
        this.dimensionesPantalla = dimensionesPantalla;
        this.resolucionCamara = resolucionCamara;
        this.color = color;
    }

    public String getTipoMarca() {
        return tipoMarca;
    }

    public void setTipoMarca(String tipoMarca) {
        this.tipoMarca = tipoMarca;
    }

    public String getDimensionesPantalla() {
        return dimensionesPantalla;
    }

    public void setDimensionesPantalla(String dimensionesPantalla) {
        this.dimensionesPantalla = dimensionesPantalla;
    }

    public String getResolucionCamara() {
        return resolucionCamara;
    }

    public void setResolucionCamara(String resolucionCamara) {
        this.resolucionCamara = resolucionCamara;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Smartphone{" + "tipoMarca=" + tipoMarca + ", dimensionesPantalla=" + dimensionesPantalla + ", resolucionCamara=" + resolucionCamara + ", color=" + color + '}';
    }
}
