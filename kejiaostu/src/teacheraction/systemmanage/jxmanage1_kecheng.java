package teacheraction.systemmanage;

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
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 系统管理-教学管理-课程管理：课程的创建与删除，发布与取消发布（删除之前需要将创建的课程搜索出来然后删）
 * @author chain
 *
 */
public class jxmanage1_kecheng {
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
  public void kechcrede() throws InterruptedException {
    driver.get("http://192.168.1.115:8099/gxzy/");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("teach01");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).sendKeys("12345678");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".cliklogin")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".headertitle > ul:nth-child(1) span")).click();   //系统管理
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-menu-item > span")).click();  //教学管理
    Thread.sleep(2000);
    
    //创建课程
    driver.findElement(By.cssSelector("#coursemanagement > .el-row .el-button:nth-child(2) > span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-input:nth-child(2) > .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-input:nth-child(2) > .el-input__inner")).sendKeys("123");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-dialog__footer:nth-child(3) .el-button--primary > span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item__content:nth-child(1) span")).click();
    Thread.sleep(2000);
    //搜索
    driver.findElement(By.cssSelector("#coursemanagement .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("#coursemanagement .el-input__inner")).sendKeys("123");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("#coursemanagement .header .el-button:nth-child(1) > span")).click();
    Thread.sleep(2000);
    
    //发布
//    driver.findElement(By.cssSelector(".el-table_1_column_6 .el-button--primary > span")).click();
    driver.findElement(By.xpath("//span[text()='点击发布']")).click();
    Thread.sleep(3000);
    //断言
    boolean res2 = driver.findElement(By.tagName("body")).getText().contains("操作成功");
    Assert.assertTrue(res2);
    Thread.sleep(2000);
    //取消发布
    driver.findElement(By.xpath("//span[text()='取消发布']")).click();
    Thread.sleep(3000);
    //断言
    boolean res3 = driver.findElement(By.tagName("body")).getText().contains("操作成功");
    Assert.assertTrue(res3);
    Thread.sleep(2000);
    
    //删除
    driver.findElement(By.cssSelector(".el-table_4_column_21 .el-button--danger")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-button--default:nth-child(2) > span")).click();
    Thread.sleep(2000);
    
    //删除成功断言
    boolean res1 = driver.findElement(By.tagName("body")).getText().contains("操作成功");
    Assert.assertTrue(res1);
    Thread.sleep(2000);
  }
}
