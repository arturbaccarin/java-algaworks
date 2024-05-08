package com.algaworks.algafoodapi.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafoodapi.di.model.Client;
import com.algaworks.algafoodapi.di.notification.Notificator;

@Component
public class ClientActivationService {

    @Autowired
    private Notificator notificator;

    // @Autowired
    // public ClientActivationService(Notificator notificator) {
    // this.notificator = notificator;
    // }

    // public ClientActivationService(String s) {

    // }

    public void activate(Client client) {
        client.active();

        this.notificator.notificate(client, "Your register is active!");
    }

    // @Autowired
    // public void setNotificator(Notificator notificator) {
    // this.notificator = notificator;
    // }
}
