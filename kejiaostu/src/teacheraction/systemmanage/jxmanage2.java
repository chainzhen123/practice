package teacheraction.systemmanage;

import org.junit.Before;
import org.junit.After;
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
import org.testng.annotations.Test;

import junit.framework.Assert;

import org.openqa.selenium.JavascriptExecutor;
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
 * 系统管理-教学管理-课程管理-课时管理：课时添加、查看、修改、删除.    说明：课时添加时需要指定文件绝对路径，代码111行
 * 备注：此处使用 Robot类进行文件上传
 * @author chain
 *
 */
public class jxmanage2 {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  
  @BeforeClass
  public void setUp() throws AWTException {
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
  public void kechcrede() throws InterruptedException, AWTException {
	//新建一个Robot对象
	Robot robot = new Robot();
    driver.get("http://192.168.1.115:8099/gxzy/");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("teach02");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).sendKeys("12345678");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".cliklogin")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".headertitle > ul:nth-child(1) span")).click();   //系统管理
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-menu-item > span")).click();  //教学管理
    Thread.sleep(2000);
    //创建课程
    driver.findElement(By.cssSelector("#coursemanagement > .el-row .el-button:nth-child(2) > span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-input:nth-child(2) > .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-input:nth-child(2) > .el-input__inner")).sendKeys("456");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-dialog__footer:nth-child(3) .el-button--primary > span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item__content:nth-child(1) span")).click();
    Thread.sleep(2000);
    
    //搜索课程
    driver.findElement(By.cssSelector("#coursemanagement .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("#coursemanagement .el-input__inner")).sendKeys("456");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("#coursemanagement .header .el-button:nth-child(1) > span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-button--warning:nth-child(1) > span")).click();
    Thread.sleep(2000);
    
    //默认计划设置
    driver.findElement(By.id("tab-CourseSetting")).click();
    Thread.sleep(2000);
    //课时管理
    driver.findElement(By.id("tab-ClassHourManagement")).click();
    Thread.sleep(2000);
    
    //   添加课时
    
    //指定PDF文档的路径
    StringSelection selection=new StringSelection("D:\\Paxos Made Simple.pdf");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
    //把PDF文件路径复制到剪切板
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
    System.out.println("selection"+selection);
    
   //点击添加课时按钮
    driver.findElement(By.cssSelector(".right span")).click();
    //上传文件
    driver.findElement(By.cssSelector(".el-upload-dragger")).click();
    
    //按下Ctrl+V
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);

    //释放Ctrl+V
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.keyRelease(KeyEvent.VK_V);
    Thread.sleep(2000);
    //点击回车
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(3000);
    
    //开始上传
    driver.findElement(By.cssSelector(".el-button--small > span")).click();
    Thread.sleep(8000);
       
    vars.put("window_handles", driver.getWindowHandles());
    vars.put("root", driver.getWindowHandle()); 
    //查看课时
    driver.findElement(By.cssSelector(".marrighht > span")).click();
    
    Thread.sleep(5000);    
    //切换回主网页
    driver.switchTo().window(vars.get("root").toString());   
    Thread.sleep(2000);
    
    //修改
    driver.findElement(By.cssSelector(".el-button--warning > span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).clear();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("18.HADOOP权威指南 123");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-button--primary > span")).click();
    Thread.sleep(2000);
    //修改断言
    boolean res1 = driver.findElement(By.tagName("body")).getText().contains("18.HADOOP权威指南 123");
    Assert.assertTrue(res1);
    Thread.sleep(2000);
    
    //删除
    driver.findElement(By.cssSelector(".el-button--danger > span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-button--primary > span")).click();
    Thread.sleep(2000);
    //删除断言
    boolean res2 = driver.findElement(By.tagName("body")).getText().contains("18.HADOOP权威指南 123");
    Assert.assertFalse(res2);
    Thread.sleep(2000);
    
  }
}
