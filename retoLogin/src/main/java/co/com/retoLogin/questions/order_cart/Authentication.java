package co.com.retoLogin.questions.order_cart;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.time.Duration;

import static co.com.retoLogin.user_Interface.home_page.HomePage.TXT_AUTHENTICATION;

public class Authentication implements Question<Boolean> {
    private Authentication(){}
    @Override
    public Boolean answeredBy(Actor actor) {
        TXT_AUTHENTICATION.resolveFor(actor).setImplicitTimeout(Duration.ofSeconds(100));
        return TXT_AUTHENTICATION.resolveFor(actor).isPresent();
    }
    public static Authentication success(){
        return new Authentication();
    }
}
