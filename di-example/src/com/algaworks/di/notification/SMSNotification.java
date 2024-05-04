package com.algaworks.di.notification;

import com.algaworks.di.model.Client;

public class SMSNotification implements Notificator {

    @Override
    public void notificate(Client client, String message) {
        System.out.printf("Notifying %s by SMS %s: %s\n",
                client.getName(),
                client.getPhone(),
                message);
    }
}
