package stuaction;

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

/**
 * 计算中心_训练可视化。验证 创建、修改、删除、启动 按钮
 * 运行脚本前需要准备：学生账号、个人分区及名称、云存储文件路径及名称,各名称要与脚本严格对应
 * @author chain
 *
 */
public class calCenter_xlksh {
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
  public String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }
  
  
  @Test
  public void xlksh() throws InterruptedException {
    driver.get("http://192.168.1.115:8099/gxzy/");
    Thread.sleep(3000);
    driver.manage().window().setSize(new Dimension(1110, 670));
    Thread.sleep(2000);
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
    
    //计算中心
    driver.findElement(By.cssSelector("ul:nth-child(2) > li > span")).click();
    Thread.sleep(2000);
    //人工智能
    driver.findElement(By.cssSelector(".el-submenu__title > span")).click();
    Thread.sleep(2000);
    //训练可视化
    driver.findElement(By.cssSelector("label label:nth-child(3) span")).click();
    Thread.sleep(2000);
    
    //创建
    driver.findElement(By.cssSelector(".el-button--success > span")).click();
    Thread.sleep(2000);
    //云服务器名称
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("训练可视化01");
    Thread.sleep(2000);
    //任务类型
    driver.findElement(By.cssSelector(".el-form-item:nth-child(2) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='TensorBoard ']")).click();
    Thread.sleep(2000);
    
    //计算资源来源
    driver.findElement(By.cssSelector(".el-radio:nth-child(1) > .el-radio__label")).click();
    Thread.sleep(2000);
    //个人分区
    driver.findElement(By.cssSelector(".el-form-item:nth-child(5) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='zhsan1']")).click();
    Thread.sleep(2000);
    //文件路径
    driver.findElement(By.cssSelector(".is-plain > span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".flix > span:nth-child(2)")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-button--primary > span")).click();
    Thread.sleep(2000);
     
    
    //配额
    driver.findElement(By.cssSelector(".el-form-item:nth-child(9) .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-form-item:nth-child(9) .el-input__inner")).sendKeys("1");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(10) .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-form-item:nth-child(10) .el-input__inner")).sendKeys("0");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(11) .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-form-item:nth-child(11) .el-input__inner")).sendKeys("1");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item__content:nth-child(1) > .el-button--success > span")).click();
    Thread.sleep(2000);
    
    //创建训练可视化任务断言
    boolean res1 = driver.findElement(By.tagName("body")).getText().contains("训练可视化01");
    Assert.assertTrue(res1);  
    
    //修改
    driver.findElement(By.cssSelector(".el-button--warning > span")).click();
    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(1) .el-input__inner")).click();
    Thread.sleep(2000);
    //将原有的文本内容清空
    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(1) .el-input__inner")).clear();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(1) .el-input__inner")).sendKeys("训练可视化012");
    driver.findElement(By.cssSelector(".el-button--success:nth-child(1) > span")).click(); 
    Thread.sleep(3000);    
    
    //修改训练可视化任务断言
    boolean res2 = driver.findElement(By.tagName("body")).getText().contains("训练可视化012");
    Assert.assertTrue(res2);
    
    vars.put("window_handles", driver.getWindowHandles());  
    vars.put("root", driver.getWindowHandle());
    driver.findElement(By.xpath("//span[text()='启动']")).click();
    Thread.sleep(5000);
    //切回主网页
    driver.switchTo().window(vars.get("root").toString());
    Thread.sleep(3000);
    
    //删除
    driver.findElement(By.cssSelector(".el-button--danger > span")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".el-button--default:nth-child(2) > span")).click();
    Thread.sleep(3000);
    
    //删除训练可视化任务断言
    boolean res3 = driver.findElement(By.tagName("body")).getText().contains("训练可视化012");
    Assert.assertFalse(res3);
    
  }
}
