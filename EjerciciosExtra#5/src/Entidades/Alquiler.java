/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author clavs
 */
public class Alquiler {

    private String nombre;
    private String dni;
    private Date alquiler;
    private Date devolucion;
    private int posicion;
    private Barco barco;

    public Alquiler(Barco barco) {
        this.nombre = "Chiquito";
        this.dni = "666";
        this.alquiler = new Date(2023 -1900, 4, 30);
        this.devolucion = new Date(2023 - 1900, 5, 31);
        this.posicion = 10;
        this.barco = barco;
    }

    public Alquiler(String nombre, String dni, Date alquiler, Date devolucion, int posicion, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.alquiler = alquiler;
        this.devolucion = devolucion;
        this.posicion = posicion;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Date alquiler) {
        this.alquiler = alquiler;
    }

    public Date getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(Date devolucion) {
        this.devolucion = devolucion;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
}
