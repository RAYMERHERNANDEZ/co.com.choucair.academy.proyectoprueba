package co.com.choucair.academy.proyectoprueba.tasks;

import co.com.choucair.academy.proyectoprueba.userinterface.AutomationTestingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {

    private AutomationTestingPage automationTestingPage;

    public static Abrir sitioWeb() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(automationTestingPage));
    }
}