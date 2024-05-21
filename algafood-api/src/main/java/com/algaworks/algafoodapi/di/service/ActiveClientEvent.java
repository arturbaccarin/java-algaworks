package com.algaworks.algafoodapi.di.service;

import com.algaworks.algafoodapi.di.model.Client;

public class ActiveClientEvent {

    private Client client;

    public ActiveClientEvent(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }
}
