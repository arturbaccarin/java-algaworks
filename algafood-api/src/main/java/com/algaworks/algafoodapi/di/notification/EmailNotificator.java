package com.algaworks.algafoodapi.di.notification;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.algaworks.algafoodapi.di.model.Client;

// @Primary
// @Qualifier("normal")
@Profile("prod")
@NotificatorType(UrgencyLevel.NORMAL)
@Component
public class EmailNotificator implements Notificator {

    public EmailNotificator() {
        System.out.println("Real EmailNotificator");
    }

    @Override
    public void notificate(Client client, String message) {
        System.out.printf("Notifying %s in e-mail %s using SMTP: %s\n",
                client.getName(), client.getEmail(), message);
    }
}
