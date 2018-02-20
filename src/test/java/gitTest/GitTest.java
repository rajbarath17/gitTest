package gitTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GitTest {

	@Test
	public void loginTest() throws IOException, InterruptedException
	{
		WebDriver wd = new FirefoxDriver();
		wd.get("https://git-scm.com/download/win");
		File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\THALAPATHI\\SeleniumWorkspace\\GitTest\\Screenshot\\test.jpg"));
		Thread.sleep(1000);
		wd.quit();
	}
}
