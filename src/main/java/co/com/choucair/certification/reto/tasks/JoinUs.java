package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.UtestJoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;


public class JoinUs implements Task {
    private String strName;
    private String strLastName;
    private String strEmail;
    private String strDayBirthday;
    private String strMonthBirthday;
    private String strYearBirthday;
    private String strCity;
    private String strCodPostal;
    private String strPassword;

    public JoinUs(String strName, String strLastName, String strEmail, String strMonthBirthday, String strDayBirthday, String strYearBirthday, String strCity, String strCodPostal, String strPassword) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonthBirthday = strMonthBirthday;
        this.strDayBirthday = strDayBirthday;
        this.strYearBirthday = strYearBirthday;
        this.strCity = strCity;
        this.strCodPostal = strCodPostal;
        this.strPassword = strPassword;
    }







    public static JoinUs OnThePage(String strName, String strLastName, String strEmail, String strMonthBirthday, String strDayBirthday, String strYearBirthday, String strCity, String strCodPostal, String strPassword) {
        return Tasks.instrumented(JoinUs.class, strName, strLastName, strEmail, strMonthBirthday, strDayBirthday, strYearBirthday,
                                    strCity, strCodPostal, strPassword);
    }
    private UtestJoinPage joinUs;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestJoinPage.JOIN_TODAY),

                Enter.theValue(strName).into(UtestJoinPage.FIRST_NAME),
                Enter.theValue(strLastName).into(UtestJoinPage.LAST_NAME),
                Enter.theValue(strEmail).into(UtestJoinPage.EMAIL_ADDRESS),

                SelectFromOptions.byVisibleText(strMonthBirthday).from(UtestJoinPage.BIRTH_DATE_MONTH),
                SelectFromOptions.byVisibleText(strDayBirthday).from(UtestJoinPage.BIRTH_DATE_DAY),
                SelectFromOptions.byVisibleText(strYearBirthday).from(UtestJoinPage.BIRTH_DATE_YEAR),

                Click.on(UtestJoinPage.NEXT_LOCATION),


                Click.on(UtestJoinPage.LISTA_PAISES),
                Click.on(UtestJoinPage.COUNTRY),
                Click.on(UtestJoinPage.CITY),
                Enter.theValue(strCity).into(UtestJoinPage.CITY),
                Hit.the(Keys.ARROW_DOWN).keyIn(UtestJoinPage.CITY),
                Hit.the(Keys.ENTER).keyIn(UtestJoinPage.CITY),
                Enter.theValue(strCodPostal).into(UtestJoinPage.POSTAL_CODE),

                Click.on(UtestJoinPage.NEXT_DEVICES),

                Click.on(UtestJoinPage.MOBILE_DEVICES),
                Click.on(UtestJoinPage.CHOOSE_MOBILE),
                Click.on(UtestJoinPage.MODEL),
                Click.on(UtestJoinPage.CHOOSE_MODEL),
                Click.on(UtestJoinPage.SYSTEM_OPERATING),
                Click.on(UtestJoinPage.CHOOSE_SYSTEM_OPERATING),

                Click.on(UtestJoinPage.NEXT_LAST_STEP),
                Enter.theValue(strPassword).into(UtestJoinPage.PASSWORD),
                Enter.theValue(strPassword).into(UtestJoinPage.CONFIRM_PASSWORD),

                Click.on(UtestJoinPage.TERM_OF_USE),
                Click.on(UtestJoinPage.SECURITY_POLICY),
                Click.on(UtestJoinPage.FINISH)

                );
    }


    }


