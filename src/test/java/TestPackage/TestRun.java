package TestPackage;
import org.testng.annotations.Test;
import PageOpjectModel.CreateRequest;
import PageOpjectModel.clickLogin;
import PageOpjectModel.ParentClass;
import PageOpjectModel.signUpPage;

public class TestRun extends ParentClass
{
	@Test (priority = 1)
	public void Test1() throws InterruptedException
	{
		clickLogin LT = new clickLogin();
		LT.login();
	}
	
	@Test (priority = 2)
	public void Test2() throws InterruptedException
	{
		CreateRequest CR = new CreateRequest();
		CR.CreateRequestSteps();
	}
	@Test (priority = 3)
	public void Test3() throws InterruptedException
	{
		signUpPage SU = new signUpPage();
		SU.insertInfo();
	}
}
