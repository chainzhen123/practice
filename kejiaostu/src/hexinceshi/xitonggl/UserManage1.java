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

/**
 * 脚本说明：  添加--下载模板--上传用户模板文件--批量创建工作空间--修改--重置密码
 * @author chain
 *
 */
public class UserManage1 {
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
  public void userManage1() {
    driver.get("http://192.168.1.115:8099/gxzy/");
    //driver.manage().window().setSize(new Dimension(1550, 838));
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("changing");
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).sendKeys("12345678");
    driver.findElement(By.cssSelector(".cliklogin")).click();
    driver.findElement(By.cssSelector(".activestyle > span")).click();
    driver.findElement(By.cssSelector("label:nth-child(3) span")).click();
    driver.findElement(By.cssSelector(".el-form-item__content > .el-button:nth-child(2) > span")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".el-form-item__content > .el-button:nth-child(2) > span"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) > .el-form-item__content > .el-input > .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) > .el-form-item__content > .el-input > .el-input__inner")).sendKeys("lisi1");
    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(2) .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(2) .el-input__inner")).sendKeys("lisi1");
    driver.findElement(By.cssSelector(".el-form-item:nth-child(3) > .el-form-item__content > .el-input > .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-form-item:nth-child(3) > .el-form-item__content > .el-input > .el-input__inner")).sendKeys("12345678");
    driver.findElement(By.cssSelector(".el-form-item:nth-child(4) > .el-form-item__content > .el-input > .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-form-item:nth-child(4) > .el-form-item__content > .el-input > .el-input__inner")).sendKeys("12345678");
    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(5) .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(5) .el-input__inner")).sendKeys("13285694561");
    driver.findElement(By.cssSelector(".diaadd > span")).click();
    driver.findElement(By.cssSelector(".el-form-item:nth-child(8) span")).click();
    driver.findElement(By.cssSelector(".el-form-item:nth-child(9) span")).click();
    driver.findElement(By.id("fileExport")).click();
    driver.findElement(By.id("fileExport")).sendKeys("C:\\fakepath\\批量导入账户文件模板.xlsx");
    driver.findElement(By.cssSelector(".el-dialogmin:nth-child(3) .el-dialog__close")).click();
    driver.findElement(By.cssSelector(".demo-form-inline > .el-form-item:nth-child(2) .el-input__inner")).click();
    driver.findElement(By.cssSelector(".demo-form-inline > .el-form-item:nth-child(2) .el-input__inner")).sendKeys("lisi");
    driver.findElement(By.cssSelector(".el-form-item:nth-child(7) .el-button--primary")).click();
    driver.findElement(By.cssSelector(".is-leaf .el-checkbox__inner")).click();
    driver.findElement(By.cssSelector(".el-form-item:nth-child(10) span")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".el-form-item:nth-child(10) span"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".el-dialog__wrapper:nth-child(6) .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-dialog__wrapper:nth-child(6) .el-input__inner")).sendKeys("5");
    driver.findElement(By.cssSelector(".el-form-item:nth-child(2) span")).click();
    driver.findElement(By.cssSelector(".el-form-item:nth-child(2) .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-form-item:nth-child(2) .el-input__inner")).sendKeys("lisi");
    driver.findElement(By.cssSelector(".el-form-item:nth-child(7) .el-button--primary > span")).click();
    driver.findElement(By.cssSelector(".el-form-item:nth-child(2) .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-form-item:nth-child(2) .el-input__inner")).sendKeys("lisi1");
    driver.findElement(By.cssSelector(".el-form-item:nth-child(7) .el-button--primary > span")).click();
    driver.findElement(By.cssSelector(".el-button--warning > span")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".el-button--warning > span"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".el-form-item:nth-child(4) > .el-form-item__content > .el-input > .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-form-item:nth-child(4) > .el-form-item__content > .el-input > .el-input__inner")).sendKeys("13285694562");
    driver.findElement(By.cssSelector(".diaadd > span")).click();
    driver.findElement(By.cssSelector(".el-button:nth-child(3) > span")).click();
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) > .el-form-item__content > .el-input > .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) > .el-form-item__content > .el-input > .el-input__inner")).sendKeys("123456789");
    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(2) > .el-form-item__content > .el-input > .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(2) > .el-form-item__content > .el-input > .el-input__inner")).sendKeys("123456789");
    driver.findElement(By.cssSelector(".el-form-item:nth-child(3) .el-button > span")).click();
    driver.findElement(By.cssSelector(".demo-form-inline > .el-form-item:nth-child(2) .el-input__inner")).click();
    driver.findElement(By.cssSelector(".demo-form-inline > .el-form-item:nth-child(2) .el-input__inner")).sendKeys("lisi");
    driver.findElement(By.cssSelector(".el-form-item:nth-child(7) .el-button--primary > span")).click();
  }
}
