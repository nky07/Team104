package test.hk.ust.cse.TwitterClient.Views;

import static org.junit.Assert.*;
import hk.ust.cse.TwitterClient.Resources.Resources;
import hk.ust.cse.TwitterClient.Views.NumberBar;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.junit.Test;

public class NumberBarTest {

	@Test
	public void testConstructor() {
		Display display = new Display();
		Shell shell = new Shell(display);
		long[] ab = {(long)1};
		String[] s = {"s"};
		Object a = new Object();
		NumberBar nb = new NumberBar(shell,ab,s,100,20,20,Resources.TEXT_COLOR,Resources.GRAY_COLOR,Resources.LINK_COLOR,
				Resources.FONT10,Resources.FONT11,false,"",a);
		//shell.dispose();
		if (Display.getCurrent() != null) {
		      Display.getCurrent().dispose();
		}
	}

}
