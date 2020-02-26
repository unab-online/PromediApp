package co.edu.unab.celis.sergio.promediapp;

import java.io.Serializable;

public class Definitiva implements Serializable {

    private double asistencia1;
    private double talleres;
    private double clase1;
    private double parcial;
    private double asistencia2;
    private double clase2;
    private double entregable1;
    private double entregable2;
    private double sustentacion;
    private double aplicacion;

    public double getPrimerCorte(){
        return this.asistencia1*0.1 + this.talleres*0.3 + this.clase1*0.3 + this.parcial*0.3;
    }

    public double getSegundoCorte(){
        return this.asistencia2*0.1 + this.clase2*0.3 + this.entregable1*0.15 + this.entregable2*0.15 + this.sustentacion*0.15 + this.aplicacion*0.15;
    }

    public double getDefinitiva(){
        return this.getPrimerCorte()*0.5 + this.getSegundoCorte()*0.5;
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

    public double getClase1() {
        return clase1;
    }

    public void setClase1(double clase1) {
        this.clase1 = clase1;
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

    public double getClase2() {
        return clase2;
    }

    public void setClase2(double clase2) {
        this.clase2 = clase2;
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
