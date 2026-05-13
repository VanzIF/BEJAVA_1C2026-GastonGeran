package com.techlab.ecommerce;

import com.techlab.ecommerce.service.PedidoService;
import com.techlab.ecommerce.service.ProductoService;
import com.techlab.ecommerce.ui.MenuProducto;

import java.util.Scanner;

/**
 * Punto de entrada principal del sistema.
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ProductoService productoService = new ProductoService();
        PedidoService pedidoService = new PedidoService();

        MenuProducto menu = new MenuProducto(
                sc,
                productoService,
                pedidoService
        );

        menu.iniciar();

        sc.close();
    }
}