/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab2_rafaeldiaz;

/**
 *
 * @author Rafael
 */
public class AlumnosProgra2 {
    String apodo, gradoacademico, tipoarma,numcuenta;
    int edad, resistencia,poderfuego;

    public AlumnosProgra2(String apodo, String gradoacademico, String tipoarma, String numcuenta, int edad, int resistencia, int poderfuego) {
        this.apodo = apodo;
        this.gradoacademico = gradoacademico;
        this.tipoarma = tipoarma;
        this.numcuenta = numcuenta;
        this.edad = edad;
        this.resistencia = resistencia;
        this.poderfuego = poderfuego;
    }

    public int getPoderfuego() {
        return poderfuego;
    }

    public void setPoderfuego(int poderfuego) {
        this.poderfuego = poderfuego;
    }

    

    public AlumnosProgra2() {
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getGradoacademico() {
        return gradoacademico;
    }

    public void setGradoacademico(String gradoacademico) {
        this.gradoacademico = gradoacademico;
    }

    public String getTipoarma() {
        return tipoarma;
    }

    public void setTipoarma(String tipoarma) {
        this.tipoarma = tipoarma;
    }

    public String getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(String numcuenta) {
        this.numcuenta = numcuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public String toString() {
        return "Los_Alumnos_de_Programacion_ll{" + "apodo=" + apodo + '}';
    }

    
}
