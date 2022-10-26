package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpPagePersonal extends PageObject {
    public static final Target INPUT_FIRST_NAME = Target
            .the("Where do we write the first name")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target
            .the("Where do we write the last name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target
            .the("Where do we write the email")
            .located(By.id("email"));
    public static final Target DROPDOWN_MONTH = Target
            .the("Where do we select the born month")
            .located(By.id("birthMonth"));
    public static final Target DROPDOWN_DAY = Target
            .the("Where do we select the born day")
            .located(By.id("birthDay"));
    public static final Target DROPDOWN_YEAR = Target
            .the("Where do we select the born year")
            .located(By.id("birthYear"));
    public static final Target NEXT_PART_BUTTON = Target
            .the("Button that sends us to the next form part (ADDRESS)")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
}
