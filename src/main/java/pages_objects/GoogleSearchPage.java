package pages_objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;
import pages_objects.web_elements.GoogleSearchWebElements;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

@Getter
public class GoogleSearchPage extends GoogleSearchWebElements {


    public GoogleSearchPage searchForSomeString( String searchString ){
        super.googleSearchInputField.shouldBe(Condition.visible)
                .setValue(searchString)
                .shouldBe(Condition.enabled);
        return page(GoogleSearchPage.class);
    }

    public GoogleSearchPage clickOnTheSearchButton(){
        super.googleSearchButton.shouldBe(Condition.visible)
                .shouldBe(Condition.enabled)
                .click();
        return page(GoogleSearchPage.class);
    }


}

