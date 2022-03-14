package hexinceshi.ziyuangl;


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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

   //批量分配工作空间
/**
 * 脚本说明：管理员登录-用户管理-创建用户-存储管理-搜索用户-分配空间-刷新-修改-刷新-删除-
 *          搜索框中的文字删掉-搜索/刷新-批量删除、分配、修改
 *          
 *因为新建的用户没有添加工作空间路径，因此 将创建用户的代码注释掉。需要提前准备好一个分配好工作空间路径的学生用户即可。
 *   
 */


public class StoreMana1_GongNengBiao2 {
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
  @Parameters({"url","username","password"})
  public void duoGongNengBiao(String url,String username,String password) throws InterruptedException {
    driver.get(url);
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys(username);
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).sendKeys(password);
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".cliklogin")).click();
    Thread.sleep(2000);
          
	  //系统管理
	driver.findElement(By.xpath("//span[text()='系统管理']")).click();
	Thread.sleep(2000);	    
	  //资源管理
	driver.findElement(By.cssSelector(".headertitle > ul:nth-child(2) > li")).click();
	Thread.sleep(2000);
      //存储管理
	driver.findElement(By.cssSelector("label:nth-child(4) span")).click();
    Thread.sleep(2000);
    
   
    //选择3位用户
    driver.findElement(By.cssSelector(".el-table__row:nth-child(1) .el-checkbox__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-table__row:nth-child(2) .el-checkbox__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-table__row:nth-child(3) .el-checkbox__inner")).click();
    Thread.sleep(2000);
    //批量分配工作空间并确定
    {
        WebElement element = driver.findElement(By.cssSelector(".el-icon-arrow-down:nth-child(1)"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();  //创建云服务器   悬停
      }    
    Thread.sleep(2000);
    driver.findElement(By.xpath("//li[contains(text(),'批量给账户分配工作空间')]")).click();    
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-dialog__wrapper:nth-child(4) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-dialog__wrapper:nth-child(4) .el-input__inner")).sendKeys("5");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-dialog__wrapper:nth-child(4) .el-dialog__body span")).click();
    Thread.sleep(2000);
    
    
    
    
//    //选择3位用户，修改工作空间并确定
//    driver.findElement(By.cssSelector(".el-table__row:nth-child(1) .el-checkbox__inner")).click();
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-table__row:nth-child(2) .el-checkbox__inner")).click();
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-table__row:nth-child(3) .el-checkbox__inner")).click();
//    Thread.sleep(2000);
//    //批量修改工作空间
//    {
//        WebElement element = driver.findElement(By.cssSelector(".el-icon-arrow-down:nth-child(1)"));
//        Actions builder = new Actions(driver);
//        builder.moveToElement(element).perform();  //创建云服务器   悬停
//      }   
//    Thread.sleep(2000);
//    driver.findElement(By.xpath("//li[contains(text(),'批量给账户分配工作空间')]")).click();    
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-dialog__wrapper:nth-child(5) .el-input__inner")).click();
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-dialog__wrapper:nth-child(5) .el-input__inner")).sendKeys("10");
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-dialog__wrapper:nth-child(5) .el-dialog__body span")).click();
//    Thread.sleep(2000);
       
  }
}
