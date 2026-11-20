package org.sebsy.bestioles.notif;

import org.sebsy.bestioles.config.RefugeProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Primary
@Profile("!dev")
public class EmailNotifier implements Notifier {
    private static final Logger log = LoggerFactory.getLogger(EmailNotifier.class);

    private final RefugeProperties refuge;

    public EmailNotifier(RefugeProperties refuge) {
        this.refuge = refuge;
    }

    @Override
    public void send(String to, String message) {
        log.info("[e-mail de {}] {} <- {}", refuge.emailContact(), to, message);
    }
}
