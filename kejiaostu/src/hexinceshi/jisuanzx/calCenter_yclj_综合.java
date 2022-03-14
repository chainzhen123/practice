package hexinceshi.jisuanzx;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import static org.testng.Assert.assertTrue;

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

/**
 * 计算中心_远程连接
 * 
 * 远程连接-创建ssh。 验证 创建、修改、删除按钮
 * 运行脚本前需要准备：学生账号、个人分区及名称、云存储文件路径及名称,各名称要与脚本严格对应
 * 用户信息：用户/分区/云存储文件路径：  zhsan5/zhsan5/zhsan5
 * @author chain
 *
 */
public class calCenter_yclj_综合 {
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
  public void yclj() throws InterruptedException {
    driver.get("http://192.168.1.115:8099/gxzy/");
    Thread.sleep(1000);
    //driver.manage().window().setSize(new Dimension(1410, 864));
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("zhsan5");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).sendKeys("12345678");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".cliklogin")).click();
    Thread.sleep(2000);
    //登录断言
    boolean login = driver.findElement(By.tagName("body")).getText().contains("计算中心");
    Assert.assertTrue(login);
    
    driver.findElement(By.cssSelector("ul:nth-child(2) span:nth-child(1)")).click();   //计算中心
    Thread.sleep(2000);
    
    driver.findElement(By.cssSelector("label:nth-child(4) span")).click();   //远程连接
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".btn")).click();   //创建
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
    Thread.sleep(3000);
    
    //创建远程连接任务断言
    boolean res1 = driver.findElement(By.tagName("body")).getText().contains("remote06");
    Assert.assertTrue(res1);
    
    //修改
//    driver.findElement(By.cssSelector(".el-button--warning > span")).click();
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
//    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).clear();  
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("remote07");
//    Thread.sleep(5000);
//    driver.findElement(By.cssSelector(".el-button--primary > span")).click();
//    Thread.sleep(2000);
    
    //修改远程连接断言
//    boolean res2 = driver.findElement(By.tagName("body")).getText().contains("remote07");
//    Assert.assertTrue(res2);
    
    //删除
    driver.findElement(By.cssSelector(".el-button--danger > span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-button--default:nth-child(2) > span")).click();
    Thread.sleep(3000);
    
    //删除远程连接断言
    boolean res3 = driver.findElement(By.tagName("body")).getText().contains("remote07");
    Assert.assertFalse(res3);
    
    
  }
}
