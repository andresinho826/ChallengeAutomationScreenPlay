package co.com.retoLogin.tasks.home;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.retoLogin.user_Interface.home_page.HomePage.*;

public class ToReturn implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        BTN_HOME.resolveFor(actor).withTimeoutOf(Duration.ofSeconds(60)).waitUntilVisible();
        actor.attemptsTo(
                Click.on(BTN_HOME)
        ); }
    public static Performable atHome(){
        return instrumented(ToReturn.class);
    }
}
