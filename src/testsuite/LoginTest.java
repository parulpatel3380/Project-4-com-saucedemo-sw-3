package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

/**2. Create the package ‘testsuite’ and create the
 following class inside the ‘testsuite’ package.

 1. LoginTest

 3. Write down the following test into ‘LoginTest’
 class
 1. userSholdLoginSuccessfullyWithValid

 Credentials
 * Enter “standard_user” username
 * Enter “secret_sauce” password
 * Click on ‘LOGIN’ button
 * Verify the text “PRODUCTS”

 2. verifyThatSixProductsAreDisplayedOnPage

 * Enter “standard_user” username
 * Enter “secret_sauce” password
 * Click on ‘LOGIN’ button
 * Verify that six products are displayed
 on page
 *
 */
public class LoginTest extends Utility {
    String baseUrl = "https://www.saucedemo.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl); //opening the Url
    }

    @Test
    public void userShouldLoginSuccessfullyWithValid() {
        sendTextToElement(By.id("user-name"), "standard_user");
        sendTextToElement(By.id("password"), "secret_sauce");
        clickOnElement(By.id("login-button"));
        String expectedMessage = "Products"; //expected message
        WebElement actualMessage = driver.findElement(By.xpath("//span[@class='title']")); //finding Actual message
        String actualMessage1 = actualMessage.getText(); //Storing the actual message in the string
        Assert.assertEquals("Error Message is not Displayed ", actualMessage1, expectedMessage); //compare actual and expected message

    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        sendTextToElement(By.id("user-name"), "standard_user");
        sendTextToElement(By.id("password"), "secret_sauce");
        clickOnElement(By.id("login-button"));
        // Class name Locator --- To find multiple elements

        String expectedSize = "6";
        List<WebElement> productElementList = driver.findElements(By.xpath("//div[@class='inventory_item']"));
        // System.out.println("Total product is : " +productElementList.size());
        int size =productElementList.size();
        String actualSize = String.valueOf(size);
        Assert.assertEquals("Error",expectedSize,actualSize);

    }

    @After
    public void tearDown() {
        // driver.close();


    }


}
