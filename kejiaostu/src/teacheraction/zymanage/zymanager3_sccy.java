package teacheraction.zymanage;

import org.junit.Before;
import org.junit.After;
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
import org.testng.Assert;
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
 * 教师用户-资源管理-课题组管理：删除成员
 * @author chain
 *
 */
public class zymanager3_sccy {
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
  public void ketizuManager() throws InterruptedException {
    driver.get("http://192.168.1.115:8099/gxzy/");
    Thread.sleep(2000);
    driver.manage().window().setSize(new Dimension(1550, 838));
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("teach02");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).sendKeys("12345678");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".cliklogin")).click();    
    Thread.sleep(2000);
    //资源管理
    driver.findElement(By.cssSelector("ul:nth-child(2) span")).click();
    Thread.sleep(2000);
    //课题组管理
    driver.findElement(By.cssSelector(".el-menu-item > span")).click();
    Thread.sleep(2000);
//    //创建课题组按钮
//    driver.findElement(By.cssSelector(".el-button--success > span")).click();
//    Thread.sleep(2000);
//
//    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) > .el-form-item__content > .el-input > .el-input__inner")).click();
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) > .el-form-item__content > .el-input > .el-input__inner")).sendKeys("laoshideketizu");
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-form-item:nth-child(2) > .el-form-item__content > .el-input > .el-input__inner")).click();
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-form-item:nth-child(2) > .el-form-item__content > .el-input > .el-input__inner")).sendKeys("2");
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(3) .el-input__inner")).click();
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(3) .el-input__inner")).sendKeys("0");
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(4) .el-input__inner")).click();
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(4) .el-input__inner")).sendKeys("2");
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(5) .el-input__inner")).click();
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(5) .el-input__inner")).sendKeys("2");
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-form-item__content > .el-button--default > span")).click();
//    Thread.sleep(2000);
//       
//    driver.findElement(By.cssSelector(".tableleft .el-input__inner")).click();
//    Thread.sleep(2000);
//    //查询账户
//    driver.findElement(By.cssSelector(".tableleft .el-input__inner")).sendKeys("Teacherzhao");
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-form-item:nth-child(2) .el-button > span")).click();
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".cell > .el-button")).click();
//    Thread.sleep(2000);
//    //创建
//    driver.findElement(By.cssSelector(".el-form-item__content > .is-plain:nth-child(1) > span")).click();
//    Thread.sleep(2000);
//    
//    //创建后断言
//    boolean res1 = driver.findElement(By.tagName("body")).getText().contains("laoshideketizu");
//    Assert.assertTrue(res1);
//    
//    //刷新页面
//    driver.navigate().refresh();   //刷新网页，更新云服务器的运行状态
//    Thread.sleep(3000);
//    
//    {
//        WebElement element = driver.findElement(By.cssSelector(".operItem:nth-child(1) span"));
//        Actions builder = new Actions(driver);
//        builder.moveToElement(element).perform();
//    }
//    Thread.sleep(3000);   
//    driver.findElement(By.xpath("//li[contains(text(),'邀请成员')]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.cssSelector(".el-form-item:nth-child(1) > .el-form-item__content > .el-input > .el-input__inner")).click();
//	Thread.sleep(3000);
//	//选择用户
//	driver.findElement(By.cssSelector(".el-form-item:nth-child(1) > .el-form-item__content > .el-input > .el-input__inner")).sendKeys("zhsan1");
//	Thread.sleep(3000);
//	driver.findElement(By.cssSelector(".el-form-item:nth-child(2) .el-button > span")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.cssSelector(".el-button--small:nth-child(1) > span")).click();
//	Thread.sleep(5000);
//	
//    //刷新页面
//    driver.navigate().refresh();   //刷新网页，更新云服务器的运行状态
//    Thread.sleep(3000);
    
    {
        WebElement elementq = driver.findElement(By.cssSelector(".operItem:nth-child(1) span"));
        Actions builder = new Actions(driver);
        builder.moveToElement(elementq).perform();
    }
    Thread.sleep(3000);
    
	driver.findElement(By.xpath("//li[contains(text(),'删除成员')]")).click();  //此处删除成员是无效操作，删除的是自己
	Thread.sleep(3000);
	driver.findElement(By.cssSelector(".el-button--danger:nth-child(1) > span")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector(".el-button:nth-child(2) > span")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#projecttema > .el-dialog__wrapper:nth-child(5) .el-dialog__close")).click();
	Thread.sleep(5000);

  }
}
