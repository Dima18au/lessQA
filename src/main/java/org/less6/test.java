package org.less6;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.List;

public class test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Web\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("C:\\Users\\Student\\IdeaProjects\\Dddv\\src\\main\\resources\\select.html");

        WebElement selectElement =
                webDriver.findElement(By.cssSelector("#out1"));
        Select select = new Select(selectElement);//тупо не признет select

        List<WebElement> options = select.getOptions();
        String[] auto = {"none", "volvo", "saab","mercedes","audi"};

        if (options.size() == auto.length) {
            for (int i = 0; i < options.size(); i++) { //options.length
                WebElement webElement = options.get(i);//options[i]
                if(options.get(i).getText().equals(auto[i])){
                    System.out.println("Exp " + options.get(i).getText() +  " actual " + auto[i]);
                }
            }
        }else {
            System.out.println("Exp size = " + options.size() +  " actual size =  " + auto.length);
        }
        select.selectByIndex(1);//выбор volvo
        WebElement volvo = webDriver.findElement(By.cssSelector("#out1"));
        System.out.println(volvo.getText());
        String strauto = "value:volvo";
        if (volvo.getText().equals(strauto)){
            System.out.println("Выбран авто volvo");
        }else {
            System.out.println("Выбран не volvo");
        }
        Thread.sleep(3000);

        select.selectByValue("saab");//выбор saab
        WebElement saab = webDriver.findElement(By.cssSelector("#out1"));
        System.out.println(saab.getText());
        String strauto1 = "value:saab";
        if (saab.getText().equals(strauto1)){
            System.out.println("Выбран авто saab");
        }else {
            System.out.println("Выбран не saab");
        }
        Thread.sleep(3000);

        select.deselectByVisibleText("Mersedes");//выбор mersedes selectByText не понимает!!
        WebElement Mersedes = webDriver.findElement(By.cssSelector("#out1"));
        System.out.println(saab.getText());
        String strauto2 = "value:mersedes";
        if (saab.getText().equals(strauto1)){
            System.out.println("Выбран авто mersedes");
        }else {
            System.out.println("Выбран не mersedes");
        }
        Thread.sleep(3000);

        System.out.println("End test");
        webDriver.quit();
    }
}
