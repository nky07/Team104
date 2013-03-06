package test.hk.ust.cse.TwitterClient.Controls;

import static org.junit.Assert.*;
import hk.ust.cse.TwitterClient.Controls.UserPageControl;

import org.eclipse.swt.widgets.Display;
import org.junit.Test;

public class UserPageControlTest {

	@Test
	public void test() {
		UserPageControl upc = new UserPageControl(null);
		upc.showFollowersListCallback(null);
		upc.showFollowingListCallback(null);
		upc.showTweetsListCallback(null);
		
	}

}
