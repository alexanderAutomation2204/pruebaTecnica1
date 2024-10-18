package co.sqasa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static ui.AmazonHomePage.PRODUCTO_UNO;
import static ui.AmazonHomePage.PRODUCTO_DOS;

public class AgregarProductosCarrito implements Task {
    public static AgregarProductosCarrito selectTwoProducts() {
        return new AgregarProductosCarrito();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PRODUCTO_UNO),
                Click.on(PRODUCTO_DOS)
        );
    }
}
