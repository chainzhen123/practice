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
 * 教师用户-资源管理-课题组管理-更多操作：计算资源解锁，定位弹窗的成功信息进行断言
 * @author chain
 *
 */
public class zymanager5_zycz {
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
  public void ketizuManager() throws InterruptedException {
    driver.get("http://192.168.1.115:8099/gxzy/");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("Teacherzhao");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).sendKeys("1234567899");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".cliklogin")).click();    
    Thread.sleep(2000);
    //资源管理
    driver.findElement(By.cssSelector("ul:nth-child(2) span")).click();
    Thread.sleep(2000);
    //课题组管理
    driver.findElement(By.cssSelector(".el-menu-item > span")).click();
    Thread.sleep(2000);
    //更多操作 悬停   
    {
        WebElement element = driver.findElement(By.cssSelector(".operItem:nth-child(2) span"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
    }
    Thread.sleep(3000);   
    
//    
//    boolean res1 = driver.findElement(By.tagName("body")).getText().contains("计算资源锁定");
//    Assert.assertTrue(res1);
//    
//    boolean res2 = driver.findElement(By.tagName("body")).getText().contains("计算资源清空");
//    Assert.assertTrue(res2);
//        
//    boolean res3 = driver.findElement(By.tagName("body")).getText().contains("计算资源强制清空");
//    Assert.assertTrue(res3);
//    
//    boolean res4 = driver.findElement(By.tagName("body")).getText().contains("存储资源清空");
//    Assert.assertTrue(res4);
//    
//    boolean res5 = driver.findElement(By.tagName("body")).getText().contains("存储资源强制清空");
//    Assert.assertTrue(res5);
//    Thread.sleep(3000);   
        
    driver.findElement(By.xpath("//li[contains(text(),'计算资源解锁')]")).click(); //  点击计算资源清空
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-button:nth-child(2) > span")).click();   //点击确定
    Thread.sleep(3000);
    
    //捕获操作之后弹窗弹出的操作成功的文字
    boolean res6 = driver.findElement(By.tagName("body")).getText().contains("计算资源解锁成功");
    Assert.assertTrue(res6);
    
      
  }
}
