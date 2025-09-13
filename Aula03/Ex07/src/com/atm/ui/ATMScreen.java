package com.atm.ui;

public class ATMScreen implements DepositUI, WithdrawalUI, TransferUI {

    @Override
    public double requestDepositAmount() {
        System.out.println("Exibindo tela de depósito...");
        return 100.0; 
    }

    @Override
    public double requestWithdrawalAmount() {
        System.out.println("Exibindo tela de saque...");
        return 600.0; 
    }

    @Override
    public void informInsufficientFunds() {
        System.out.println("Saldo Insuficiente!!! Por favor, tente um valor menor.");
    }

    @Override
    public double requestTransferAmount() {
        System.out.println("Exibindo tela de transferência...");
        return 250.0; 
    }
}