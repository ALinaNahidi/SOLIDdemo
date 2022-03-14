package com.isp;

public class Gpay implements CashBackManager,UPIPayment{

    @Override
    public void getCashBackAsCreditBalance() {

        System.out.println("Get cashback through G-pay");
    }

    @Override
    public void payMoney() {
        System.out.println("Pay Money through G-pay");
    }

    @Override
    public void getScratchCard() {

        System.out.println("Get ScrachCard through G-pay");
    }
}

