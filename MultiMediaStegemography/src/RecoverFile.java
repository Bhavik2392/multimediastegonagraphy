

import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class RecoverFile extends JFrame
{
  private JTextField bmpfilepath;
  private JTextField bmpsize;
  private JButton closebtn;
  private JButton filebrowsebtn;
  private JButton filebrowsebtn1;
  private JTextField filesize;
  private JLabel jLabel1;
  private JLabel jLabel2;
  private JLabel jLabel3;
  private JLabel jLabel4;
  private JLabel jLabel5;
  private JSeparator jSeparator1;
  private JPasswordField password;
  private JButton recoverbtn;
  private JLabel showmsg;
  private JTextField targetfilepath;

  public RecoverFile()
  {
    initComponents();
  }

  private void initComponents()
  {
    this.targetfilepath = new JTextField();
    this.jLabel1 = new JLabel();
    this.jLabel2 = new JLabel();
    this.bmpfilepath = new JTextField();
    this.filebrowsebtn1 = new JButton();
    this.filebrowsebtn = new JButton();
    this.recoverbtn = new JButton();
    this.password = new JPasswordField();
    this.jLabel3 = new JLabel();
    this.jSeparator1 = new JSeparator();
    this.jLabel4 = new JLabel();
    this.filesize = new JTextField();
    this.bmpsize = new JTextField();
    this.jLabel5 = new JLabel();
    this.closebtn = new JButton();
    this.showmsg = new JLabel();

    getContentPane().setLayout(null);

    setDefaultCloseOperation(2);
    setTitle("Recover File");
    getContentPane().add(this.targetfilepath);
    this.targetfilepath.setBounds(80, 100, 420, 20);

    this.jLabel1.setFont(new Font("MS Sans Serif", 1, 11));
    this.jLabel1.setText("Target File :");
    getContentPane().add(this.jLabel1);
    this.jLabel1.setBounds(10, 100, 70, 15);

    this.jLabel2.setFont(new Font("MS Sans Serif", 1, 11));
    this.jLabel2.setText("Bitmap File :");
    getContentPane().add(this.jLabel2);
    this.jLabel2.setBounds(10, 30, 70, 15);

    getContentPane().add(this.bmpfilepath);
    this.bmpfilepath.setBounds(80, 30, 420, 20);

    this.filebrowsebtn1.setText("...");
    this.filebrowsebtn1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        RecoverFile.this.filebrowsebtn1ActionPerformed(evt);
      }
    });
    getContentPane().add(this.filebrowsebtn1);
    this.filebrowsebtn1.setBounds(500, 100, 30, 23);

    this.filebrowsebtn.setText("...");
    this.filebrowsebtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        RecoverFile.this.filebrowsebtnActionPerformed(evt);
      }
    });
    getContentPane().add(this.filebrowsebtn);
    this.filebrowsebtn.setBounds(500, 30, 30, 23);

    this.recoverbtn.setText("Recover ");
    this.recoverbtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        RecoverFile.this.recoverbtnActionPerformed(evt);
      }
    });
    getContentPane().add(this.recoverbtn);
    this.recoverbtn.setBounds(440, 60, 90, 23);

    getContentPane().add(this.password);
    this.password.setBounds(80, 60, 360, 22);

    this.jLabel3.setFont(new Font("MS Sans Serif", 1, 11));
    this.jLabel3.setText("Password :");
    getContentPane().add(this.jLabel3);
    this.jLabel3.setBounds(10, 60, 70, 15);

    getContentPane().add(this.jSeparator1);
    this.jSeparator1.setBounds(0, 140, 530, 10);

    this.jLabel4.setFont(new Font("MS Sans Serif", 1, 11));
    this.jLabel4.setText("File Size :");
    getContentPane().add(this.jLabel4);
    this.jLabel4.setBounds(80, 160, 90, 15);

    this.filesize.setEditable(false);
    getContentPane().add(this.filesize);
    this.filesize.setBounds(170, 160, 100, 20);

    this.bmpsize.setEditable(false);
    getContentPane().add(this.bmpsize);
    this.bmpsize.setBounds(170, 190, 100, 20);

    this.jLabel5.setFont(new Font("MS Sans Serif", 1, 11));
    this.jLabel5.setText("Bitmap Size :");
    getContentPane().add(this.jLabel5);
    this.jLabel5.setBounds(80, 190, 90, 15);

    this.closebtn.setText("Close");
    this.closebtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        RecoverFile.this.closebtnActionPerformed(evt);
      }
    });
    getContentPane().add(this.closebtn);
    this.closebtn.setBounds(440, 220, 90, 23);

    this.showmsg.setFont(new Font("MS Sans Serif", 1, 11));
    getContentPane().add(this.showmsg);
    this.showmsg.setBounds(80, 220, 340, 20);

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    setBounds((screenSize.width - 540) / 2, (screenSize.height - 285) / 2, 540, 285);
  }

  private void filebrowsebtn1ActionPerformed(ActionEvent evt)
  {
    FileDialog fd = new FileDialog(this, "Open File", 0);
    fd.show();
    String s1 = fd.getDirectory();
    String s2 = fd.getFile();
    if ((s1 != null) && (s2 != null))
      this.targetfilepath.setText(s1 + s2);
  }

  private void filebrowsebtnActionPerformed(ActionEvent evt)
  {
    FileDialog fd = new FileDialog(this, "Open File", 0);
    fd.show();
    String s1 = fd.getDirectory();
    String s2 = fd.getFile();
    if ((s1 != null) && (s2 != null))
      this.bmpfilepath.setText(s1 + s2);
  }

  private void recoverbtnActionPerformed(ActionEvent evt)
  {
    String pass = this.password.getText();
    String bmpp = this.bmpfilepath.getText();
    String tp = this.targetfilepath.getText();

    if ((pass.length() > 0) && (bmpp.length() > 0) && (tp.length() > 0))
    {
      try {
        Recover r = new Recover();
        r.Recover(bmpp);
        if (r.pass.equals(pass))
        {
          this.filesize.setText("" + r.msg.length() + " Bytes");
          File f1 = new File(bmpp);
          this.bmpsize.setText("" + f1.length() + " Bytes");
          FileOutputStream f = new FileOutputStream(tp);
          f.write(r.msg.getBytes());
          f.close();
        }
        else {
          this.showmsg.setText("Invalid Password");
        }
      } catch (Exception e) {
        System.out.println(e);
      }
      this.showmsg.setText("Process Completed");
    }
    else
    {
      this.showmsg.setText("Failed: Insufficient Data");
    }
  }

  private void closebtnActionPerformed(ActionEvent evt)
  {
      new MainPage().show();
        this.hide();
  }

  public static void main(String[] args)
  {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        new RecoverFile().setVisible(true);
      }
    });
  }
}