package com.algaworks.algafoodapi.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.algaworks.algafoodapi.di.notification.Notificator;
import com.algaworks.algafoodapi.di.notification.NotificatorType;
import com.algaworks.algafoodapi.di.notification.UrgencyLevel;
import com.algaworks.algafoodapi.di.service.ActiveClientEvent;

@Component
public class ServiceNotification {

    @NotificatorType(UrgencyLevel.NORMAL)
    @Autowired
    private Notificator notificator;

    @EventListener
    public void ClientActivateListener(ActiveClientEvent event) {
        notificator.notificate(event.getClient(), "Your register is completed!");
    }
}
