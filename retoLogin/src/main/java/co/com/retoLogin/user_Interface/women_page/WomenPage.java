package co.com.retoLogin.user_Interface.women_page;

import net.serenitybdd.screenplay.targets.Target;

public class WomenPage {
    public static final Target BTN_WOMEN =
            Target.the("Boton Women").
                    locatedBy("//*[@id='block_top_menu']/ul/li[1]/a");

    public static final Target BTN_TOPS =
            Target.the("Boton TOPS").
                    locatedBy("#categories_block_left > div > ul > li:nth-child(1) > a");

    public static final Target BTN_BlOUSES =
            Target.the("Boton BLOUSES").
                    locatedBy("//*[@id='categories_block_left']/div/ul/li[2]/a");
    public static final Target BTN_PRODUCT_BlOUSE =
            Target.the("Boton Product BLOUSE").
                    locatedBy("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]");

    public static final Target BTN_ADD_TO_CART =
            Target.the("Boton Add to cart").
                    locatedBy("//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]");

    public static final Target BTN_CONTINUE_SHOPPING =
            Target.the("Boton Continue shopping").
                    locatedBy("//*[@id='layer_cart']/div[1]/div[2]/div[4]/span/span");
}
