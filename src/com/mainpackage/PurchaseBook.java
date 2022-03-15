package com.mainpackage;

import com.ocp.SendOTPByCall;
import com.isp.Gpay;
import com.lsp.BookDeliveryOnline;

public class PurchaseBook {

//    private DebitCard card;
//    public PurchaseBook(DebitCard debitCard){
//        this.card = debitCard;
//    }
//    public void doPayment(Object order, int amount){
//        card.doTransaction(amount);
//    }


    private final BankCard bankCard;

    public PurchaseBook(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public static void main(String[] args) {

        var sendOTPByCall = new SendOTPByCall();
        sendOTPByCall.sendOTP("call");
        var deliveryAddress = new BookDeliveryOnline();
        deliveryAddress.DeliverOnline();
        var upiPayment = new Gpay();
        upiPayment.getCashBackAsCreditBalance();

//        DebitCard debitCard = new DebitCard();
//        var main= new PurchaseBook(debitCard);
//        main.doPayment("some order",2000);


        BankCard bankCard = new DebitCard();
        PurchaseBook main = new PurchaseBook(bankCard);
        main.doPayment("some order", 2000);

    }

    public void doPayment(Object order, int amount) {
        System.out.println(order);
        bankCard.doTransaction(amount);
    }
//    public void getDeliveryLocations() {
//        String title;
//        int userID;
//         System.out.println("Delivery Locations");
//    }
//
//    public void UPIPayment(){
//        System.out.println("use g-pay");
//    }
//    public static void getPurchaseInfo(String purchaseType) {
//        if (purchaseType.equals("EducationalBook")) {
//            System.out.println("EducationalBook");
//        }
//        if (purchaseType.equals("Novel")) {
//            System.out.println("Novel");
//        }
//        if (purchaseType.equals("Biography")) {
//            System.out.println("Biography");
//        }
//    }
//    public void sendOTP(String medium) {
//        if (medium.equals("email")) {
//            System.out.println("send OTP through email");
//        }
//    }
//
//


}

