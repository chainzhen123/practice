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
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

 /**
  * 科教平台-学生-教学中心-提交报告  
  * @author chain
  *
  */
public class teachCenter3_report {
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
    
//    //删除
//    driver.findElement(By.cssSelector(".el-table__row:nth-child(1) .el-button--danger > span")).click();
//    Thread.sleep(5000);
//    //确定
//    driver.findElement(By.cssSelector(".el-button--default:nth-child(2) > span")).click();
//    Thread.sleep(5000);
    
    driver.findElement(By.id("tab-task")).click();     //点击任务栏
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".el-table__row:nth-child(6) .el-button--info > span")).click();  //提交报告
    Thread.sleep(2000);
    driver.findElement(By.className("el-upload__text")).click();    //点击上传按钮  ？？？？上传需要借助其他工具，selenium单独不能实现
    Thread.sleep(10000);
    
            
  }
}

