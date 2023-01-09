package com.ex.fp;

public class HotMail implements EmailSender{

    @Override
    public void send() {
        System.out.println("sending email using hotmail....");
    }
}
