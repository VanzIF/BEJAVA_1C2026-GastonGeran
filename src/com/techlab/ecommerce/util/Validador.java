package com.techlab.ecommerce.util;

/**
 * Clase utilitaria para validaciones.
 */
public class Validador {

    /**
     * Valida que el precio sea mayor a cero.
     */
    public static boolean precioValido(double precio) {
        return precio > 0;
    }

    /**
     * Valida que el stock no sea negativo.
     */
    public static boolean stockValido(int stock) {
        return stock >= 0;
    }

    /**
     * Valida texto no vacío.
     */
    public static boolean textoValido(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }
}