/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tsalazarb.openbootcamp;


/**
 *
 * @author tatia
 */
public class main {
    public static void main(String[] args) {
       Coche miCoche = new Coche();
       miCoche.aumentarPuerta();
       System.out.println(miCoche.puertas);

    }
}
class Coche{
    int puertas = 4;

    public void aumentarPuerta() {
        this.puertas++;
    }
    
    
}

