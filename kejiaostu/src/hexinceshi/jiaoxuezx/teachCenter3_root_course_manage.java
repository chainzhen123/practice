package hexinceshi.jiaoxuezx;

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
  * 科教平台-管理员-课程管理页面内容检查
  * @author chain
  *
  */
public class teachCenter3_root_course_manage {
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
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("changing");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).sendKeys("12345678");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".cliklogin")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//span[text()='教学中心']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='课程']")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".style1:nth-child(1) li:nth-child(2) img")).click(); //点击c++课程进入课程详情
    Thread.sleep(2000);
      
    driver.findElement(By.xpath("//span[text()='管理']")).click();
    Thread.sleep(3000);
    
    //课程管理中内容检查
    boolean res1 = driver.findElement(By.tagName("body")).getText().contains("课程信息");
    boolean res2 = driver.findElement(By.tagName("body")).getText().contains("默认计划设置");
    boolean res3 = driver.findElement(By.tagName("body")).getText().contains("镜像地址");
    boolean res4 = driver.findElement(By.tagName("body")).getText().contains("分类");
    boolean res5 = driver.findElement(By.tagName("body")).getText().contains("课程介绍");
    Assert.assertTrue(res1);
    Assert.assertTrue(res2);
    Assert.assertTrue(res3);
    Assert.assertTrue(res4);
    Assert.assertTrue(res5);
    Thread.sleep(3000);
    
    
       
  }
}

