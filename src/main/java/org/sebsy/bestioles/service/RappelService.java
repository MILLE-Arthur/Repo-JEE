package org.sebsy.bestioles.service;

import org.sebsy.bestioles.notif.Notifier;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class RappelService {
    private final Notifier notifier;

    public RappelService(@Qualifier("smsNotifier") Notifier notifier) {
        this.notifier = notifier;
    }

    public void rappelerVaccin(String telephone, String animal) {
        notifier.send(telephone, "Rappel : vaccin de " + animal + " à prévoir");
    }
}
