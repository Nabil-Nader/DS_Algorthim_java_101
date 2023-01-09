package com.ex.fp;

public class Main {
    /*
        we will see OOP approach, then we will see functional programming
     */
    public static void main(String[] args) {

        EmailSender emailSender = new Gmail();
        emailSender.send();

        // we could replace this with lambda
        EmailSender amigosCode = new EmailSender() {
            @Override
            public void send() {
                System.out.println("send email using override  .....");
            }
        };
        amigosCode.send();

        //lambda is only consider lambda when there is only one method to override
        EmailSender lambdaCode = () -> {
            System.out.println("send email using lambda  .....");
        };

        lambdaCode.send();




        }

}
