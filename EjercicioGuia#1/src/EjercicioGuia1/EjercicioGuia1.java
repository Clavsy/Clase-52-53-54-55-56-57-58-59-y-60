/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioGuia1;

import java.util.ArrayList;

/**
 *
 * @author clavs
 */
public class EjercicioGuia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Animal> lista = new ArrayList();
        
        Animal animal = new Animal();
        lista.add(animal);
        Animal perro = new Perro();
        lista.add(perro);
        Animal gato = new Gato();
        lista.add(gato);
        
        for (Animal animal1 : lista) {
            animal1.hacerRuido();
        }
    }
}
