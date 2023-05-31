/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Alquiler;

/**
 *
 * @author clavs
 */
public class AlquilerService {

    public double calcularAlquiler(Alquiler al) {

        int milisecondsByDay = 86400000;
        double dias = ((al.getDevolucion().getTime() - al.getAlquiler().getTime()) / milisecondsByDay);
        
        return dias;
    }
}
