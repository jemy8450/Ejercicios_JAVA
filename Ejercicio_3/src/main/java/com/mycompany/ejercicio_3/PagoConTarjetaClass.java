/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_3;

/**
 *
 * @author segur
 */
public class PagoConTarjetaClass implements Pago {
    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Procesando pago con tarjeta de: " + cantidad + " Dolares.");
    }
}
