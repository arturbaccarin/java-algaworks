package com.algaworks.algafoodapi.di.notification;

import org.springframework.stereotype.Component;

import com.algaworks.algafoodapi.di.model.Client;

@Component
public class EmailNotificator implements Notificator {

    @Override
    public void notificate(Client client, String message) {
        System.out.printf("Notifying %s in e-mail %s using SMTP: %s\n",
                client.getName(), client.getEmail(), message);
    }
}
