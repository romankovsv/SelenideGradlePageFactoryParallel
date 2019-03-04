package Pages;

import com.codeborne.selenide.SelenideElement;
import config.ExtendReporter;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class HomePage {

    @FindBy(id = "new")
    public SelenideElement newMenu;

    public NewPage openNewPage() {
        ExtendReporter.logToAllure("Click new in menu");
        newMenu.click();
        return page(NewPage.class);
    }
}
