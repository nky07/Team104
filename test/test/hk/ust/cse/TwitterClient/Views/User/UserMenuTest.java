package test.hk.ust.cse.TwitterClient.Views.User;

import static org.junit.Assert.*;
import hk.ust.cse.TwitterClient.Views.User.UserMenu;
import hk.ust.cse.TwitterClient.Views.User.UserPage;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.junit.Test;

import test.hk.ust.cse.TwitterClient.Mocks.MockUser;

public class UserMenuTest {

	@Test
	public void test() {
		Display display = new Display();
	    Shell shell = new Shell(display);
	    
	    
	    Object a = new Object();
		UserMenu um = new UserMenu(shell,200,100,"ABCD",a);
		um.setCurrentSelected(1);
		assertEquals("Equal",1,um.getCurrentSelected());
		shell.dispose();
		if (Display.getCurrent() != null) {
		      Display.getCurrent().dispose();
		}
	}

}
