package com.coronado;

public class PagoTransferencia implements pasarela {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando transferencia bancaria por un total de $" + monto + ".");
    }
}
