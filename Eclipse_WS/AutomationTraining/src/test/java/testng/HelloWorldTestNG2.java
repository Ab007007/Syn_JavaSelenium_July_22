package testng;

import org.testng.annotations.Test;

public class HelloWorldTestNG2 {
	@Test(priority = 1)
	public void launch() {
		System.out.println("launch");
	}

	@Test(priority = 2)
	public void login() {
		System.out.println("login");
	}

	@Test(priority = 3)
	public void createUsers() {
		System.out.println("create User");
	}

	@Test(priority = 4 )
	public void logout() {
		System.out.println("Logout");
	}
}
