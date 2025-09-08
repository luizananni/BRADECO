package com.bancario;

public class Pagamentos {

    public static void pagarConta(ContaComSaque conta, double valor) {
        System.out.println("Saldo anterior: " + ((ContaBancaria)conta).getSaldo());
        conta.sacar(valor);
        System.out.println("Saldo atual: " + ((ContaBancaria)conta).getSaldo());
    }
}