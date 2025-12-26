package org.examplesoftware.userregistrationservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class EmailNotificationService implements NotificationService {
    @Value("${mail-server.host}")
    private String host;
    @Value("${mail-server.port}")
    private int port;
    @Override
    public void send(String message, String recipientEmail) {
        System.out.println(message + "Sending message to " + recipientEmail + " through host/port " + host + ":" + port);
    }
}
