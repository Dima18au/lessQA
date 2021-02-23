package org.less6.less7;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Innertest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\new\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        System.out.println("start test");
        webDriver.get("C:\\Users\\Student\\IdeaProjects\\Dddv\\src\\main\\resources\\windows.html");
        WebElement iframe = null;
        try {
            iframe = webDriver.findElement(By.cssSelector("#iframe > iframe"));

        }catch (NotFoundException e){
            System.out.println("Элемент не найден");
        }

        WebDriver frame = webDriver.switchTo().frame(iframe);
        WebElement select = frame.findElement(By.cssSelector("li:first-child"));
        select.click();
        Thread.sleep(3000);


    }

}
