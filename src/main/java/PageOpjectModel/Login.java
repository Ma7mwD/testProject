package PageOpjectModel;
import org.openqa.selenium.By;

public class Login 
{
	
	public void loginTest() throws InterruptedException 
	{
		
		clickLogin CL = new clickLogin();
		CL.login();
		String username = "";
		String password = "";
		
		String[][]Users = {
				{"mahmoud@fandua.com","Pass1234"},
				{"pohev575749258@fandua.com","Pass1234"},
				{"mahmoud3s@fandua.com","Pass1234"}
		};
		
		for (int i = 0; i < Users.length; i++) 
		{
			for (int j = 0; j < Users[i].length; j++) 
			{
				username = (j % 2 == 0) ? Users[i][j] : password;
				password = (j % 2 != 0) ? Users[i][j] : username;
			}
			
			
			ParentClass.getDriver().findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys(username);
			ParentClass.getDriver().findElement(By.name("password")).sendKeys(password);
			ParentClass.getDriver().findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
			ParentClass.getDriver().findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		}
		
	}
}
