package com.coronado;

public class PagoTarjeta implements pasarela {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Cobrando $" + monto + " a la tarjeta de crédito del miembro.");
    }
}