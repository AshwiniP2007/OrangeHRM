package businessfunction;

public class LoginLogoutUtils extends LoginLogoutBaseClass
{
	public static void login(String uname , String passwd)
	{
		LoginPage.enterUserName(uname);
		loginPage.enterPassword(passwd);
		loginPage.enterSignInButton();
	}
	public static void logout()
	{
		logoutPage.clickUserdropdown();
		logoutPage.clickonLogoutlink();
	}
}
