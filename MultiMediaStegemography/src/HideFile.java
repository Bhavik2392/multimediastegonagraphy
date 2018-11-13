

import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.PrintStream;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class HideFile extends JFrame
{
  private JTextField bmpfilepath;
  private JTextField bmpsize;
  private JButton closebtn;
  private JButton filebrowsebtn1;
  private JButton filebrowsebtn2;
  private JButton filebrowsebtn3;
  private JTextField filecapacity;
  private JTextField filesize;
  private JButton hidebtn;
  private JLabel jLabel1;
  private JLabel jLabel2;
  private JLabel jLabel3;
  private JLabel jLabel4;
  private JLabel jLabel5;
  private JLabel jLabel6;
  private JLabel jLabel7;
  private JSeparator jSeparator1;
  private JPasswordField password;
  private JLabel showmsg;
  private JTextField sourcepath;
  private JTextField targetfilepath;

  public HideFile()
  {
    initComponents();
  }

  private void initComponents()
  {
    this.jLabel1 = new JLabel();
    this.jLabel2 = new JLabel();
    this.filebrowsebtn2 = new JButton();
    this.bmpfilepath = new JTextField();
    this.jLabel3 = new JLabel();
    this.password = new JPasswordField();
    this.hidebtn = new JButton();
    this.filesize = new JTextField();
    this.jSeparator1 = new JSeparator();
    this.jLabel4 = new JLabel();
    this.jLabel5 = new JLabel();
    this.bmpsize = new JTextField();
    this.jLabel6 = new JLabel();
    this.filecapacity = new JTextField();
    this.closebtn = new JButton();
    this.sourcepath = new JTextField();
    this.filebrowsebtn1 = new JButton();
    this.jLabel7 = new JLabel();
    this.targetfilepath = new JTextField();
    this.filebrowsebtn3 = new JButton();
    this.showmsg = new JLabel();

    getContentPane().setLayout(null);

    setDefaultCloseOperation(2);
    setTitle("Hide File");
    this.jLabel1.setFont(new Font("MS Sans Serif", 1, 11));
    this.jLabel1.setText("Source File :");
    getContentPane().add(this.jLabel1);
    this.jLabel1.setBounds(7, 20, 67, 15);

    this.jLabel2.setFont(new Font("MS Sans Serif", 1, 11));
    this.jLabel2.setText("Bitmap File :");
    getContentPane().add(this.jLabel2);
    this.jLabel2.setBounds(10, 50, 70, 15);

    this.filebrowsebtn2.setText("...");
    this.filebrowsebtn2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        HideFile.this.filebrowsebtn2ActionPerformed(evt);
      }
    });
    getContentPane().add(this.filebrowsebtn2);
    this.filebrowsebtn2.setBounds(500, 50, 30, 23);

    getContentPane().add(this.bmpfilepath);
    this.bmpfilepath.setBounds(80, 50, 420, 20);

    this.jLabel3.setFont(new Font("MS Sans Serif", 1, 11));
    this.jLabel3.setText("Password :");
    getContentPane().add(this.jLabel3);
    this.jLabel3.setBounds(10, 80, 70, 15);

    getContentPane().add(this.password);
    this.password.setBounds(80, 80, 360, 22);

    this.hidebtn.setText("Hide");
    this.hidebtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        HideFile.this.hidebtnActionPerformed(evt);
      }
    });
    getContentPane().add(this.hidebtn);
    this.hidebtn.setBounds(440, 80, 90, 23);

    this.filesize.setEditable(false);
    getContentPane().add(this.filesize);
    this.filesize.setBounds(170, 170, 100, 20);

    getContentPane().add(this.jSeparator1);
    this.jSeparator1.setBounds(0, 150, 530, 10);

    this.jLabel4.setFont(new Font("MS Sans Serif", 1, 11));
    this.jLabel4.setText("File Size :");
    getContentPane().add(this.jLabel4);
    this.jLabel4.setBounds(80, 170, 90, 15);

    this.jLabel5.setFont(new Font("MS Sans Serif", 1, 11));
    this.jLabel5.setText("Bitmap Size :");
    getContentPane().add(this.jLabel5);
    this.jLabel5.setBounds(80, 200, 90, 15);

    this.bmpsize.setEditable(false);
    getContentPane().add(this.bmpsize);
    this.bmpsize.setBounds(170, 200, 100, 20);

    this.jLabel6.setFont(new Font("MS Sans Serif", 1, 11));
    this.jLabel6.setText("File Capacity :");
    getContentPane().add(this.jLabel6);
    this.jLabel6.setBounds(280, 170, 74, 15);

    this.filecapacity.setEditable(false);
    getContentPane().add(this.filecapacity);
    this.filecapacity.setBounds(360, 170, 100, 20);

    this.closebtn.setText("Close");
    this.closebtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        HideFile.this.closebtnActionPerformed(evt);
      }
    });
    getContentPane().add(this.closebtn);
    this.closebtn.setBounds(440, 250, 90, 23);

    getContentPane().add(this.sourcepath);
    this.sourcepath.setBounds(80, 20, 420, 20);

    this.filebrowsebtn1.setText("...");
    this.filebrowsebtn1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        HideFile.this.filebrowsebtn1ActionPerformed(evt);
      }
    });
    getContentPane().add(this.filebrowsebtn1);
    this.filebrowsebtn1.setBounds(500, 20, 30, 23);

    this.jLabel7.setFont(new Font("MS Sans Serif", 1, 11));
    this.jLabel7.setText("Target File :");
    getContentPane().add(this.jLabel7);
    this.jLabel7.setBounds(10, 110, 64, 15);

    getContentPane().add(this.targetfilepath);
    this.targetfilepath.setBounds(80, 110, 420, 20);

    this.filebrowsebtn3.setText("...");
    this.filebrowsebtn3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        HideFile.this.filebrowsebtn3ActionPerformed(evt);
      }
    });
    getContentPane().add(this.filebrowsebtn3);
    this.filebrowsebtn3.setBounds(500, 110, 30, 23);

    this.showmsg.setFont(new Font("MS Sans Serif", 1, 11));
    getContentPane().add(this.showmsg);
    this.showmsg.setBounds(80, 230, 350, 20);

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    setBounds((screenSize.width - 540) / 2, (screenSize.height - 325) / 2, 540, 325);
  }

  private void filebrowsebtn3ActionPerformed(ActionEvent evt)
  {
    FileDialog fd = new FileDialog(this, "Open File", 0);
    fd.show();
    String s1 = fd.getDirectory();
    String s2 = fd.getFile();
    if ((s1 != null) && (s2 != null))
      this.targetfilepath.setText(s1 + s2);
  }

  private void closebtnActionPerformed(ActionEvent evt)
  {
    //  new MainPage().show();
        this.hide();
  }

  private void hidebtnActionPerformed(ActionEvent evt)
  {
    String pass = this.password.getText();
    String sp = this.sourcepath.getText();
    String bmpp = this.bmpfilepath.getText();
    String tp = this.targetfilepath.getText();

    if ((pass.length() > 0) && (sp.length() > 0) && (bmpp.length() > 0) && (tp.length() > 0))
    {
      try {
        FileInputStream f = new FileInputStream(sp);
        byte[] b = new byte[f.available()];
        f.read(b);
        f.close();
        String m = new String(b);

        this.filesize.setText("" + m.length() + " Bytes");
        File f1 = new File(bmpp);
        this.bmpsize.setText("" + f1.length() + " Bytes");
        long capacity = f1.length() - 54L - 256L - 32L;
        capacity /= 8L;
        this.filecapacity.setText("" + capacity + " Bytes");
        this.showmsg.setText("Hiding Message");

        Hide.Crypto(bmpp, tp, pass, m);
      }
      catch (Exception e) {
        System.out.println(e);
      }
      this.showmsg.setText("Process Completed");
    }
    else
    {
      System.out.println("Hello");
      this.showmsg.setText("Failed: Insufficient Data");
    }
  }

  private void filebrowsebtn2ActionPerformed(ActionEvent evt)
  {
    FileDialog fd = new FileDialog(this, "Open File", 0);
    fd.show();
    String s1 = fd.getDirectory();
    String s2 = fd.getFile();
    if ((s1 != null) && (s2 != null))
      this.bmpfilepath.setText(s1 + s2);
  }

  private void filebrowsebtn1ActionPerformed(ActionEvent evt)
  {
    FileDialog fd = new FileDialog(this, "Open Bitmap File", 0);
    fd.show();
    String s1 = fd.getDirectory();
    String s2 = fd.getFile();
    if ((s1 != null) && (s2 != null))
      this.sourcepath.setText(s1 + s2);
  }

  public static void main(String[] args)
  {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        new HideFile().setVisible(true);
      }
    });
  }
}