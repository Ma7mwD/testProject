
package PageOpjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class signUpPage 
{
	public void CheckBox()
	{
		// Locate the check box element
	    WebElement checkbox1 = ParentClass.getDriver().findElement(By.name("title"));

	    // Check the check box if it is not already checked
	    if (!checkbox1.isSelected()) 
	    {
	        checkbox1.click();
	    }
	 
	    /*WebElement checkbox2 = ParentClass.getDriver().findElement(By.name("newsletter"));

	    if (!checkbox2.isSelected()) 
	    {
	        checkbox2.click();
	    }
	    
	    WebElement checkbox3 = ParentClass.getDriver().findElement(By.name("optin"));

	    if (!checkbox3.isSelected()) 
	    {
	        checkbox3.click();
	    }*/
	}
	
	public void dropDownList()
	{
		// Locate the drop-down element
        WebElement dropdown1 = ParentClass.getDriver().findElement(By.name("days"));

        // Create a new Select instance
        Select select1 = new Select(dropdown1);

        // Select an option by its visible text
        select1.selectByVisibleText("21");
       // Locate the drop-down element
        WebElement dropdown2 = ParentClass.getDriver().findElement(By.name("months"));

        // Create a new Select instance
        Select select2 = new Select(dropdown2);

        // Select an option by its visible text
        select2.selectByVisibleText("January");
        
        // Locate the drop-down element
        WebElement dropdown3 = ParentClass.getDriver().findElement(By.name("years"));

        // Create a new Select instance
        Select select3 = new Select(dropdown3);

        // Select an option by its visible text
        select3.selectByVisibleText("1998");
        
        // Locate the drop-down element
        WebElement dropdown4 = ParentClass.getDriver().findElement(By.name("country"));

        // Create a new Select instance
        Select select4 = new Select(dropdown4);

        // Select an option by its visible text
        select4.selectByVisibleText("Canada");
	}
	
	public void insertInfo() throws InterruptedException
	{
		CheckBox();
		dropDownList();
		ParentClass.getDriver().findElement(By.name("password")).sendKeys("Pass1234");
		ParentClass.getDriver().findElement(By.name("first_name")).sendKeys("Mahmoud");
		ParentClass.getDriver().findElement(By.name("last_name")).sendKeys("Ahmed");
		ParentClass.getDriver().findElement(By.name("company")).sendKeys("Digination");
		ParentClass.getDriver().findElement(By.name("address1")).sendKeys("Asyut1");
		ParentClass.getDriver().findElement(By.name("address2")).sendKeys("Asyut2");
		ParentClass.getDriver().findElement(By.name("state")).sendKeys("Asyut3");
		ParentClass.getDriver().findElement(By.name("city")).sendKeys("Asyut4");
		ParentClass.getDriver().findElement(By.name("zipcode")).sendKeys("152648");
		ParentClass.getDriver().findElement(By.name("mobile_number")).sendKeys("01124558177");
		ParentClass.getDriver().findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button")).click();
		String txt = ParentClass.getDriver().findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b")).getText();
		//Assert.assertEquals(txt, "ACCOUNT CREATED!");
		Assert.assertEquals(txt, "ACCOUNT CREATED!");
		
		
        Thread.sleep(5000);
	}
	
	
	
}
