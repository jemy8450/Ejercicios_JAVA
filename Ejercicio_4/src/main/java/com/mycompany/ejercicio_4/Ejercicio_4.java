/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_4;

/**
 *
 * @author segur
 */
public class Ejercicio_4 {

    public static void main(String[] args) {
        FiguraGeometrica miCirculo = new CirculoClass(5.0);
        FiguraGeometrica miRectangulo = new RectanguloClass(4.0, 6.0);

        System.out.printf("Area del circulo: %.2f\n", miCirculo.area()); // Salida: Area del circulo: 78.54
        System.out.printf("Perimetro del circulo: %.2f\n", miCirculo.perimetro()); // Salida: Perimetro del circulo: 31.42

        System.out.printf("Area del rectangulo: %.2f\n", miRectangulo.area()); // Salida: Area del rectangulo: 24.00
        System.out.printf("Perimetro del rectangulo: %.2f\n", miRectangulo.perimetro()); // Salida: Perimetro del rectangulo: 20.00
    }
}
