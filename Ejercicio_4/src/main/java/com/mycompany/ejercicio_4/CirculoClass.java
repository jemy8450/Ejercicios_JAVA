/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_4;

/**
 *
 * @author segur
 */
public class CirculoClass implements FiguraGeometrica {
    private double radio;

    public CirculoClass (double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio; // Area = π * r²
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio; // Perimetro = 2 * π * r
    }
}
