package com.algaworks.algafoodapi.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.algaworks.algafoodapi.di.model.Client;

@Component
public class ClientActivationService {

    // private List<Notificator> notificators;
    // @Qualifier("normal")
    // @NotificatorType(UrgencyLevel.NORMAL)
    // @Autowired(required = false)
    // private Notificator notificator;

    // @Autowired
    // public ClientActivationService(Notificator notificator) {
    // this.notificator = notificator;
    // }

    // public ClientActivationService(String s) {

    // }

    // @PostConstruct
    // public void init() {
    // System.out.println("INIT" + notificator);
    // }

    // @PreDestroy
    // public void destroy() {
    // System.out.println("DESTROY");
    // }

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void activate(Client client) {
        client.active();

        eventPublisher.publishEvent(new ActiveClientEvent(client));
        // notificator.notificate(client, "Your register is ready!");
    }

    // @Autowired
    // public void setNotificator(Notificator notificator) {
    // this.notificator = notificator;
    // }
}
