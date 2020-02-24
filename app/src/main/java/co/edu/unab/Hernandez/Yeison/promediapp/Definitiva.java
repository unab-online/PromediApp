package co.edu.unab.Hernandez.Yeison.promediapp;

public class Definitiva {
    private double asistenciaUno,talleres,trabajosUno,pacial,asistenciaDos,trabajosDos,sustentacon,aplicacion,entregableUno,entregableDos;

    public double getAsistenciaUno() {
        return asistenciaUno;
    }

    public void setAsistenciaUno(double asistenciaUno) {
        this.asistenciaUno = asistenciaUno;
    }

    public double getTalleres() {
        return talleres;
    }

    public void setTalleres(double talleres) {
        this.talleres = talleres;
    }

    public double getTrabajosUno() {
        return trabajosUno;
    }

    public void setTrabajosUno(double trabajosUno) {
        this.trabajosUno = trabajosUno;
    }

    public double getPacial() {
        return pacial;
    }

    public void setPacial(double pacial) {
        this.pacial = pacial;
    }

    public double getAsistenciaDos() {
        return asistenciaDos;
    }

    public void setAsistenciaDos(double asistenciaDos) {
        this.asistenciaDos = asistenciaDos;
    }

    public double getTrabajosDos() {
        return trabajosDos;
    }

    public void setTrabajosDos(double trabajosDos) {
        this.trabajosDos = trabajosDos;
    }

    public double getSustentacon() {
        return sustentacon;
    }

    public void setSustentacon(double sustentacon) {
        this.sustentacon = sustentacon;
    }

    public double getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(double aplicacion) {
        this.aplicacion = aplicacion;
    }
    public double getDefinitiva(){
        return (getPrimerCorte()*0.5)+(getSegundoCorte()*0.5);
    }
    public double getPrimerCorte(){

        return getAsistenciaUno()*0.1 +getTrabajosUno()*0.3+getTalleres()*0.3+getPacial()*0.3;

    }
    public double getSegundoCorte(){

        return (getAsistenciaDos()*0.1 +getTrabajosDos()*0.3)+(getEntregableUno()*0.15 +getEntregableDos()*0.15+getSustentacon()*0.15 +getAplicacion()*0.15);

    }

    public Definitiva() {
    }

    public double getEntregableUno() {
        return entregableUno;
    }

    public void setEntregableUno(double entregableUno) {
        this.entregableUno = entregableUno;
    }

    public double getEntregableDos() {
        return entregableDos;
    }

    public void setEntregableDos(double entregableDos) {
        this.entregableDos = entregableDos;
    }

    public Definitiva(double asistenciaUno, double talleres, double trabajosUno, double pacial, double asistenciaDos, double trabajosDos, double sustentacon, double aplicacion, double entregableUno, double entregableDos) {
        this.asistenciaUno = asistenciaUno;
        this.talleres = talleres;
        this.trabajosUno = trabajosUno;
        this.pacial = pacial;
        this.asistenciaDos = asistenciaDos;
        this.trabajosDos = trabajosDos;
        this.sustentacon = sustentacon;
        this.aplicacion = aplicacion;
        this.entregableUno = entregableUno;
        this.entregableDos = entregableDos;
    }

    @Override
    public String toString() {
        return "Notas en el semestre: " +
                "asistenciaUno = " + asistenciaUno +
                ", talleres = " + talleres +
                ", trabajosUno = " + trabajosUno +
                ", pacial=  " + pacial +
                ", asistenciaDos = " + asistenciaDos +
                ", trabajosDos = " + trabajosDos +
                ", sustentacon = " + sustentacon +
                ", aplicacion = " + aplicacion +
                ", entregableUno = " + entregableUno +
                ", entregableDos = " + entregableDos +
                "  Nota Final: "+String.valueOf(getDefinitiva());
    }
}
