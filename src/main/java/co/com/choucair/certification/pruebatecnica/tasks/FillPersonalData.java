package co.com.choucair.certification.pruebatecnica.tasks;

import co.com.choucair.certification.pruebatecnica.userinterface.SignUpPagePersonal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import static co.com.choucair.certification.pruebatecnica.util.EmailGeneratorUtil.getNewEmail;


public class FillPersonalData implements Task {
    public static FillPersonalData formStep1() {
        return Tasks.instrumented(FillPersonalData.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("DefaultName").into(SignUpPagePersonal.INPUT_FIRST_NAME),
                Enter.theValue("DefaultName").into(SignUpPagePersonal.INPUT_LAST_NAME),
                Enter.theValue(getNewEmail("@hotmail.com")).into(SignUpPagePersonal.INPUT_EMAIL),
                SelectFromOptions.byValue("number:3").from(SignUpPagePersonal.DROPDOWN_MONTH),
                SelectFromOptions.byValue("number:5").from(SignUpPagePersonal.DROPDOWN_DAY),
                SelectFromOptions.byValue("number:1910").from(SignUpPagePersonal.DROPDOWN_YEAR),
                Click.on(SignUpPagePersonal.NEXT_PART_BUTTON)
        );
    }
}
