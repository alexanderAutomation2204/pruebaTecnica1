package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AmazonHomePage {
    public static final Target SEARCH_BOX = Target.the("Campo de búsqueda de Amazon")
            .located(By.id("twotabsearchtextbox"));
    public static final Target PRODUCTO_UNO = Target.the("Primer producto")
            .located(By.cssSelector("span.a-size-medium.a-color-base.a-text-normal:nth-of-type(1)"));
    public static final Target PRODUCTO_DOS = Target.the("Segundo producto")
            .located(By.cssSelector("span.a-size-medium.a-color-base.a-text-normal:contains('Glorious Gaming - Teclado de disparo rápido GMMK 3 HE')"));
}
