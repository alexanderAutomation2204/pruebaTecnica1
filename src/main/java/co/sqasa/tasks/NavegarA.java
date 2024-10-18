package co.sqasa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavegarA implements Task {
    private final String url;

    public NavegarA(String url) {
        this.url = url;
    }

    public static NavegarA theAmazonHomePage() {
        return new NavegarA("https://www.amazon.com/");
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }
}
