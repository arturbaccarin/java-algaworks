package com.algaworks.algafoodapi.di.notification;

import org.springframework.stereotype.Component;

import com.algaworks.algafoodapi.di.model.Client;

@Component
public class EmailNotificator {

    public EmailNotificator() {
        System.out.println("EmailNotificator");
    }

    public void notificate(Client client, String message) {
        System.out.printf("Notifying %s in e-mail %s: %s\n",
                client.getName(),
                client.getEmail(),
                message);
    }
}
