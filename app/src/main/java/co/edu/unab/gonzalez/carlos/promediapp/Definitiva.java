package co.edu.unab.gonzalez.carlos.promediapp;

import java.io.Serializable;

public class Definitiva implements Serializable {
    private double asistencia1;
    private double talleres;
    private double trabajos1;
    private double parcial;
    private double asistencia2;
    private double trabajos2;
    private double entregable1;
    private double entregable2;
    private double sustentacion;
    private double aplicacion;

    public double getPrimercorte(){
        return this.asistencia1*0.1+this.trabajos1*0.3+this.talleres*0.3+this.parcial*0.3;
    }

    public double getSegundocorte(){
        return this.asistencia2*0.1+this.trabajos2*0.3+this.entregable1*0.15+this.entregable2*0.15+this.sustentacion*0.15+this.aplicacion*0.15;
    }

    public double getDefinitiva(){
        return this.getPrimercorte()*0.5+this.getSegundocorte()*0.5;
    }

    public double getAsistencia1() {
        return asistencia1;
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

    public double getEntregable1() {
        return entregable1;
    }

    public void setEntregable1(double entregable1) {
        this.entregable1 = entregable1;
    }

    public double getEntregable2() {
        return entregable2;
    }

    public void setEntregable2(double entregable2) {
        this.entregable2 = entregable2;
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
}
