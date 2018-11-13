

import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.PrintStream;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ContentsFrame extends JFrame
{
  private JScrollPane jScrollPane1;
  private JTextArea txtdata;

  public ContentsFrame()
  {
    initComponents();
    try {
      FileInputStream f = new FileInputStream("Help.txt");
      byte[] b = new byte[f.available()];
      f.read(b);
      f.close();
      this.txtdata.setText(new String(b));
    }
    catch (Exception e)
    {
      System.out.println(e);
    }
  }

  private void initComponents()
  {
    this.jScrollPane1 = new JScrollPane();
    this.txtdata = new JTextArea();

    setDefaultCloseOperation(2);
    setTitle("Help");
    this.jScrollPane1.setHorizontalScrollBarPolicy(32);
    this.jScrollPane1.setVerticalScrollBarPolicy(22);
    this.txtdata.setEditable(false);
    this.txtdata.setMargin(new Insets(5, 5, 0, 0));
    this.jScrollPane1.setViewportView(this.txtdata);

    getContentPane().add(this.jScrollPane1, "Center");

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    setBounds((screenSize.width - 538) / 2, (screenSize.height - 507) / 2, 538, 507);
  }

  public static void main(String[] args)
  {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        new ContentsFrame().setVisible(true);
      }
    });
  }
}