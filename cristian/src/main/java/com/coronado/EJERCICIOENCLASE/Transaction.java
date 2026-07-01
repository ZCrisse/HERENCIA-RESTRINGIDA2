package com.coronado.EJERCICIOENCLASE;

public abstract sealed class Transaction  
permits Transferencia, Retiro{
        
    abstract float obtenerSaldo();

    abstract boolean realizarTransferencia(String numeroCuenta);

    void imprimirVoucher() {
    System.out.println("su voucher ha sido enviado a su correo");
    }

        }


 