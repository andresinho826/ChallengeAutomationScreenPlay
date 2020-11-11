package co.com.retoLogin.interaction.open_browser;

import co.com.retoLogin.user_Interface.home_page.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenBrowser implements Interaction {
    private HomePage paginaPrincipal;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaPrincipal));
    }
    public static Performable withUrl(){
        return instrumented(OpenBrowser.class);
    }
}
