package co.com.retoLogin.interaction.dresses;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static co.com.retoLogin.user_Interface.dresses_page.DressesPage.*;
import static co.com.retoLogin.user_Interface.women_page.WomenPage.BTN_CONTINUE_SHOPPING;


import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.time.Duration;

public class Evening implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        BTN_EVENING_DRESSES.resolveFor(actor).withTimeoutOf(Duration.ofSeconds(60)).waitUntilVisible();
        actor.attemptsTo(
                Click.on(BTN_EVENING_DRESSES),
                Click.on(BTN_PRINTED_DRESS),
                Click.on(BTN_ADD_TO_CART_POPUP),
                Click.on(BTN_CONTINUE_SHOPPING)
        );
    }
    public static Evening specialDress(){
        return Tasks.instrumented(Evening.class);
    }
}
