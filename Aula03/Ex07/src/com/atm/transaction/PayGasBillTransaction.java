package com.atm.transaction;

import com.atm.ui.PayBillUI;

public class PayGasBillTransaction extends Transaction {
    private PayBillUI ui;
    private double amount;

    public PayGasBillTransaction(PayBillUI ui) {
        this.ui = ui;
    }

    @Override
    public void execute() {
        this.amount = ui.requestBillAmount();
        System.out.println("Fazendo um pagamento da fatura de um cartão no valor de: " + this.amount);
    }
}