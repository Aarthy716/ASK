package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;

public class endToend2_5 {
    @And("I select Single-choice option in Question {int} type checkbox")
    public void iSelectSingleChoiceOptionInQuestionTypeCheckbox(int qNum) {
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Q" + qNum + "')]/../../..//div[contains(text(),'Single-Choice')]")).click();
    }

    @And("I select Multiple-choice option in Question {int} type checkbox")
    public void iSelectMultipleChoiceOptionInQuestionTypeCheckbox(int qNum) {
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Q" + qNum + "')]/../../..//div[contains(text(),'Multiple-Choice')]")).click();
    }

    @And("I enter {string} question text in Question {int} field")
    public void iEnterQuestionTextInQuestionField(String txt, int qNum) {
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Q" + qNum + "')]/../../..//textarea[@formcontrolname='question']")).sendKeys(txt);
    }


    @And("I enter {string} text in Option{int} field in Question {int} field")
    public void iEnterTextInOptionFieldInQuestionField(String txt, int optNum, int qNum) {
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Q" + qNum + "')]/../../..//textarea[@placeholder='Option " + optNum + "*']")).sendKeys(txt);
    }

    @And("I select option{int} as a correct answer in {string} Question {int} checkbox")
    public void iSelectOptionAsACorrectAnswerInQuestionCheckbox(int optNum, String qtype, int qNum) {
        if (qtype.equalsIgnoreCase("single")) {
            getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Q" + qNum + "')]/../../..//div/mat-radio-group[" + optNum + "]/mat-radio-button")).click();
        } else if (qtype.equalsIgnoreCase("multiple")) {
            getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Q"+ qNum + "')]/../../..//textarea[@placeholder='Option " + optNum + "*']/../../../../../mat-checkbox")).click();
        }
    }

    @And("I click Add Option button {int} times in Question {int} field")
    public void iClickAddOptionButtonTimesInQuestionField(int num, int qNum) {
        for (int i = 0; i < num; i++) {
            getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Q" + qNum + "')]/../../..//span[contains(text(),'Add Option')]")).click();
        }
    }

    @And("I select {int} {string} in the Users list on Give Assignment page")
    public void iSelectInTheUsersListOnGiveAssignmentPage(int num, String sname) throws InterruptedException {
        int i = 0;
        for ( WebElement elm:getDriver().findElements(By.xpath
                ("//mat-list-option/div/div[contains(.,'"+ sname +"')]"))) {
            elm.click();
            System.out.println("We selected " + i + "times !");
            if(i < num) i++;
            else break;
            Thread.sleep(2000);
            //mat-list-option/div/div[contains(.,'" + sname + "'])/..//mat-pseudo-checkbox
        }
    }

    @And("I again click [Add Question] button")
    public void iAgainClickAddQuestionButton() {
        getDriver().findElement(By.xpath("//div[@class='controls ng-star-inserted shift']//span[1]")).click();
    }

    @And("I select name {string} of Quiz in Quiz to assign select box")
    public void iSelectNameOfQuizInQuizToAssignSelectBox(String qname) {
        getDriver().findElement(By.xpath("(//mat-option/span[contains(text(), '" + qname +"')])[1]")).click();
    }

    @Then("quiz with name {string} appears")
    public void quizWithNameAppears(String qname){
         WebElement elm;
         elm=getDriver().findElement(By.xpath("//div[@class='quizzes']//mat-panel-title[contains(text(),'" + qname + "')]"));
         assertThat(elm.isDisplayed()).isTrue();
    }

    @Then("I delete quiz name {string}")
    public void iDeleteQuizName(String qName) throws InterruptedException {
        for (WebElement elm:getDriver().findElements(
                By.xpath("//div[@class='quizzes']//mat-panel-title[contains(text(),'" + qName + "')]/../../..//span[text()='Delete']"))) {
            getDriver().findElement(
                    By.xpath("//div[@class='quizzes']//mat-panel-title[contains(text(),'" + qName + "')]")).click();
            Thread.sleep(5000);
            elm.click();
            System.out.println("We open delete control");
            Thread.sleep(5000);
            getDriver().findElement(By.xpath("//mat-dialog-container//span[contains(text(),'Delete')]")).click();
            Thread.sleep(5000);
        }
    }

    @Then("Assignment with quiz name {string} appears")
    public void assignmentWithQuizNameAppears(String qName) {
        WebElement elm;
        elm=getDriver().findElement(By.xpath("//span[@class='mat-content']//*[contains(text(),'End to End 2.5')]"));
        assertThat(elm.isDisplayed()).isTrue();
    }
}

