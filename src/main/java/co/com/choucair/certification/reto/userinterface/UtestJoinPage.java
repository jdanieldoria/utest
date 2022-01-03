package co.com.choucair.certification.reto.userinterface;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


@DefaultUrl("https://utest.com/signup/personal")
public class UtestJoinPage extends PageObject {
    public static final Target JOIN_TODAY = Target.the("boton que muestra el formulario").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up'][contains(text(), 'Join Today')]"));

    public static final Target FIRST_NAME = Target.the("Ingresar nombre").located(By.xpath("//input[@placeholder='John']"));
    public static final Target LAST_NAME = Target.the("ingresar apellido").located(By.xpath("//input[@placeholder='Smith']"));
    public static final Target EMAIL_ADDRESS = Target.the("ingresar email").located(By.xpath("//input[@placeholder='jsmith@example.com']"));
    public static final Target BIRTH_DATE_MONTH = Target.the("ingresar mes de nacimiento").located(By.xpath("//select[@id='birthMonth']"));
    public static final Target BIRTH_DATE_DAY = Target.the("ingresar dia de nacimiento").located(By.xpath("//select[@id='birthDay']"));
    public static final Target BIRTH_DATE_YEAR = Target.the("ingresar año de nacimiento").located(By.xpath("//select[@id='birthYear']"));

    public static final Target NEXT_LOCATION = Target.the("boton que pasa al siguiente formulario").located(By.xpath("//div/a[@role='button']"));

    public static final Target CITY = Target.the("ingresa ciudad").located(By.xpath("//input[@id='city']"));
    public static final Target LISTA_PAISES = Target.the("desplegar lista de paises").located(By.xpath("//div[@class='ui-select-match' and @aria-label='Select a country']//i[@class='caret pull-right']"));
    public static final Target COUNTRY = Target.the("seleccionar pais").located(By.xpath("//div/span/div[contains(text(), 'Colombia')]"));
    public static final Target POSTAL_CODE = Target.the("ingresar codigo postal").located(By.xpath("//input[@id='zip']"));

    public static final Target NEXT_DEVICES = Target.the("Boton siguiente dispositivos").located(By.xpath("//div/a[@class='btn btn-blue pull-right']"));

    public static final Target MOBILE_DEVICES = Target.the("desplegar menú mobiles").located(By.xpath("//div[@placeholder='Select Brand']"));
    public static final Target CHOOSE_MOBILE = Target.the("Seleccionar marca mobile").located(By.xpath("//ul/li/div[@id='ui-select-choices-row-6-1']"));
    public static final Target MODEL = Target.the("seleccionar modelo").located(By.xpath("//div[@class='ui-select-match' and @aria-label='Select a Model']"));
    public static final Target CHOOSE_MODEL = Target.the("seleccionar modelo").located(By.xpath("//ul/li/div[@id='ui-select-choices-row-7-0']"));
    public static final Target SYSTEM_OPERATING = Target.the("seleccionar Sistema operativo").located(By.xpath("//div[@name='handsetOSId']"));
    public static final Target CHOOSE_SYSTEM_OPERATING = Target.the("seleccionar Sistema operativo").located(By.xpath("//div[@id='ui-select-choices-row-8-0']"));
    public static final Target NEXT_LAST_STEP = Target.the("Seguir al ultimo paso").located(By.xpath("//span[contains(text(),'Next: Last Step')]"));
    public static final Target PASSWORD = Target.the("Ingresar contraseña").located(By.xpath("//input[@name='password']"));
    public static final Target CONFIRM_PASSWORD =Target.the("Confirmar Contraseña").locatedBy("//input[@name='confirmPassword']");
    public static final Target TERM_OF_USE = Target.the("Aceptar terminos de uso").located(By.xpath("//input[@name='termOfUse']"));
    public static final Target SECURITY_POLICY = Target.the("Aceptar politica de seguridad").located(By.xpath("//input[@name='privacySetting']"));
    public static final Target FINISH = Target.the("Finalizar registro").located(By.xpath("//div/a/span[contains(text(), 'Complete Setup')]"));
}
