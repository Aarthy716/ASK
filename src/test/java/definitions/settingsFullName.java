package definitions;

import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

// test comment

import static support.TestContext.getDriver;
public class settingsFullName {
    @And("I click settings button")
    public void iClickSettingsButton() {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Settings')]")).click();
    }

    @And("I click change your name button")
    public void iClickChangeYourNameButton() throws InterruptedException {
        getDriver().findElement(By.xpath("//span[contains(text(),'Change Your Name')]")).click();
        Thread.sleep(3000);
    }

    @And("I type new name field {string}")
    public void iTypeNewNameField(String NewName) {
        getDriver().findElement(By.xpath("//input[@placeholder='New name']")).sendKeys(NewName);
    }

    @And("I clear new name field")
    public void iDeleteNewNameField() throws InterruptedException {
        WebElement toClear = getDriver().findElement(By.xpath("//input[@placeholder='New name']"));
        while(!toClear.getAttribute("value").equals("")) toClear.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(3000);
    }

    @And("I click change button")
    public void iClickChangeButton() throws InterruptedException {
        getDriver().findElement(By.xpath("//div[@class='mat-dialog-actions']//button[@class='mat-raised-button mat-primary']")).click();
        Thread.sleep(3000);
    }

}
