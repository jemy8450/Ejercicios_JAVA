/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_10;

/**
 *
 * @author segur
 */
public class Ejercicio_10 {

    public static void main(String[] args) {
        Descontable descuentoPorcentaje = new DescuentoPorcentajeClass(15); // 15%
        Descontable descuentoFijo = new DescuentoFijoClass(20); // $20

        double precioOriginal = 100; // Precio original de $100

        double descuento1 = descuentoPorcentaje.calcularDescuento(precioOriginal);
        double descuento2 = descuentoFijo.calcularDescuento(precioOriginal);

        System.out.println("Descuento por porcentaje: $" + descuento1); // Salida: Descuento por porcentaje: $15.0
        System.out.println("Descuento fijo: $" + descuento2); // Salida: Descuento fijo: $20.0
    }
}
