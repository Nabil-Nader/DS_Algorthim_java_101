
package com.ex.fp;

@FunctionalInterface // it only allows one method to override via lambda
public interface EmailSender {

    void send(String email);
}
