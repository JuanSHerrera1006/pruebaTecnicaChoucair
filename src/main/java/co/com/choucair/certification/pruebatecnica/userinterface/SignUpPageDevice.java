package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpPageDevice extends PageObject {
    public static final Target CONTAINER_INPUT_COMPUTER = Target
            .the("Where do it contains the computer input")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div"));
    public static final Target INPUT_COMPUTER = Target
            .the("Where do we write the computer that we have")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target CONTAINER_INPUT_VERSION = Target
            .the("Where do it contains the pc version input")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div"));
    public static final Target INPUT_VERSION = Target
            .the("Where do we write the pc version")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target CONTAINER_INPUT_LANGUAGE = Target
            .the("Where do it contains the os language input")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div"));
    public static final Target INPUT_LANGUAGE = Target
            .the("Where do we write the os language")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target NEXT_PART_BUTTON = Target
            .the("Button that sends us to the next form part (FINAL)")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
}
