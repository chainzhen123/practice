package stuaction;

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
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 
 * @author chain
 *
 */
public class Test1234_4 {
	
	
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
   
  public String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }
  
  @Test
  public void jx_wordxx() throws InterruptedException {
    driver.get("http://192.168.1.115:8099/gxzy/");
    Thread.sleep(3000);
    driver.manage().window().setSize(new Dimension(1410, 864));
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("stu2");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).sendKeys("12345678");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".cliklogin")).click();
    Thread.sleep(2000);
       
    driver.findElement(By.cssSelector(".activestyle > span")).click();   //教学中心
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("label:nth-child(3) span")).click();   //我的学习
    Thread.sleep(2000);
    driver.findElement(By.id("tab-studyMyCloudServer")).click();     //我的云服务器
    Thread.sleep(2000);
    
    vars.put("window_handles", driver.getWindowHandles());
    //进入容器
    driver.findElement(By.xpath("//span[text()='进入容器']")).click();
    Thread.sleep(2000);
    vars.put("root", driver.getWindowHandle());
//    driver.switchTo().window(vars.get("win8759").toString());
//    driver.switchTo().frame(1);
//    driver.findElement(By.id("noVNC_password_input")).sendKeys("123456");
//    Thread.sleep(2000);
//    driver.findElement(By.id("noVNC_password_button")).click();
//    Thread.sleep(2000);
//    driver.close();
//    Thread.sleep(2000);
    driver.switchTo().window(vars.get("root").toString());
    Thread.sleep(2000);
    
    // 修改绑定
    driver.findElement(By.xpath("//span[text()='修改绑定']")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item__content .el-select__caret")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='C++程序设计基础']")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-button--success > span")).click();
    Thread.sleep(2000);
    
    //批量修改绑定
    driver.findElement(By.cssSelector(".el-button--info:nth-child(1) > span")).click();
    Thread.sleep(2000);      
    driver.findElement(By.cssSelector(".el-table__row .el-checkbox__inner")).click();   
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-button--info:nth-child(1) > span")).click();   //批量修改按钮
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item__content .el-select__caret")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='Java语言程序设计']")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-button--success > span")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("tab-studyMyLessons")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("div:nth-child(1) > .conent-center-value .el-button--success > span")).click();
    Thread.sleep(2000);
    
    
    driver.findElement(By.id("tab-studyMyCloudServer")).click();  //我的云服务器
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-button--danger:nth-child(2) > span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-table__row .el-checkbox__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-button--danger:nth-child(2) > span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-button--default:nth-child(2) > span")).click();   //确定
    Thread.sleep(3000);
//    driver.findElement(By.cssSelector(".el-table__row:nth-child(2) .el-button--danger > span")).click();
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-button--default:nth-child(2) > span")).click();
//    Thread.sleep(2000);
  }
}
