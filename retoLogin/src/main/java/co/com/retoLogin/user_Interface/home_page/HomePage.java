package co.com.retoLogin.user_Interface.home_page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {
    public static final Target BTN_HOME =
            Target.the("Boton Home").
                    locatedBy("//*[@id='header_logo']");

    public static final Target BTN_CART =
            Target.the("Boton Cart").
                    locatedBy("\n" +
                            "//*[@id='header']/div[3]/div/div/div[3]/div/a");
    public static final Target TXT_PRODUCTS =
            Target.the("Text Products").
                    locatedBy("\n" +
                            "//*[@id='summary_products_quantity']");

    public static final Target BTN_ORDER_CART =
            Target.the("Boton Order Cart").
                    locatedBy("\n" +
                            "//*[@id='center_column']/p[2]/a[1]");
    public static final Target TXT_AUTHENTICATION =
            Target.the("Text Authentication").
                    locatedBy("//*[@id='columns']/div[1]/span[2]");
}
