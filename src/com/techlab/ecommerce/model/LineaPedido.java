package com.techlab.ecommerce.model;

/**
 * Representa una línea dentro de un pedido.
 *
 * Una línea contiene:
 * - el producto seleccionado
 * - la cantidad solicitada
 */
public class LineaPedido {

    private Producto producto;
    private int cantidad;

    /**
     * Constructor principal.
     *
     * @param producto Producto asociado
     * @param cantidad Cantidad solicitada
     */
    public LineaPedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    // =========================
    // GETTERS
    // =========================

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    // =========================
    // SETTERS
    // =========================

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Calcula el subtotal de la línea.
     *
     * subtotal = precio × cantidad
     *
     * @return subtotal calculado
     */
    public double calcularSubtotal() {
        return producto.getPrecio() * cantidad;
    }

    @Override
    public String toString() {
        return "Producto: " + producto.getNombre() +
                " | Cantidad: " + cantidad +
                " | Subtotal: $" + calcularSubtotal();
    }
}