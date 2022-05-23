package ensyu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex01 {
	public static void main (String[] args) throws InterruptedException {
	 //Chrome制御のためChromeDriverのパスを指定
    System.setProperty("webdriver.chrome.driver","./exe/chromedriver");
    //Chromeを起動する
    WebDriver driver = new ChromeDriver();
    //指定したURLに遷移する
    driver.get("https://www.google.com/");
    Thread.sleep(2000); //5秒処理を停止(動作確認の為)
    
    WebElement searchBox = driver.findElement(By.name("q"));
	searchBox.sendKeys("selenium");
	searchBox.submit();

	Thread.sleep(2000);
	WebElement element = driver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div > div > div > div.NJo7tc.Z26q7c.jGGQ5e > div > a > h3"));
    //カレントページのタイトルを取得して表示
	System.out.println(element.getText());
    driver.quit();
  }

}
