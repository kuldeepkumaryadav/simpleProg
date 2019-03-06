package capgemini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TalentPage {
	public static void main(String args[]) {
WebDriver driver = new ChromeDriver();
driver.get("https://talent.capgemini.com/in");
System.out.println(driver.getCurrentUrl());
driver.close();
}
}
