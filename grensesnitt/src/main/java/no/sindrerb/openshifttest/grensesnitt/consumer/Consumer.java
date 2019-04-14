package no.sindrerb.openshifttest.grensesnitt.consumer;

import org.springframework.stereotype.Component;

@Component
public class Consumer {

    public void print(final String string) {
        System.out.println("Grensesnitt: " + string);
    }
}
