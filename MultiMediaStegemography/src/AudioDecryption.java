import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * AudioDecryption.java
 *
 * Created on 23 December, 2013, 9:30 PM
 */

/**
 *
 * @author  ASHWIN
 */
public class AudioDecryption extends javax.swing.JFrame {
    
	InputStream ins;
            int c=0,n=0,j,i=0,m=0,cou=0,tln=0,tn=1,k=0,t=0,coun=0,pb=0,thr=0,h=0,strl=0,hel=0,inr=0;
	String str="",cr="",sam="";
        String address,form=".wav";
    
    /**
     * Creates new form AudioDecryption
     */
    public AudioDecryption() {
        
        /** to put frame in center of screen **/
          setTitle("AUDIO DECRYPTION");
            // setContentPane(new JLabel(new ImageIcon("STEGO/Tech.jpg")));
            Toolkit toolkit = getToolkit();
            Dimension size = toolkit.getScreenSize();
            setLocation(size.width/3-getWidth()/3,size.height/5-getHeight()/5);
            
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFile = new javax.swing.JTextField();
        txtKey = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();
        btnBrowse = new javax.swing.JButton();
        btnDecrypt = new javax.swing.JButton();
        btnMainMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("AUDIO DECRYPTION");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Browse File :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Secret Key :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Message :");

        txtMessage.setColumns(20);
        txtMessage.setRows(5);
        jScrollPane1.setViewportView(txtMessage);

        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        btnDecrypt.setText("Decrypt");
        btnDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecryptActionPerformed(evt);
            }
        });

        btnMainMenu.setText("Back");
        btnMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel1)
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDecrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(btnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtKey, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(txtFile, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBrowse)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrowse))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMainMenu)
                            .addComponent(btnDecrypt)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecryptActionPerformed
// TODO add your handling code here:
        cou=0;
c=0;
String dis="";
n=0;
str=txtKey.getText();
t=0;
tln=str.length();

for(int i=0;i<tln;i++)
{
tn=(int)str.charAt(i);
t=t ^ tn;
}
t=t>>1;	
inr=0;
try
{
InputStream in =new FileInputStream(txtFile.getText());
while(c!=-1)
{
	cou=0;
	char ex[]=new char[8];
	
	do
	{
		c=in.read();
		
		if((c==254)||(c==255))
		{
			BigDecimal bc=new BigDecimal(c);
			BigInteger bi=bc.toBigInteger();
			cr=bi.toString(2);
			ex[cou]=cr.charAt(cr.length()-1);
			cou+=1;
									
		}
		
		
	}while(cou<=7);
	
	m=0;
	k=0;
	for(i=0;i<=7;i++)
	{
		k=k+1;
		Character cs=new Character(ex[i]);
		String sr=cs.toString();
		n=Integer.parseInt(sr);
		for(j=0;j<k;j++)
		{
			if(j!=0)
				n=n*2;
		}
			
			m=m+n;
			
				
	}
	
	
	if(m==255)	
		c=-1;
	else
	m=m-t;
	if((m!=35)&&(m<255))
		dis=dis+""+(char)m;
	
	else if(m==32)
	System.out.print(" ");
	
	else if(m==10)
	dis=dis+"";
	
	else if(m==9)
	dis=dis+"";
}


JOptionPane.showMessageDialog(this,"The message is successfully decoded from the file.","INFORM",JOptionPane.INFORMATION_MESSAGE);
txtMessage.setText(dis);
in.close();
}

catch(Exception e)
{
JOptionPane.showMessageDialog(this,"There was an error in decoding.Please check again","ERROR",JOptionPane.ERROR_MESSAGE);
}      
    }//GEN-LAST:event_btnDecryptActionPerformed

    private void btnMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainMenuActionPerformed
// TODO add your handling code here:
        new MainPage().show();
        this.hide();
    }//GEN-LAST:event_btnMainMenuActionPerformed

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
// TODO add your handling code here:
         JFileChooser filechooser=new JFileChooser(JFileChooser.SELECTED_FILES_CHANGED_PROPERTY);
	File f=new File("\\Sample_Audios\\");
	filechooser.setCurrentDirectory(f);
	filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
	//filechooser.setFileFilter(new filter());
	String se="";
	int r=filechooser.showOpenDialog(this);
	File fc=filechooser.getCurrentDirectory();
				
	File tempfilename=filechooser.getSelectedFile(); 
	
      	if(r==JFileChooser.CANCEL_OPTION)
	       JOptionPane.showMessageDialog(this,"File Not Selected","Error",JOptionPane.ERROR_MESSAGE);	
      	else
        		se=""+fc+"\\"+tempfilename.getName();
	int ind=se.indexOf('\\',3);
	
	if(ind==3)
	{
	StringBuffer sbu= new StringBuffer(se);
	sbu.deleteCharAt(ind);
	se=sbu.toString();
	}
		
	txtFile.setText(se);
    }//GEN-LAST:event_btnBrowseActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AudioDecryption().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnDecrypt;
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtFile;
    private javax.swing.JTextField txtKey;
    private javax.swing.JTextArea txtMessage;
    // End of variables declaration//GEN-END:variables
    
}
