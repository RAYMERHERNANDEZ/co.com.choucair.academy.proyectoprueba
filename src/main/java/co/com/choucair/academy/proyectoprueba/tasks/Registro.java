package co.com.choucair.academy.proyectoprueba.tasks;

import co.com.choucair.academy.proyectoprueba.userinterface.AutomationTestingRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;



public class Registro implements Task {

    private String strFirstName;
    private String strLastName;
    private String strAddress;
    private String strEmail;
    private String strPhone;
    private String strPassword;
    private String strConfirmPassword;

    public Registro(String strFirstName, String strLastName, String strAddress, String strEmail, String strPhone, String strPassword, String strConfirmPassword) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strAddress = strAddress;
        this.strEmail = strEmail;
        this.strPhone = strPhone;
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }

    public static Registro enSitioWeb(String strFirstName,String strLastName,String strAddress,String strEmail,String strPhone,String strPassword,String strConfirmPassword) {
        return Tasks.instrumented(Registro.class,strFirstName,strLastName,strAddress,strEmail,strPhone,strPassword,strConfirmPassword);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SendKeys.of(strFirstName).into(AutomationTestingRegistro.INPUT_FIRSTNAME),
                SendKeys.of(strLastName).into(AutomationTestingRegistro.INPUT_LASTNAME),
                SendKeys.of(strAddress).into(AutomationTestingRegistro.INPUT_ADDRESS),
                SendKeys.of(strEmail).into(AutomationTestingRegistro.INPUT_EMAIL),
                SendKeys.of(strPhone).into(AutomationTestingRegistro.INPUT_PHONE),
                Click.on(AutomationTestingRegistro.RADIO_GENDER),
                Click.on(AutomationTestingRegistro.CHECK_CRICKET),
                Click.on(AutomationTestingRegistro.CHECK_MOVIES),
                Click.on(AutomationTestingRegistro.SELECT_LANGUAGE),
                Click.on(AutomationTestingRegistro.OPTION_LANGUAGE),
                Click.on(AutomationTestingRegistro.SELECT_SKILL),
                Click.on(AutomationTestingRegistro.SELECT_COUNTRY),
                Click.on(AutomationTestingRegistro.OPTION_COUNTRY),
                Click.on(AutomationTestingRegistro.SELECT_YEAR),
                Click.on(AutomationTestingRegistro.SELECT_MONTH),
                Click.on(AutomationTestingRegistro.SELECT_DAY),
                SendKeys.of(strPassword).into(AutomationTestingRegistro.INPUT_PASSWORD),
                SendKeys.of(strConfirmPassword).into(AutomationTestingRegistro.INPUT_CONFIRMPASSWORD),
                Click.on(AutomationTestingRegistro.BUTTON_SUBMIT)
        );
    }
}
