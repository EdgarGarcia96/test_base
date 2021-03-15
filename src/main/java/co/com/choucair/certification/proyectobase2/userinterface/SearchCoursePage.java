package co.com.choucair.certification.proyectobase2.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("selecciona certificaciones")
            .located(By.xpath("//div[@id='certificaciones']//strong"));
    public static final Target INPUT_COURSE = Target.the("Buscar el curso")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Da click para buscar el certificado")
            .located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Da click para seleccionar el certificado")
            .located(By.xpath("//h4[a[contains(text(),'Foundation Level')]]//a"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del certificado")
            .located(By.xpath("//h1[contains(text(),'Foundation Level')]"));
}
