package com.algaworks.di.service;

import com.algaworks.di.model.Client;
import com.algaworks.di.notification.Notificator;

public class ClientActivateService {

    private Notificator notificator;

    public ClientActivateService(Notificator notificator) {
        this.notificator = notificator;
    }

    public void activate(Client client) {
        client.active();

        this.notificator.notificate(client, "Your register is active!");
    }
}
