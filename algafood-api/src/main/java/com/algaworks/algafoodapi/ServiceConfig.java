package com.algaworks.algafoodapi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.algaworks.algafoodapi.di.service.ClientActivationService;

@Configuration
public class ServiceConfig {

    // @Bean(initMethod = "init", destroyMethod = "destroy")
    // public ClientActivationService clientActivationService() {
    // return new ClientActivationService();
    // }
}
