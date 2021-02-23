package org.less6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class less6 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\new\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.navigate().to("http://itstep.dp.ua/contacts");

        WebElement elem = webDriver.findElement(By.cssSelector("#form_construct_main > div > div:nth-child(1) > input"));
        String placehold = elem.getAttribute("placeholder");
        System.out.println(placehold);

        }
}
