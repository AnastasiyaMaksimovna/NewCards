package vasya;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class AutorisationVasya {
    UserVasya userVasya = new UserVasya("vasya", "qwerty123", "12345" );
    private SelenideElement loginField = $("span[data-test-id=login] input");
    private SelenideElement passwordField = $("span[data-test-id=password] input");
    private SelenideElement loginButton =  $("[data-test-id=action-login]");
    private SelenideElement codeField = $("span[data-test-id=code] input");
    private SelenideElement verifyButton = $("[data-test-id=action-verify]");
    public void registrationVasya(){
        loginField.setValue(userVasya.getLogin());
        passwordField.setValue(userVasya.getPassword());
        loginButton.click();
        codeField.setValue(userVasya.getKod());
        verifyButton.click();
    }
}