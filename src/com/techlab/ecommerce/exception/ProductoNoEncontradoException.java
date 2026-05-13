package com.techlab.ecommerce.exception;

/**
 * Excepción personalizada para búsquedas fallidas.
 */
public class ProductoNoEncontradoException extends Exception {

    public ProductoNoEncontradoException(String mensaje) {
        super(mensaje);
    }
}