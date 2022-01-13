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
 * 计算中心_计算概览_训练可视化:创建-删除-修改
 * 运行脚本前需要准备：学生账号、个人分区及名称、云存储文件路径及名称,各名称要与脚本严格对应
 * @author chain
 *
 */
public class calCenter_GL_xlksh {
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
  public void gl_xlksh() throws InterruptedException {
    driver.get("http://192.168.1.115:8099/gxzy/");
    Thread.sleep(2000);
    driver.manage().window().setSize(new Dimension(1936, 1056));
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
    driver.findElement(By.cssSelector("ul:nth-child(2) > li > span")).click();  //计算中心
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='计算概览']")).click();  //计算概览
    Thread.sleep(2000);
    {
      WebElement element = driver.findElement(By.cssSelector(".el-dropdown-selfdefine > span"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();  //创建云服务器   悬停
    }
    Thread.sleep(2000);
    
    driver.findElement(By.cssSelector(".el-dropdown-menu__item:nth-child(5)")).click(); //  点击训练可视化
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
    Thread.sleep(8000);
    
    //创建后断言
    boolean res1 = driver.findElement(By.tagName("body")).getText().contains("训练可视化01");
    Assert.assertTrue(res1);
    
    driver.navigate().refresh();   //刷新网页，更新云服务器的运行状态
    Thread.sleep(5000);

    //修改
    driver.findElement(By.cssSelector(".el-button--warning > span")).click();  
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();   //修改云服务器名称
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).clear();   
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("xunlian02");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-button--success:nth-child(1) > span")).click();  //提交修改
    Thread.sleep(5000);
    
    //修改后断言
    boolean res2 = driver.findElement(By.tagName("body")).getText().contains("xunlian02");
    Assert.assertTrue(res2);
    
    
    //删除
    driver.findElement(By.cssSelector(".el-button--danger:nth-child(2) > span")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".el-button--primary:nth-child(2)")).click();
    Thread.sleep(3000);
    
    //删除后断言
    boolean res3 = driver.findElement(By.tagName("body")).getText().contains("xunlian02");
    Assert.assertFalse(res3);
        
  }
}
