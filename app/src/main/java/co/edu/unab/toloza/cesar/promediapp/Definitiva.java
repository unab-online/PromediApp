package co.edu.unab.toloza.cesar.promediapp;

import java.io.Serializable;

public class Definitiva implements Serializable {

    private double asistencia1;
    private double talleres;
    private double trabajos1;
    private double parcial;
    private double asistencia2;
    private double trabajos2;
    private double sustentacion;
    private double aplicacion;
    private double entragable1;
    private double entragable2;

    public double getPrimerCorte(){
        return this.asistencia1*.1+this.trabajos1*.3+this.talleres*.3+this.parcial*.3;
    }

    public double getSegundoCorte(){
        return this.asistencia2*.1+this.trabajos2*.3+this.entragable1*.15+this.entragable2*.15+this.sustentacion*.15+this.aplicacion*.15;
    }

    public double getAsistencia1() {
        return asistencia1;
    }
    public double getDefinitiva(){
        return getPrimerCorte()*.5+getSegundoCorte()*.5;
    }

    public void setAsistencia1(double asistencia1) {
        this.asistencia1 = asistencia1;
    }

    public double getTalleres() {
        return talleres;
    }

    public void setTalleres(double talleres) {
        this.talleres = talleres;
    }

    public double getTrabajos1() {
        return trabajos1;
    }

    public void setTrabajos1(double trabajos1) {
        this.trabajos1 = trabajos1;
    }

    public double getParcial() {
        return parcial;
    }

    public void setParcial(double parcial) {
        this.parcial = parcial;
    }

    public double getAsistencia2() {
        return asistencia2;
    }

    public void setAsistencia2(double asistencia2) {
        this.asistencia2 = asistencia2;
    }

    public double getTrabajos2() {
        return trabajos2;
    }

    public void setTrabajos2(double trabajos2) {
        this.trabajos2 = trabajos2;
    }

    public double getSustentacion() {
        return sustentacion;
    }

    public void setSustentacion(double sustentacion) {
        this.sustentacion = sustentacion;
    }

    public double getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(double aplicacion) {
        this.aplicacion = aplicacion;
    }

    public double getEntragable1() {
        return entragable1;
    }

    public void setEntragable1(double entragable1) {
        this.entragable1 = entragable1;
    }

    public double getEntragable2() {
        return entragable2;
    }

    public void setEntragable2(double entragable2) {
        this.entragable2 = entragable2;
    }
}
