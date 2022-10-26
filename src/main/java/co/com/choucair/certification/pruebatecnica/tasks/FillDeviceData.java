package co.com.choucair.certification.pruebatecnica.tasks;

import co.com.choucair.certification.pruebatecnica.userinterface.SignUpPageDevice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class FillDeviceData implements Task {
    public static FillDeviceData formStep3() {
        return Tasks.instrumented(FillDeviceData.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SignUpPageDevice.CONTAINER_INPUT_COMPUTER),
                Enter.theValue("Windows").into(SignUpPageDevice.INPUT_COMPUTER),
                Hit.the(Keys.ENTER).into(SignUpPageDevice.INPUT_COMPUTER),
                Click.on(SignUpPageDevice.CONTAINER_INPUT_VERSION),
                Enter.theValue("Windows 10").into(SignUpPageDevice.INPUT_VERSION),
                Hit.the(Keys.ENTER).into(SignUpPageDevice.INPUT_VERSION),
                Click.on(SignUpPageDevice.CONTAINER_INPUT_LANGUAGE),
                Enter.theValue("Spanish").into(SignUpPageDevice.INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).into(SignUpPageDevice.INPUT_LANGUAGE),
                Click.on(SignUpPageDevice.NEXT_PART_BUTTON)
        );
    }
}
