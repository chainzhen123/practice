package hexinceshi.jiaoxuezx;

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
  * 科教平台-学生-教学中心-课程详情-课程标题信息
  * @author chain
  *
  */
public class teachCenter1_stu_course_detail {
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
    driver.findElement(By.cssSelector(".style1:nth-child(1) li:nth-child(2) img")).click(); //点击c++课程进入课程详情
    Thread.sleep(2000);
    
    //检查课程标题的内容
    boolean res1 = driver.findElement(By.tagName("body")).getText().contains("C++程序设计基础");
    boolean res2 = driver.findElement(By.tagName("body")).getText().contains("课时");
    boolean res3 = driver.findElement(By.tagName("body")).getText().contains("授课类型");
    boolean res4 = driver.findElement(By.tagName("body")).getText().contains("正在学习");
    boolean res5 = driver.findElement(By.tagName("body")).getText().contains("最后更新时间");
    boolean res6 = driver.findElement(By.tagName("body")).getText().contains("课程完成时间");   //课程时间正常情况下没有这个字段
    boolean res7 = driver.findElement(By.tagName("body")).getText().contains("管理");
    boolean res8 = driver.findElement(By.tagName("body")).getText().contains("加入学习");
    Assert.assertTrue(res1);
    Assert.assertTrue(res2);
    Assert.assertTrue(res3);
    Assert.assertTrue(res4);
    Assert.assertTrue(res5);
    Assert.assertFalse(res6);
    Assert.assertFalse(res7);     //学生角色没有管理按钮
    Assert.assertTrue(res8);
    Thread.sleep(3000);
    
    
    
      
//    //加入学习
//    driver.findElement(By.cssSelector(".topdiv_footer_right")).click();  
//    Thread.sleep(3000);
//    //加入学习断言
//    boolean res3 = driver.findElement(By.tagName("body")).getText().contains("退出学习");
//    Assert.assertTrue(res3);
//    
//    //退出学习
//    driver.findElement(By.cssSelector(".topdiv_footer_rightout")).click();
//    Thread.sleep(3000);
//    //退出学习断言 
//    boolean res4 = driver.findElement(By.tagName("body")).getText().contains("加入学习");
//    Assert.assertTrue(res4);
//    Thread.sleep(2000);
    
    
       
  }
}

