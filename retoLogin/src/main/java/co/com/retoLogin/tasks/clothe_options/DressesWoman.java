package co.com.retoLogin.tasks.clothe_options;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.time.Duration;

import static co.com.retoLogin.user_Interface.dresses_page.DressesPage.BTN_DRESSES;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DressesWoman implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        BTN_DRESSES.resolveFor(actor).withTimeoutOf(Duration.ofSeconds(30)).waitUntilVisible();
        actor.attemptsTo(Click.on(BTN_DRESSES));
    }
    public static Performable toAdd(){
        return instrumented(DressesWoman.class);
    }
}
