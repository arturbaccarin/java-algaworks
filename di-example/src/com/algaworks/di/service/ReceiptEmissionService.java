package com.algaworks.di.service;

import com.algaworks.di.model.Client;
import com.algaworks.di.model.Product;
import com.algaworks.di.notification.EmailNotification;

public class ReceiptEmissionService {

    public void emit(Client client, Product product) {
        EmailNotification notification = new EmailNotification();
        notification.notificate(client, "Your receipt was emitted from product "
                + product.getName());
    }
}
