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


  //管理员给学生zhsan1 删除、分配、修改工作空间，批量删除3位用户的工作空间
/**
 * 脚本说明：管理员登录-用户管理-创建用户-存储管理-搜索用户-分配空间-刷新-修改-刷新-删除-
 *          搜索框中的文字删掉-搜索/刷新-批量删除、分配、修改
 *          
 *因为新建的用户没有添加工作空间路径，因此 将创建用户的代码注释掉。需要提前准备好一个分配好工作空间路径的学生用户即可。
 */


public class StoreMana1_GongNengBiao {
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
//    //系统管理
//    driver.findElement(By.cssSelector(".activestyle > span")).click();
//    Thread.sleep(2000);
//    //用户管理
//    driver.findElement(By.cssSelector("label:nth-child(3) span")).click();
//    Thread.sleep(2000);
//    //添加用户
//    driver.findElement(By.cssSelector(".el-form-item__content > .el-button:nth-child(2) > span")).click();
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) > .el-form-item__content > .el-input > .el-input__inner")).click();
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) > .el-form-item__content > .el-input > .el-input__inner")).sendKeys("chenzhen");
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(2) .el-input__inner")).click();
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(2) .el-input__inner")).sendKeys("chenzhen");
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-form-item:nth-child(3) > .el-form-item__content > .el-input > .el-input__inner")).click();
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-form-item:nth-child(3) > .el-form-item__content > .el-input > .el-input__inner")).sendKeys("12345678");
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-form-item:nth-child(4) > .el-form-item__content > .el-input > .el-input__inner")).click();
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-form-item:nth-child(4) > .el-form-item__content > .el-input > .el-input__inner")).sendKeys("12345678");
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(5) .el-input__inner")).click();
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(5) .el-input__inner")).sendKeys("15169365489");
//    Thread.sleep(2000);
//    //添加按钮
//    driver.findElement(By.cssSelector(".diaadd > span")).click();
//    Thread.sleep(2000);
    
    //资源管理
    driver.findElement(By.cssSelector(".headertitle > ul:nth-child(2) > li")).click();
    Thread.sleep(2000);
    //存储管理
    driver.findElement(By.cssSelector("label:nth-child(4) span")).click();
    Thread.sleep(2000);
    //搜索框中输入账户名称
    driver.findElement(By.cssSelector(".el-form-item__content > .el-input > .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item__content > .el-input > .el-input__inner")).sendKeys("zhsan1");
    Thread.sleep(2000);
    //搜索按钮
    driver.findElement(By.cssSelector(".el-button--primary > span")).click();
    Thread.sleep(2000);
    //删除按钮
    driver.findElement(By.cssSelector(".el-button--danger > span")).click();
    Thread.sleep(2000);
    //确定删除
    driver.findElement(By.cssSelector(".el-button--default:nth-child(2) > span")).click();
    Thread.sleep(2000);
 
    
     //  搜索/刷新按钮
    driver.findElement(By.cssSelector(".el-button--primary > span")).click();
    Thread.sleep(2000);
    //分配空间
    driver.findElement(By.cssSelector(".el-button--success > span")).click();
    Thread.sleep(2000);
     //输入空间大小
    driver.findElement(By.cssSelector(".el-form--label-right .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form--label-right .el-input__inner")).sendKeys("10");
    Thread.sleep(2000);
    //确定
    driver.findElement(By.cssSelector(".el-form-item__content > .el-button--success > span")).click();
    Thread.sleep(2000);
    
    //搜索刷新
    driver.findElement(By.cssSelector(".el-button--primary > span")).click();
    Thread.sleep(2000);
    //修改
    driver.findElement(By.cssSelector(".el-button--warning > span")).click();
    Thread.sleep(2000);
    //修改工作空间
    driver.findElement(By.cssSelector(".el-dialog__wrapper:nth-child(5) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-dialog__wrapper:nth-child(5) .el-input__inner")).sendKeys("5");
    Thread.sleep(2000);
    //确定
    driver.findElement(By.cssSelector(".el-dialog__wrapper:nth-child(5) .el-dialog__body span")).click();
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
  
     
    //选择3名用户
    driver.findElement(By.cssSelector(".el-table__row:nth-child(1) .el-checkbox__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-table__row:nth-child(2) .el-checkbox__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-table__row:nth-child(3) .el-checkbox__inner")).click();
    Thread.sleep(2000);    
    //批量删除工作空间并确定
    {
        WebElement element = driver.findElement(By.cssSelector(".el-icon-arrow-down:nth-child(1)"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();  //创建云服务器   悬停
      }
    Thread.sleep(2000);
    driver.findElement(By.xpath("//li[contains(text(),'批量删除账户工作空间')]")).click();    
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-button--default:nth-child(2) > span")).click();
    Thread.sleep(2000);
    
    
    
//    //选择3位用户
//    driver.findElement(By.cssSelector(".el-table__row:nth-child(1) .el-checkbox__inner")).click();
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-table__row:nth-child(2) .el-checkbox__inner")).click();
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-table__row:nth-child(3) .el-checkbox__inner")).click();
//    Thread.sleep(2000);
//    //批量分配工作空间并确定
//    {
//        WebElement element2 = driver.findElement(By.cssSelector(".el-icon-arrow-down:nth-child(1)"));
//        Actions builder2 = new Actions(driver);
//        builder2.moveToElement(element2).perform();  //创建云服务器   悬停
//      }    
//    Thread.sleep(2000);
//    driver.findElement(By.xpath("//span[text()='批量给账户分配工作空间']")).click();    
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-dialog__wrapper:nth-child(4) .el-input__inner")).click();
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-dialog__wrapper:nth-child(4) .el-input__inner")).sendKeys("5");
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-dialog__wrapper:nth-child(4) .el-dialog__body span")).click();
//    Thread.sleep(2000);
//    
//    
//    
//    
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
//    driver.findElement(By.xpath("//span[text()='批量修改账户工作空间']")).click();    
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-dialog__wrapper:nth-child(5) .el-input__inner")).click();
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-dialog__wrapper:nth-child(5) .el-input__inner")).sendKeys("10");
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-dialog__wrapper:nth-child(5) .el-dialog__body span")).click();
//    Thread.sleep(2000);
       
  }
}
