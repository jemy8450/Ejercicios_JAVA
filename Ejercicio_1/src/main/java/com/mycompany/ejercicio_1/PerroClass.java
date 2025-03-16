/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_1;

/**
 *
 * @author segur
 */
public class PerroClass implements Animales{

     @Override
    public void hacerSonido() {
        System.out.println("El perro ladra y hace: ¡Guau!");
    }

    @Override
    public void mover() {
        System.out.println("El perro corre.");
    }
}
