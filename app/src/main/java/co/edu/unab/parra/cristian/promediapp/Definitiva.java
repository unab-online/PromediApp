package co.edu.unab.parra.cristian.promediapp;

public class Definitiva {

    private double asistencia1;
    private  double talleres;
    private  double trabajos1;
    private double parcial1;
    private double asistencia2;
    private double trabajos2;
    private  double sustentacion;
    private  double aplicacion;
    private   double entregable1;
    private  double entregable2;

    public Definitiva(double asistencia1, double talleres, double trabajos1, double parcial1, double asistencia2, double trabajos2, double sustentacion, double aplicacion, double entregable1, double entregable2) {
        this.asistencia1 = asistencia1;
        this.talleres = talleres;
        this.trabajos1 = trabajos1;
        this.parcial1 = parcial1;
        this.asistencia2 = asistencia2;
        this.trabajos2 = trabajos2;
        this.sustentacion = sustentacion;
        this.aplicacion = aplicacion;
        this.entregable1 = entregable1;
        this.entregable2 = entregable2;
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

    public double getDefinitiva(){
        double resultadoSem= (this.getPrimerCorte()*0.5)+(this.getSegundoCorte()*0.5);
        return resultadoSem;
    }

    public double getPrimerCorte(){
        double corte1= this.asistencia1*0.10+this.trabajos1*0.30+this.talleres*0.30+this.parcial1*0.30;
        return corte1;
    }

    public double getSegundoCorte(){
        double corte2= this.asistencia2*0.10+this.trabajos2*0.30+this.entregable1*0.15+this.entregable2*0.15+this.sustentacion*0.15+this.aplicacion*0.15;
        return corte2;
    }

}
