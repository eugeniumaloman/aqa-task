package base;

import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import com.codeborne.selenide.Configuration;
import org.junit.After;
import org.junit.Before;



abstract public class BaseTest {
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.headless = true;
    }

    @Before
    public void init() {
        setUp();
    }

    @After
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
