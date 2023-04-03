import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import vasya.AutorisationVasya;

import static com.codeborne.selenide.Selenide.open;

public class CardsTest {
    @Test
    public void authTest1(){
        Configuration.holdBrowserOpen = true;
        open("http://localhost:9999");
        AutorisationVasya autorisationVasya = new AutorisationVasya();
        BalansPage balansPage = new BalansPage();
        autorisationVasya.registrationVasya();
        balansPage.getFirstCardBalance();

    }
    @Test
    public void authTest2(){
        Configuration.holdBrowserOpen = true;
        open("http://localhost:9999");
        AutorisationVasya autorisationVasya = new AutorisationVasya();
        BalansPage balansPage = new BalansPage();
        autorisationVasya.registrationVasya();
        balansPage.getFirstCardBalance();
        balansPage.replenishmentBalance();
    }
}
