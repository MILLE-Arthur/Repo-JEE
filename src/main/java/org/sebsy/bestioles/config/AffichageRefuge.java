package org.sebsy.bestioles.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AffichageRefuge implements ApplicationRunner {
    private final RefugeProperties refuge;

    public AffichageRefuge(RefugeProperties refuge) {
        this.refuge = refuge;
    }

    @Override
    public void run(ApplicationArguments args) {
        System.out.println(">>> " + refuge.nom() + " : " + refuge.capaciteMax() + " places");
    }
}
