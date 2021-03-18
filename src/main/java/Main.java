import com.google.common.base.Charsets;
import com.google.common.io.Files;
import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.json.Json;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\bin\\geckodriver.exe");
        /*ddPetForBettyTest test2= new AddPetForBettyTest();
        test2.setUp();
        test2.addPetForBetty();
        test2.tearDown();*/
        DaiTest test = new DaiTest();
        test.setUp();
        test.dai();
        //test.tearDown();

    }
}
