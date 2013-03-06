package test.hk.ust.cse.TwitterClient.Views.User;

import static org.junit.Assert.*;
import hk.ust.cse.TwitterClient.Views.User.FriendView;
import hk.ust.cse.TwitterClient.Views.User.ProfileView;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.junit.Test;

import test.hk.ust.cse.TwitterClient.Mocks.MockUser;

public class ProfileViewTest {

	@Test
	public void test() {
		Display display = new Display();
	    Shell shell = new Shell(display);
	    
	    MockUser friend = new MockUser("FakeUser", "FakeScreenName", true, "Fake Description");
	    ProfileView profileView = new ProfileView(shell, friend, 50, 50);
	    assertNotNull(profileView.getUser());
	    
	    
	    shell.dispose();
	    if (Display.getCurrent() != null) {
		      Display.getCurrent().dispose();
		}
	}

}
