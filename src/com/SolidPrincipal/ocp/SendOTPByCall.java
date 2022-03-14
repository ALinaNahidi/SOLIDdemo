package com.SolidPrincipal.ocp;

public class SendOTPByCall implements NotificationService {

    @Override
    public void sendOTP(String medium) {

        System.out.println("sending OTP through Phone Call");
    }

}
