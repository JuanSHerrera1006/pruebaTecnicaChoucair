package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SignUpPageFinal extends PageObject {
    public static final Target INPUT_PASSWORD = Target
            .the("Where do we write the user password")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target
            .the("Where do we write again the user password")
            .located(By.id("confirmPassword"));
    public static final Target CHECKBOX_TERM_OF_USE = Target
            .the("Where do we accept all term of use about app")
            .located(By.xpath("//*[@id=\"termOfUse\"]"));

    public static final Target CHECKBOX_PRIVACY = Target
            .the("Where do we accept the doc about privacy and security")
            .located(By.xpath("//*[@id=\"privacySetting\"]"));
    
    public static final Target FINISH_FORM_BUTTON = Target
            .the("Button that finish the form")
            .located(By.xpath("//*[@id=\"laddaBtn\"]"));

    public static final Target WELCOME_MESSAGE = Target
            .the("The first message that see when we create a user")
            .located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));
}
