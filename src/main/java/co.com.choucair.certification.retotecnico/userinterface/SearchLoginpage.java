package co.com.choucair.certification.retotecnico.userinterface;

import java.lang.annotation.Target;

import org.openqa.selenium.By;
import  net.serenitybdd.core.pages.pageObject;

        import java.lang.annotation.Target;

public class SearchLoginPage extends  PageObject{
    public static final target BUTTON_UC = Target.the("Seleccion join today")
            .Located(By.Xpath("//div[@div='join today']//strong"));
    public static final target INPUT_COURSE = Target.the("search botton")
            .Located(By.id("bottonsearchbox"));
    public static final target BUTTON_GO = Target.the("click join today")
            .Located(By.id("//button[@class='btn btn-secondary']"));
    public static final target SELECT_COURSE = Target.the("click search")
            .Located(By.Xpath("//h4[contains(text(),'Join today')]"));

}