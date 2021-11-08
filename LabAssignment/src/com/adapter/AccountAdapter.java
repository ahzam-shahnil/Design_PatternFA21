package com.adapter;


public class AccountAdapter extends AbstractAccount {


    private OffshoreAccount offshoreAccount;

    public AccountAdapter( OffshoreAccount offshoreAccount) {
        super(offshoreAccount.getOffshoreBalance());
        this.offshoreAccount = offshoreAccount;
    }

    @Override
    public double getBalance() {
        final double taxRate = offshoreAccount.getTaxRate();
        final double grossBalance = offshoreAccount.getOffshoreBalance();

        final double taxableBalance = grossBalance * taxRate;
        final double balanceAfterTax = grossBalance - taxableBalance;
        return balanceAfterTax;
    }
}