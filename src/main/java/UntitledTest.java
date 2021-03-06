// Generated by Selenium IDE

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class UntitledTest {
  public UntitledTest() {

  }

  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void untitled() {
    driver.get("http://localhost:8080/");
    driver.manage().window().setSize(new Dimension(1550, 838));
    driver.findElement(By.cssSelector("li:nth-child(2) span:nth-child(2)")).click();
    driver.findElement(By.id("lastName")).click();
    driver.findElement(By.id("lastName")).sendKeys("davis");
    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".active span:nth-child(2)")).click();
  }
}
