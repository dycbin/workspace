package bin.com;



import java.util.Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
public class YingWeiLai {
	
	WebDriver wd; 
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		login("18210281431", "123456");
		Thread.sleep(1000);
		//ˢ��ҳ��
	 wd.navigate().refresh();
		clicka();
		clickt();
		pinglun();
		Thread.sleep(1000);
		 wd.navigate().refresh();
		quit();
	}
	public void login(String username,String password){
		System.setProperty("webdriver.ie.driver","C:\\work\\IEDriverServer.exe");
		wd=new InternetExplorerDriver(); 
		wd.manage().window().maximize();
		 //��Ӯδ��ϵͳ
		 String URL="http://172.21.106.54/";
		 wd.get(URL);
		 WebElement dl=wd.findElement(By.linkText("��¼"));
		 dl.click();
		 
		wd.findElement(By.xpath("html/body/div[2]/div[4]/div/div[2]/ul/li[2]/input")).sendKeys(username);
		wd.findElement(By.xpath("html/body/div[2]/div[4]/div/div[2]/ul/li[3]/input")).sendKeys(password);
		wd.findElement(By.xpath("html/body/div[2]/div[4]/div/div[2]/ul/li[4]/input")).click();
	}

	public void quit(){
		Actions builder = new Actions(wd);
		 builder.moveToElement(wd.findElement(By.className("login"))).perform();
		wd.findElement(By.id("logout")).click();
	}
	public void clicka(){
		//�����̳����
		 wd.findElement(By.xpath("html/body/div[1]/div/ul/li[4]/a")).click();
	}
	public void clickt(){
		//�������
		 wd.findElement(By.xpath("html/body/div[2]/div/div[1]/div[2]/div[1]/div[1]/ul/li[1]/a/h3/span[2]")).click();
	}
	public void pinglun(){
		 Set<String> allWindowsId = wd.getWindowHandles();
			// ��ȡ���еĴ򿪴��ڵľ��
		        for (String windowId : allWindowsId) {
		            if (wd.switchTo().window(windowId).getTitle().contains("��������")) {
		                wd.switchTo().window(windowId);
		                break;
		            }
		        }
			 
//			 //����
			 //��������
			 wd.manage().window().maximize();
			 wd.findElement(By.xpath("html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/div[1]/textarea")).sendKeys("���Ǹ��ö���");
			 wd.findElement(By.linkText("��������")).click();
	}
}
