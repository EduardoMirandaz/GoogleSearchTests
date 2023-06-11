package pages_objects.web_elements;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class GoogleSearchWebElements {

    protected SelenideElement googleLogoImg = $(By.xpath("//div[@class='logo']//img"));
    protected SelenideElement googleSearchInputField = $(By.xpath("//*[@id='tsf']//textarea"));

    protected SelenideElement googleSearchButton = $(By.xpath("//*[@id=\"tsf\"]//button[@type='submit']"));

}
