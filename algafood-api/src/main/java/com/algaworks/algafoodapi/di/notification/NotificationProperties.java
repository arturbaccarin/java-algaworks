package com.algaworks.algafoodapi.di.notification;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("notificator.email")
public class NotificationProperties {

    /**
     * Server e-mail host
     */
    private String hostServer; // host-server
    private Integer portServer = 25; // port-server

    public String getHostServer() {
        return hostServer;
    }

    public Integer getPortServer() {
        return portServer;
    }

    public void setHostServer(String hostServer) {
        this.hostServer = hostServer;
    }

    public void setPortServer(Integer portServer) {
        this.portServer = portServer;
    }

}
