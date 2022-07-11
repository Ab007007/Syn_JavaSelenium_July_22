package testng;

import org.testng.annotations.Test;

public class HelloWorldTestNG {
	@Test
	public void launch() {
		System.out.println("launch");
	}

	@Test(dependsOnMethods = "launch")
	public void login() {
		System.out.println("login");
	}

	@Test(dependsOnMethods = "login")
	public void createUsers() {
		System.out.println("create User");
	}

	@Test(dependsOnMethods = "createUsers" )
	public void logout() {
		System.out.println("Logout");
	}
}
