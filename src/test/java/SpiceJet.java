import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJet {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spicejet.com/");
        driver.findElement(By.xpath("//*[@id=\"divpaxinfo\"]")).click();
//        WebElement adult = driver.findElement(By.id("adultDropdown"));
//        adult.click();
//        Select s=new Select(adult);
//        s.selectByVisibleText("3");
    }
}
