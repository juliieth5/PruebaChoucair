package co.com.choucair.certificacion.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {

    public static final Target LOGIN_BUTTON = Target.the("button that shows us the fom to login").located(By.xpath("//div[@class='d-block d-lg-none']//strong[contains(text(),'Ingresar')]"));

    public static final Target INPUT_USER  = Target.the("where do we write the user").located(By.id("username"));

    public static final Target INPUT_PASSWORD  = Target.the("where do we write the user").located(By.id("password"));

    public static final Target ENTER_BUTTON  = Target.the("button to confirm login").located(By.xpath("//button[contains(@class,'btn btn-primary')]"));


}
