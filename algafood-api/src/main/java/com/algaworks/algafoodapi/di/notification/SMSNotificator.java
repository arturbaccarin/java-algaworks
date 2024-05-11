package com.algaworks.algafoodapi.di.notification;

import org.springframework.stereotype.Component;

import com.algaworks.algafoodapi.di.model.Client;

// @Qualifier("urgent")
@NotificatorType(UrgencyLevel.URGENT)
@Component
public class SMSNotificator implements Notificator {

    @Override
    public void notificate(Client client, String message) {
        System.out.printf("Notifying %s in SMS %s using SMTP: %s\n",
                client.getName(), client.getPhone(), message);
    }
}
