package com.atm.transaction;

import com.atm.ui.WithdrawalUI;

public class WithdrawalTransaction extends Transaction {
    private WithdrawalUI ui;
    private double amount;

    public WithdrawalTransaction(WithdrawalUI ui) {
        this.ui = ui;
    }

    @Override
    public void execute() {
        this.amount = ui.requestWithdrawalAmount();
        System.out.println("Fazendo um saque de " + this.amount);
        if (this.amount > 500) {
            ui.informInsufficientFunds();
        } else {
        }
    }
}