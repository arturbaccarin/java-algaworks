package com.algaworks.algafoodapi.di.notification;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.algaworks.algafoodapi.di.model.Client;

@Profile("dev")
@NotificatorType(UrgencyLevel.NORMAL)
@Component
public class EmailNotificatorMock implements Notificator {

    public EmailNotificatorMock() {
        System.out.println("Mock EmailNotificator");
    }

    @Override
    public void notificate(Client client, String message) {
        System.out.printf("Notifying %s in e-mail %s using SMTP: %s\n",
                client.getName(), client.getEmail(), message);
    }
}
