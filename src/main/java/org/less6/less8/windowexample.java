package org.less6.less8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowexample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\new\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        System.out.println("start test");
        webDriver.get("C:\\Users\\Student\\IdeaProjects\\Dddv\\src\\main\\resources\\windows.html");

        WebElement a = webDriver.findElement(By.cssSelector("a"));
       // Set<String> windowHandles = webDriver.getWindowHandles();
       String main = webDriver.getWindowHandle();
        System.out.println("Before open win");
        showWinech(webDriver.getWindowHandles());
                    System.out.println("-----" );
                a.click();
        Thread.sleep(2000);
        showWinech(webDriver.getWindowHandles());
            System.out.println("After open win");
            String secpage = "";
        for (String windowHandle : webDriver.getWindowHandles()){
            if (!windowHandle.equals(main)){
                break;
            }
        }
        System.out.println("secpage = " + secpage);

        WebDriver window = webDriver.switchTo().window(secpage);
        System.out.println("Title = " + window.getTitle());

        webDriver.quit();
        System.out.println("End Test");
    }
//    public static void showWin(Set<String> windowHandles) {
//        System.out.println("win size =" + windowHandles.size());
//        Iterator<String> iterator = windowHandles.iterator();
//        while (iterator.hasNext()) {
//            System.out.println("iterator = " + iterator.next());
//                  }
    public static void showWinech(Set<String> windowHandles) {
        System.out.println("win size =" + windowHandles.size());
        for (String windowHandle : windowHandles){
                    System.out.println("windowHandle = " + windowHandle);
                  }
         }
    }


