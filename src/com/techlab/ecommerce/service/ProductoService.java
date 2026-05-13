package com.techlab.ecommerce.service;

import com.techlab.ecommerce.exception.ProductoNoEncontradoException;
import com.techlab.ecommerce.model.Producto;

import java.util.ArrayList;
import java.util.List;

/**
 * Servicio encargado de administrar productos.
 */
public class ProductoService {

    private List<Producto> productos;

    /**
     * Constructor principal.
     */
    public ProductoService() {

        productos = new ArrayList<>();

        // Productos precargados
        productos.add(new Producto("Café Premium", 5500, 10));
        productos.add(new Producto("Yerba Mate", 3200, 20));
        productos.add(new Producto("Azúcar", 1800, 15));
    }

    /**
     * Agrega un producto.
     */
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    /**
     * Retorna todos los productos.
     */
    public List<Producto> obtenerProductos() {
        return productos;
    }

    /**
     * Lista productos.
     */
    public void listarProductos() {

        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
            return;
        }

        System.out.println("\n========== PRODUCTOS ==========");

        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    /**
     * Busca un producto por ID.
     */
    public Producto buscarPorId(int id)
            throws ProductoNoEncontradoException {

        for (Producto producto : productos) {

            if (producto.getId() == id) {
                return producto;
            }
        }

        throw new ProductoNoEncontradoException(
                "Producto no encontrado con ID: " + id
        );
    }

    /**
     * Elimina un producto.
     */
    public void eliminarProducto(int id)
            throws ProductoNoEncontradoException {

        Producto producto = buscarPorId(id);

        productos.remove(producto);
    }

    /**
     * Actualiza el precio.
     */
    public void actualizarPrecio(int id, double nuevoPrecio)
            throws ProductoNoEncontradoException {

        Producto producto = buscarPorId(id);

        producto.setPrecio(nuevoPrecio);
    }

    /**
     * Actualiza stock.
     */
    public void actualizarStock(int id, int nuevoStock)
            throws ProductoNoEncontradoException {

        Producto producto = buscarPorId(id);

        producto.setStock(nuevoStock);
    }
}