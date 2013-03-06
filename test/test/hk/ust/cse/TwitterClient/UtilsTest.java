package test.hk.ust.cse.TwitterClient;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import hk.ust.cse.TwitterClient.Utils;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.graphics.Region;
import org.eclipse.swt.graphics.Resource;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.junit.Ignore;
import org.junit.Test;

public class UtilsTest {
  @Test(timeout=10000)
  public void testGetColorFromString() throws Throwable {
    assertEquals(new Color(null, 171, 205, 239), Utils.getColorFromString("ABCDEF"));
  }

  @Test
  public void testSelect() {
	  String s1 = Utils.selectImageVersion("_normal.png", 48, 48);
	  String s2 = Utils.selectImageVersion("_normal.png", 73, 73);
	  String s3 = Utils.selectImageVersion("_normal.png", 80, 80);
	  String s4 = Utils.selectImageVersion("_bigger.png", 48, 48);
	  String s5 = Utils.selectImageVersion("_bigger.png", 73, 73);
	  String s6 = Utils.selectImageVersion(".png", 100, 73);
	  String s7 = Utils.selectImageVersion("_bigger.png", 48, 73);
	  String s8 = Utils.selectImageVersion("_bigger.png", 73, 80);
	  String s9 = Utils.selectImageVersion("_bigger.png", 73, 48);
	  String s0 = Utils.selectImageVersion("_bigger.png", 80, 73);
	  
  }
  @Test
  public void testCutRoundCorner() throws Throwable {
	  Display display = new Display();
	  Shell shell = new Shell(display);
	  Utils.cutRoundCorner(shell, true, true, true, true);
	  Utils.cutRoundCorner(shell, false, false, false, false);
	  //shell.dispose();
	  if (Display.getCurrent() != null) {
	      Display.getCurrent().dispose();
	  }
  }
}
