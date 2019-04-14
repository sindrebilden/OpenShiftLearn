package no.sindrerb.openshifttest.backend.felles;

public abstract class Api {
    private String name;

    protected void sayMyName() {
        System.out.println(name);
    }
}
