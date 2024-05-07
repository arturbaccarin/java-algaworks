package com.algaworks.algafoodapi.di.notification;

import com.algaworks.algafoodapi.di.model.Client;

public class EmailNotificator implements Notificator {

    private boolean upperCase;
    private String smtpHostServer;

    public EmailNotificator(String smtpHostServer) {
        this.smtpHostServer = smtpHostServer;
        System.out.println("EmailNotificator");
    }

    @Override
    public void notificate(Client client, String message) {
        if (this.upperCase) {
            message = message.toUpperCase();
        }

        System.out.printf("Notifying %s in e-mail %s using SMTP %s: %s\n",
                client.getName(),
                client.getEmail(),
                this.smtpHostServer,
                message);
    }

    public void setUpperCase(boolean upperCase) {
        this.upperCase = upperCase;
    }
}
