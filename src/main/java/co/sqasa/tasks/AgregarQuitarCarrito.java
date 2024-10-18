package co.sqasa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static ui.AmazonHomePage.SEARCH_BOX;
import static ui.PaginaCarrito.REMOVE_BUTTON;

public class AgregarQuitarCarrito implements Task {
    public static AgregarQuitarCarrito selectOfferAndRemove() {
        return new AgregarQuitarCarrito();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SEARCH_BOX),
                Click.on(REMOVE_BUTTON)
        );
    }
}

