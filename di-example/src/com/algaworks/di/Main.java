package com.algaworks.di;

import com.algaworks.di.model.Client;
import com.algaworks.di.notification.SMSNotification;
import com.algaworks.di.notification.Notificator;
import com.algaworks.di.service.ClientActivateService;

public class Main {
    public static void main(String[] args) {
        Client joao = new Client("João", "joao@aaa.com", "3211684");
        Client maria = new Client("Maria", "maria@aaa.com", "3211684");

        Notificator notificator = new SMSNotification();

        ClientActivateService clientActivate = new ClientActivateService(notificator);
        clientActivate.activate(joao);
        clientActivate.activate(maria);
    }
}
