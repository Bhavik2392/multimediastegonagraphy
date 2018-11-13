
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

public class MainFrame extends JFrame
{
  private JMenuItem contents;
  private JMenuItem exit;
  private JButton exitbtn;
  private JMenu help;
  private JMenuItem hidefile;
  private JButton hidefilebtn;
  private JMenuItem hidemessage;
  private JButton hidemessagebtn;
  private JMenuBar jMenuBar1;
  private JSeparator jSeparator2;
  private JSeparator jSeparator3;
  private JToolBar jToolBar1;
  private JMenuItem recoverfile;
  private JButton recoverfilebtn;
  private JMenuItem recovermsg;
  private JButton recovermsgbtn;
  private JMenu cryptography;

  public MainFrame()
  {
    initComponents();
  }

  private void initComponents()
  {
    this.jToolBar1 = new JToolBar();
    this.hidemessagebtn = new JButton();
    this.recovermsgbtn = new JButton();
    this.hidefilebtn = new JButton();
    this.recoverfilebtn = new JButton();
    this.exitbtn = new JButton();
    this.jMenuBar1 = new JMenuBar();
    this.cryptography = new JMenu();
    this.hidemessage = new JMenuItem();
    this.recovermsg = new JMenuItem();
    this.jSeparator3 = new JSeparator();
    this.hidefile = new JMenuItem();
    this.recoverfile = new JMenuItem();
    this.jSeparator2 = new JSeparator();
    this.exit = new JMenuItem();
    this.help = new JMenu();
    this.contents = new JMenuItem();

    getContentPane().setLayout(null);

    setDefaultCloseOperation(3);
    setTitle("CryptoDeck");
    this.hidemessagebtn.setText("Hide Message");
    this.hidemessagebtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        MainFrame.this.hidemessagebtnActionPerformed(evt);
      }
    });
    this.jToolBar1.add(this.hidemessagebtn);

    this.recovermsgbtn.setText("Recover Message");
    this.recovermsgbtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        MainFrame.this.recovermsgbtnActionPerformed(evt);
      }
    });
    this.jToolBar1.add(this.recovermsgbtn);

    this.hidefilebtn.setText("Hide File");
    this.hidefilebtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        MainFrame.this.hidefilebtnActionPerformed(evt);
      }
    });
    this.jToolBar1.add(this.hidefilebtn);

    this.recoverfilebtn.setText("Recover File");
    this.recoverfilebtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        MainFrame.this.recoverfilebtnActionPerformed(evt);
      }
    });
    this.jToolBar1.add(this.recoverfilebtn);

    this.exitbtn.setText("Exit");
    this.exitbtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        MainFrame.this.exitbtnActionPerformed(evt);
      }
    });
    this.jToolBar1.add(this.exitbtn);

    getContentPane().add(this.jToolBar1);
    this.jToolBar1.setBounds(0, 2, 620, 30);

    this.cryptography.setMnemonic('S');
    this.cryptography.setText("CryptoDeck");
    this.hidemessage.setAccelerator(KeyStroke.getKeyStroke(113, 0));
    this.hidemessage.setText("Hide Message...");
    this.hidemessage.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        MainFrame.this.hidemessageActionPerformed(evt);
      }
    });
    this.cryptography.add(this.hidemessage);

    this.recovermsg.setAccelerator(KeyStroke.getKeyStroke(115, 0));
    this.recovermsg.setText("Recover Message...");
    this.recovermsg.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        MainFrame.this.recovermsgActionPerformed(evt);
      }
    });
    this.cryptography.add(this.recovermsg);

    this.cryptography.add(this.jSeparator3);

    this.hidefile.setAccelerator(KeyStroke.getKeyStroke(114, 0));
    this.hidefile.setText("Hide File...");
    this.hidefile.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        MainFrame.this.hidefileActionPerformed(evt);
      }
    });
    this.cryptography.add(this.hidefile);

    this.recoverfile.setAccelerator(KeyStroke.getKeyStroke(116, 0));
    this.recoverfile.setText("Recover File...");
    this.recoverfile.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        MainFrame.this.recoverfileActionPerformed(evt);
      }
    });
    this.cryptography.add(this.recoverfile);

    this.cryptography.add(this.jSeparator2);

    this.exit.setAccelerator(KeyStroke.getKeyStroke(115, 8));
    this.exit.setText("Exit");
    this.exit.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        MainFrame.this.exitActionPerformed(evt);
      }
    });
    this.cryptography.add(this.exit);

    this.jMenuBar1.add(this.cryptography);

    this.help.setMnemonic('H');
    this.help.setText("Help");
    this.contents.setAccelerator(KeyStroke.getKeyStroke(112, 0));
    this.contents.setText("Contents");
    this.contents.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        MainFrame.this.contentsActionPerformed(evt);
      }
    });
    this.help.add(this.contents);

    this.jMenuBar1.add(this.help);

    setJMenuBar(this.jMenuBar1);

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    setBounds((screenSize.width - 624) / 2, (screenSize.height - 526) / 2, 624, 526);
  }

  private void recoverfileActionPerformed(ActionEvent evt)
  {
    RecoverFile rf = new RecoverFile();
    rf.show();
  }

  private void recoverfilebtnActionPerformed(ActionEvent evt) {
    RecoverFile rf = new RecoverFile();
    rf.show();
  }

  private void hidefileActionPerformed(ActionEvent evt)
  {
    HideFile hf = new HideFile();
    hf.show();
  }

  private void recovermsgActionPerformed(ActionEvent evt)
  {
    RecoverMessage r = new RecoverMessage();
    r.show();
  }

  private void hidefilebtnActionPerformed(ActionEvent evt)
  {
    HideFile hf = new HideFile();
    hf.show();
  }

  private void recovermsgbtnActionPerformed(ActionEvent evt)
  {
    RecoverMessage r = new RecoverMessage();
    r.show();
  }

  private void exitbtnActionPerformed(ActionEvent evt)
  {
    dispose();
  }

  private void hidemessageActionPerformed(ActionEvent evt)
  {
    HideMessage h = new HideMessage();
    h.show();
  }

  private void hidemessagebtnActionPerformed(ActionEvent evt)
  {
    HideMessage h = new HideMessage();
    h.show();
  }

  private void contentsActionPerformed(ActionEvent evt)
  {
    System.out.println("Hello");
    ContentsFrame f = new ContentsFrame();
    f.show();
  }

  private void exitActionPerformed(ActionEvent evt)
  {
    System.exit(0);
  }

  public static void main(String[] args)
  {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        new MainFrame().setVisible(true);
      }
    });
  }
}