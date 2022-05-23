package ensyu;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./exe/chromedriver");
		WebDriver driver = new ChromeDriver(); //ChromeDriverの作成

		driver.get("https://rakuplus.jp/wp-login.php?redirect_to=https%3A%2F%2Frakuplus.jp%2F&reauth=1"); //get()でブラウザ起動
		Thread.sleep(5000); //5秒処理を停止(動作確認の為)
		// メールアドレス入力
		driver.findElement(By.name("log")).sendKeys("satone.ito@rakus-partners.co.jp");

		// パスワード入力
		driver.findElement(By.name("pwd")).sendKeys("satone.ito@rakus-partners.co.jp");

		// ログインボタンを押す
		driver.findElement(By.className("wp-submit")).click();
		
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(file.toPath(), new File("itosatone" + file.getName()).toPath());


		}
		

}
