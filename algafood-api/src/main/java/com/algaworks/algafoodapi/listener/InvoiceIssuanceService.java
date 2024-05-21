package com.algaworks.algafoodapi.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.algaworks.algafoodapi.di.service.ActiveClientEvent;

@Component
public class InvoiceIssuanceService {

    @EventListener
    public void clientActivateListener(ActiveClientEvent event) {
        System.out.println("Issuancing invoice to client " + event.getClient().getName());
    }
}
