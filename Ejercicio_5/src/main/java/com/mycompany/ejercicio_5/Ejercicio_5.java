/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_5;

/**
 *
 * @author segur
 */
public class Ejercicio_5 {

    public static void main(String[] args) {
        Trabajador desarrollador = new DesarrolladorClass();
        Trabajador diseñador = new DiseñadorClass();

        desarrollador.trabajar(); // Salida: El desarrollador está escribiendo un código.
        diseñador.trabajar(); // Salida: El diseñador está creando un nuevo diseño.
    }
}
