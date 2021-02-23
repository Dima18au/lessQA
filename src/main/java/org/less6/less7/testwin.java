package org.less6.less7;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class testwin {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\new\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        System.out.println("start test");
        webDriver.get("C:\\Users\\Student\\IdeaProjects\\Dddv\\src\\main\\resources\\windows.html");

        WebElement button = null;
        try {
           button = webDriver.findElement(By.cssSelector("#alert > button"));
           button.click();

           WebDriver.TargetLocator targetLocator = webDriver.switchTo();
           Alert alert = targetLocator.alert();
           String expect = "It is simple alert";
           String actualttext = alert.getText();
           if (expect.equals(actualttext)) {
               System.out.println("Pass ");
           } else{
               System.out.println("модальное окно содержит текст = " + actualttext);
           }
           alert.accept();


            System.out.println("Все хорошо");
             }catch (NoSuchElementException e) {
            System.out.println("Элемент не найден");
        }
//        WebElement button = webDriver.findElement(By.cssSelector("#alert > button"));
        System.out.println("end test");
    }

}
