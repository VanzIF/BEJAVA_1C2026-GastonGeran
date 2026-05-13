package com.techlab.ecommerce.exception;

/**
 * Excepción lanzada cuando no existe stock suficiente.
 */
public class StockInsuficienteException extends Exception {

    public StockInsuficienteException(String mensaje) {
        super(mensaje);
    }
}