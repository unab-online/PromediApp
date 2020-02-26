package co.edu.unab.diaz.javier.promediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Definitiva {

    private double asistencia1;
    private double trabajoclase1;
    private double trabajostalleres;
    private double parcial;
    private double asistencia2;
    private double trabajoclase2;
    private double primerentregable;
    private double segundoentregable;
    private double sustentacion;
    private double aplicacion;

    public double getPrimerCorte(){
        return this.asistencia1*.1+this.trabajoclase1*.3+this.trabajostalleres*.3+this.parcial*.3;
    }

    public double getSegundoCorte(){
        return this.asistencia2*.1+this.trabajoclase2*.3+this.primerentregable*.15+this.segundoentregable*.15+this.sustentacion*.15+this.aplicacion*.15;
    }

    public double getDefinitiva(){
        return getPrimerCorte()*.5+getSegundoCorte()*.5;
    }

    public double getAsistencia1() {
        return asistencia1;
    }

    public void setAsistencia1(double asistencia1){
        this.asistencia1 = asistencia1;
    }

    public double getTrabajoclase1(){
        return trabajoclase1;
    }

    public void setTrabajoclase1(double trabajoclase1) {
        this.trabajoclase1 = trabajoclase1;
    }

    public double getTrabajostalleres(){
        return trabajostalleres;
    }

    public void setTrabajostalleres(double trabajostalleres) {
        this.trabajostalleres = trabajostalleres;
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

    public double getTrabajoclase2() {
        return trabajoclase2;
    }

    public void setTrabajoclase2(double trabajoclase2) {
        this.trabajoclase2 = trabajoclase2;
    }

    public double getPrimerentregable() {
        return primerentregable;
    }

    public void setPrimerentregable(double primerentregable) {
        this.primerentregable = primerentregable;
    }

    public double getSegundoentregable() {
        return segundoentregable;
    }

    public void setSegundoentregable(double segundoentregable) {
        this.segundoentregable = segundoentregable;
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
