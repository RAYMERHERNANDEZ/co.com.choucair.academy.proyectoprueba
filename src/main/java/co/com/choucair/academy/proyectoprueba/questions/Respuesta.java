package co.com.choucair.academy.proyectoprueba.questions;

import co.com.choucair.academy.proyectoprueba.userinterface.AutomationTestingRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Respuesta implements Question<Boolean> {

    private String question;

    public Respuesta(String question) {
        this.question = question;
    }

    public static Respuesta tituloPagina(String question) {
        return new Respuesta(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;
        String nombrePagina = Text.of(AutomationTestingRegistro.NAME_PAGE).viewedBy(actor).asString();
        if (question.equals((nombrePagina))){
            resultado = true;
        } else {
          resultado = false;
        }
        return resultado;
    }
}
