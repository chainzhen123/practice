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
 * 系统管理-教学管理-课程管理-教师管理、学员管理：添加教师、删除教师、添加学员、完课、批量删除
 * @author chain
 *
 */
public class jxmanage4 {
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
  public void tearDown()throws AWTException  {
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
    driver.findElement(By.cssSelector(".el-input:nth-child(2) > .el-input__inner")).sendKeys("789");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-dialog__footer:nth-child(3) .el-button--primary > span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item__content:nth-child(1) span")).click();
    Thread.sleep(2000);
        
    //搜索课程
    driver.findElement(By.cssSelector("#coursemanagement .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("#coursemanagement .el-input__inner")).sendKeys("789");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("#coursemanagement .header .el-button:nth-child(1) > span")).click();
    Thread.sleep(2000);
    
    //管理按钮
    driver.findElement(By.xpath("//span[text()='管理']")).click();
    Thread.sleep(5000);
    
    //默认计划设置
    driver.findElement(By.xpath("//div[text()='默认计划设置']")).click();
    Thread.sleep(3000);
    
  //教师管理
    driver.findElement(By.xpath("//div[text()='教师管理']")).click();
    Thread.sleep(2000);
    //添加教师
    driver.findElement(By.xpath("//span[text()='新增']")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-table__row:nth-child(1) span")).click();
    Thread.sleep(2000);
    //删除教师
    driver.findElement(By.cssSelector(".el-button--danger > span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-button:nth-child(2)")).click();
    Thread.sleep(2000);
    
    //学员管理
    driver.findElement(By.xpath("//div[text()='学员管理']")).click();
    Thread.sleep(2000);
    //添加学员
    driver.findElement(By.cssSelector(".el-button--success > span")).click();
    Thread.sleep(5000);
    driver.findElement(By.cssSelector(".el-table__row:nth-child(1) .el-checkbox__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-table__row:nth-child(2) .el-checkbox__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(8) span")).click(); 
    Thread.sleep(2000);
    //完课操作
    driver.findElement(By.cssSelector(".el-table__row:nth-child(2) .el-button--success > span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-button--default:nth-child(2) > span")).click();
    Thread.sleep(2000);
    
    //批量删除
    driver.findElement(By.cssSelector(".is-leaf .el-checkbox__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item__content > .el-button--danger > span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-button--default:nth-child(2) > span")).click();
    Thread.sleep(3000);
    
      
  }
}
