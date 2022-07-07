package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MyStepdefs {
    WebDriver driver;

    @Given("I Launch chrome browser")
    public void iLaunchChromeBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @When("i open xyz website")
    public void iOpenXyzWebsite() {
        driver.get("https://demo.applitools.com/index_v2.html");
    }

    @And("login into test site")
    public void loginIntoTestSite() {
        driver.findElement(By.cssSelector("#username")).sendKeys("shivakumar12054");
        driver.findElement(By.cssSelector("#password")).sendKeys("password");
        driver.findElement(By.cssSelector("#log-in")).click();
    }

    @Then("Verify the  logo ont the page")
    public void verifyTheLogoOntThePage() {
       String logoname = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/a/div[2]")).getText();
        String actualStr = "ACME";
        if(logoname.equalsIgnoreCase(actualStr)) {
            System.out.println("pass");
        } else {
            System.out.println("fails");
        }

    }

    @And("close tab")
    public void closeTab() {
        driver.close();
    }


}
