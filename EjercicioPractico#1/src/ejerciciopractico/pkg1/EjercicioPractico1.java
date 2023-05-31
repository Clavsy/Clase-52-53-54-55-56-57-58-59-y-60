/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico.pkg1;

/**
 *
 * @author clavs
 */
public class EjercicioPractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro = new Perro("Chiquito", "Croqutas", 5, "Chiuahua");
        Animal gato = new Gato("Gatinhio", "Almas", 2, "Persa");
        Animal caballo = new Caballo("Garfield", "Lasagna", 10, "Mustang");
        
        perro.Alimentarse();
        gato.Alimentarse();
        caballo.Alimentarse();
        System.out.println(perro.toString());
    }
    
}
