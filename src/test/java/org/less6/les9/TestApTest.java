package org.less6.les9;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestApTest {
    WebDriver webDriver = null;
    @Before
    public void init(){
        System.setProperty("webdriver.chrome.driver","C:\\new\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    @Test
    public void test(){
        webDriver.get("https://www.google.com/");
        String actual = webDriver.getTitle();
        String exp= "Gooogle";
        Assert.assertEquals(exp, actual);
    }
    @After
    public  void close(){
        webDriver.quit();
            }
}