/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Rectangulo;
import Interfaces.CalculoRectangulo;

/**
 *
 * @author clavs
 */
public class RectanguloService implements CalculoRectangulo {

    @Override
    public double calcularArea(Rectangulo rec) {
        return rec.getBase() * rec.getAltura();
    }

    @Override
    public double calcularPerimetro(Rectangulo rec) {
        return (rec.getBase() + rec.getAltura()) * 2;
    }
}
