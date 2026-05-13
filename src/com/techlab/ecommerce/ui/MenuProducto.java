package com.techlab.ecommerce.ui;

import com.techlab.ecommerce.exception.ProductoNoEncontradoException;
import com.techlab.ecommerce.exception.StockInsuficienteException;
import com.techlab.ecommerce.model.Pedido;
import com.techlab.ecommerce.model.Producto;
import com.techlab.ecommerce.service.PedidoService;
import com.techlab.ecommerce.service.ProductoService;
import com.techlab.ecommerce.util.Validador;

import java.util.Scanner;

/**
 * Maneja interacción con usuario.
 */
public class MenuProducto {

    private Scanner sc;
    private ProductoService productoService;
    private PedidoService pedidoService;

    public MenuProducto(
            Scanner sc,
            ProductoService productoService,
            PedidoService pedidoService) {

        this.sc = sc;
        this.productoService = productoService;
        this.pedidoService = pedidoService;
    }

    /**
     * Inicia menú principal.
     */
    public void iniciar() {

        int opcion;

        do {

            mostrarMenu();

            opcion = sc.nextInt();
            sc.nextLine();

            try {

                switch (opcion) {

                    case 1:
                        agregarProducto();
                        break;

                    case 2:
                        productoService.listarProductos();
                        break;

                    case 3:
                        buscarProducto();
                        break;

                    case 4:
                        eliminarProducto();
                        break;

                    case 5:
                        crearPedido();
                        break;

                    case 6:
                        pedidoService.listarPedidos();
                        break;

                    case 7:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opción inválida.");
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (opcion != 7);
    }

    /**
     * Muestra menú.
     */
    private void mostrarMenu() {

        System.out.println("\n============================");
        System.out.println(" SISTEMA E-COMMERCE JAVA");
        System.out.println("============================");
        System.out.println("1. Agregar producto");
        System.out.println("2. Listar productos");
        System.out.println("3. Buscar producto");
        System.out.println("4. Eliminar producto");
        System.out.println("5. Crear pedido");
        System.out.println("6. Listar pedidos");
        System.out.println("7. Salir");

        System.out.print("Seleccione opción: ");
    }

    /**
     * Agrega producto.
     */
    private void agregarProducto() {

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Precio: ");
        double precio = sc.nextDouble();

        System.out.print("Stock: ");
        int stock = sc.nextInt();
        sc.nextLine();

        if (!Validador.textoValido(nombre)) {
            System.out.println("Nombre inválido.");
            return;
        }

        if (!Validador.precioValido(precio)) {
            System.out.println("Precio inválido.");
            return;
        }

        if (!Validador.stockValido(stock)) {
            System.out.println("Stock inválido.");
            return;
        }

        Producto producto = new Producto(
                nombre,
                precio,
                stock
        );

        productoService.agregarProducto(producto);

        System.out.println("Producto agregado correctamente.");
    }

    /**
     * Busca producto.
     */
    private void buscarProducto()
            throws ProductoNoEncontradoException {

        System.out.print("Ingrese ID: ");

        int id = sc.nextInt();
        sc.nextLine();

        Producto producto = productoService.buscarPorId(id);

        System.out.println(producto);
    }

    /**
     * Elimina producto.
     */
    private void eliminarProducto()
            throws ProductoNoEncontradoException {

        System.out.print("Ingrese ID: ");

        int id = sc.nextInt();
        sc.nextLine();

        productoService.eliminarProducto(id);

        System.out.println("Producto eliminado.");
    }

    /**
     * Crea pedido.
     */
    private void crearPedido()
            throws ProductoNoEncontradoException,
            StockInsuficienteException {

        Pedido pedido = pedidoService.crearPedido();

        System.out.print("Cantidad de productos: ");

        int cantidadProductos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidadProductos; i++) {

            productoService.listarProductos();

            System.out.print("ID producto: ");
            int idProducto = sc.nextInt();

            System.out.print("Cantidad: ");
            int cantidad = sc.nextInt();
            sc.nextLine();

            Producto producto =
                    productoService.buscarPorId(idProducto);

            pedidoService.agregarProductoAPedido(
                    pedido,
                    producto,
                    cantidad
            );
        }

        System.out.println("Pedido creado correctamente.");
        System.out.println(pedido);
    }
}