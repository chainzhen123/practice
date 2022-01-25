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
 * 教师用户-资源管理-课题组管理：创建、修改、删除
 * @author chain
 *
 */
public class zymanager1_ketizu {
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
    driver.manage().window().setSize(new Dimension(1550, 838));
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
    //创建课题组按钮
    driver.findElement(By.cssSelector(".el-button--success > span")).click();
    Thread.sleep(2000);

    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) > .el-form-item__content > .el-input > .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) > .el-form-item__content > .el-input > .el-input__inner")).sendKeys("laoshideketizu");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(2) > .el-form-item__content > .el-input > .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(2) > .el-form-item__content > .el-input > .el-input__inner")).sendKeys("2");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(3) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(3) .el-input__inner")).sendKeys("0");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(4) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(4) .el-input__inner")).sendKeys("2");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(5) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(5) .el-input__inner")).sendKeys("2");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item__content > .el-button--default > span")).click();
    Thread.sleep(2000);
       
    driver.findElement(By.cssSelector(".tableleft .el-input__inner")).click();
    Thread.sleep(2000);
    //查询账户
    driver.findElement(By.cssSelector(".tableleft .el-input__inner")).sendKeys("Teacherzhao");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(2) .el-button > span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".cell > .el-button")).click();
    Thread.sleep(2000);
    //创建
    driver.findElement(By.cssSelector(".el-form-item__content > .is-plain:nth-child(1) > span")).click();
    Thread.sleep(2000);
    
    //创建后断言
    boolean res1 = driver.findElement(By.tagName("body")).getText().contains("laoshideketizu");
    Assert.assertTrue(res1);
    
    //刷新页面
    driver.navigate().refresh();   //刷新网页，更新云服务器的运行状态
    Thread.sleep(3000);
    
    //修改
    driver.findElement(By.cssSelector(".operItem > span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(4) .el-input__inner")).clear();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(4) .el-input__inner")).sendKeys("5");
    Thread.sleep(2000);
    //修改
    driver.findElement(By.cssSelector(".is-plain:nth-child(1)")).click();  
    Thread.sleep(5000);
    
    //修改断言
    boolean res3 = driver.findElement(By.tagName("body")).getText().contains("5");
    Assert.assertTrue(res3);
    
    //删除
    driver.findElement(By.cssSelector(".el-button--danger > span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-button--default:nth-child(2)")).click();
    Thread.sleep(2000);
    
    //删除后刷新页面
    driver.navigate().refresh();   //刷新网页，更新云服务器的运行状态
    Thread.sleep(3000);
    
    //删除后断言
    boolean res2 = driver.findElement(By.tagName("body")).getText().contains("laoshideketizu");
    Assert.assertFalse(res2);
    
  }
}
