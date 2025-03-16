/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_7;

/**
 *
 * @author segur
 */
public class Ejercicio_7 {

    public static void main(String[] args) {
        Alimentacion persona = new PersonaClass();
        Alimentacion animal = new AnimalClass();

        persona.comer(); // Salida: La persona esta comiendo una ensalada.
        animal.comer();  // Salida: El animal esta comiendo su alimento.
    }
}
