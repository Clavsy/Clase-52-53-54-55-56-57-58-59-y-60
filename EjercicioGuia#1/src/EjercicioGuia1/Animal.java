/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioGuia1;

/**
 *
 * @author clavs
 */
public class Animal {

    public void hacerRuido(){
        System.out.println("Hola!");
    }
}

class Perro extends Animal {

    @Override
    public void hacerRuido(){
        System.out.println("Guau!!!");
    }
}

class Gato extends Animal {

    @Override
    public void hacerRuido(){
        System.out.println("Miau.");
    }
}