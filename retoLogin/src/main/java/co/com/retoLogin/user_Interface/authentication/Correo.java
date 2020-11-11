package co.com.retoLogin.user_Interface.authentication;


import net.serenitybdd.screenplay.targets.Target;

public class Correo {
    public static final Target LBL_EMAIL = Target.the("correo electronico").
            locatedBy("//*[@id='email_create']");

    public static final Target BTN_CREATE = Target.the("boton crear cuenta").
            locatedBy("//*[@id='SubmitCreate']");


}
