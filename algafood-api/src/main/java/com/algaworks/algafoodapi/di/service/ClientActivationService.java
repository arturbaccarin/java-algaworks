package com.algaworks.algafoodapi.di.service;

import org.springframework.stereotype.Component;

import com.algaworks.algafoodapi.di.model.Client;
import com.algaworks.algafoodapi.di.notification.EmailNotificator;

@Component
public class ClientActivationService {

    private EmailNotificator notificator;

    public ClientActivationService(EmailNotificator notificator) {
        this.notificator = notificator;
        System.out.println("ClientActivationService: " + notificator);
    }

    public void activate(Client client) {
        client.active();

        this.notificator.notificate(client, "Your register is active!");
    }
}
