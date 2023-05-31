/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico.pkg1;

/**
 *
 * @author clavs
 */
class Caballo extends Animal{

    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    @Override
    public void Alimentarse(){
        System.out.println("El caballo se alimenta de : " +alimento);
    }

    @Override
    public String toString() {
        return "Caballo{" + nombre + alimento + edad + raza + "}";
    }
}
