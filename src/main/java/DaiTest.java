// Generated by Selenium IDE
import net.bytebuddy.utility.RandomString;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static java.lang.Boolean.TRUE;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DaiTest {
  File file= new File("src/main/resources/scriptMutationH1Injection.js");
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  String script, script1;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(10));
    script=HandleScriptJS.fromScriptToString(file);
    script1=HandleScriptJS.fromScriptToString((new File("src/main/resources/scriptSaveStringInLocalStorage.js")));
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void dai() {
    int step=0;
    ArrayList<String> arr = new ArrayList<>();
    driver.get("http://localhost:8080/");
    driver.manage().window().maximize();
    if( (Long)js.executeScript(script,++step) > 0 ){
      arr.add(driver.getPageSource());
    }
    driver.findElement(By.cssSelector("li:nth-child(2) > a")).click();
    if( (Long)js.executeScript(script,++step) > 0 ){
      arr.add(driver.getPageSource());
    }
    driver.findElement(By.id("lastName")).click();
    driver.findElement(By.id("lastName")).sendKeys("davis");
    if( (Long)js.executeScript(script,++step) > 0 ){
      arr.add(driver.getPageSource());
    }
    //driver.findElement(By.id("lastName")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
    if( (Long)js.executeScript(script,++step) > 0 ){
      arr.add(driver.getPageSource());
    }
    driver.findElement(By.linkText("Betty Davis")).click();
    if( (Long)js.executeScript(script,++step) > 0 ){
      arr.add(driver.getPageSource());
    }
    driver.findElement(By.cssSelector("li:nth-child(1) > a")).click();
    if( (Long)js.executeScript(script,++step) > 0 ){
      arr.add(driver.getPageSource());
    }
    driver.findElement(By.cssSelector("li:nth-child(2) > a")).click();
    if( (Long)js.executeScript(script,++step) > 0 ){
      arr.add(driver.getPageSource());
    }
    driver.findElement(By.id("lastName")).click();
    if( (Long)js.executeScript(script,++step) > 0 ){
      arr.add(driver.getPageSource());
    }
    driver.findElement(By.id("lastName")).sendKeys("davis");
    driver.findElement(By.id("lastName")).sendKeys(Keys.ENTER);
    if( (Long)js.executeScript(script,++step) > 0 ){
      arr.add(driver.getPageSource());
    }
    driver.findElement(By.linkText("Harold Davis")).click();
    if( (Long)js.executeScript(script,++step) > 0 ){
      arr.add(driver.getPageSource());
    }
    driver.findElement(By.cssSelector("li:nth-child(1) span:nth-child(2)")).click();
    if( (Long)js.executeScript(script,++step) > 0 ){
      arr.add(driver.getPageSource());
    }
    driver.findElement(By.cssSelector("li:nth-child(2) > a")).click();
    if( (Long)js.executeScript(script,++step) > 0 ){
      arr.add(driver.getPageSource());
    }
    driver.findElement(By.id("lastName")).click();
    driver.findElement(By.id("lastName")).sendKeys("davis");
    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
    if( (Long)js.executeScript(script,++step) > 0 ){
      arr.add(driver.getPageSource());
    }
    //arr=(ArrayList<String>) js.executeScript(HandleScriptJS.fromScriptToString(new File("src/main/resources/scriptSaveStorageOnFile.js")),step);
    File obj;
    for ( String s : arr ) {
      obj= new File("src/main/resources/generateHTML/"+ RandomString.make(3) +".html");
      try {
        obj.createNewFile();
        FileWriter writer = new FileWriter(obj.getCanonicalPath());
        writer.write(s);
        writer.close();
      } catch (IOException e) {
        e.printStackTrace();
      }

    }

  }
}
