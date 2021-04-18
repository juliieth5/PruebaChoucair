package co.com.choucair.certificacion.proyectobase.userinterface;

import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends Tasks {

    public static final Target BUTTON_UC = Target.the("Selecciona la uniersidad chooucair").located(By.xpath("//div[@id='universidad']//strong"));
    public static final Target INPUT_COURSE = Target.the("Buscar el curso").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO= Target.the("Da click para buscar el curso").located(By.id("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE= Target.the("Da click para buscar el curso").located(By.xpath("//h4[contains(text(),'Recursos Automatizaciòn Bancolombia')]"));

    public static final Target NAME_COURSE= Target.the("Extae el nombre del curso").located(By.xpath("//p[contains(@class,'errormessage')]"));



}
