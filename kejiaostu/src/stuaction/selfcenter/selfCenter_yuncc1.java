package stuaction.selfcenter;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;


public class selfCenter_yuncc1 {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  
@BeforeClass
public void setUp() {
	System.setProperty("webdriver.gecko.driver","C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe");
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }



 @AfterClass
public void tearDown() {
    driver.quit();
  }
 
@Test
public void ycc123() throws InterruptedException {
    driver.get("http://192.168.1.115:8099/gxzy/");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("zhsan1");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).sendKeys("12345678");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".cliklogin")).click();
    Thread.sleep(2000);
    
    //个人中心
    driver.findElement(By.cssSelector("ul:nth-child(4) span")).click();
    Thread.sleep(2000);
    //云存储
    driver.findElement(By.cssSelector("label:nth-child(4) span")).click();
    Thread.sleep(2000);
    
    driver.findElement(By.cssSelector(".menu_style li:nth-child(2)")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item__content .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item__content .el-input__inner")).sendKeys("12345678");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-button--success:nth-child(1) > span")).click();
    Thread.sleep(2000);
    
    
    {
      WebElement element = driver.findElement(By.cssSelector(".el-button--success:nth-child(1) > span"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    Thread.sleep(2000);
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".menu_style li:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".el-form-item__content .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-form-item__content .el-input__inner")).sendKeys("13");
    driver.findElement(By.cssSelector(".el-button--success:nth-child(1) > span")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".el-button--success:nth-child(1) > span"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector("li:nth-child(5)")).click();
    driver.findElement(By.cssSelector(".role_list:nth-child(4) .divone")).click();
    driver.findElement(By.cssSelector(".role_list:nth-child(4) .divone")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".role_list:nth-child(4) .divone"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.cssSelector(".menu_style li:nth-child(3)")).click();
    driver.findElement(By.cssSelector(".topimgstyle")).click();
    driver.findElement(By.cssSelector(".menu_style li:nth-child(4)")).click();
    driver.findElement(By.cssSelector(".role_list:nth-child(3) .divone")).click();
    driver.findElement(By.cssSelector(".role_list:nth-child(3) .divone")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".role_list:nth-child(3) .divone"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.cssSelector(".menu_style li:nth-child(3)")).click();
    driver.findElement(By.cssSelector(".topimgstyle")).click();
    driver.findElement(By.cssSelector("li:nth-child(9)")).click();
    driver.findElement(By.cssSelector(".menu_style:nth-child(5) li:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".el-button:nth-child(2) > span")).click();
    driver.findElement(By.cssSelector("li:nth-child(8)")).click();
    driver.findElement(By.cssSelector("li:nth-child(10)")).click();
    driver.findElement(By.cssSelector("li:nth-child(7)")).click();
  }
}
