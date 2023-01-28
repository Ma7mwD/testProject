package PageOpjectModel;
import org.openqa.selenium.By;

public class clickLogin
{
	public void login() throws InterruptedException
	{
		
        Thread.sleep(1000);
        ParentClass.getDriver().findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
        
	}
}
