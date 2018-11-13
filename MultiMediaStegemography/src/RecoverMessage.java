

import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RecoverMessage extends JFrame
{
  private JButton closebtn;
  private JButton filebrowsebtn;
  private JTextField filepath;
  private JLabel jLabel1;
  private JLabel jLabel2;
  private JLabel jLabel3;
  private JLabel jLabel4;
  private JScrollPane jScrollPane1;
  private JSeparator jSeparator1;
  private JTextArea message;
  private JTextField msgsize;
  private JPasswordField password;
  private JButton recoverbtn;
  private JLabel showmsg;

  public RecoverMessage()
  {
    initComponents();
  }

  private void initComponents()
  {
    this.msgsize = new JTextField();
    this.jLabel4 = new JLabel();
    this.closebtn = new JButton();
    this.recoverbtn = new JButton();
    this.password = new JPasswordField();
    this.jLabel3 = new JLabel();
    this.jSeparator1 = new JSeparator();
    this.filepath = new JTextField();
    this.jLabel2 = new JLabel();
    this.filebrowsebtn = new JButton();
    this.jLabel1 = new JLabel();
    this.jScrollPane1 = new JScrollPane();
    this.message = new JTextArea();
    this.showmsg = new JLabel();

    getContentPane().setLayout(null);

    setDefaultCloseOperation(2);
    setTitle("Recover Message");
    this.msgsize.setEditable(false);
    getContentPane().add(this.msgsize);
    this.msgsize.setBounds(170, 270, 100, 20);

    this.jLabel4.setFont(new Font("MS Sans Serif", 1, 11));
    this.jLabel4.setText("Message Size :");
    getContentPane().add(this.jLabel4);
    this.jLabel4.setBounds(80, 270, 90, 15);

    this.closebtn.setText("Close");
    this.closebtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        RecoverMessage.this.closebtnActionPerformed(evt);
      }
    });
    getContentPane().add(this.closebtn);
    this.closebtn.setBounds(440, 330, 90, 23);

    this.recoverbtn.setText("Recover");
    this.recoverbtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        RecoverMessage.this.recoverbtnActionPerformed(evt);
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
    this.jSeparator1.setBounds(0, 240, 530, 10);

    getContentPane().add(this.filepath);
    this.filepath.setBounds(80, 20, 420, 20);

    this.jLabel2.setFont(new Font("MS Sans Serif", 1, 11));
    this.jLabel2.setText("Bitmap File :");
    getContentPane().add(this.jLabel2);
    this.jLabel2.setBounds(10, 20, 70, 15);

    this.filebrowsebtn.setText("...");
    this.filebrowsebtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        RecoverMessage.this.filebrowsebtnActionPerformed(evt);
      }
    });
    getContentPane().add(this.filebrowsebtn);
    this.filebrowsebtn.setBounds(500, 20, 30, 23);

    this.jLabel1.setFont(new Font("MS Sans Serif", 1, 11));
    this.jLabel1.setText("Message :");
    getContentPane().add(this.jLabel1);
    this.jLabel1.setBounds(20, 100, 60, 15);

    this.jScrollPane1.setHorizontalScrollBarPolicy(32);
    this.jScrollPane1.setVerticalScrollBarPolicy(22);
    this.message.setMargin(new Insets(5, 5, 0, 0));
    this.jScrollPane1.setViewportView(this.message);

    getContentPane().add(this.jScrollPane1);
    this.jScrollPane1.setBounds(80, 100, 450, 120);

    this.showmsg.setFont(new Font("MS Sans Serif", 1, 11));
    getContentPane().add(this.showmsg);
    this.showmsg.setBounds(80, 320, 360, 15);

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    setBounds((screenSize.width - 540) / 2, (screenSize.height - 388) / 2, 540, 388);
  }

  private void recoverbtnActionPerformed(ActionEvent evt)
  {
    String pass = this.password.getText();
    String fp = this.filepath.getText();

    if ((pass.length() > 0) && (fp.length() > 0))
    {
      this.showmsg.setText("Process...");
      try {
        Recover r = new Recover();
        r.Recover(fp);

        this.showmsg.setText("Process Completed");
        if (pass.equals(r.pass))
        {
          this.message.setText(r.msg);
          this.msgsize.setText("" + r.msg.length());
        }
        else {
          this.showmsg.setText("Invalid Password");
        }
      }
      catch (Exception e) {
        this.showmsg.setText("Failed");
      }

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
        new RecoverMessage().setVisible(true);
      }
    });
  }
}