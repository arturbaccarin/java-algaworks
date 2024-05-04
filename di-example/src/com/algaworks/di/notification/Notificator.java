package com.algaworks.di.notification;

import com.algaworks.di.model.Client;

public interface Notificator {

    void notificate(Client client, String message);
}
