package sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class SeleniumEnsyuTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() 
		throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./exe/chromedriver");
			WebDriver driver = new ChromeDriver(); //ChromeDriverの作成

			driver.get("http://www.google.com/xhtml"); //get()でブラウザ起動
			Thread.sleep(5000); //5秒処理を停止(動作確認の為)
			//ブラウザの要素を指定 メソッド名がわかりやすいですよね。
			WebElement searchBox = driver.findElement(By.name("q"));
			searchBox.sendKeys("ラクスパートナーズ");
			searchBox.submit();

			Thread.sleep(5000);
//			driver.quit(); //ブラウザを閉じる。
	}
	void test2() 
			throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "./exe/chromedriver");
				WebDriver driver = new ChromeDriver(); //ChromeDriverの作成

				driver.get("http://www.yahoo.co.jp/"); //get()でブラウザ起動
				Thread.sleep(5000); //5秒処理を停止(動作確認の為)
				//ブラウザの要素を指定 メソッド名がわかりやすいですよね。
				WebElement searchBox = driver.findElement(By.name("p"));
				searchBox.sendKeys("ラクスパートナーズ");
				searchBox.submit();

				Thread.sleep(5000);
//				driver.quit(); //ブラウザを閉じる。
		}

}
