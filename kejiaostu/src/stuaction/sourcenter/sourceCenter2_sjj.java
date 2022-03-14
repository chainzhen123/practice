package stuaction.sourcenter;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
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
 * 数据集_下载到本地_下载到云存储.在进入数据集详情时定位下载到本地和下载到云存储按钮，下载到本地按钮就不点了
 * @author chain
 *
 */
public class sourceCenter2_sjj {
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
  public void sjj() throws InterruptedException {
    driver.get("http://192.168.1.115:8099/gxzy/");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("zhsan1");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).sendKeys("12345678");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".cliklogin")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("ul:nth-child(3) span:nth-child(1)")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("label:nth-child(2) span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".bods:nth-child(1) > .left > img")).click();  //选择数据集，进入数据集详情
    Thread.sleep(2000);
    
    //下载到本地和下载到云硬盘断言
    boolean res1 = driver.findElement(By.tagName("body")).getText().contains("下载到本地");
    Assert.assertTrue(res1);
    Thread.sleep(1000);
    
    boolean res2 = driver.findElement(By.tagName("body")).getText().contains("下载到云存储");
    Assert.assertTrue(res2);
    Thread.sleep(1000);
    
//    driver.findElement(By.linkText("下载到本地")).click(); //？？？此处注意，点击下载到本地之后有系统的弹窗，确认是否保存文件，目前是手动干预点击
//    Thread.sleep(5000);
    driver.findElement(By.linkText("下载到云存储")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".flix")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".el-button--primary > span")).click();
    Thread.sleep(3000);
  }
}

