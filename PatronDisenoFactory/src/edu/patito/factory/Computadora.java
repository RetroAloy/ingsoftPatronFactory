package edu.patito.factory;

import ico.fes.factory.Articulo;

/**
 *
 * @author Adrian Enrique Valdivia Cabañas
 */
public class Computadora implements Articulo {
    public String tipoMarca;
    public String sistemaOperativo;
    public String memoriaRam;
    public String memoriaInterna;

    public Computadora() {
    }

    public Computadora(String tipoMarca, String sistemaOperativo, String memoriaRam, String memoriaInterna) {
        this.tipoMarca = tipoMarca;
        this.sistemaOperativo = sistemaOperativo;
        this.memoriaRam = memoriaRam;
        this.memoriaInterna = memoriaInterna;
    }

    public String getTipoMarca() {
        return tipoMarca;
    }

    public void setTipoMarca(String tipoMarca) {
        this.tipoMarca = tipoMarca;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getMemoriaInterna() {
        return memoriaInterna;
    }

    public void setMemoriaInterna(String memoriaInterna) {
        this.memoriaInterna = memoriaInterna;
    }

    @Override
    public String toString() {
        return "Computadora{" + "tipoMarca=" + tipoMarca + ", sistemaOperativo=" + sistemaOperativo + ", memoriaRam=" + memoriaRam + ", memoriaInterna=" + memoriaInterna + '}';
    }
}
