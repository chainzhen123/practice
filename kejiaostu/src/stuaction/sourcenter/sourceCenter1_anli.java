package stuaction.sourcenter;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
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
 * 案例中心_fork_运行
 * @author chain
 *
 */
public class sourceCenter1_anli {
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
  public void fork() throws InterruptedException {
    driver.get("http://192.168.1.115:8099/gxzy/");
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("zhsan1");
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).sendKeys("12345678");
    driver.findElement(By.cssSelector(".cliklogin")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("ul:nth-child(3) span:nth-child(1)")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".is-active > span")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".bods:nth-child(1) > .left > img")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".el-button--success > span")).click();   //fork
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("div:nth-child(1) > .flix")).click(); 
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".el-button:nth-child(5) > span")).click();
    Thread.sleep(3000);   
    
    //以下是运行，上面代码包括fork操作
    driver.findElement(By.cssSelector(".el-button--primary > span")).click();  // 运行按钮
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(2) .el-input__inner")).click();  //镜像类型
    Thread.sleep(3000);
    driver.findElement(By.xpath("//span[text()='TensorFlow']")).click();    //选择TensorFlow
    Thread.sleep(3000);    
    driver.findElement(By.cssSelector(".is-checked > .el-radio__label")).click();   //计算资源来源
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(6) .el-input__inner")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//span[text()='zhsan1']")).click();
    Thread.sleep(3000);
    
    driver.findElement(By.cssSelector(".is-plain > span")).click();  //选择保存路径   
    Thread.sleep(3000);
    //
    driver.findElement(By.cssSelector("div:nth-child(1) > .flix")).click();   //
    Thread.sleep(3000);                         
    driver.findElement(By.cssSelector(".el-button--primary > span")).click();  //选择完成
    Thread.sleep(3000);
       
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
    driver.findElement(By.cssSelector(".el-button--success:nth-child(1) > span")).click();
    Thread.sleep(3000);
  }
}

