package stuaction;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;


//@Listeners({TestReport.class})
public class zhsan1{
	
		private WebDriver driver;
	    private Map<String, Object> vars;
	    JavascriptExecutor js;
		Actions action=null;
	  
	 
@BeforeClass
public void setUp() {
		System.setProperty("webdriver.gecko.driver","C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe");
	    driver = new FirefoxDriver();
	    js = (JavascriptExecutor) driver;
	    vars = new HashMap<String, Object>();
	    action = new Actions(driver);
	  }
	  
	  
@AfterClass
public void tearDown() {
	    driver.quit();
	  }
  
@Test
public void zhsan1() throws InterruptedException {  
	    driver.get("http://192.168.1.115:8099/gxzy/#/Login");
	    Thread.sleep(3000);
	    //driver.manage().window().setSize(new Dimension(1410, 864));
	    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("zhsan1");
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).sendKeys("12345678");
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".cliklogin")).click();
	    Thread.sleep(2000);
	    
	    //登录断言
	    boolean login = driver.findElement(By.tagName("body")).getText().contains("课程");
	    Assert.assertTrue(login);
	    System.out.println("登录断言结:"+login);
	   
	    
	    driver.findElement(By.cssSelector("ul:nth-child(2) span:nth-child(1)")).click();   //计算中心
	    Thread.sleep(2000);
	    
	    //切换到计算中心断言
	    boolean calcenter = driver.findElement(By.tagName("body")).getText().contains("计算概览");
	    Assert.assertTrue(calcenter);
	    
	    driver.findElement(By.cssSelector("label:nth-child(4) span")).click();   //远程连接
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".btn")).click();   //创建
	    Thread.sleep(2000);
	    
	    //创建远程连接断言
	    boolean yuan = driver.findElement(By.tagName("body")).getText().contains("创建远程连接");
	    Assert.assertTrue(yuan);
	    
	    //云服务器
	    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("zhsan1");  
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
	    driver.findElement(By.cssSelector(".el-form-item:nth-child(5) .el-input__inner")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()='zhsan1']")).click();
	    Thread.sleep(2000);
	    //选择路径
	    driver.findElement(By.cssSelector(".el-button--success")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("div:nth-child(1) > .flix")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".el-button:nth-child(5) > span")).click();
	    Thread.sleep(2000);
	    
	    //配额
	    driver.findElement(By.cssSelector(".el-form-item:nth-child(9) .el-input__inner")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".el-form-item:nth-child(9) .el-input__inner")).sendKeys("1");
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".el-form-item:nth-child(10) .el-input__inner")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".el-form-item:nth-child(10) .el-input__inner")).sendKeys("0");
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".el-form-item:nth-child(11) .el-input__inner")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".el-form-item:nth-child(11) .el-input__inner")).sendKeys("1");
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".el-button--primary:nth-child(1) > span")).click();
	    Thread.sleep(2000);
	    
	    //创建远程连接后结果断言
	    boolean create1 = driver.findElement(By.tagName("body")).getText().contains("zhsan1");
	    Assert.assertTrue(create1);
	    Thread.sleep(8000);
	    boolean status1 = driver.findElement(By.tagName("body")).getText().contains("运行中");
	    Assert.assertTrue(status1);
	    
	}  
}
