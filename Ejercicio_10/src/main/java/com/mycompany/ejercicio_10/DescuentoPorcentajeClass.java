/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_10;

/**
 *
 * @author segur
 */
public class DescuentoPorcentajeClass implements Descontable {
    private double porcentaje;

    public DescuentoPorcentajeClass (double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcularDescuento(double precio) {
        return precio * (porcentaje / 100);
    }
}

