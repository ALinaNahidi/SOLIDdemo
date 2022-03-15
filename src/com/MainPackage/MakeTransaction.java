package com.MainPackage;

public class MakeTransaction {
    public static void makePayment(int amount) {
        doTransaction(2000);
    }
    public static void doTransaction(int amount){
        System.out.println("tx done with DebitCard");
    }
}
