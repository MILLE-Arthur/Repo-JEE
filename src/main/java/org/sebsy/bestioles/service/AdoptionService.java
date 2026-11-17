package org.sebsy.bestioles.service;

import org.sebsy.bestioles.notif.Notifier;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.Clock;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class AdoptionService {
    private final Notifier notifier;
    private final Clock clock;

    public AdoptionService(@Qualifier("emailNotifier") Notifier notifier, Clock clock) {
        this.notifier = notifier;
        this.clock = clock;
    }

    public LocalDate adopter(String animal, String email) {
        LocalDate date = LocalDate.now(clock);
        String jour = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        notifier.send(email, "Adoption de " + animal + " confirmée le " + jour);
        return date;
    }
}