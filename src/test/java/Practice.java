//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.Iterator;
//import java.util.Set;
//
//import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;
//
//
//public class Practice {
//    public static void main(String[] args) throws IOException {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://rahulshettyacademy.com/angularpractice/");
//        WebElement nameEditBo = driver.findElement(By.cssSelector("[name='name']"));
//        System.out.println(driver.findElement(withTagName("label").above(nameEditBo)).getText());
//        WebElement dobLabel = driver.findElement(By.cssSelector("[for='dateofBirth']"));
//        driver.findElement(withTagName("input").below(dobLabel)).sendKeys("02/02/1997");
//        WebElement check = driver.findElement(By.xpath("//*[text()='Check me out if you Love IceCreams!']"));
//
//        driver.findElement(withTagName("input").toLeftOf(check)).click();
//
//        WebElement btn = driver.findElement(By.id("inlineRadio1"));
//        System.out.println(driver.findElement(withTagName("label").toRightOf(btn)).getText());
//        driver.switchTo().newWindow(WindowType.TAB);
//        Set<String> handles = driver.getWindowHandles();
//        Iterator<String> it = handles.iterator();
//        String parent = it.next();
//        String child = it.next();
//        driver.switchTo().window(child);
//        driver.get("https://rahulshettyacademy.com/");
//        String course=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']")).get(1).getText();
//        driver.switchTo().window(parent);
//        WebElement name=driver.findElement(By.cssSelector("[name='name']"));
//        name.sendKeys(course);
//       File file=  name.getScreenshotAs(OutputType.FILE);
//       FileUtils.copyFile(file,new File("logo.png"));
//        driver.quit();
//    }
//}
