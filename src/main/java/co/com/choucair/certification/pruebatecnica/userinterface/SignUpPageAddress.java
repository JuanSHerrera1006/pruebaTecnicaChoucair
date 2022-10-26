package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpPageAddress extends PageObject {
    public static final Target INPUT_CITY = Target
            .the("Where do we write the city")
            .located(By.id("city"));
    public static final Target INPUT_ZIP = Target
            .the("Where do we write the zip")
            .located(By.id("zip"));

    public static final Target NEXT_PART_BUTTON = Target
            .the("Button that sends us to the next form part (DEVICE)")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));
}
