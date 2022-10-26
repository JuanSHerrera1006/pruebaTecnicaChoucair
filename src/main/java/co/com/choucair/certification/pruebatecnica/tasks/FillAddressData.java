package co.com.choucair.certification.pruebatecnica.tasks;

import co.com.choucair.certification.pruebatecnica.userinterface.SignUpPageAddress;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.time.Duration;

public class FillAddressData implements Task {
    public static FillAddressData formStep2() {
        return Tasks.instrumented(FillAddressData.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Medellin").into(SignUpPageAddress.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(SignUpPageAddress.INPUT_CITY),
                Hit.the(Keys.ENTER).into(SignUpPageAddress.INPUT_CITY),
                Enter.theValue("400023").into(SignUpPageAddress.INPUT_ZIP),
                Click.on(SignUpPageAddress.NEXT_PART_BUTTON)
        );
    }
}
