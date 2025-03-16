/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_2;

/**
 *
 * @author segur
 */
class CarroClass implements Vehiculo {
    @Override
    public void arrancar() {
        System.out.println("El coche ha arrancado.");
    }

    @Override
    public void detener() {
        System.out.println("El coche se ha detenido.");
    }
}
