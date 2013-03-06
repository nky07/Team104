package test.hk.ust.cse.TwitterClient.Controls;

import static org.junit.Assert.*;
import hk.ust.cse.TwitterClient.Controls.TweetViewControl;

import org.eclipse.swt.widgets.Display;
import org.junit.Test;

public class TweetViewControlTest {

	@Test
	public void test() {
		TweetViewControl tvc = new TweetViewControl(null);
		tvc.getRepliesCallback(null);
		
	}

}
