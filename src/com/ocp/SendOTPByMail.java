package com.ocp;

public class SendOTPByMail implements NotificationService {
    @Override
    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            System.out.println("sending OTP through email");
        }
    }

}
