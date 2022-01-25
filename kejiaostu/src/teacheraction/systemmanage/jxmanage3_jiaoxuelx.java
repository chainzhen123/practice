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
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 系统管理-教学管理-课程管理-教学类型管理：创建一级分类、创建子分类、修改、展示/取消展示、删除
 * 
 * @author chain
 *
 */
public class jxmanage3_jiaoxuelx {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  
  @BeforeClass
  public void setUp() throws AWTException {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
        
  }
  
  
  @AfterClass
  public void tearDown() {
    driver.quit();
  }
  
  
  @Test
  public void kechcrede() throws InterruptedException{
    driver.get("http://192.168.1.115:8099/gxzy/");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("Teacherzhao");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).sendKeys("1234567899");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".cliklogin")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".headertitle > ul:nth-child(1) span")).click();   //系统管理
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-menu-item > span")).click();  //教学管理
    Thread.sleep(3000);
    
    //创建一级分类
    driver.findElement(By.cssSelector(".el-button--success:nth-child(1) > span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-dialog__body .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-dialog__body .el-input__inner")).sendKeys("123");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-dialog__body .el-button")).click();
    Thread.sleep(2000);
    //创建一级分类断言
    boolean res1 = driver.findElement(By.tagName("body")).getText().contains("123");
    Assert.assertTrue(res1);
    //创建子分类
    driver.findElement(By.cssSelector(".el-table__row:nth-child(35) .el-button--success > span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-dialog__body .el-form-item:nth-child(1) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-dialog__body .el-form-item:nth-child(1) .el-input__inner")).sendKeys("456");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(3) span")).click();    
    Thread.sleep(2000);
    
    //修改
    driver.findElement(By.cssSelector(".el-table__row:nth-child(35) .el-button--warning > span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-dialog__wrapper:nth-child(3) .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-dialog__wrapper:nth-child(3) .el-input__inner")).clear();
    driver.findElement(By.cssSelector(".el-dialog__wrapper:nth-child(3) .el-input__inner")).sendKeys("123456");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-dialog__body .el-form-item:nth-child(2) .el-button--primary")).click();
    Thread.sleep(2000);
    //修改断言
    boolean res3 = driver.findElement(By.tagName("body")).getText().contains("123456");
    Assert.assertTrue(res3);
    
    //发布与取消
    driver.findElement(By.cssSelector(".el-table__row:nth-child(35) .el-button--primary > span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-table__row:nth-child(35) .el-button--primary > span")).click();
    Thread.sleep(2000);
    
    //删除
    driver.findElement(By.cssSelector(".el-table__row:nth-child(35) .el-button--danger > span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-message-box__btns > .el-button--primary > span")).click();
    Thread.sleep(2000);
    
  }
}
