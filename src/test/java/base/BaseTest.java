package base;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages_objects.GoogleSearchPage;

import static com.codeborne.selenide.Selenide.*;

public abstract class BaseTest {
	
	protected GoogleSearchPage googleSearchPage;

	protected String baseUrl = "https://www.google.com/search?q=1";

	public BaseTest() {
		this.googleSearchPage = new GoogleSearchPage();
	}

	@BeforeEach
	protected void setUp() {
		Configuration.pageLoadStrategy = "eager";
		open(baseUrl);
	}
	
	@AfterEach
	public void tearDown() {
		closeWindow();
	    closeWebDriver();
	}
	
}
