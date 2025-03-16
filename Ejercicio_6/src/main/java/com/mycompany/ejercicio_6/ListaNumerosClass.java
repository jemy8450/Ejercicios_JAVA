/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author segur
 */
public class ListaNumerosClass implements Ordenable {
    private List<Integer> numeros;

    public ListaNumerosClass() {
        this.numeros = new ArrayList<>();
    }

    // Método para agregar números a la lista
    public void agregarNumero(int numero) {
        numeros.add(numero);
    }

    @Override
    public void ordenar() {
        Collections.sort(numeros); // Ordena la lista de numeros
    }

    // Método para mostrar la lista de números
    public void mostrarNumeros() {
        System.out.println("Lista de numeros: " + numeros);
    }
}
