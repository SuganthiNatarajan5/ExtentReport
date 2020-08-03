package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExtentHtmlReporter reporter= new ExtentHtmlReporter("report.html");
		ExtentReports extentReports=new ExtentReports();
		extentReports.attachReporter(reporter);
		ExtentTest test=extentReports.createTest("whatsup");

		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\sugannat\\Desktop\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		
		driver.findElement(By.name("q")).sendKeys("click");
		driver.findElement(By.name("q")).submit();
		test.pass("test passed");
		driver.quit();
		extentReports.flush();
		
	}

}
