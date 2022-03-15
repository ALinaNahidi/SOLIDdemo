package com.mainpackage;

public class CreditCard implements BankCard{
    public void doTransaction(int amount) {
        System.out.println("tx done with CreditCard");
    }
}
