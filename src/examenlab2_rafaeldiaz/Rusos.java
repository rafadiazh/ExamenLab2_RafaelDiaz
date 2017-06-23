/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab2_rafaeldiaz;

import java.io.Serializable;

/**
 *
 * @author Rafael
 */
public class Rusos implements Serializable{
    static final long SerialVersionUID=777L;
    String nombre, rango, arma,ID;
    int edad, resistencia,poderfuego;

    public Rusos(String nombre, String rango, String arma, String ID, int edad, int resistencia, int poderfuego) {
        this.nombre = nombre;
        this.rango = rango;
        this.arma = arma;
        this.ID = ID;
        this.edad = edad;
        this.resistencia = resistencia;
        this.poderfuego = poderfuego;
    }

    

    public Rusos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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

    public int getPoderfuego() {
        return poderfuego;
    }

    public void setPoderfuego(int poderfuego) {
        this.poderfuego = poderfuego;
    }
    

    @Override
    public String toString() {
        return nombre;
    }

}
