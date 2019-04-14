package no.sindrerb.openshifttest.backend.api1.controller;

import no.sindrerb.openshifttest.backend.felles.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class Api1 extends Api {

    private String name = "Api 1";

    @RequestMapping("backend/api1")
    public void api1() {
        sayMyName();
    }
}
