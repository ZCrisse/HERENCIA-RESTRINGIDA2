package com.coronado.EJERCICIO2;

public final class Email implements Alerta {
    
    @Override

    public void enviarAlerta(String mensaje) {
        verificarConexion();
        System.out.println("Enviando correo con el mensaje: " + mensaje);
    }
    

    
}
