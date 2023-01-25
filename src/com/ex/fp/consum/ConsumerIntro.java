package com.ex.fp.consum;

import java.util.List;
import java.util.function.BiConsumer;

public class ConsumerIntro {
    public static void main(String[] args) {
//        sendEmail("email@Email.com");
//        sendEmailConsumer.accept("hello@email.net");

        //let say if we have a list of email
        List<String> emails = List.of(
                "hello@hello.com",
                "foo@amigoscode.com",
                "bar@bar.net"
        );

//        emails.forEach(ConsumerIntro::sendEmail);

        sendEmailConsumer.accept("hello@hello.com", "alex@gmail.com");

    }

    //    static Consumer<String> sendEmailConsumer = email-> System.out.println("Sending email to "+email);
    static BiConsumer<String, String> sendEmailConsumer = (from, to) ->
    {
        //validate email
        System.out.printf("Sending from %s to %s ", from, to);
    };




    static void sendEmail(String email) {
        System.out.println("Sending email to " + email);
    }

    static void sendEmail(String from, String to) {
        System.out.printf("Sending from %s to %s ", from, to);
    }


}
