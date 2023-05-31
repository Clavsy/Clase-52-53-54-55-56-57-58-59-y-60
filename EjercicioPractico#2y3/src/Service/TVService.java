/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidades.Electrodomestico;
import Entidades.TV;

/**
 *
 * @author clavs
 */
public final class TVService extends ElectrodomesticoService{
    
    @Override
    public Electrodomestico crear() {

        System.out.println("Ingrese el color:");
        String color = leer.next();
        String colorFinal = comprobarColor(color);
        System.out.println("Ingresar consumo:");
        String consumo = leer.next();
        String consumoFinal = comprobarConsumo(consumo);
        System.out.println("Ingresar peso:");
        int peso = leer.nextInt();
        System.out.println("Ingresar pulgadas:");
        double pulgadas = leer.nextDouble();
        System.out.println("Tiene sintonizador TDT? (S/N)");
        String rta = leer.next();
        boolean tdt = false;
        if(rta.equalsIgnoreCase("S")){
            tdt = true;
        }
        
        int precio = precioFinal(consumoFinal, peso, pulgadas, tdt);

        Electrodomestico tv = new TV(pulgadas, tdt, precio, colorFinal, consumoFinal, peso);

        return tv;
    }

    public int precioFinal(String consumoFinal, int peso, double pulgadas, boolean tdt) {

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

        if (peso > 1 && peso < 19) {
            precio += 100;
        } else if (peso > 20 && peso < 49) {
            precio += 500;
        } else if (peso > 50 && peso < 79) {
            precio += 800;
        } else if (peso > 80) {
            precio += 1000;
        }

        if (pulgadas > 40) {
            precio *= 1.3;
        }
        
        if (tdt) {
            precio += 500;
        }
        
        return precio;
    }
}
