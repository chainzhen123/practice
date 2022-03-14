package hexinceshi.gerenzx;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * 脚本说明：创建文件夹：新建文件夹1、新建文件夹2--复制2到1中--删除1中的2--
 *         剪切2到1中--压缩1-删除1-解压1.zip-（下载和重命名保留）-数据恢复
 * @author chain
 *
 */
public class selfCenter_yuncc1 {
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
public void ycc123() throws InterruptedException {
    driver.get("http://192.168.1.115:8099/gxzy/");
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
    
    //个人中心
    driver.findElement(By.cssSelector("ul:nth-child(4) span")).click();
    Thread.sleep(2000);
    //云存储
    driver.findElement(By.cssSelector("label:nth-child(4) span")).click();
    Thread.sleep(2000);
    
    //1、定位到‘大小’文字的位置,然后右键单击操作
    WebElement el = driver.findElement(By.xpath("//div[text()='大小']"));
    Actions action = new Actions(driver);
    action.contextClick(el).perform();
    Thread.sleep(3000);   
    driver.findElement(By.xpath("//li[contains(text(),'创建文件夹')]")).click();
    Thread.sleep(2000);
    //文件夹名字
    driver.findElement(By.cssSelector(".el-form-item__content .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-form-item__content .el-input__inner")).sendKeys("新建文件夹1");
    //确定
    driver.findElement(By.cssSelector(".el-button--success:nth-child(1) > span")).click();
    //刷新页面
    driver.navigate().refresh();
    Thread.sleep(3000);
    boolean res1 = driver.findElement(By.tagName("body")).getText().contains("新建文件夹1");
    Assert.assertTrue(res1);
    
    //2、再次创建一个文件夹
    //定位到‘大小’文字的位置,然后右键单击操作
    WebElement el2 = driver.findElement(By.xpath("//div[text()='大小']"));
    Actions action2 = new Actions(driver);
    action2.contextClick(el2).perform();
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("//li[contains(text(),'创建文件夹')]")).click();
    Thread.sleep(2000);
    //文件夹名字
    driver.findElement(By.cssSelector(".el-form-item__content .el-input__inner")).click();
    driver.findElement(By.cssSelector(".el-form-item__content .el-input__inner")).sendKeys("新建文件夹2");
    //确定
    driver.findElement(By.cssSelector(".el-button--success:nth-child(1) > span")).click();
    //刷新页面
    driver.navigate().refresh();
    Thread.sleep(3000);  
    boolean res2 = driver.findElement(By.tagName("body")).getText().contains("新建文件夹2");
    Assert.assertTrue(res2);
    
    
    //3、复制文件夹2到文件夹1中
    //选中新建文件夹2右键单击复制
    WebElement el3 = driver.findElement(By.xpath("//div[contains(text(),'新建文件夹2')]"));
    Actions action3 = new Actions(driver);
    action3.contextClick(el3).perform();
    Thread.sleep(3000);    
    driver.findElement(By.xpath("//li[contains(text(),'复制')]")).click();
    Thread.sleep(2000);
    //双击进入文件夹1，执行粘贴操作
    WebElement el4 = driver.findElement(By.xpath("//div[contains(text(),'新建文件夹1')]"));
    Actions action4 = new Actions(driver);
    action4.doubleClick(el4).perform();
    Thread.sleep(2000);   
    WebElement el5 = driver.findElement(By.xpath("//div[text()='大小']"));
    Actions action5 = new Actions(driver);
    action5.contextClick(el5).perform();
    Thread.sleep(3000);    
    driver.findElement(By.xpath("//li[contains(text(),'粘贴')]")).click();
    Thread.sleep(2000);
    
