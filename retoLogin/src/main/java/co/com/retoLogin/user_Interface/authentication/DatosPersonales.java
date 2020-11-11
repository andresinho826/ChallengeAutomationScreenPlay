package co.com.retoLogin.user_Interface.authentication;

import net.serenitybdd.screenplay.targets.Target;

public class DatosPersonales {
    public static final Target LBL_NOMBRE = Target.the("NOMBRE DEL USUARIO").
            locatedBy("//*[@id='customer_firstname']");

    public static final Target LBL_APELLIDO = Target.the("APELLIDO DEL USUARIO").
            locatedBy("//*[@id='customer_lastname']");

    public static final Target LBL_CORREO = Target.the("CORREO DEL USUARIO").
            locatedBy("//*[@id='email']");

    public static final Target LBL_CONTRASENA = Target.the("CONTRASENA DEL USUARIO").
            locatedBy("//*[@id='passwd']");

    public static final Target LBL_NOMBRE_DOS = Target.the("NOMBRE DEL USUARIO").
            locatedBy("//*[@id='firstname']");

    public static final Target LBL_APELLIDO_DOS = Target.the("APELLIDO DEL USUARIO").
            locatedBy("//*[@id='lastname']");

    public static final Target LBL_DIRECCION = Target.the("DIRRECION DEL USUARIO").
            locatedBy("//*[@id='address1']");

    public static final Target LBL_CIUDAD = Target.the("CIUDAD DEL USUARIO").
            locatedBy("//*[@id='city']");

    public static final Target LBL_ESTADO = Target.the("ESTADO DEL USUARIO").
            locatedBy("//*[@id='id_state']");

    public static final Target LBL_CODIGO = Target.the("CODIGO POSTAL DEL USUARIO").
            locatedBy("//*[@id='postcode']");

    public static final Target LBL_PAIS = Target.the("PAIS DEL USUARIO").
            locatedBy("//*[@id='id_country']");
    public static final Target LBL_MOBILE = Target.the("MOBILE DEL USUARIO").
            locatedBy("//*[@id='phone_mobile']");
    public static final Target LBL_ALIAS = Target.the("ALIAS DEL USUARIO").
            locatedBy("//*[@id='alias']");

}
