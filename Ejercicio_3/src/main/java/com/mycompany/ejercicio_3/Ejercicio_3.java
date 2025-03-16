/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_3;

/**
 *
 * @author segur
 */
public class Ejercicio_3 {

    public static void main(String[] args) {
        Pago pagoTarjeta = new PagoConTarjetaClass();
        Pago pagoEfectivo = new PagoConEfectivoClass();

        pagoTarjeta.procesarPago(50.0);   // Salida: Procesando pago con tarjeta de: 50.0 euros.
        pagoEfectivo.procesarPago(30.0);   // Salida: Procesando pago en efectivo de: 30.0 euros.
    }
}
