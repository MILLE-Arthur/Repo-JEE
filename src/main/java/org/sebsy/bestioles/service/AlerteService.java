package org.sebsy.bestioles.service;

import org.sebsy.bestioles.notif.Notifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlerteService {
    private final List<Notifier> notifiers;

    public AlerteService(List<Notifier> notifiers) {
        this.notifiers = notifiers;
    }

    public void alerter(String destinataire, String message) {
        notifiers.forEach(n -> n.send(destinataire, message));
    }
}
