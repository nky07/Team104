package test.hk.ust.cse.TwitterClient.Views;

import static org.junit.Assert.*;
import hk.ust.cse.TwitterClient.Views.ListView;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.junit.Test;

public class ListViewTest {

	@Test
	public void testConstructor() {
		Display display = new Display();
		Shell shell = new Shell(display);
		ListView lv = new ListView(shell,100);
		//shell.dispose();
		if (Display.getCurrent() != null) {
		      Display.getCurrent().dispose();
		}
	}

}
