/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_6;

/**
 *
 * @author segur
 */
public class Ejercicio_6 {

    public static void main(String[] args) {
        ListaNumerosClass lista = new ListaNumerosClass();
        
        // Agregar números a la lista
        lista.agregarNumero(5);
        lista.agregarNumero(2);
        lista.agregarNumero(8);
        lista.agregarNumero(1);
        lista.agregarNumero(3);

        System.out.println("Antes de ordenar:");
        lista.mostrarNumeros(); // Muestra la lista antes de ordenar

        lista.ordenar(); // Ordena la lista

        System.out.println("Despues de ordenar:");
        lista.mostrarNumeros(); // Muestra la lista despues de ordenar
    }
}
