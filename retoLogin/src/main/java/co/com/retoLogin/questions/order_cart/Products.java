package co.com.retoLogin.questions.order_cart;

import static co.com.retoLogin.user_Interface.home_page.HomePage.TXT_PRODUCTS;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.time.Duration;

public class Products implements Question<Boolean> {
    private Products(){}
    @Override
    public Boolean answeredBy(Actor actor) {
        TXT_PRODUCTS.resolveFor(actor).setImplicitTimeout(Duration.ofSeconds(60));
        return TXT_PRODUCTS.resolveFor(actor).isPresent();
    }
    public static Products amount(){return new Products();}
}
