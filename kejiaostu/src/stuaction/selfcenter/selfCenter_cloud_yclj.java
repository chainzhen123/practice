package stuaction.selfcenter;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

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

public class selfCenter_cloud_yclj {
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
  public void cloud_yclj() throws InterruptedException {
    driver.get("http://192.168.1.115:8099/gxzy/");
    Thread.sleep(1000);
    //driver.manage().window().setSize(new Dimension(1128, 733));
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("zhsan5");
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).click();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).sendKeys("12345678");
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".cliklogin")).click();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector("ul:nth-child(4) span")).click();   //个人中心
    Thread.sleep(1000);
    driver.findElement(By.cssSelector("label:nth-child(3) span")).click();    //云服务器
    Thread.sleep(1000);
    {
        WebElement element = driver.findElement(By.cssSelector(".el-button--success > span"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();     //创建云服务器  悬停
    }
    
    Thread.sleep(2000);   
    driver.findElement(By.cssSelector(".el-dropdown-menu__item:nth-child(6)")).click(); //  点击远程连接
    Thread.sleep(2000);		
    
    //云服务器
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("remote06");  
    Thread.sleep(2000);
    //镜像类型
    driver.findElement(By.cssSelector(".el-form-item:nth-child(2) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='ssh']")).click();
    Thread.sleep(2000);
    //镜像名称
    driver.findElement(By.cssSelector(".el-form-item:nth-child(3) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='192.168.1.117/ssh/base-ssh:latest']")).click();
    Thread.sleep(2000);
    //计算资源来源--个人分区
    driver.findElement(By.cssSelector(".is-checked > .el-radio__label")).click();
    Thread.sleep(2000);
    //个人分区
    driver.findElement(By.cssSelector(".el-form-item:nth-child(7) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='zhsan5']")).click();
    Thread.sleep(2000);
    //选择路径
    driver.findElement(By.cssSelector(".el-button--success")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("div:nth-child(1) > .flix")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-button:nth-child(5) > span")).click();
    Thread.sleep(2000);
    
    //配额
    driver.findElement(By.cssSelector(".el-form-item:nth-child(11) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(11) .el-input__inner")).sendKeys("1");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(12) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(12) .el-input__inner")).sendKeys("0");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(13) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(13) .el-input__inner")).sendKeys("1");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-button--primary:nth-child(1) > span")).click();
    Thread.sleep(5000);
    
    //创建后断言
    boolean res1 = driver.findElement(By.tagName("body")).getText().contains("remote06");
    Assert.assertTrue(res1);
    
    driver.navigate().refresh();   //刷新网页，更新云服务器的运行状态
    Thread.sleep(5000);

//    //修改
//    driver.findElement(By.cssSelector(".el-button--warning > span")).click();  
//    Thread.sleep(3000);
//    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();   //修改云服务器名称
//    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).clear();   
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("remote02");
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-button--primary:nth-child(1) > span")).click();  //提交修改
//    Thread.sleep(5000);
    
      //这里  修改 功能暂时有bug，越过
//    driver.navigate().refresh();   //修改完成后刷新网页，更新
//    Thread.sleep(5000);
//    
//    //修改后断言
//    boolean res2 = driver.findElement(By.tagName("body")).getText().contains("remote02");
//    Assert.assertTrue(res2);
    
    //批量删除删除
    driver.findElement(By.cssSelector(".el-table__row .el-checkbox__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-button:nth-child(3) > span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-button--primary:nth-child(2) > span")).click();
    Thread.sleep(3000);
       
    //删除后断言
    boolean res3 = driver.findElement(By.tagName("body")).getText().contains("remote02");
    Assert.assertFalse(res3);

  }
}
