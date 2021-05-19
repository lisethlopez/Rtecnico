package co.com.choucair.certification.retotecnico.userinterface;

        import net.serenitybdd.core.pages.PageObject;
        import net.serenitybdd.screenplay.targets.target;
        import sun.awt.image.BytePackedRaster;

        import java.lang.annotation.Target;

public class UtestLoginPage extends pageObjet {
    public  static final target LOGIN_BUTTON=  Target.the("button that shows us the form to login")
            .located(By.Xpath("//div[@class='d-one d-lg-block']//strong[contains(text(),'ingresar')]"));
    static final  Target INPUT_USER =Target.the("Where do we write the user")
            .located(By.id("username"));
    static final Target INPUT_PASSWORD =Target.the("where do we write the password")
            .located(By.id("password"));
    static final Target ENTER_BUTTON = Target.the("button to confirm login")
            .located(by.xpath("//button[contains(@class,'btn btn-primary')]"));

}
