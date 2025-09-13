package com.atm.transaction;

import com.atm.ui.TransferUI;

public class TransferTransaction extends Transaction {
    private TransferUI ui;
    private double amount;

    public TransferTransaction(TransferUI ui) {
        this.ui = ui;
    }

    @Override
    public void execute() {
        this.amount = ui.requestTransferAmount();
        System.out.println("Fazendo uma transferência de " + this.amount);
    }
}