/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_9;

/**
 *
 * @author segur
 */
public class Ejercicio_9 {

    public static void main(String[] args) {
        ProductoClass producto1 = new ProductoClass(10.99);
        ProductoClass producto2 = new ProductoClass(15.49);
        ProductoClass producto3 = new ProductoClass(10.99);

        // Comparar productos
        System.out.println("Comparando producto1 y producto2: " + producto1.comparar(producto2)); // Salida: -1
        System.out.println("Comparando producto1 y producto3: " + producto1.comparar(producto3)); // Salida: 0
        System.out.println("Comparando producto2 y producto1: " + producto2.comparar(producto1)); // Salida: 1
    }
}
