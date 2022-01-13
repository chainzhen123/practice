package stuaction;

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
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

 /**
  * 科教平台-学生-教学中心-目录-仅文档-文档/在线实验 查看
  * @author chain
  *
  */
public class Test1234_3 {
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
  public void Test1234() throws InterruptedException {
	  
  	driver.get("http://192.168.1.113:8090/gxzy/");
    Thread.sleep(3000);
    driver.manage().window().setSize(new Dimension(1536, 824));
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("stu2");
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).sendKeys("12345678");
    driver.findElement(By.cssSelector(".cliklogin")).click();
    
    driver.findElement(By.xpath("//span[text()='教学中心']")).click();
    driver.findElement(By.xpath("//span[text()='课程']")).click();
    driver.findElement(By.cssSelector(".style1:nth-child(1) li:nth-child(1) > img")).click();
    driver.findElement(By.id("tab-Tankage")).click();     //点击云服务器 栏
    Thread.sleep(3000);
       
    driver.findElement(By.id("tab-second")).click();    //点击目录
    Thread.sleep(3000);
    
    vars.put("window_handles", driver.getWindowHandles()); 
    
    driver.findElement(By.xpath("//span[text()='仅文档']")).click();
    Thread.sleep(5000);
    
    vars.put("root", driver.getWindowHandle());
    driver.switchTo().window(vars.get("root").toString());   //切换回原网页
    
    Thread.sleep(3000);
    driver.findElement(By.xpath("//span[text()='文档/在线实验']")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".cell > .el-button--mini > span")).click();
    Thread.sleep(5000);
    
    driver.switchTo().window(vars.get("root").toString());   //切换回原网页
    Thread.sleep(5000);
    
    
               
  }
}

