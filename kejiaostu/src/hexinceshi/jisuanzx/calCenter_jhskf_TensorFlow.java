package hexinceshi.jisuanzx;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

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
 * 计算中心_交互式开发。验证 创建、修改、删除、开始编程 按钮
 * 运行脚本前需要准备：学生账号、个人分区及名称、云存储文件路径及名称,各名称要与脚本严格对应
 * 用户信息：用户/分区/云存储文件路径：  zhsan1/zhsan1/zhsan1
 * @author chain
 *
 */
public class calCenter_jhskf_TensorFlow {
	
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
   
  //@Parameters({"url","username","password","imagename"})
  @Test
  public void jhskf() throws InterruptedException {
    driver.get("http://192.168.1.115:8099/gxzy/#/Login");
    Thread.sleep(2000);
    //driver.manage().window().setSize(new Dimension(1936, 1056));
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("zhsan1");
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).click();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).sendKeys("12345678");
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".cliklogin")).click();
    Thread.sleep(2000);
    
    
    driver.findElement(By.cssSelector("ul:nth-child(2) span:nth-child(1)")).click();   //计算中心
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-submenu__title > span")).click();  //人工智能
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("label > .menutree > label:nth-child(1) span")).click();  //交互式开发
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-button--success")).click();  //创建
    Thread.sleep(2000);
    
    //云服务器名称
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("jiaohushi01");
    Thread.sleep(2000);
    //镜像类型
    driver.findElement(By.cssSelector(".el-form-item:nth-child(2) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='TensorFlow']")).click();    
    Thread.sleep(2000);
    //计算资源来源和选择个人分区
    driver.findElement(By.cssSelector(".is-checked > .el-radio__label")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(6) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='zhsan1']")).click();
    Thread.sleep(2000);
    //云存储路径
    driver.findElement(By.cssSelector(".is-plain > span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("div:nth-child(1) > .flix > span:nth-child(2)")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-button--primary > span")).click();
    Thread.sleep(2000);
    //配额
    driver.findElement(By.cssSelector(".el-form-item:nth-child(10) .el-input__inner")).click();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(10) .el-input__inner")).sendKeys("1");
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(11) .el-input__inner")).click();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(11) .el-input__inner")).sendKeys("0");
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(12) .el-input__inner")).click();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(12) .el-input__inner")).sendKeys("1");
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".el-form-item__content:nth-child(1) > .el-button--success > span")).click();
    Thread.sleep(2000);
    
    //创建交互式开发断言
    boolean res1 = driver.findElement(By.tagName("body")).getText().contains("jiaohushi");
    Assert.assertTrue(res1);
    
    //修改
//    driver.findElement(By.cssSelector(".el-button--warning > span")).click();
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(1) .el-input__inner")).click();
//    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(1) .el-input__inner")).clear();  //清空文本框中的内容
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(1) .el-input__inner")).sendKeys("jiaohushi01");
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-button--success:nth-child(1) > span")).click();
//    Thread.sleep(5000);
    
    //修改交互式开发断言
//    boolean res2 = driver.findElement(By.tagName("body")).getText().contains("jiaohushi01");
//    Assert.assertTrue(res2);
    
    Thread.sleep(5000);
    vars.put("window_handles", driver.getWindowHandles());
    vars.put("root", driver.getWindowHandle());
    //运行
    driver.findElement(By.cssSelector(".el-button--small:nth-child(1) > span")).click();  //运行
    Thread.sleep(2000);
     
    driver.switchTo().window(vars.get("root").toString());      //切换回主网页
    Thread.sleep(2000);
    
    driver.findElement(By.cssSelector(".el-button--danger > span")).click();  //删除
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-button--default:nth-child(2) > span")).click();   //确定
    Thread.sleep(3000);
   
    //删除交互式开发断言
    boolean res3 = driver.findElement(By.tagName("body")).getText().contains("jiaohushi01");
    Assert.assertFalse(res3);
    
   
  }
}
