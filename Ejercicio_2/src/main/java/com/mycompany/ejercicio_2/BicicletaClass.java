/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_2;

/**
 *
 * @author segur
 */
class BicicletaClass implements Vehiculo {
    @Override
    public void arrancar() {
        System.out.println("La bicicleta ha comenzado a moverse.");
    }

    @Override
    public void detener() {
        System.out.println("La bicicleta se ha detenido.");
    }
}
