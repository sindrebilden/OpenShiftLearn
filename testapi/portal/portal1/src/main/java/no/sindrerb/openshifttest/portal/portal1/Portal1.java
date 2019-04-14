package no.sindrerb.openshifttest.portal.portal1;

import no.sindrerb.openshifttest.grensesnitt.consumer.Consumer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Portal1 {

    private String name = "Portal 1";
    private Consumer consumer;

    public Portal1(final Consumer consumer) {
        this.consumer = consumer;
    }

    @RequestMapping("/portal/portal1")
    public void portal1() {
        consumer.print(name);
    }
}
