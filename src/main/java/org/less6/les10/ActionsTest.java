package org.less6.les10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ActionsTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\new\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        System.out.println("start test");

        String s = "C:\\Users\\Student\\IdeaProjects\\Dddv\\src\\main\\resources\\actions.html";

        webDriver.get(s);
        Actions actions = new Actions(webDriver);
        try {
            List<WebElement> li = webDriver.findElements(By.tagName("Li"));
            actions.click(li.get(1))
                    .keyDown(Keys.CONTROL)
                    .moveToElement(li.get(5))
                    .pause(2000)
                    .click()
                    .perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    webDriver.quit();
    }
}
