package com.atm.transaction;

import com.atm.ui.DepositUI;

public class DepositTransaction extends Transaction {
    private DepositUI ui;
    private double amount;

    public DepositTransaction(DepositUI ui) {
        this.ui = ui;
    }

    @Override
    public void execute() {
        this.amount = ui.requestDepositAmount();
        System.out.println("Fazendo um depósito de: " + this.amount);
    }
}