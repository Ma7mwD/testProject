
package PageOpjectModel;
import org.openqa.selenium.By;

public class CreateRequest
{
	
	public void CreateRequestSteps() throws InterruptedException
	{
		Thread.sleep(1000);
		
		//ParentClass.getDriver().findElement(By.xpath("//*[@id=\"b2-l2-26_2-b2-Menu\"]/a/div/span")).click();
		
		//ParentClass.getDriver().findElement(By.xpath("//*[@id=\"$b7\"]/div/div[1]/button/div")).click();
		ParentClass.getDriver().findElement(By.name("name")).sendKeys("Mahmoud");
		ParentClass.getDriver().findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("mahmoud3s@fandua.com");
		ParentClass.getDriver().findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
	}
}
