package com.bancario;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(1000);
        System.out.println("____ Pagando conta com a Conta Corrente ____\n");
        Pagamentos.pagarConta(conta1, 200);
    }
}