package com.algaworks.algafoodapi.di.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.algaworks.algafoodapi.di.model.Client;

// @Primary
// @Qualifier("normal")
@Profile("prod")
@NotificatorType(UrgencyLevel.NORMAL)
@Component
public class EmailNotificator implements Notificator {

    // @Value("${notificator.email.host-server}")
    // private String host;

    // @Value("${notificator.email.port-server}")
    // private Integer port;

    @Autowired
    private NotificationProperties properties;

    public EmailNotificator() {
        System.out.println("Real EmailNotificator");
    }

    @Override
    public void notificate(Client client, String message) {
        System.out.println("Host: " + properties.getHostServer());
        System.out.println("Port: " + properties.getPortServer());

        System.out.printf("Notifying %s in e-mail %s using SMTP: %s\n",
                client.getName(), client.getEmail(), message);
    }
}
