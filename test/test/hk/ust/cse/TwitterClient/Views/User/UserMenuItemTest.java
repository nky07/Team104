package test.hk.ust.cse.TwitterClient.Views.User;

import static org.junit.Assert.*;
import hk.ust.cse.TwitterClient.Resources.Resources;
import hk.ust.cse.TwitterClient.Views.User.UserMenuItem;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.junit.Test;

public class UserMenuItemTest {

	@Test
	public void test() {
		Display display = new Display();
	    Shell shell = new Shell(display);
		UserMenuItem umi = new UserMenuItem(shell,"title",100,50,Resources.FONT10,Resources.FONT11);
		umi.setClicked();
		umi.setNotClicked();
		assertEquals("Equal","title",umi.getTitle());
		shell.dispose();
		if (Display.getCurrent() != null) {
		      Display.getCurrent().dispose();
		}
	}

}
