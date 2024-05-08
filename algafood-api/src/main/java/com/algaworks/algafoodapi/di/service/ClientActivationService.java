package com.algaworks.algafoodapi.di.service;

import com.algaworks.algafoodapi.di.model.Client;
import com.algaworks.algafoodapi.di.notification.Notificator;

public class ClientActivationService {

    private Notificator notificator;

    public ClientActivationService(Notificator notificator) {
        this.notificator = notificator;
        System.out.println("ClientActivationService: " + notificator);
    }

    public void activate(Client client) {
        client.active();

        this.notificator.notificate(client, "Your register is active!");
    }
}
