package definitions;

import cucumber.api.java.en.And;
import org.openqa.selenium.By;

import static support.TestContext.getDriver;

public class endToend2_5 {
    @And("I select Single-choice option in Question {int} type checkbox")
    public void iSelectSingleChoiceOptionInQuestionTypeCheckbox(int qNum) {
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Q"+qNum+"')]/../../..//div[contains(text(),'Single-Choice')]")).click();
    }

    @And("I select Multiple-choice option in Question {int} type checkbox")
    public void iSelectMultipleChoiceOptionInQuestionTypeCheckbox(int qNum) {
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Q"+qNum+"')]/../../..//div[contains(text(),'Multiple-Choice')]")).click();
    }

    @And("I enter {string} question text in Question {int} field")
    public void iEnterQuestionTextInQuestionField(String txt, int qNum) {
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Q"+qNum+"')]/../../..//textarea[@formcontrolname='question']")).sendKeys(txt);
    }


    @And("I enter {string} text in Option{int} field in Question {int} field")
    public void iEnterTextInOptionFieldInQuestionField(String txt, int optNum, int qNum) {
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Q\"+qNum+\"')]/../../..//textarea[@placeholder='Option "+optNum+"*']")).sendKeys(txt);
    }

    @And("I select option{int} as a correct answer in {string} \"Question {int} checkbox")
    public void iSelectOptionAsACorrectAnswerInQuestionCheckbox(int optNum, String qtype, int qNum) {
        if(qtype.equalsIgnoreCase("single")) {
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Q\"+qNum+\"')]/../../..//div/mat-radio-group["+optNum+"]/mat-radio-button")).click();
    }else if(qtype.equalsIgnoreCase("multiple")) {
            getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Q\"+qNum+\"')]/../../..//textarea[@placeholder='Option "+optNum+"*']/../../../../../mat-checkbox")).click();
        }
        }

    @And("I click Add Option button {int} times in Question {int} field")
    public void iClickAddOptionButtonTimesInQuestionField(int num, int qNum) {
        for (int i = 0; i < num; i++){
            getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Q\"+qNum+\"')]/../../..//span[contains(text(),'Add Option')]")).click();
    }
}
