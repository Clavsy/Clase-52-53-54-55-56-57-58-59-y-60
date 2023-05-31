/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico.pkg4;

import Entidades.Circulo;
import Entidades.Rectangulo;
import Servicios.CiculoService;
import Servicios.RectanguloService;

/**
 *
 * @author clavs
 */
public class EjercicioPractico4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circ = new Circulo(5);
        Rectangulo rec = new Rectangulo(7, 3);
        
        CiculoService servC = new CiculoService();
        RectanguloService servR = new RectanguloService();
        
        System.out.println("Area circulo: " + servC.calcularArea(circ));
        System.out.println("Perimetro circulo: " + servC.calcularPerimetro(circ));
        System.out.println("Area rectangulo: " + servR.calcularArea(rec));
        System.out.println("Perimetro rectangulo: " + servR.calcularPerimetro(rec));
    }
    
}
