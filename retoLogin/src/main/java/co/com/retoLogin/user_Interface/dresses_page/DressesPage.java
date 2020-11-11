package co.com.retoLogin.user_Interface.dresses_page;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;

public class DressesPage {
    public static final Target BTN_DRESSES =
            Target.the("Boton Dresses").
                    locatedBy("//*[@id='block_top_menu']/ul/li[2]/a");

    public static final Target BTN_EVENING_DRESSES =
            Target.the("Boton Evening Dresses").
                    locatedBy("//*[@id='categories_block_left']/div/ul/li[2]/a");

    public static final Target BTN_PRINTED_DRESS =
            Target.the("Boton Printed Dress").
                    locatedBy("//*[@id='center_column']/ul/li/div/div[1]");

    public static final Target BTN_ADD_TO_CART_POPUP =
            Target.the("Boton Add to cart popUp").inIFrame(IFrame.withPath(By.xpath("//*[@class='fancybox-iframe']")))
                    .locatedBy("//*[@id='add_to_cart']/button");

}
