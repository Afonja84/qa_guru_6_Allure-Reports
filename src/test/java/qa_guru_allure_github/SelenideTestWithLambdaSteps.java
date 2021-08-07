package qa_guru_allure_github;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class SelenideTestWithLambdaSteps {

    private static  final String REPOSITORY = "Afonja84/qa_guru_6_Allure_Reports";

    @Test
    public void repositoryIssueTest() {

        step("Открываем главную страницу", () -> {
            open("https://github.com");
        });

        step("Ищем репозиторий", () -> {
            $(".header-search-input").click();
            $(".header-search-input").sendKeys(REPOSITORY);
            $(".header-search-input").submit();
        });

        step("Переходим в репозиторий", () -> {
            $(linkText(REPOSITORY)).click();
        });

        step("Переходим в раздел Issues", () -> {
            $(partialLinkText("Issues")).click();
        });

        step("Проверяем, что мы в разделе Issues", () -> {
            $(byText("Issues")).should(Condition.exist);
        });
    }
}
