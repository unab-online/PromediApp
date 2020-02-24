package co.edu.unab.primerapellido.primernombre.promediapp;

public class Definitiva {

    private Double asistencia1;
    private Double trabajoClase1;
    private Double trabajosTalleres;
    private Double parcial;
    private Double asistencia2;
    private Double trabajoClase2;
    private Double primerEntregable;
    private Double segundoEntregable;
    private Double sustentacion;
    private Double aplicacion;

    public double getPrimerCorte(){
        return this.asistencia1*.1+this.trabajoClase1*.3+this.trabajosTalleres*.3+this.parcial*.3;
    }

    public double getSegundoCorte(){
        return this.asistencia2*.1+this.trabajoClase2*.3+this.primerEntregable*.15+this.segundoEntregable*.15+this.sustentacion*.15+this.aplicacion*.15;
    }

    public double getDefinitiva(){
        return this.getPrimerCorte()*.5+this.getSegundoCorte()*.5;
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

    public Double getTrabajosTalleres() {
        return trabajosTalleres;
    }

    public void setTrabajosTalleres(Double trabajosTalleres) {
        this.trabajosTalleres = trabajosTalleres;
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

    public Double getPrimerEntregable() {
        return primerEntregable;
    }

    public void setPrimerEntregable(Double primerEntregable) {
        this.primerEntregable = primerEntregable;
    }

    public Double getSegundoEntregable() {
        return segundoEntregable;
    }

    public void setSegundoEntregable(Double segundoEntregable) {
        this.segundoEntregable = segundoEntregable;
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
