package co.com.choucair.certification.pruebatecnica.tasks;

import co.com.choucair.certification.pruebatecnica.userinterface.SignUpPageFinal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.CheckCheckbox;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.certification.pruebatecnica.util.EmailGeneratorUtil.getRandomString;

public class FillFinalData implements Task {
    public static FillFinalData formStep4() {
        return Tasks.instrumented(FillFinalData.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String password = getRandomString() + "abc*_";
        actor.attemptsTo(
                Enter.theValue(password).into(SignUpPageFinal.INPUT_PASSWORD),
                Enter.theValue(password).into(SignUpPageFinal.INPUT_CONFIRM_PASSWORD),
                CheckCheckbox.of(SignUpPageFinal.CHECKBOX_TERM_OF_USE),
                CheckCheckbox.of(SignUpPageFinal.CHECKBOX_PRIVACY),
                Click.on(SignUpPageFinal.FINISH_FORM_BUTTON)
        );
    }
}

