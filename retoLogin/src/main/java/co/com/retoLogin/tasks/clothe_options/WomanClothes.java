package co.com.retoLogin.tasks.clothe_options;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.retoLogin.user_Interface.women_page.WomenPage.BTN_WOMEN;

public class WomanClothes implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        BTN_WOMEN.resolveFor(actor).withTimeoutOf(Duration.ofSeconds(30)).waitUntilVisible();
        actor.attemptsTo(
                Click.on(BTN_WOMEN));
    }
    public static Performable add(){
        return instrumented(WomanClothes.class);
    }
}
