package teacheraction.teachcenter;

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
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;

 /**
  * 科教平台-教师-教学中心-报告与任务：报告--审批、详情、导出文档/文档与报告；任务-创建、提交报告、修改与详情
  * 注意：该教师需所是选课程的授课老师才可以。
  * @author chain
  *
  */
public class teachCenter5_taskreport {
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
  
  @Test
  public void Test1234() throws InterruptedException, AWTException {
	Robot robot = new Robot();
  	driver.get("http://192.168.1.115:8099/gxzy/");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("Teacherzhao");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).sendKeys("1234567899");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".cliklogin")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='教学中心']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='课程']")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".style1:nth-child(1) li:nth-child(2) img")).click();  //选择课程
    Thread.sleep(3000);
    
    //验证是【授课中】，即为该课程的授课教师
    boolean res1 = driver.findElement(By.tagName("body")).getText().contains("管理");
    Assert.assertTrue(res1);
    
    //点击任务栏，创建一条任务，验证任务的名称，修改和详情按钮即可，
    driver.findElement(By.cssSelector("#tab-task")).click();
    Thread.sleep(3000);
    
    //如果不存在任务  则创建一个
    
    
    //断言‘创建’按钮是否存在
    boolean res2 = driver.findElement(By.tagName("body")).getText().contains("创建");
    Assert.assertTrue(res2);
    
    //断言‘提交报告’是否存在
    boolean res3 = driver.findElement(By.tagName("body")).getText().contains("提交报告");
    Assert.assertTrue(res3);
    
    //断言‘修改’按钮是否存在
    boolean res4 = driver.findElement(By.tagName("body")).getText().contains("修改");
    Assert.assertTrue(res4);
    
    //断言‘详情’按钮是否存在
    boolean res5 = driver.findElement(By.tagName("body")).getText().contains("详情");
    Assert.assertTrue(res5);
    
    
    //提交报告操作 
//    driver.findElement(By.cssSelector(".el-button--info:nth-child(1) > span")).click();   //提交报告
//    Thread.sleep(3000);
//    driver.findElement(By.cssSelector(".uploadIcon")).click();   //上传报告按钮
//    Thread.sleep(2000);
//    
//    //指定PDF文档的路径
//    StringSelection selection=new StringSelection("D:\\Paxos Made Simple.pdf");
//    //把图片路径复制到剪切板
//    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
//    System.out.println("selection"+selection);
//    
//
//    //上传文件
//    driver.findElement(By.cssSelector(".el-upload-dragger")).click();
//    
//    //按下Ctrl+V
//    robot.keyPress(KeyEvent.VK_CONTROL);
//    robot.keyPress(KeyEvent.VK_V);
//
//    //释放Ctrl+V
//    robot.keyRelease(KeyEvent.VK_CONTROL);
//    robot.keyRelease(KeyEvent.VK_V);
//    Thread.sleep(2000);
//    //点击回车
//    robot.keyPress(KeyEvent.VK_ENTER);
//    robot.keyRelease(KeyEvent.VK_ENTER);
//    Thread.sleep(3000);
//    
//    //提交按钮   
//    driver.findElement(By.cssSelector(".el-form-item__content > .el-button--success > span")).click();
//    Thread.sleep(5000);
    
    //点击报告栏，验证仅导出、导出报告与文档、详情、审批
    driver.findElement(By.cssSelector("#tab-third")).click();
    Thread.sleep(3000);
    
    boolean res6 = driver.findElement(By.tagName("body")).getText().contains("仅批量导出报告");
    Assert.assertTrue(res6);
    Thread.sleep(2000);
    boolean res7 = driver.findElement(By.tagName("body")).getText().contains("批量导出报告与文档");
    Assert.assertTrue(res7);
    Thread.sleep(2000);
    boolean res8 = driver.findElement(By.tagName("body")).getText().contains("详情");
    Assert.assertTrue(res8);
    Thread.sleep(2000);
    boolean res9 = driver.findElement(By.tagName("body")).getText().contains("审批");
    Assert.assertTrue(res9);
    Thread.sleep(2000);
    
    
    //审批操作，审完之后验证UI‘已审批’    TUDO   
//    boolean res10 = driver.findElement(By.tagName("body")).getText().contains("已审批");
//    Assert.assertTrue(res10);
                  
  }
}

