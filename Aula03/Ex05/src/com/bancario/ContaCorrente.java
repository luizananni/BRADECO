package com.bancario;

public class ContaCorrente extends ContaBancaria implements ContaComSaque {
    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente!");
        }
        saldo -= valor;
    }
}