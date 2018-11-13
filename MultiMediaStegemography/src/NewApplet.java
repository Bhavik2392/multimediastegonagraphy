

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.EventQueue;

public class NewApplet extends Applet
{
  public void init()
  {
    try
    {
      EventQueue.invokeAndWait(new Runnable() {
        public void run() {
          NewApplet.this.initComponents();
        } } );
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  private void initComponents()
  {
    setLayout(new BorderLayout());
  }
}