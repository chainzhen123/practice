package hexinceshi.jisuanzx;

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
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * 创建一主一从模式的hbase
 * @author chain
 *
 */
public class BigData_4_CreateHbase {
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
  public void createhbase() throws InterruptedException {
    driver.get("http://192.168.1.115:8099/gxzy/");
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("zhsan1");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".box")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).sendKeys("12345678");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".cliklogin")).click();
    Thread.sleep(2000);
    //计算中心
    driver.findElement(By.cssSelector(".headertitle > ul:nth-child(2) > li")).click();
    Thread.sleep(2000);
    //大数据
    driver.findElement(By.cssSelector("label:nth-child(6) span")).click();
    Thread.sleep(2000);
    //进入集群详情
    driver.findElement(By.cssSelector(".cell > .el-button--primary > span")).click();
    Thread.sleep(2000);
    //创建
    driver.findElement(By.cssSelector(".btn > span")).click();
    Thread.sleep(2000);
    
    
    //选择类型
    driver.findElement(By.cssSelector(".selectipt .el-input__inner")).click();
    Thread.sleep(2000);
    //选择Hbase
    driver.findElement(By.xpath("//span[text()='HBase']")).click();
    Thread.sleep(2000);
    //确定按钮
    driver.findElement(By.cssSelector(".dialog-footer > .el-button--primary > span")).click();
    Thread.sleep(2000);
    
    //Master cpu 内存
    driver.findElement(By.cssSelector("div:nth-child(1) > .el-form-item:nth-child(1) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("div:nth-child(1) > .el-form-item:nth-child(1) .el-input__inner")).sendKeys("1");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("div:nth-child(1) > .el-form-item:nth-child(2) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("div:nth-child(1) > .el-form-item:nth-child(2) .el-input__inner")).sendKeys("1");
    Thread.sleep(2000);
    //Slave CPU 内存  副本
    driver.findElement(By.cssSelector("div:nth-child(2) > .el-form-item:nth-child(1) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("div:nth-child(2) > .el-form-item:nth-child(1) .el-input__inner")).sendKeys("1");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("div:nth-child(2) > .el-form-item:nth-child(2) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("div:nth-child(2) > .el-form-item:nth-child(2) .el-input__inner")).sendKeys("1");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(3) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(3) .el-input__inner")).sendKeys("1");
    Thread.sleep(2000);
    
    //创建    
    driver.findElement(By.cssSelector(".el-button--success > span")).click();
    Thread.sleep(2000);
    
    //hbase详情
    driver.findElement(By.xpath("//div[contains(text(),'hbase')]")).click();
    Thread.sleep(2000);
    boolean res2 = driver.findElement(By.tagName("body")).getText().contains("Hbase-Master");
    boolean res3 = driver.findElement(By.tagName("body")).getText().contains("Hbase-Region");
    Assert.assertTrue(res2);
    Assert.assertTrue(res3);
    
    //返回
    driver.findElement(By.cssSelector(".el-page-header__left")).click();
    Thread.sleep(2000);
  }
}
