package co.sqasa.StepDef;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import tasks.AddProductsToCart;
import tasks.AddAndRemoveFromCart;
import tasks.NavigateTo;
import org.openqa.selenium.WebDriver;

public class AmazonShoppingSteps {
    private Actor user = Actor.named("Usuario");
    private WebDriver driver;

    @Given("que el usuario está en la página principal de Amazon")
    public void queElUsuarioEstaEnLaPaginaPrincipalDeAmazon() {
        user.can(BrowseTheWeb.with(driver));
        user.attemptsTo(NavigateTo.theAmazonHomePage());
    }

    @When("selecciona dos productos")
    public void seleccionaDosProductos() {
        user.attemptsTo(AddProductsToCart.selectTwoProducts());
    }

    @When("selecciona un producto de la opción equipos en oferta")
    public void seleccionaUnProductoDeLaOpcionEquiposEnOferta() {
        user.attemptsTo(AddAndRemoveFromCart.selectOfferAndRemove());
    }
}
