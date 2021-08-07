package qa_guru_allure_github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class SelenideTestWithAnnotationSteps {

    private WebSteps steps = new WebSteps();

    private static final String REPOSITORY = "Afonja84/qa_guru_6_Allure_Reports";

    @Test
    public void repositoryIssueTest() {

        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.goToRepository(REPOSITORY);
        steps.openIssuesTab();
        steps.shouldSeeIssue();

    }

}
