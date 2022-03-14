package com.isp;

public class PhonePay implements UPIPayment {

    @Override
    public void payMoney() {
        System.out.println("Pay Money through G-pay");

    }

    @Override
    public void getScratchCard() {
        System.out.println("Pay Money through G-pay");
    }
}
