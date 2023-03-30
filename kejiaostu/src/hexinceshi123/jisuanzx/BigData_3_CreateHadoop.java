package hexinceshi.jisuanzx;

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
import org.openqa.selenium.JavascriptExecutor;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 脚本说明：创建一主一从模式的hadoop
 * @author chain
 *
 */
public class BigData_3_CreateHadoop {
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
  public void createhadoop() throws InterruptedException {
    driver.get("http://192.168.1.115:8099/gxzy/");
    Thread.sleep(3000);
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
    driver.findElement(By.xpath("//span[text()='计算中心']")).click();
    Thread.sleep(2000);
    //大数据
    driver.findElement(By.xpath("//span[text()='大数据']")).click();
    Thread.sleep(2000);
    //进入集群详情
    driver.findElement(By.cssSelector(".cell > .el-button--primary > span")).click();
    Thread.sleep(2000);
    //创建按钮
    driver.findElement(By.cssSelector(".btn > span")).click();
    Thread.sleep(2000);
    //选择创建的类型
    driver.findElement(By.cssSelector(".selectipt .el-input__inner")).click();
    Thread.sleep(2000);
    //选择hadoop
    driver.findElement(By.xpath("//span[text()='Hadoop']")).click();
    Thread.sleep(2000);
    //点击确定
    driver.findElement(By.cssSelector(".el-button--primary:nth-child(2) > span")).click();
    Thread.sleep(2000);
    //HDFS-Name
    driver.findElement(By.cssSelector(".disflex:nth-child(4) > div:nth-child(1) > .el-form-item:nth-child(2) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".disflex:nth-child(4) > div:nth-child(1) > .el-form-item:nth-child(2) .el-input__inner")).sendKeys("1");   
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".disflex:nth-child(4) > div:nth-child(1) > .el-form-item:nth-child(3) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".disflex:nth-child(4) > div:nth-child(1) > .el-form-item:nth-child(3) .el-input__inner")).sendKeys("1");
    Thread.sleep(2000);
    //HDFS-Data
    driver.findElement(By.cssSelector(".disflex:nth-child(4) > div:nth-child(2) > .el-form-item:nth-child(2) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".disflex:nth-child(4) > div:nth-child(2) > .el-form-item:nth-child(2) .el-input__inner")).sendKeys("1");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".disflex:nth-child(4) > div:nth-child(2) > .el-form-item:nth-child(3) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".disflex:nth-child(4) > div:nth-child(2) > .el-form-item:nth-child(3) .el-input__inner")).sendKeys("1");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".disflex:nth-child(4) .is-required:nth-child(4) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".disflex:nth-child(4) .is-required:nth-child(4) .el-input__inner")).sendKeys("1");
    Thread.sleep(2000);
    //Yarn-Name
    driver.findElement(By.cssSelector(".disflex:nth-child(5) > div:nth-child(1) > .el-form-item:nth-child(2) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".disflex:nth-child(5) > div:nth-child(1) > .el-form-item:nth-child(2) .el-input__inner")).sendKeys("1");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".disflex:nth-child(5) > div:nth-child(1) > .el-form-item:nth-child(3) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".disflex:nth-child(5) > div:nth-child(1) > .el-form-item:nth-child(3) .el-input__inner")).sendKeys("1");
    Thread.sleep(2000);
    //Yarn-Data
    driver.findElement(By.cssSelector(".disflex:nth-child(5) > div:nth-child(2) > .el-form-item:nth-child(2) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".disflex:nth-child(5) > div:nth-child(2) > .el-form-item:nth-child(2) .el-input__inner")).sendKeys("4");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".disflex:nth-child(5) > div:nth-child(2) > .el-form-item:nth-child(3) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".disflex:nth-child(5) > div:nth-child(2) > .el-form-item:nth-child(3) .el-input__inner")).sendKeys("6");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".disflex:nth-child(5) .is-required:nth-child(4) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".disflex:nth-child(5) .is-required:nth-child(4) .el-input__inner")).sendKeys("1");
    Thread.sleep(2000);
    //创建按钮
    driver.findElement(By.cssSelector(".el-button--success > span")).click();
    Thread.sleep(2000);
    //创建断言
    boolean res1 = driver.findElement(By.tagName("body")).getText().contains("hdfs");
    Assert.assertTrue(res1);
    
    //进入hadoop详情页面
    driver.findElement(By.xpath("//div[contains(text(),'hdfs')]")).click();
    Thread.sleep(5000);
    
    
    
    //YARN-NameNode 8088端口映射
    {
      WebElement element = driver.findElement(By.cssSelector(".el-table__row:nth-child(3) span"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    Thread.sleep(3000);
    //端口映射断言
    boolean res3 = driver.findElement(By.tagName("body")).getText().contains("8088");
    Assert.assertTrue(res3);
    
    //返回
    driver.findElement(By.cssSelector(".el-icon-back")).click();
    Thread.sleep(3000);
    
    
    

    
  }
}
