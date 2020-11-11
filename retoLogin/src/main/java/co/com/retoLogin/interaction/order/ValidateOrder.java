package co.com.retoLogin.interaction.order;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.time.Duration;

import static co.com.retoLogin.user_Interface.home_page.HomePage.BTN_ORDER_CART;

public class ValidateOrder implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        BTN_ORDER_CART.resolveFor(actor).withTimeoutOf(Duration.ofSeconds(60)).waitUntilVisible();
        actor.attemptsTo(
                Click.on(BTN_ORDER_CART)); }
    public static ValidateOrder checkOut(){
        return Tasks.instrumented(ValidateOrder.class);
    }
}
