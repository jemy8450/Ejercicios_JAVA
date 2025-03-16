/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_1;

/**
 *
 * @author segur
 */
public class Ejercicio_1 {

    public static void main(String[] args) {
        Animales miPerro = new PerroClass();
        Animales miGato = new GatoClass();

        miPerro.hacerSonido(); // Salida: El perro ladra: ¡Guau!
        miPerro.mover();       // Salida: El perro corre.

        miGato.hacerSonido();  // Salida: El gato maúlla: ¡Miau!
        miGato.mover();        // Salida: El gato salta.
    }
}
