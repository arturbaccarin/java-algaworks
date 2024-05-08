package com.algaworks.algafoodapi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.algaworks.algafoodapi.di.notification.EmailNotificator;

@Configuration
public class NotificatorConfig {

    @Bean
    public EmailNotificator emailNotificator() {
        EmailNotificator notificator = new EmailNotificator("smtp.algamail.com.br");
        notificator.setUpperCase(true);

        return notificator;
    }
}
