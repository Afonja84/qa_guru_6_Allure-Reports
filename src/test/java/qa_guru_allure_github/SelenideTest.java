package qa_guru_allure_github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class SelenideTest {

    @Test
    public void repositoryIssueTest() {

        SelenideLogger.addListener("allure", new AllureSelenide());  //отчёт в Аллюр

        open("https://github.com");

        $(".header-search-input").click();
        $(".header-search-input").sendKeys("Afonja84/qa_guru_6_Allure_Reports");
        $(".header-search-input").submit();

        $(linkText("Afonja84/qa_guru_6_Allure_Reports")).click();
        $(partialLinkText("Issues")).click();
        $(byText("Issues")).should(Condition.exist);
    }

}
