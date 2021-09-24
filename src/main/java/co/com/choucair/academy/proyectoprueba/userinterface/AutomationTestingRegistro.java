package co.com.choucair.academy.proyectoprueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutomationTestingRegistro {
    public static final Target INPUT_FIRSTNAME = Target.the("nombre del usuario a registrar").
            located(By.xpath("//input[@ng-model='FirstName']"));
    public static final Target INPUT_LASTNAME = Target.the("apellido del usuario a registrar").
            located(By.xpath("//input[@ng-model='LastName']"));
    public static final Target INPUT_ADDRESS = Target.the("direccion del usuario a registrar").
            located(By.xpath("//textarea[@ng-model='Adress']"));
    public static final Target INPUT_EMAIL = Target.the("correo del usuario a registrar").
            located(By.xpath("//input[@ng-model='EmailAdress']"));
    public static final Target INPUT_PHONE = Target.the("numero celular del usuario a registrar").
            located(By.xpath("//input[@ng-model='Phone']"));
    public static final Target RADIO_GENDER = Target.the("genero del usuario a registrar").
            located(By.xpath("//div[@class='form-group']//input[@value='Male']"));
    public static final Target CHECK_CRICKET = Target.the("hobbies del usuario a registrar").
            located(By.xpath("//div[@class='form-group']//input[@value='Cricket']"));
    public static final Target CHECK_MOVIES = Target.the("hobbies del usuario a registrar").
            located(By.xpath("//div[@class='form-group']//input[@value='Movies']"));
    public static final Target SELECT_LANGUAGE = Target.the("idiomas del usuario a registrar").
            located(By.xpath("//div[@class='form-group']//multi-select"));
    public static final Target OPTION_LANGUAGE = Target.the("escoger idioma del usuario a registrar").
            located(By.xpath("//li[@class='ng-scope']//a[contains(text(),'Spanish')]"));
    public static final Target SELECT_SKILL = Target.the("seleccionar perfil del usuario a registrar").
            located(By.xpath("//select[@ng-model='Skill']//option[contains(text(), 'Analytics')]"));
    public static final Target SELECT_COUNTRY = Target.the("seleccionar el pais del usuario a registrar").
            located(By.xpath("//span[@class='select2-selection select2-selection--single']"));
    public static final Target OPTION_COUNTRY = Target.the("escoger el pais del usuario a registrar").
            located(By.xpath("//li[contains(text(), 'New Zealand')]"));
    public static final Target SELECT_YEAR = Target.the("escoger el año del usuario a registrar").
            located(By.xpath("//select[@id='yearbox']//option[@value='1993']"));
    public static final Target SELECT_MONTH = Target.the("escoger el mes del usuario a registrar").
            located(By.xpath("//select[@ng-model='monthbox']//option[@value='September']"));
    public static final Target SELECT_DAY = Target.the("escoger el dia del usuario a registrar").
            located(By.xpath("//select[@id='daybox']//option[@value='8']"));
    public static final Target INPUT_PASSWORD = Target.the("contraseña del usuario a registrar").
            located(By.xpath("//input[@ng-model='Password']"));
    public static final Target INPUT_CONFIRMPASSWORD = Target.the("confirmar la contraseña el dia del usuario a registrar").
            located(By.id("secondpassword"));
    public static final Target BUTTON_SUBMIT = Target.the("confirmar la informacion del usuario a registrar").
            located(By.id("submitbtn"));
    public static final Target NAME_PAGE = Target.the("Extraer la informacion el nombre del sitio web").
            located(By.xpath("//div[@class='col-sm-8 col-xs-8 col-md-8']//h1[contains(text(), 'Automation Demo Site')]"));
}
