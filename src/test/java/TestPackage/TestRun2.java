package TestPackage;
import java.io.IOException;
import org.testng.annotations.Test;
import PageOpjectModel.Login;
import PageOpjectModel.ParentClass;

public class TestRun2 extends ParentClass
{
	
	@Test
	public void Test1() throws InterruptedException, IOException
	{
		Login L = new Login();
		L.loginTest();
		
	}
}
