package co.com.choucair.certification.reto.userinterface;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;



@DefaultUrl("https://utest.com/welcome?from=signup")
public class UtestHome extends PageObject {
    public static final Target WELCOME_SMS = Target.the("Welcome page").located(By.xpath("//div/h1/font/font[contains(text(), '¡Bienvenido')]"));
}
