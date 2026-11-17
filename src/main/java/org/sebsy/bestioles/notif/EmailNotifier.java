package org.sebsy.bestioles.notif;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailNotifier implements Notifier {
    private static final Logger log = LoggerFactory.getLogger(EmailNotifier.class);

    @Override
    public void send(String to, String message) {
        log.info("[e-mail] {} <- {}", to, message);
    }
}