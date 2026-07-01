package com.coronado.EJERCICIOENCLASE;

public final  class Transferencia extends Transaction {
    
    @Override
    float obtenerSaldo() {
        return 0.0f; // Implementación para obtener el saldo de la cuenta
    }

    @Override
    boolean realizarTransferencia(String numeroCuenta) {
        // Implementación para realizar la transferencia a la cuenta especificada
        return true; // Retorna true si la transferencia fue exitosa, false en caso contrario
    }
}
