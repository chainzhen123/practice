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
  * 科教平台-学生-教学中心-加入学习-退出学习-加入学习-创建交互式开发-开始实验-删除
  * @author chain
  *
  */
public class teachCenter1_jhkf {
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
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("zhsan1");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).sendKeys("12345678");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".cliklogin")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//span[text()='教学中心']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='课程']")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".style1:nth-child(1) li:nth-child(1) img")).click(); //点击java课程进入课程详情
    Thread.sleep(2000);
    
    //加入学习
    driver.findElement(By.cssSelector(".topdiv_footer_right")).click();  
    Thread.sleep(3000);
    //加入学习断言
    boolean res3 = driver.findElement(By.tagName("body")).getText().contains("退出学习");
    Assert.assertTrue(res3);
    
    //退出学习
    driver.findElement(By.cssSelector(".topdiv_footer_rightout")).click();
    Thread.sleep(3000);
    //退出学习断言 
    boolean res4 = driver.findElement(By.tagName("body")).getText().contains("加入学习");
    Assert.assertTrue(res4);
    Thread.sleep(2000);
    //再次加入学习
    driver.findElement(By.cssSelector(".topdiv_footer_right")).click();
    Thread.sleep(3000);
    
    driver.findElement(By.id("tab-Tankage")).click();     //点击云服务器 栏
    Thread.sleep(3000);
    
    {
      WebElement element = driver.findElement(By.cssSelector(".el-dropdown-selfdefine > span"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();          //创建云服务器  悬停
    }
    Thread.sleep(2000);
   
    driver.findElement(By.xpath("//*[text()='交互式开发']")).click();    //  点击交互式开发
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("交互式开发123");    //云服务器名称
       
    driver.findElement(By.cssSelector(".el-form-item:nth-child(2) .el-input__inner")).click();    //镜像类型
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[text()='TensorFlow']")).click();
    Thread.sleep(3000);
    
    
    driver.findElement(By.cssSelector(".is-checked > .el-radio__label")).click();   // 计算资源来源 选择个人分区
    Thread.sleep(3000);
        
    driver.findElement(By.cssSelector(".el-form-item:nth-child(6) .el-input__inner")).click();   //个人分区
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[text()='zhsan1']")).click();  //参考之前的写法
    Thread.sleep(3000);
    
    
    driver.findElement(By.cssSelector(".is-plain > span")).click();    //请选择保存路径，使用xpath来写
    Thread.sleep(5000); 
    //driver.findElement(By.cssSelector(".is-plain > span"));      

      
    driver.findElement(By.cssSelector(".flix")).click();         //点击	选择某一个文件夹,考虑用xpath来写
    Thread.sleep(3000);  
    driver.findElement(By.cssSelector(".el-button--primary > span")).click();     //选择完成
    Thread.sleep(3000);
    
    //资源配额     
    driver.findElement(By.cssSelector(".el-form-item:nth-child(10) .el-input__inner")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(10) .el-input__inner")).sendKeys("1");
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(11) .el-input__inner")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(11) .el-input__inner")).sendKeys("0");
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(12) .el-input__inner")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(12) .el-input__inner")).sendKeys("1");
    Thread.sleep(3000);
    //创建按钮
    driver.findElement(By.cssSelector(".el-form-item__content:nth-child(1) > .el-button--success > span")).click();   
    Thread.sleep(8000);
    
    //创建后断言
    boolean res1 = driver.findElement(By.tagName("body")).getText().contains("交互式开发123");
    Assert.assertTrue(res1);
    
    
    vars.put("window_handles", driver.getWindowHandles());
    vars.put("root", driver.getWindowHandle());
    Thread.sleep(2000);
    
    //开始实验
    driver.findElement(By.cssSelector(".el-table__fixed-body-wrapper .el-button:nth-child(1) > span")).click();         
    Thread.sleep(3000);
    
    driver.switchTo().window(vars.get("root").toString());      //切换回主网页
    Thread.sleep(3000);
    
    //删除交互式开发   
    driver.findElement(By.cssSelector(".el-table__fixed-body-wrapper .el-button--danger")).click();         
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-button--default:nth-child(2) > span")).click();         
    Thread.sleep(3000);
    
    //删除断言
    boolean res2 = driver.findElement(By.tagName("body")).getText().contains("交互式开发123");
    Assert.assertFalse(res2);
    Thread.sleep(2000);
    
    
       
  }
}

