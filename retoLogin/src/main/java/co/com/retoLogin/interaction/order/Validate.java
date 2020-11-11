package co.com.retoLogin.interaction.order;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.time.Duration;

import static co.com.retoLogin.user_Interface.home_page.HomePage.BTN_CART;

public class Validate implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        BTN_CART.resolveFor(actor).withTimeoutOf(Duration.ofSeconds(60)).waitUntilVisible();
        actor.attemptsTo(
                Click.on(BTN_CART)
        );
    }
    public static Validate onCart(){
        return Tasks.instrumented(Validate.class);
    }
}
