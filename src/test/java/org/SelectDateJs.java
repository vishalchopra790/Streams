package org;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDateJs {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.get("https://www.spicejet.com");
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        String date ="18-12-2020";
        WebElement startdate=driver.findElement(By.name("ctl00$mainContent$txt_Fromdate"));
        selectDateJS(driver,startdate,date);

    }

    public static  void selectDateJS(WebDriver driver, WebElement element,String dateval){
        JavascriptExecutor js=((JavascriptExecutor)driver);
        js.executeScript("arguments[0].setAttribute('value','"+dateval+"')",element);

    }
}
