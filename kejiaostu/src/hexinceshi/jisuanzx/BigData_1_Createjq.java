package hexinceshi.jisuanzx;


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
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 脚本说明：大数据-创建集群
 * @author chain
 *
 */
public class BigData_1_Createjq {
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
  public void createBigDataJq() throws InterruptedException {
    driver.get("http://192.168.1.115:8099/gxzy/");
    //driver.manage().window().setSize(new Dimension(860, 824));
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
    driver.findElement(By.xpath("//span[text()='计算中心']")).click();  //计算中心
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='大数据']")).click();    //大数据
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='创建']")).click();    //创建按钮
    Thread.sleep(3000);
    

    //集群名称
    driver.findElement(By.cssSelector(".el-dialog__body .el-form-item__content > .el-input > .el-input__inner")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".el-dialog__body .el-form-item__content > .el-input > .el-input__inner")).sendKeys("zhsanjiqun");
    Thread.sleep(2000);
    //选择个人分区
    driver.findElement(By.xpath("//span[text()='个人分区']")).click();
    Thread.sleep(2000);
    //个人分区输入框
    driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).click();
    Thread.sleep(2000);
    //选择具体的个人分区
    driver.findElement(By.cssSelector(".el-select-dropdown__item > span")).click();
    Thread.sleep(2000);
    //确定
    driver.findElement(By.cssSelector(".el-form-item__content > .el-button--success:nth-child(1)")).click();
    Thread.sleep(2000);
    //创建集群断言
    boolean res1 = driver.findElement(By.tagName("body")).getText().contains("zhsanjiqun");
    Assert.assertTrue(res1);
  }
}
