package com.coronado.EJERCICIO2;

public interface Alerta permits Email, SMS {
    void enviarAlerta(String mensaje);
    default void verificarConexion(){
        System.out.println("Verificando conexión de alerta...");
    }
}
