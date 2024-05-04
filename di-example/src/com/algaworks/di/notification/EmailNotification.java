package com.algaworks.di.notification;

import com.algaworks.di.model.Client;

public class EmailNotification implements Notificator {

    @Override
    public void notificate(Client client, String message) {
        System.out.printf("Notifying %s in e-mail %s: %s\n",
                client.getName(),
                client.getEmail(),
                message);
    }
}
