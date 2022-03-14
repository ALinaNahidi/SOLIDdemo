package com.anynameasnamespace;

public class PurchaseInfo {
    public static void getPurchaseInfo(String purchaseType) {
        if (purchaseType.equals("EducationalBook")) {
            System.out.println("EducationalBook");
        }
        if (purchaseType.equals("Novel")) {
            System.out.println("Novel");
        }
        if (purchaseType.equals("Biography")) {
            System.out.println("Biography");
        }
    }

}
