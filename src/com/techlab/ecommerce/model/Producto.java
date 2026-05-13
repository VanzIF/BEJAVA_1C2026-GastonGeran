package com.techlab.ecommerce.model;

/**
 * Representa un producto del sistema.
 *
 * Cada producto posee:
 * - ID único
 * - nombre
 * - precio
 * - stock disponible
 *
 * Esta clase aplica encapsulamiento utilizando atributos privados
 * y métodos públicos getter/setter.
 */
public class Producto {

    /**
     * Contador estático compartido por todos los productos.
     * Permite generar IDs automáticos.
     */
    private static int contadorId = 1;

    private int id;
    private String nombre;
    private double precio;
    private int stock;

    /**
     * Constructor principal.
     *
     * @param nombre Nombre del producto
     * @param precio Precio del producto
     * @param stock Cantidad disponible
     */
    public Producto(String nombre, double precio, int stock) {
        this.id = contadorId++;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // =========================
    // GETTERS
    // =========================

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    // =========================
    // SETTERS
    // =========================

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Representación visual del producto.
     */
    @Override
    public String toString() {
        return "ID: " + id +
                " | Nombre: " + nombre +
                " | Precio: $" + precio +
                " | Stock: " + stock;
    }
}