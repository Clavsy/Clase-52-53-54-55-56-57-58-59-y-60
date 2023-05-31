/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico.pkg2;

import Entidades.Electrodomestico;
import Service.LavadoraService;
import Service.TVService;
import java.util.ArrayList;

/**
 *
 * @author clavs
 */
public class EjercicioPractico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        LavadoraService servLav = new LavadoraService();
        TVService servTV = new TVService();

        System.out.println("CREAR LAVADORA #1:");
        Electrodomestico lavadora1 = servLav.crear();
        electrodomesticos.add(lavadora1);
        System.out.println("CREAR LAVADORA #2:");
        Electrodomestico lavadora2 = servLav.crear();
        electrodomesticos.add(lavadora2);
        System.out.println("CREAR TV #1:");
        Electrodomestico tv1 = servTV.crear();
        electrodomesticos.add(tv1);
        System.out.println("CREAR TV #2:");
        Electrodomestico tv2 = servTV.crear();
        electrodomesticos.add(tv2);

        int precioTotal = 0;
        
        for (Electrodomestico electrodomestico : electrodomesticos) {
            precioTotal += electrodomestico.getPrecio();
        }
        
        System.out.println("El precio total de los " + electrodomesticos.size() + " es de $" + precioTotal);
    }
}