    //4、将复制的新建文件夹2删除掉
    WebElement el6 = driver.findElement(By.xpath("//div[contains(text(),'新建文件夹2')]"));
    Actions action6 = new Actions(driver);
    action6.contextClick(el6).perform();
    Thread.sleep(3000);    
    driver.findElement(By.xpath("//li[contains(text(),'删除')]")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".dialog-footer > .el-button--primary > span")).click();
    Thread.sleep(2000);
        
    //刷新页面
    driver.navigate().refresh();
    Thread.sleep(3000);
    
    
    //5、剪切文件夹2到文件夹1中
    //选中新建文件夹2右键单击剪切
    WebElement el7 = driver.findElement(By.xpath("//div[contains(text(),'新建文件夹2')]"));
    Actions action7 = new Actions(driver);
    action7.contextClick(el7).perform();
    Thread.sleep(3000);    
    driver.findElement(By.xpath("//li[contains(text(),'剪切')]")).click();
    Thread.sleep(2000);
    //双击进入文件夹1，执行粘贴操作
    WebElement el8 = driver.findElement(By.xpath("//div[contains(text(),'新建文件夹1')]"));
    Actions action8 = new Actions(driver);
    action8.doubleClick(el8).perform();
    Thread.sleep(2000);   
    WebElement el9 = driver.findElement(By.xpath("//div[text()='大小']"));
    Actions action9 = new Actions(driver);
    action9.contextClick(el9).perform();
    Thread.sleep(3000);    
    driver.findElement(By.xpath("//li[contains(text(),'粘贴')]")).click();
    Thread.sleep(2000);    
    //刷新页面，回到新建文件夹1页面
    driver.navigate().refresh();
    Thread.sleep(2000);
    
    
    
    //6、将新建文件夹1压缩-删除掉新建文件夹1-下载新建文件夹1.zip-解压缩新建文件夹1.zip-重命名操作--数据恢复（文件夹全部删除）
    //压缩
    WebElement el10 = driver.findElement(By.xpath("//div[contains(text(),'新建文件夹1')]"));
    Actions action10 = new Actions(driver);
    action10.contextClick(el10).perform();
    Thread.sleep(3000);    
    driver.findElement(By.xpath("//li[contains(text(),'压缩文件')]")).click();
    Thread.sleep(2000);
    //删除
    WebElement el11 = driver.findElement(By.xpath("//div[contains(text(),'新建文件夹1')]"));
    Actions action11 = new Actions(driver);
    action11.contextClick(el11).perform();
    Thread.sleep(3000);    
    driver.findElement(By.xpath("//li[contains(text(),'删除')]")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".dialog-footer > .el-button--primary > span")).click();
    Thread.sleep(2000);
        
    
    //下载压缩文件？
//    WebElement el12 = driver.findElement(By.xpath("//div[contains(text(),'新建文件夹1.zip')]"));
//    Actions action12 = new Actions(driver);
//    action12.contextClick(el12).perform();
//    Thread.sleep(3000);    
//    driver.findElement(By.xpath("//li[contains(text(),'下载')]")).click();
//    Thread.sleep(8000);
    
    //解压缩文件夹1.zip
    WebElement el13 = driver.findElement(By.xpath("//div[contains(text(),'新建文件夹1.zip')]"));
    Actions action13 = new Actions(driver);
    action13.contextClick(el13).perform();
    Thread.sleep(3000);    
    driver.findElement(By.xpath("//li[contains(text(),'解压文件')]")).click();
    Thread.sleep(2000);
       
    //重命名操作（保留）？
        
    //数据恢复(删除)
    WebElement el14 = driver.findElement(By.xpath("//div[contains(text(),'新建文件夹1')]"));
    Actions action14 = new Actions(driver);
    action14.contextClick(el14).perform();
    Thread.sleep(3000);    
    driver.findElement(By.xpath("//li[contains(text(),'删除')]")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".dialog-footer > .el-button--primary > span")).click();
    Thread.sleep(2000);
    
    WebElement el15 = driver.findElement(By.xpath("//div[contains(text(),'新建文件夹1')]"));
    Actions action15 = new Actions(driver);
    action15.contextClick(el15).perform();
    Thread.sleep(3000);    
    driver.findElement(By.xpath("//li[contains(text(),'删除')]")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".dialog-footer > .el-button--primary > span")).click();
    Thread.sleep(2000);
    boolean res3 = driver.findElement(By.tagName("body")).getText().contains("新建文件夹1");
    Assert.assertFalse(res3);
    
  }
}
