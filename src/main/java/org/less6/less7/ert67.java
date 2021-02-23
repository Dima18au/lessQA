package org.less6.less7;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
public class ert67 {

           public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "C:\\new\\chromedriver.exe");
            WebDriver webDriver = new ChromeDriver();

            webDriver.get("C:\\Users\\HP\\IdeaProjects\\Ddvmaven\\src\\main\\resources\\select_hw.html");

            WebElement selectElement =
                    webDriver.findElement(By.cssSelector("#out1"));//почему у меня такой короткий селектор?
            Select select = new Select(selectElement);
//        List<WebElement> options = select.getOptions();
//        String[] auto = {"none", "volvo", "saab","mercedes","audi"};
//
//        if (options.size() == countries.length) {
//            for (int i = 0; i < options.size(); i++) { //options.length
//                WebElement webElement = options.get(i);//options[i]
//                if(options.get(i).getText().equals(countries[i])){
//                    System.out.println("Exp " + options.get(i).getText() +  " actual " + countries[i]);
//                }
//            }
//        }else {
//            System.out.println("Exp size = " + options.size() +  " actual size =  " + countries.length);
//        }

            //    System.out.println("=====Selected elements=======");

            select.selectByIndex(1);//выбор volvo. Это хоть правильно?
            //как проверить наличие строки "value:volvo" в output элементе с id = out1?
            // какой метод использовать и почему именно его?
            //Почему ничего не работает?
            select.selectByIndex(2);//выбор saab

            List<WebElement> allSelectedOptions = select.getAllSelectedOptions();

            for (WebElement selectionEl : allSelectedOptions) {
                System.out.println(selectionEl.getText());
            }
            webDriver.quit();
            System.out.println("Ок");


        }
    }
