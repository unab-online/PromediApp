package co.edu.unab.melon.cristian.promediapp;

public class Definitiva {

    public double getDefinitiva() {
        return this.getPrimerCorte()*0.5+this.getSegundocorte()*0.5;
    }

    public void setDefinitiva(double definitiva) {
        this.definitiva = definitiva;
    }

    private double definitiva;
    private double segundocorte;
    private double primerCorte;
    private double asitencia1;
    private double talleres1;
    private double trabajos1;
    private double parcial1;
    private double asistencia2;
    private double trabajos2;
    private double sustentacion;
    private double aplicacion;
    private double entregable1;
    private double entregable2;

    public double getAsitencia1() {
        return asitencia1;
    }

    public void setAsitencia1(double asitencia1) {
        this.asitencia1 = asitencia1;
    }

    public double getTalleres1() {
        return talleres1;
    }

    public void setTalleres1(double talleres1) {
        this.talleres1 = talleres1;
    }

    public double getTrabajos1() {
        return trabajos1;
    }

    public void setTrabajos1(double trabajos1) {
        this.trabajos1 = trabajos1;
    }

    public double getParcial1() {
        return parcial1;
    }

    public void setParcial1(double parcial1) {
        this.parcial1 = parcial1;
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



    public double getPrimerCorte() {
        return this.asitencia1*0.1+this.talleres1*0.3+this.trabajos1*0.3+this.parcial1*0.3;
    }

    public void setPrimerCorte(double primerCorte) {
        this.primerCorte = primerCorte;
    }

    public double getSegundocorte() {
        return this.asistencia2*0.1+this.trabajos2*0.3+this.entregable1*0.15+this.entregable2*0.15+this.sustentacion*0.15+this.aplicacion*0.15;
    }

    public void setSegundocorte(double segundocorte) {
        this.segundocorte = segundocorte;
    }










}
