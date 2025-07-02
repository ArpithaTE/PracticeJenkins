package pac2;
import org.testng.annotations.Test;

public class DeleteTest {
	@Test
	public void deleteContactTest() {
		System.out.println("Contact deleted =====PASS");
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);

	}

	@Test
	public void deleteOrgTest() {
		System.out.println("Org deleted =====PASS");
	}

}
