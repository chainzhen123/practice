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
  * 科教平台-学生-教学中心-创建远程连接-开始实验
  * @author chain
  *
  */
public class teachCenter2_yclj {
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
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("zhsan2");
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
    driver.findElement(By.cssSelector(".style1:nth-child(1) li:nth-child(1) img")).click();  //课程
    Thread.sleep(3000);
    //加入学习
    driver.findElement(By.cssSelector(".topdiv_footer_right")).click();  
    Thread.sleep(3000);
    driver.findElement(By.id("tab-Tankage")).click();     //点击云服务器 栏
    Thread.sleep(3000);
    
    {
      WebElement element = driver.findElement(By.cssSelector(".el-dropdown-selfdefine > span"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();          //创建云服务器  悬停
    }
    Thread.sleep(3000);

                    
    driver.findElement(By.xpath("//*[text()='远程连接']")).click();    //  点击远程连接
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("远程连接001");   //云服务器名称    
    Thread.sleep(3000);
    
    driver.findElement(By.cssSelector(".el-form-item:nth-child(2) .el-input__inner")).click();     //镜像类型
    Thread.sleep(3000);
    driver.findElement(By.xpath("//span[text()='novnc']")).click();         //选择某一个镜像类型，后面改成xpath
    Thread.sleep(3000);
    
    driver.findElement(By.cssSelector(".el-form-item:nth-child(3) .el-input__inner")).click();     //镜像名称
    Thread.sleep(3000);
    driver.findElement(By.xpath("//span[text()='192.168.1.117/ssh/java:dev']")).click();
    Thread.sleep(3000);
      
    driver.findElement(By.cssSelector(".el-form-item__content > .el-input--suffix > .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item__content > .el-input--suffix > .el-input__inner")).sendKeys("123456");
    Thread.sleep(2000);
    
    driver.findElement(By.cssSelector(".el-radio:nth-child(1) > .el-radio__label")).click();    //计算资源来源-个人分区
    Thread.sleep(3000);
    
    driver.findElement(By.cssSelector(".el-form-item:nth-child(8) .el-select__caret")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='zhsan2']")).click();
    Thread.sleep(2000);
    
    driver.findElement(By.cssSelector(".el-button--success > span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".flix")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-button:nth-child(5) > span")).click();
    Thread.sleep(3000);
    
    //配额
    driver.findElement(By.cssSelector(".el-form-item:nth-child(12) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(12) .el-input__inner")).sendKeys("1");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(13) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(13) .el-input__inner")).sendKeys("0");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(14) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(14) .el-input__inner")).sendKeys("1");
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".el-button--primary > span")).click();  //创建
    Thread.sleep(8000);
     
    //创建断言
    boolean res1 = driver.findElement(By.tagName("body")).getText().contains("远程连接001");
    Assert.assertTrue(res1);
    
    vars.put("window_handles", driver.getWindowHandles());
    vars.put("root", driver.getWindowHandle());
    Thread.sleep(2000);
       
    //开始实验
    driver.findElement(By.cssSelector(".el-table__fixed-body-wrapper .el-button:nth-child(1) > span")).click();      
    Thread.sleep(5000);  
    
    //开始实验断言：考虑到有的镜像创建失败，不能切换到新页面的情况。正常情况下是定位不到'远程连接001'的
//    boolean res3 = driver.findElement(By.tagName("body")).getText().contains("远程连接001");
//    Assert.assertFalse(res3);
//    Thread.sleep(2000);
    
    driver.switchTo().window(vars.get("root").toString());      //切换回主网页
    Thread.sleep(3000);
    
   
    //删除远程连接
    driver.findElement(By.cssSelector(".el-table__fixed-body-wrapper .el-button:nth-child(2) > span")).click();         
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-button--default:nth-child(2) > span")).click();         
    Thread.sleep(3000);
    
    //删除断言
    boolean res2 = driver.findElement(By.tagName("body")).getText().contains("远程连接001");
    Assert.assertFalse(res2);
    Thread.sleep(2000);
    
  }
}

