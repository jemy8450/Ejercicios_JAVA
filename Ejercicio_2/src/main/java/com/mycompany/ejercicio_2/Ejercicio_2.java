/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_2;

/**
 *
 * @author segur
 */
public class Ejercicio_2 {

    public static void main(String[] args) {
        Vehiculo miCarro = new CarroClass();
        Vehiculo miBicicleta = new BicicletaClass();

        miCarro.arrancar();   // Salida: El coche ha arrancado.
        miCarro.detener();    // Salida: El coche se ha detenido.

        miBicicleta.arrancar(); // Salida: La bicicleta ha comenzado a moverse.
        miBicicleta.detener();  // Salida: La bicicleta se ha detenido.
    }
}
