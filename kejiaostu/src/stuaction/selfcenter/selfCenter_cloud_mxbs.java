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

public class selfCenter_cloud_mxbs {
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
  public void cloud_mxbs() throws InterruptedException {
  	driver.get("http://192.168.1.115:8099/gxzy/");
    Thread.sleep(3000);
    //driver.manage().window().setSize(new Dimension(1128, 733));
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("zhsan3");
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).sendKeys("12345678");
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".cliklogin")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("ul:nth-child(4) span")).click();   //个人中心
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("label:nth-child(3) span")).click();    //云服务器
    Thread.sleep(3000);
    {
        WebElement element = driver.findElement(By.cssSelector(".el-button--success > span"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();     //创建云服务器  悬停
    }
    Thread.sleep(2000);
  //此处通过部分文字定位，远程连接中的方法在这不适用，网页中有重复的元素影响定位
    driver.findElement(By.xpath("//li[contains(text(),'模型部署')]")).click(); //  点击模型部署
    Thread.sleep(2000);
  	    	       
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();   //云服务器名称
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("模型部署");
    Thread.sleep(2000);
    
    driver.findElement(By.cssSelector(".el-form-item:nth-child(2) .el-input__inner")).click();  //镜像名称
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='192.168.1.117/tensorflow/serving:1.15.0']")).click();
    Thread.sleep(2000);
    
    //模型名称
    driver.findElement(By.cssSelector(".el-form-item:nth-child(3) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(3) .el-input__inner")).sendKeys("name");
    Thread.sleep(2000);
    //任务类型
    driver.findElement(By.cssSelector(".radiodiv:nth-child(1) .el-radio__label")).click();
    Thread.sleep(2000);
    //计算资源来源
    driver.findElement(By.cssSelector(".is-bordered:nth-child(1) > .el-radio__label")).click();
    Thread.sleep(2000);
    
    //个人分区
    driver.findElement(By.cssSelector(".el-form-item:nth-child(8) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='zhsan3']")).click();
    Thread.sleep(2000);
    
    //文件路径
    driver.findElement(By.cssSelector(".el-button--success > span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".flix > span:nth-child(2)")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-button:nth-child(5) > span")).click();
    Thread.sleep(2000);
    
    //配额
    driver.findElement(By.cssSelector(".el-form-item:nth-child(12) .el-input__inner")).click();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(12) .el-input__inner")).sendKeys("1");
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(13) .el-input__inner")).click();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(13) .el-input__inner")).sendKeys("0");
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(14) .el-input__inner")).click();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(14) .el-input__inner")).sendKeys("1");
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".el-button--primary:nth-child(1) > span")).click();  //创建
    Thread.sleep(8000);
    
    //创建模型部署后断言
    boolean res1 = driver.findElement(By.tagName("body")).getText().contains("模型部署");
    Assert.assertTrue(res1);
    
    driver.navigate().refresh();   //刷新网页，更新云服务器的运行状态
    Thread.sleep(5000);
    
    //修改
//    driver.findElement(By.cssSelector(".el-button--warning > span")).click();  
//    Thread.sleep(3000);
//    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();   //修改云服务器名称
//    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).clear();   
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("moxing02");
//    Thread.sleep(2000);
//    driver.findElement(By.cssSelector(".el-button--success:nth-child(1) > span")).click();  //提交修改
//    Thread.sleep(5000);
//    
//    //修改模型部署后断言
//    boolean res2 = driver.findElement(By.tagName("body")).getText().contains("moxing02");
//    Assert.assertTrue(res2);
    
    
    //删除
    driver.findElement(By.cssSelector(".is-plain:nth-child(3) > span")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".el-button--primary:nth-child(2) > span")).click();
    Thread.sleep(3000);
    //删除模型部署后断言
    boolean res4 = driver.findElement(By.tagName("body")).getText().contains("moxing02");
    Assert.assertFalse(res4);
   
  }
}
