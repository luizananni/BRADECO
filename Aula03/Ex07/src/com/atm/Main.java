package com.atm;

import com.atm.transaction.DepositTransaction;
import com.atm.transaction.PayGasBillTransaction;
import com.atm.transaction.TransferTransaction;
import com.atm.transaction.WithdrawalTransaction;
import com.atm.ui.ATMScreen;
import com.atm.ui.ATMScreenWithPayBill;

public class Main {
    public static void main(String[] args) {
        ATMScreen atmScreen = new ATMScreen();

        System.out.println("__ Executando uma Transação de Depósito __");
        DepositTransaction deposit = new DepositTransaction(atmScreen);
        deposit.execute();

        System.out.println("\n__ Executando uma Transação de Saque __");
        WithdrawalTransaction withdrawal = new WithdrawalTransaction(atmScreen);
        withdrawal.execute();

        System.out.println("\n__ Executando uma Transação de Transferência __");
        TransferTransaction transfer = new TransferTransaction(atmScreen);
        transfer.execute();

        System.out.println("\n__ Adicionando nova funcionalidade de pagamento de conta __");
        System.out.println("__ Fazendo um pagamento da fatura de um cartão... \" __\n\n");
        PayGasBillTransaction gasBill = new PayGasBillTransaction(new ATMScreenWithPayBill());
        gasBill.execute();
    }
}