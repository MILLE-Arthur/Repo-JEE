package org.sebsy.bestioles.service;

import org.junit.jupiter.api.Test;
import org.sebsy.bestioles.notif.Notifier;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdoptionServiceTest {

    @Test
    void adopterEnvoieLeMessageEtRenvoieLaDate() {
        List<String> recus = new ArrayList<>();
        Notifier notifier = (to, message) -> recus.add(to + " <- " + message);
        Clock clock = Clock.fixed(Instant.parse("2026-12-31T23:30:00Z"), ZoneId.of("Europe/Paris"));

        AdoptionService service = new AdoptionService(notifier, clock);
        LocalDate date = service.adopter("Rex", "lea@mail.fr");

        assertEquals(LocalDate.of(2027, 1, 1), date);
        assertEquals(List.of("lea@mail.fr <- Adoption de Rex confirmée le 01/01/2027"), recus);
    }
}
