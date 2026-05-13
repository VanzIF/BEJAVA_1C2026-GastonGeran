package com.techlab.ecommerce.service;

import com.techlab.ecommerce.exception.StockInsuficienteException;
import com.techlab.ecommerce.model.LineaPedido;
import com.techlab.ecommerce.model.Pedido;
import com.techlab.ecommerce.model.Producto;

import java.util.ArrayList;
import java.util.List;

/**
 * Servicio encargado de administrar pedidos.
 */
public class PedidoService {

    private List<Pedido> pedidos;

    public PedidoService() {
        pedidos = new ArrayList<>();
    }

    /**
     * Crea un nuevo pedido.
     */
    public Pedido crearPedido() {
        Pedido pedido = new Pedido();

        pedidos.add(pedido);

        return pedido;
    }

    /**
     * Agrega una línea al pedido validando stock.
     */
    public void agregarProductoAPedido(
            Pedido pedido,
            Producto producto,
            int cantidad)
            throws StockInsuficienteException {

        if (cantidad > producto.getStock()) {
            throw new StockInsuficienteException(
                    "Stock insuficiente para el producto: "
                            + producto.getNombre()
            );
        }

        LineaPedido linea = new LineaPedido(producto, cantidad);

        pedido.agregarLinea(linea);

        // Descontar stock
        producto.setStock(producto.getStock() - cantidad);
    }

    /**
     * Lista todos los pedidos.
     */
    public void listarPedidos() {

        if (pedidos.isEmpty()) {
            System.out.println("No existen pedidos registrados.");
            return;
        }

        System.out.println("========== PEDIDOS ==========");

        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }
}