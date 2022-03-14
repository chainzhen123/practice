package stuaction.selfcenter;

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
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class selCenter_word_ziyuan {
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
public void myResource() throws InterruptedException {	
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
    Thread.sleep(2000);
    
    driver.findElement(By.cssSelector("ul:nth-child(4) span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("label:nth-child(2) span")).click();
    Thread.sleep(3000);
    
    //修改按钮 页面元素检查
    boolean xiugai = driver.findElement(By.tagName("body")).getText().contains("修改");
    Assert.assertTrue(xiugai);
    Thread.sleep(1000);
    
    //删除按钮 页面元素检查
    boolean shanchu = driver.findElement(By.tagName("body")).getText().contains("删除");
    Assert.assertTrue(shanchu);
    Thread.sleep(1000);
    
    //申请课题组  页面元素检查
    boolean shenqingktz = driver.findElement(By.tagName("body")).getText().contains("申请课题组");
    Assert.assertTrue(shenqingktz);
    Thread.sleep(1000);
    
    // 重命名按钮  页面元素检查
    boolean chongmm = driver.findElement(By.tagName("body")).getText().contains("重命名");
    Assert.assertTrue(chongmm);
    Thread.sleep(1000);
    
    //资源申请 页面元素检查
    boolean ziyaunsq = driver.findElement(By.tagName("body")).getText().contains("资源申请");
    Assert.assertTrue(ziyaunsq);
    Thread.sleep(1000);
    
    //退出  页面元素检查
    boolean tuichu = driver.findElement(By.tagName("body")).getText().contains("退出");
    Assert.assertTrue(tuichu);
    Thread.sleep(2000);
   
  }
}
