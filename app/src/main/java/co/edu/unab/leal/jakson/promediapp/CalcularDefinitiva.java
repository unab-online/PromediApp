package co.edu.unab.leal.jakson.promediapp;

import java.io.Serializable;

public class CalcularDefinitiva implements Serializable {

    private double asistenciaPC, trabajoClasePC, trabajosTalleres, parcial;

    private double asistenciaSC, trabajoClaseSC;
    private double primerEntrega, segundaEntrega, sustentacion, app;

    public double getAsistenciaPC() {
        return asistenciaPC;
    }

    public void setAsistenciaPC(double asistenciaPC) {
        this.asistenciaPC = asistenciaPC;
    }

    public double getTrabajoClasePC() {
        return trabajoClasePC;
    }

    public void setTrabajoClasePC(double trabajoClasePC) {
        this.trabajoClasePC = trabajoClasePC;
    }

    public double getTrabajosTalleres() {
        return trabajosTalleres;
    }

    public void setTrabajosTalleres(double trabajosTalleres) {
        this.trabajosTalleres = trabajosTalleres;
    }

    public double getParcial() {
        return parcial;
    }

    public void setParcial(double parcial) {
        this.parcial = parcial;
    }

    public double getAsistenciaSC() {
        return asistenciaSC;
    }

    public void setAsistenciaSC(double asistenciaSC) {
        this.asistenciaSC = asistenciaSC;
    }

    public double getTrabajoClaseSC() {
        return trabajoClaseSC;
    }

    public void setTrabajoClaseSC(double trabajoClaseSC) {
        this.trabajoClaseSC = trabajoClaseSC;
    }

    public double getPrimerEntrega() {
        return primerEntrega;
    }

    public void setPrimerEntrega(double primerEntrega) {
        this.primerEntrega = primerEntrega;
    }

    public double getSegundaEntrega() {
        return segundaEntrega;
    }

    public void setSegundaEntrega(double segundaEntrega) {
        this.segundaEntrega = segundaEntrega;
    }

    public double getSustentacion() {
        return sustentacion;
    }

    public void setSustentacion(double sustentacion) {
        this.sustentacion = sustentacion;
    }

    public double getApp() {
        return app;
    }

    public void setApp(double app) {
        this.app = app;
    }

    public double primerCorte() {
        double aux = (this.asistenciaPC * 0.1) + (this.trabajoClasePC * 0.3) + (this.trabajosTalleres * 0.3) + (this.parcial * 0.3);
        return aux * 0.5;
    }

    public double segundoCorte() {
        double aux = (this.asistenciaSC * 0.1 + this.trabajoClaseSC * 0.3 + this.primerEntrega * 0.15 + this.segundaEntrega * 0.15 + this.sustentacion * 0.15 + this.app * 0.15);
        return aux * 0.5;
    }
}
