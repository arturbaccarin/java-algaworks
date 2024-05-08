package com.algaworks.algafoodapi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.algaworks.algafoodapi.di.notification.Notificator;
import com.algaworks.algafoodapi.di.service.ClientActivationService;

@Configuration
public class ServiceConfig {

    @Bean
    public ClientActivationService activation(Notificator notificator) {
        return new ClientActivationService(notificator);
    }
}
