

import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.PrintStream;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class HideMessage extends JFrame
{
  private JTextField bmpsize;
  private JButton closebtn;
  private JButton filebrowsebtn;
  private JButton filebrowsebtn1;
  private JTextField filepath;
  private JButton hidebtn;
  private JLabel jLabel1;
  private JLabel jLabel2;
  private JLabel jLabel3;
  private JLabel jLabel4;
  private JLabel jLabel5;
  private JLabel jLabel6;
  private JScrollPane jScrollPane1;
  private JSeparator jSeparator1;
  private JLabel labeltarget;
  private JTextArea message;
  private JTextField msgsize;
  private JTextField msgsize1;
  private JPasswordField password;
  private JLabel showmsg;
  private JTextField targetfile;

  public HideMessage()
  {
    initComponents();
  }

  private void initComponents()
  {
    this.jScrollPane1 = new JScrollPane();
    this.message = new JTextArea();
    this.jLabel1 = new JLabel();
    this.filebrowsebtn = new JButton();
    this.filepath = new JTextField();
    this.jLabel2 = new JLabel();
    this.jLabel3 = new JLabel();
    this.hidebtn = new JButton();
    this.jLabel4 = new JLabel();
    this.jSeparator1 = new JSeparator();
    this.msgsize = new JTextField();
    this.jLabel5 = new JLabel();
    this.bmpsize = new JTextField();
    this.jLabel6 = new JLabel();
    this.msgsize1 = new JTextField();
    this.closebtn = new JButton();
    this.password = new JPasswordField();
    this.showmsg = new JLabel();
    this.labeltarget = new JLabel();
    this.targetfile = new JTextField();
    this.filebrowsebtn1 = new JButton();

    getContentPane().setLayout(null);

    setDefaultCloseOperation(2);
    setTitle("Hide Message");
    this.jScrollPane1.setHorizontalScrollBarPolicy(32);
    this.jScrollPane1.setVerticalScrollBarPolicy(22);
    this.message.setMargin(new Insets(5, 5, 0, 0));
    this.jScrollPane1.setViewportView(this.message);

    getContentPane().add(this.jScrollPane1);
    this.jScrollPane1.setBounds(80, 20, 450, 120);

    this.jLabel1.setFont(new Font("MS Sans Serif", 1, 11));
    this.jLabel1.setText("Message :");
    getContentPane().add(this.jLabel1);
    this.jLabel1.setBounds(14, 20, 60, 15);

    this.filebrowsebtn.setText("...");
    this.filebrowsebtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        HideMessage.this.filebrowsebtnActionPerformed(evt);
      }
    });
    getContentPane().add(this.filebrowsebtn);
    this.filebrowsebtn.setBounds(500, 150, 30, 23);

    getContentPane().add(this.filepath);
    this.filepath.setBounds(80, 150, 420, 20);

    this.jLabel2.setFont(new Font("MS Sans Serif", 1, 11));
    this.jLabel2.setText("Bitmap File :");
    getContentPane().add(this.jLabel2);
    this.jLabel2.setBounds(10, 150, 70, 15);

    this.jLabel3.setFont(new Font("MS Sans Serif", 1, 11));
    this.jLabel3.setText("Password :");
    getContentPane().add(this.jLabel3);
    this.jLabel3.setBounds(10, 210, 70, 15);

    this.hidebtn.setText("Hide");
    this.hidebtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        HideMessage.this.hidebtnActionPerformed(evt);
      }
    });
    getContentPane().add(this.hidebtn);
    this.hidebtn.setBounds(440, 210, 90, 23);

    this.jLabel4.setFont(new Font("MS Sans Serif", 1, 11));
    this.jLabel4.setText("Message Size :");
    getContentPane().add(this.jLabel4);
    this.jLabel4.setBounds(80, 260, 90, 15);

    getContentPane().add(this.jSeparator1);
    this.jSeparator1.setBounds(0, 250, 530, 10);

    this.msgsize.setEditable(false);
    getContentPane().add(this.msgsize);
    this.msgsize.setBounds(170, 260, 100, 20);

    this.jLabel5.setFont(new Font("MS Sans Serif", 1, 11));
    this.jLabel5.setText("Bitmap Size :");
    getContentPane().add(this.jLabel5);
    this.jLabel5.setBounds(80, 290, 90, 15);

    this.bmpsize.setEditable(false);
    getContentPane().add(this.bmpsize);
    this.bmpsize.setBounds(170, 290, 100, 20);

    this.jLabel6.setFont(new Font("MS Sans Serif", 1, 11));
    this.jLabel6.setText("Message Capacity :");
    getContentPane().add(this.jLabel6);
    this.jLabel6.setBounds(280, 260, 110, 15);

    this.msgsize1.setEditable(false);
    getContentPane().add(this.msgsize1);
    this.msgsize1.setBounds(390, 260, 100, 20);

    this.closebtn.setText("Close");
    this.closebtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        HideMessage.this.closebtnActionPerformed(evt);
      }
    });
    getContentPane().add(this.closebtn);
    this.closebtn.setBounds(440, 320, 90, 23);

    getContentPane().add(this.password);
    this.password.setBounds(80, 210, 360, 22);

    this.showmsg.setFont(new Font("MS Sans Serif", 1, 11));
    getContentPane().add(this.showmsg);
    this.showmsg.setBounds(80, 320, 350, 20);

    this.labeltarget.setFont(new Font("MS Sans Serif", 1, 11));
    this.labeltarget.setText("Target File :");
    getContentPane().add(this.labeltarget);
    this.labeltarget.setBounds(10, 180, 70, 15);

    getContentPane().add(this.targetfile);
    this.targetfile.setBounds(80, 180, 420, 20);

    this.filebrowsebtn1.setText("...");
    this.filebrowsebtn1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        HideMessage.this.filebrowsebtn1ActionPerformed(evt);
      }
    });
    getContentPane().add(this.filebrowsebtn1);
    this.filebrowsebtn1.setBounds(500, 180, 30, 23);

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    setBounds((screenSize.width - 540) / 2, (screenSize.height - 388) / 2, 540, 388);
  }

  private void filebrowsebtn1ActionPerformed(ActionEvent evt)
  {
    FileDialog fd = new FileDialog(this, "Open Bitmap File", 0);
    fd.show();
    String s1 = fd.getDirectory();
    String s2 = fd.getFile();
    if ((s1 != null) && (s2 != null))
      this.targetfile.setText(s1 + s2);
  }

  private void closebtnActionPerformed(ActionEvent evt)
  {
      new MainPage().show();
        this.hide();
  }

  private void hidebtnActionPerformed(ActionEvent evt)
  {
    String pass = this.password.getText();
    String m = this.message.getText();
    String fp = this.filepath.getText();
    String tf = this.targetfile.getText();

    if ((pass.length() > 0) && (m.length() > 0) && (fp.length() > 0) && (tf.length() > 0))
    {
      this.msgsize.setText("" + m.length() + " Bytes");
      File f = new File(fp);
      this.bmpsize.setText("" + f.length() + " Bytes");
      long capacity = f.length() - 54L - 256L - 32L;
      capacity /= 8L;
      this.msgsize1.setText("" + capacity + " Bytes");
      this.showmsg.setText("Hiding Message");
      try {
        Hide.Crypto(fp, tf, pass, m);
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

  private void filebrowsebtnActionPerformed(ActionEvent evt)
  {
    FileDialog fd = new FileDialog(this, "Open Bitmap File", 0);
    fd.show();
    String s1 = fd.getDirectory();
    String s2 = fd.getFile();
    if ((s1 != null) && (s2 != null))
      this.filepath.setText(s1 + s2);
  }

  public static void main(String[] args)
  {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        new HideMessage().setVisible(true);
      }
    });
  }
}