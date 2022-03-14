package hexinceshi.xitonggl;

import static org.junit.Assert.*;
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
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class UserManager3 {
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
  public void userManage3() {
    driver.get("http://192.168.1.115:8099/gxzy/");
    driver.manage().window().setSize(new Dimension(1550, 838));
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).sendKeys("12345678");
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("changing");
    driver.findElement(By.cssSelector(".cliklogin")).click();
    driver.findElement(By.cssSelector(".activestyle > span")).click();
    driver.findElement(By.cssSelector("label:nth-child(3) span")).click();
    driver.findElement(By.cssSelector(".el-form-item:nth-child(2) .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-form-item:nth-child(2) .el-input__inner")).sendKeys("lisi");
    driver.findElement(By.cssSelector(".el-form-item:nth-child(7) .el-button--primary > span")).click();
    driver.findElement(By.cssSelector(".el-table__row:nth-child(1) .el-button--danger > span")).click();
    driver.findElement(By.cssSelector(".el-button--default:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".is-leaf .el-checkbox__inner")).click();
    driver.findElement(By.cssSelector(".el-button--danger:nth-child(1) > span")).click();
    driver.findElement(By.cssSelector(".el-button--default:nth-child(2) > span")).click();
  }
}
