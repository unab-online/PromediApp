package co.edu.unab.vasquez.nodier.promediapp;

public class Definitiva {

    private Double asistencia1;
    private Double trabajoClase1;
    private Double talleres;
    private Double parcial;
    private Double asistencia2;
    private Double trabajoClase2;
    private Double entregable1;
    private Double entregable2;
    private Double sustentacion;
    private Double aplicacion;

    public double getPrimerCorte(){
        return this.asistencia1*0.1+this.trabajoClase1*0.3+this.talleres*0.3+this.parcial*0.3;
    }

    public double getSegundoCorte(){
        return this.asistencia2*0.1+this.trabajoClase2*0.3+this.entregable1*0.15+this.entregable2*0.15+this.sustentacion*0.15+this.aplicacion*0.15;
    }

    public double getDefinitiva(){
        return this.getPrimerCorte()*0.5+this.getSegundoCorte()*0.5;
    }

    public Double getAsistencia1() {
        return asistencia1;
    }
    public void setAsistencia1(Double asistencia1) {
        this.asistencia1 = asistencia1;
    }

    public Double getTrabajoClase1() {
        return trabajoClase1;
    }
    public void setTrabajoClase1(Double trabajoClase1) {
        this.trabajoClase1 = trabajoClase1;
    }

    public Double getTaller() {
        return talleres;
    }
    public void setTaller(Double taller) {
        this.talleres = talleres;
    }

    public Double getParcial() {
        return parcial;
    }
    public void setParcial(Double parcial) {
        this.parcial = parcial;
    }

    public Double getAsistencia2() {
        return asistencia2;
    }
    public void setAsistencia2(Double asistencia2) {
        this.asistencia2 = asistencia2;
    }

    public Double getTrabajoClase2() {
        return trabajoClase2;
    }
    public void setTrabajoClase2(Double trabajoClase2) {
        this.trabajoClase2 = trabajoClase2;
    }

    public Double getEntregable1() {
        return entregable1;
    }
    public void setEntregable1(Double entregable1) {
        this.entregable1 = entregable1;
    }

    public Double getEntregable2() {
        return entregable2;
    }
    public void setEntregable2(Double entregable2) {
        this.entregable2 = entregable2;
    }

    public Double getSustentacion() {
        return sustentacion;
    }
    public void setSustentacion(Double sustentacion) {
        this.sustentacion = sustentacion;
    }

    public Double getAplicacion() {
        return aplicacion;
    }
    public void setAplicacion(Double aplicacion) {
        this.aplicacion = aplicacion;
    }



}
