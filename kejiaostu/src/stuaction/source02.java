package stuaction;

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
 * 镜像中心_下载到云存储_上传
 * @author chain
 *
 */
public class source02 {
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
	public void imgagezx() throws InterruptedException {
	 driver.get("http://192.168.1.113:8090/gxzy/");
	 Thread.sleep(3000);
	 driver.manage().window().setSize(new Dimension(1936, 1056));
	 driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("stu2");
	 Thread.sleep(3000);
	 driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.cssSelector(".el-input--suffix > .el-input__inner")).sendKeys("12345678");
	 Thread.sleep(3000);
	 driver.findElement(By.cssSelector(".cliklogin")).click();
	 Thread.sleep(3000);
	 
	 
	 driver.findElement(By.cssSelector("ul:nth-child(3) span:nth-child(1)")).click();   //资源中心
	 Thread.sleep(3000);
	 driver.findElement(By.cssSelector("label:nth-child(3) > .el-menu-item")).click();   //镜像中心
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//span[text()='下载到云存储']")).click();    //点击下载到云存储
	 Thread.sleep(3000);

	 driver.findElement(By.cssSelector(".flix")).click();     //选择一个文件夹
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//span[text()='下载']")).click();
	 Thread.sleep(3000);
	 
	 driver.findElement(By.cssSelector(".el-form-item__content > .el-button--success > span")).click(); //上传镜像
	 Thread.sleep(3000);
	 driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.cssSelector(".el-form-item:nth-child(2) .el-input__inner")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.cssSelector(".el-form-item:nth-child(3) .el-input__inner")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.cssSelector(".el-button--success > span")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.cssSelector(".flix")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.cssSelector(".nivname > span")).click();
	 Thread.sleep(3000);

	 driver.findElement(By.cssSelector(".el-dialog__wrapper:nth-child(2) .el-dialog__close")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.cssSelector(".el-button--primary:nth-child(1) > span")).click();
	 Thread.sleep(3000);

  }
}

