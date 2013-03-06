package test.hk.ust.cse.TwitterClient.Views;

import static org.junit.Assert.*;
import hk.ust.cse.TwitterClient.Views.TweetsList;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.junit.Test;

public class TweetListTest {

	@Test
	public void test() {
		Display d = new Display();
		Shell shell = new Shell(d);
		TweetsList tl = new TweetsList(shell,null,100,null,null,null,null,null,null);
		shell.dispose();
		d.dispose();
	}

}
