package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaCarrito {
    public static final Target REMOVE_BUTTON = Target.the("Botón de eliminar")
            .located(By.cssSelector("selector_boton_eliminar"));
}
