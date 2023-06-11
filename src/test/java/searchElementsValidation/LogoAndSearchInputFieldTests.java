package searchElementsValidation;

import base.BaseTest;
import com.codeborne.selenide.Condition;
import factory.InputSearchFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.attribute;

public class LogoAndSearchInputFieldTests extends BaseTest {

    @Test
    @DisplayName("Should ensure that the site's logo is visible and clickable, " +
            "and that the search field is visible and enabled for search.")
    public void testLogoAndSearchFieldVisibility() {

                // Verifying the logo
        googleSearchPage.getGoogleLogoImg()
                .shouldBe(Condition.visible)
                .shouldBe(Condition.enabled);

                // Verifying the search field
        googleSearchPage.getGoogleSearchInputField()
                .shouldBe(Condition.visible)
                .shouldBe(Condition.enabled);
    }

    @Test
    @DisplayName("Should validate entering a valid string in the search field and " +
            "ensure that the placeholder is no longer present.")
    public void testValidStringEntryAndPlaceholderAbsence() {

        String randomStringForSearch = InputSearchFactory.createRandomStringToSearchFor();

        googleSearchPage.searchForSomeString(randomStringForSearch)
                .clickOnTheSearchButton();


            // Retrieving the text in the search field and validating that the placeholder attribute is empty
        String inputFieldText = googleSearchPage.getGoogleSearchInputField()
                .shouldHave(attribute("placeholder", ""))
                .shouldBe(Condition.enabled)
                .getText();

            // Validating that the entered string is equal to the present string, ignoring the case
        Assertions.assertTrue(randomStringForSearch.equalsIgnoreCase(inputFieldText));

    }


}
