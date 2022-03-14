package stuaction.teachcenter;

import org.testng.annotations.AfterMethod;
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
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

 /**
  * 科教平台-学生-教学中心-目录：仅文档、文档/在线实验、下载课件
  * @author chain
  *
  */
public class teachCenter4_mulu {
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
  public void Test1234() throws InterruptedException {
	  
  	driver.get("http://192.168.1.115:8099/gxzy/");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("zhsan3");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).sendKeys("12345678");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".cliklogin")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='教学中心']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='课程']")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".style1:nth-child(1) li:nth-child(2) img")).click();  //选择课程
    Thread.sleep(3000);
    
    //加入学习
    driver.findElement(By.cssSelector(".topdiv_footer_right")).click();  
    Thread.sleep(3000);
    //加入学习断言
    boolean res3 = driver.findElement(By.tagName("body")).getText().contains("退出学习");
    Assert.assertTrue(res3);
       
    driver.findElement(By.id("tab-Tankage")).click();     //点击云服务器 栏
    Thread.sleep(3000);
       
    driver.findElement(By.id("tab-second")).click();    //点击目录
    Thread.sleep(3000);
    
    //进入目录 对是否存在下载课件、仅文档、文档/在线实验进行断言
    //下载课件断言
    boolean res1 = driver.findElement(By.tagName("body")).getText().contains("下载课件");
    Assert.assertTrue(res1);
    
    //仅文档断言
    boolean res2 = driver.findElement(By.tagName("body")).getText().contains("仅文档");
    Assert.assertTrue(res2);
    
    //  文档/在线实验断言
    boolean res4 = driver.findElement(By.tagName("body")).getText().contains("文档/在线实验");
    Assert.assertTrue(res4);
    
    Thread.sleep(2000);
    vars.put("window_handles", driver.getWindowHandles()); 
    vars.put("root", driver.getWindowHandle());
    
    driver.findElement(By.xpath("//span[text()='仅文档']")).click();
    Thread.sleep(5000);
       
    driver.switchTo().window(vars.get("root").toString());   //切换回原网页   
    Thread.sleep(3000);
    
       
    driver.findElement(By.xpath("//span[text()='文档/在线实验']")).click();
    Thread.sleep(3000);
    
    driver.switchTo().window(vars.get("root").toString());   //切换回原网页
    Thread.sleep(5000);
    
    //点击退出课程
    driver.findElement(By.cssSelector(".topdiv_footer_rightout")).click();
    Thread.sleep(3000);
    
                  
  }
}

