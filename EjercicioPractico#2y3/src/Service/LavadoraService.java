/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidades.Electrodomestico;
import Entidades.Lavadora;

/**
 *
 * @author clavs
 */
public final class LavadoraService extends ElectrodomesticoService {

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
        System.out.println("Ingresar carga del lavarropas:");
        int carga = leer.nextInt();

        int precio = precioFinal(consumoFinal, peso, carga);

        Electrodomestico lavadora = new Lavadora(carga, precio, colorFinal, consumoFinal, peso);

        return lavadora;
    }

    public int precioFinal(String consumoFinal, int peso, int carga) {

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

        if (carga > 30) {
            precio += 500;
        }

        return precio;
    }
}
