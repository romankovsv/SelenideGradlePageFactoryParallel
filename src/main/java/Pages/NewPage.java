package Pages;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.support.FindBy;

public class NewPage {

    @FindBy(css = ".rd-subcat-tile span")
    public ElementsCollection items;


    public NewPage verifyThatOnPageThereAre(int numberOfItems) {
        items.shouldHaveSize(numberOfItems);
        return this;
    }
}
