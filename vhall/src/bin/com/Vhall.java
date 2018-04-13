package bin.com;

import java.util.Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Vhall {
	WebDriver wd;
	@Before
	public void setUp() throws Exception {
	}
	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void test() throws InterruptedException {
//		String userName = "18210281431";
//		String passWord = "q11111";
		Thread.sleep(3000);
		login("18210281431", "q11111");
		//Thread.sleep(3000);
		//wd.navigate().refresh();
		Thread.sleep(3000);
		//mylive();
//		Thread.sleep(3000);
//		creadlive();
		changecro();
		Thread.sleep(3000);
		myhome();
//		Thread.sleep(1000);
		Thread.sleep(3000);
		quit();
	}
//登录
	public void login(String userName, String passWord) throws InterruptedException {
		System.setProperty("webdriver.firefox.bin",
				"C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		wd = new FirefoxDriver();
		wd.manage().window().maximize();
		String URL = "http://t.e.vhall.com/";
		wd.get(URL);
	//	Thread.sleep(3000);
		WebElement dl = wd.findElement(By.linkText("登录"));
		dl.click();
		wd.findElement(By.name("account")).sendKeys(userName);
		wd.findElement(By.name("password")).sendKeys(passWord);
		wd.findElement(By.id("account-to-login")).click();
	}
//退出
	public void quit() {
		wd.findElement(By.className("nowrap")).click();
		wd.findElement(By.className("v-logout")).click();

	}
//	切换控制台
	public void changecro(){
		wd.findElement(By.className("nowrap")).click();
		wd.findElement(By.className("v-border-top")).click();
	}
//	创建直播
	public void creadlive() throws InterruptedException{
		wd.findElement(By.xpath("html/body/header/nav/a")).click();
		wd.findElement(By.id("event-title")).sendKeys("0712直播");
		
			Thread.sleep(1000);
		
		wd.findElement(By.name("start_date")).sendKeys("2017-07-12");
		wd.findElement(By.name("start_time")).sendKeys("10:20");
		
			Thread.sleep(1000);
		
		wd.findElement(By.id("event-introduce")).sendKeys("我自动创建的");
		
			Thread.sleep(1000);
		
		Select select = new Select(wd.findElement(By.id("event-type")));	
		select.selectByVisibleText("教育");
			Thread.sleep(1000);
		wd.findElement(By.id("add-topic")).click();
//		wd.findElement(By.id("topic-custom-input")).sendKeys("杜彬彬的标签1111");
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		wd.findElement(By.xpath(".//*[@id='hot_topic']/li[6]")).click();
		
			Thread.sleep(1000);
		
		wd.findElement(By.xpath("html/body/section/div[2]/form/div[2]/div[10]/button")).click();
	}
//我的直播
	public void mylive() {

		wd.findElement(By.className("nowrap")).click();
		wd.findElement(By.className("v-live")).click();
	}
//我的主页
	public void myhome() throws InterruptedException {

		wd.findElement(By.className("nowrap")).click();
		wd.findElement(By.className("v-home")).click();
		Thread.sleep(3000);
		wd.findElement(By.xpath("html/body/div[3]/ul/li[1]/div[1]/a/img")).click();
		// 获取所有的打开窗口的句柄
				Set<String> allWindowsId = wd.getWindowHandles();
		        for (String windowId : allWindowsId) {
		            if (wd.switchTo().window(windowId).getTitle().contains("主题")) {
		                wd.switchTo().window(windowId);
		               // break;
		            }
		        }
//		        wd.manage().window().maximize();
	}
}