/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_9;

/**
 *
 * @author segur
 */
public class ProductoClass implements ComparableObjeto {
    private double precio;

    public ProductoClass (double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public int comparar(Object o) {
        if (o instanceof ProductoClass) {
            ProductoClass otroProducto = (ProductoClass) o;
            return Double.compare(this.precio, otroProducto.precio);
        }
        throw new IllegalArgumentException("El objeto no es un Producto");
    }
}

