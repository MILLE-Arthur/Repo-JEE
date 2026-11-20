package org.sebsy.bestioles.notif;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
@Primary
public class ConsoleNotifier implements Notifier {

    @Override
    public void send(String to, String message) {
        System.out.println(to + " <- " + message);
    }
}
