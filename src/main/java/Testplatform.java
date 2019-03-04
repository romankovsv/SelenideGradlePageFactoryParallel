import Pages.HomePage;
import config.ExtendReporter;

import static com.codeborne.selenide.Selenide.open;

public class Testplatform {


    public HomePage openHomePage() {
        ExtendReporter.logToAllure("Open Home Page");

        return open("https://www.athome.com/", HomePage.class);
    }
}
