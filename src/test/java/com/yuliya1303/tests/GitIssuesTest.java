package com.yuliya1303.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.yuliya1303.pages.GitIssuesPage;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GitIssuesTest {
    String REPOSITORY = "Yuliya1303/homework5---JUnit";

    @Test
    @Owner("yuliyabyshko")
    @Severity(SeverityLevel.BLOCKER)
    @Feature("Repositories - Issues")
    @Story("Issue tab is displayed by default")
    @DisplayName("Issue tab is displayed by default test")
    void isIssueTabExists() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        GitIssuesPage steps = new GitIssuesPage();

        steps.openMainPage();
        steps.searchRepository(REPOSITORY);
        steps.clickOnRepositoryLink(REPOSITORY);
        steps.checkIssueTabExisting();
    }
}
