package co.com.retoLogin.interaction.women;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import static co.com.retoLogin.user_Interface.women_page.WomenPage.*;


import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;


import java.time.Duration;


public class Blouse implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        BTN_TOPS.resolveFor(actor).withTimeoutOf(Duration.ofSeconds(30)).waitUntilVisible();
                actor.attemptsTo(Click.on(BTN_TOPS),
                        Click.on(BTN_BlOUSES),
                        MoveMouse.to(BTN_PRODUCT_BlOUSE),
                        Click.on(BTN_ADD_TO_CART),
                        Click.on(BTN_CONTINUE_SHOPPING)
                );
    }
    public static Blouse toNice(){
            return Tasks.instrumented(Blouse.class);
        }
}

