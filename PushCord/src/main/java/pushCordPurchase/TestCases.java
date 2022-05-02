package pushCordPurchase;

import pageObject.DashBoardPOM;
import pageObject.LoginPOM;

public class TestCases extends FunctionalMethod{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		launchBrowser("Chrome", "https://sahad.pushcord.com/#/business-login");
		maximize();
		
		System.out.println(driver.getTitle());
		waitstatic();
		
		
		LoginPOM login = new LoginPOM();
		
		staticWait();
		login.signInhome();
		staticWait();
		switchWindow(1);
		login.uname("testuser1@cordistech.com");
		login.pword("Cordis@123");
		login.signIn();
		
		switchWindow(0);
		DashBoardPOM db = new DashBoardPOM();
		db.dashboard();
		webwait();

		visibilityElement(db.getPosoption());
		db.pos();
		db.validateOption();
		staticWait();
		
		db.barCode("6281007061032");
		db.complete();
		staticWait();
		
		
		
	}

}
