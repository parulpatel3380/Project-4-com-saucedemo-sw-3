package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {

        /**
         * This method will send text to element
         */
        public void clickOnElement(By by){
            driver.findElement(by).click();
        }

        /**
         * this method is used to send the text to the element
         */
        public void sendTextToElement(By by,String text){
            driver.findElement(by).sendKeys(text);
        }

        /**
         * this method will get the text from an element
         */
        public String getTextFromElement(By by){
            return driver.findElement(by).getText();
        }

        /**
         * this method will select the option from the dropdown
         */
        public void selectFromDropDownMenu(By by,String text){
            WebElement dropDown =driver.findElement(by);
           Select select = new Select(dropDown);
            select.selectByVisibleText(text);
        }


    }
