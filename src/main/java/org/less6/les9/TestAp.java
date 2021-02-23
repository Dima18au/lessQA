package org.less6.les9;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;

public class TestAp {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","C:\\new\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        System.out.println("start test");
        webDriver.get("https://www.youtube.com/watch?v=h6jPFCXkxmY");

        String title = webDriver.getTitle();
        PrintStream file = new PrintStream("report.html");
        file.println("<html><head><title>Selenium test log</title></head><body>");
        file.println("<h1>Tests</h1>");
        file.println("<h2>Test 1</h2>");
        if(title.equals("ОСТРОСЮЖЕТНЫЙ ВОЕННЫЙ БОЕВИК! НАШУМЕВШИЙ ФИЛЬМ!")){
            file.println("<p style='color:green;'>Test ok</p>");
            File ing = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
            InputStream inputStream = new FileInputStream(ing);
            OutputStream outputStream = new FileOutputStream("img\\scrin.png");
            byte[]buffer = new byte[1024];
            int lenght = 0;
            while ((lenght = inputStream.read(buffer))>0){
                    outputStream.write(buffer, 0, lenght);
            }
            inputStream.close();
            outputStream.close();

            file.println("<a href='img/scrin.png' target='_blank'><img width='250' src='img/scrin.png'/></a>");
//            try {
//
//            }catch (){
//                f
//            }
        }else{
            file.println("<p style='color:red;'>Test error</p>");
        }

        file.println("</body></html>");
        file.close();
        webDriver.quit();
        System.out.println("End Test");
    }
}
