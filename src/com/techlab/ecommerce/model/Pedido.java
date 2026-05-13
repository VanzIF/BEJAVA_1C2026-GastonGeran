package com.techlab.ecommerce.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un pedido realizado por el usuario.
 *
 * Un pedido contiene múltiples líneas de pedido.
 */
public class Pedido {

    private static int contadorId = 1;

    private int id;
    private List<LineaPedido> lineas;

    /**
     * Constructor principal.
     */
    public Pedido() {
        this.id = contadorId++;
        this.lineas = new ArrayList<>();
    }

    // =========================
    // GETTERS
    // =========================

    public int getId() {
        return id;
    }

    public List<LineaPedido> getLineas() {
        return lineas;
    }

    /**
     * Agrega una línea al pedido.
     *
     * @param linea Línea a agregar
     */
    public void agregarLinea(LineaPedido linea) {
        lineas.add(linea);
    }

    /**
     * Calcula el total del pedido.
     *
     * @return total calculado
     */
    public double calcularTotal() {

        double total = 0;

        for (LineaPedido linea : lineas) {
            total += linea.calcularSubtotal();
        }

        return total;
    }

    @Override
    public String toString() {

        StringBuilder detalle = new StringBuilder();

        detalle.append("\n============================\n");
        detalle.append("PEDIDO ID: ").append(id).append("\n");
        detalle.append("============================\n");

        for (LineaPedido linea : lineas) {
            detalle.append(linea).append("\n");
        }

        detalle.append("----------------------------\n");
        detalle.append("TOTAL: $").append(calcularTotal()).append("\n");

        return detalle.toString();
    }
}