/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidades.Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author clavs
 */
public class ElectrodomesticoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public String comprobarConsumo(String letra) {

        switch (letra) {
            case "A":
                return "A";
            case "B":
                return "B";
            case "C":
                return "C";
            case "D":
                return "D";
            case "E":
                return "E";
            case "F":
                return "F";
            default:
                return "F";
        }
    }

    public String comprobarColor(String color) {

        color = color.toUpperCase();

        switch (color) {
            case "BLANCO":
                return "Blanco";
            case "NEGRO":
                return "Negro";
            case "ROJO":
                return "Rojo";
            case "AZUL":
                return "Azul";
            case "GRIS":
                return "Gris";
            default:
                return "Blanco";
        }
    }

    public Electrodomestico crear() {
        
        System.out.println("Ingrese el color:");
        String color = leer.next();
        String colorFinal = comprobarColor(color);
        System.out.println("Ingresar consumo:");
        String consumo = leer.next();
        String consumoFinal = comprobarConsumo(consumo);
        System.out.println("Ingresar peso:");
        int peso = leer.nextInt();

        int precio = precioFinal(consumoFinal, peso);
        
        Electrodomestico e = new Electrodomestico(precio, colorFinal, consumoFinal, peso);
        
        return e;
    }
    
    public int precioFinal(String consumoFinal, int peso){
                
        int precio = 1000;
        
        switch (consumoFinal) {
            case "A":
                precio += 1000;
                break;
            case "B":
                precio += 800;
                break;
            case "C":
                precio += 600;
                break;
            case "D":
                precio += 500;
                break;
            case "E":
                precio += 300;
                break;
            case "F":
                precio += 100;
                break;
            default:
                precio += 100;
                break;
        }
        
        if(peso > 1 && peso < 19){
            precio += 100;
        } else if (peso > 20 && peso < 49){
            precio += 500;
        } else if (peso > 50 && peso < 79){
            precio += 800;
        } else if (peso > 80){
            precio += 1000;
        } 
      
        return precio;
    }
}
