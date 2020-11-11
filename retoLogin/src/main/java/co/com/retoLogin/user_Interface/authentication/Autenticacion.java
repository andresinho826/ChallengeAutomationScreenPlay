package co.com.retoLogin.user_Interface.authentication;


import net.serenitybdd.screenplay.targets.Target;

public class Autenticacion {
    public static final Target TXT_AUTENTICACION = Target.the("texto autenticacion").
            locatedBy("//*[@id='center_column']/h1");
}
