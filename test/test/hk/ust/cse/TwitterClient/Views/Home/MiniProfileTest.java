package test.hk.ust.cse.TwitterClient.Views.Home;

import static org.junit.Assert.*;
import hk.ust.cse.TwitterClient.Views.Home.HomePage;
import hk.ust.cse.TwitterClient.Views.Home.MiniProfile;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.junit.Test;

import test.hk.ust.cse.TwitterClient.Mocks.MockUser;

public class MiniProfileTest {

	@Test
	public void test() {
		Display display = new Display();
	    Shell shell = new Shell(display);
	    MockUser friend = new MockUser("FakeUser", "FakeScreenName", true, "Fake Description");
	    MiniProfile mp = new MiniProfile(shell, friend, 30, 30);
	    shell.dispose();
	    if (Display.getCurrent() != null) {
		      Display.getCurrent().dispose();
		}
	}

}
