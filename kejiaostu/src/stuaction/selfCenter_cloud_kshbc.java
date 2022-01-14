package stuaction;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
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
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class selfCenter_cloud_kshbc {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
 
  @BeforeClass
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
 
  @AfterClass
  public void tearDown() {
    driver.quit();
  }
  
  
  @Test
  public void cloud_kshbc() throws InterruptedException {
  	driver.get("http://192.168.1.115:8099/gxzy/");
    Thread.sleep(3000);
    driver.manage().window().setSize(new Dimension(1128, 733));
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("stu2");
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).sendKeys("12345678");
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".cliklogin")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("ul:nth-child(4) span")).click();   //个人中心
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("label:nth-child(3) span")).click();    //云服务器
    Thread.sleep(3000);
    {
        WebElement element = driver.findElement(By.cssSelector(".el-button--success > span"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();     //创建云服务器  悬停
    }
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".el-dropdown-menu__item:nth-child(6)")).click();   //点击 可视化编程
    Thread.sleep(3000);
	    
	//    
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("可视化编程");
    driver.findElement(By.cssSelector(".is-focus > .el-input__inner")).click();
    driver.findElement(By.cssSelector(".hover > span")).click();
    driver.findElement(By.cssSelector(".is-focus > .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-select-dropdown:nth-child(13) .el-select-dropdown__item:nth-child(1) > span")).click();
    driver.findElement(By.cssSelector(".is-checked > .el-radio__label")).click();
    driver.findElement(By.cssSelector(".is-focus > .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-select-dropdown:nth-child(14) span")).click();
    driver.findElement(By.cssSelector(".is-plain > span")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".is-plain > span"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector("div:nth-child(1) > .flix")).click();
    driver.findElement(By.cssSelector(".el-button--primary > span")).click();
    driver.findElement(By.cssSelector(".el-form-item:nth-child(11) .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-form-item:nth-child(11) .el-input__inner")).sendKeys("1");
    driver.findElement(By.cssSelector(".el-form-item:nth-child(12) .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-form-item:nth-child(12) .el-input__inner")).sendKeys("0");
    driver.findElement(By.cssSelector(".el-form-item:nth-child(13) .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-form-item:nth-child(13) .el-input__inner")).sendKeys("1");
    driver.findElement(By.cssSelector(".el-form-item__content:nth-child(1) > .el-button--success > span")).click();


  }
}