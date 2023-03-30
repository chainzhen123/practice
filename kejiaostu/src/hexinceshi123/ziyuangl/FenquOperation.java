package hexinceshi.ziyuangl;


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
 *  脚本说明：管理员给zhsan1创建分区（断言）-查询分区（断言）-修改分区（断言）-查询分区（断言）-删除分区（断言）
 */
public class FenquOperation {
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
  public void fenquOpera() throws InterruptedException {
    driver.get("http://192.168.1.115:8099/gxzy/");
    Thread.sleep(2000);
    driver.manage().window().setSize(new Dimension(1550, 838));
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).sendKeys("12345678");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("changing");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".cliklogin")).click();
    Thread.sleep(2000);
    //资源管理
    driver.findElement(By.cssSelector("ul:nth-child(2) span")).click();
    Thread.sleep(2000);
    //集群管理
    driver.findElement(By.cssSelector("label:nth-child(2) span")).click();
    Thread.sleep(2000);
    //创建分区
    driver.findElement(By.cssSelector(".addsubarea > span")).click();
    Thread.sleep(2000);
    //资源参数
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) > .el-form-item__content > .el-input > .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) > .el-form-item__content > .el-input > .el-input__inner")).sendKeys("zhsan1defen");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(2) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(2) .el-input__inner")).sendKeys("2");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(3) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(3) .el-input__inner")).sendKeys("0");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(4) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form--label-right > .el-form-item:nth-child(4) .el-input__inner")).sendKeys("2");
    Thread.sleep(2000); 
    //选择分配用户
    driver.findElement(By.cssSelector(".el-form-item__content > .el-button--default > span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".tableleft .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".tableleft .el-input__inner")).sendKeys("zhsan1");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(2) span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".cell > .el-button--success > span")).click();
    Thread.sleep(2000);
    //创建按钮
    driver.findElement(By.cssSelector(".el-form-item__content > .is-plain:nth-child(1) > span")).click();
    Thread.sleep(2000);
    //创建断言
    boolean res1 = driver.findElement(By.tagName("body")).getText().contains("zhsan1defen");
    Assert.assertTrue(res1);
    
    //搜索分区
    driver.findElement(By.cssSelector(".el-form:nth-child(3) > .el-form-item:nth-child(2) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form:nth-child(3) > .el-form-item:nth-child(2) .el-input__inner")).sendKeys("zhsan1defen");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(6) .el-button--primary > span")).click();
    Thread.sleep(2000);
    
    //修改
    driver.findElement(By.cssSelector(".el-button--small:nth-child(1) > span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(8) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(8) .el-input__inner")).clear();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form-item:nth-child(8) .el-input__inner")).sendKeys("3");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".subbtn:nth-child(1) > span")).click();  //修改
    Thread.sleep(2000);   
    driver.findElement(By.cssSelector(".el-button--default:nth-child(2) > span")).click();  //确认
    Thread.sleep(2000);
    
     //搜索删除
    driver.findElement(By.cssSelector(".el-form:nth-child(3) > .el-form-item:nth-child(2) .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form:nth-child(3) > .el-form-item:nth-child(2) .el-input__inner")).clear();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-form:nth-child(3) > .el-form-item:nth-child(2) .el-input__inner")).sendKeys("zhsan1defen");
    Thread.sleep(2000);
    //搜索按钮
    driver.findElement(By.cssSelector(".el-form-item:nth-child(6) .el-button--primary > span")).click();
    Thread.sleep(2000);
    //删除
    driver.findElement(By.cssSelector(".cell > .el-button--small:nth-child(2) > span")).click();
    Thread.sleep(2000);
    //确认
    driver.findElement(By.cssSelector(".el-button--default:nth-child(2)")).click();
    Thread.sleep(2000);
    //删除断言
    boolean res2 = driver.findElement(By.tagName("body")).getText().contains("删除成功");
    Assert.assertTrue(res2);
    Thread.sleep(2000);
        
  }
}
