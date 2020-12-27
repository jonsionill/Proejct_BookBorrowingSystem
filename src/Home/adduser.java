
package Home;


import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class adduser extends javax.swing.JPanel {
public static DefaultTableModel tblmodel = new DefaultTableModel();
   
    public adduser() {
        initComponents();
        tblmodel = (DefaultTableModel) UserForm.tb_user.getModel();
        //records();
    }
      public ArrayList<UserDetails> userlist(){
     ArrayList<UserDetails>userflist = new ArrayList();
       try {
        String query1 = "SELECT * FROM tb_user order by stf_id desc";
        BookBorrowingSystem.rst= BookBorrowingSystem.stm.executeQuery(query1);
        UserDetails user;
        while(BookBorrowingSystem.rst.next()){
            user= new UserDetails(BookBorrowingSystem.rst.getInt("stf_id"), BookBorrowingSystem.rst.getString("stf_lname") + ", " + BookBorrowingSystem.rst.getString("stf_fname") + " " + BookBorrowingSystem.rst.getString("stf_mname"), BookBorrowingSystem.rst.getString("stf_contactno"), BookBorrowingSystem.rst.getString("stf_address"), BookBorrowingSystem.rst.getString("stf_email"));
            userflist.add(user);
        }
    } catch (Exception ex) {
        Logger.getLogger(UserForm1.class.getName()).log(Level.SEVERE, null, ex);
    }
      return userflist;
       
   }
  
 public void records(){
       ArrayList<UserDetails> list = userlist();
       Object[] row = new Object[5];
       for(int i=0;i<list.size();i++){
           row[0]=list.get(i).getid();
           row[1]=list.get(i).getname();
           row[2]=list.get(i).getcontact();
           row[3]=list.get(i).getaddress();
           row[4]=list.get(i).getemail();
          tblmodel.addRow(row);
           
       }
 }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        epanel1 = new javax.swing.JPanel();
        myear2 = new javax.swing.JLabel();
        ucontact = new javax.swing.JTextField();
        ulname = new javax.swing.JTextField();
        myear5 = new javax.swing.JLabel();
        ufname = new javax.swing.JTextField();
        myear7 = new javax.swing.JLabel();
        myear8 = new javax.swing.JLabel();
        umname = new javax.swing.JTextField();
        myear9 = new javax.swing.JLabel();
        uaddress = new javax.swing.JTextField();
        myear10 = new javax.swing.JLabel();
        myear11 = new javax.swing.JLabel();
        uemail = new javax.swing.JTextField();
        myear12 = new javax.swing.JLabel();
        utype = new javax.swing.JComboBox();
        myear13 = new javax.swing.JLabel();
        upassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        epanel1.setBackground(new java.awt.Color(255, 255, 255));
        epanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myear2.setBackground(new java.awt.Color(255, 255, 255));
        myear2.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        myear2.setForeground(new java.awt.Color(10, 37, 68));
        myear2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear2.setText("*Please fill in the required fields:");
        epanel1.add(myear2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        ucontact.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        epanel1.add(ucontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 150, 30));

        ulname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        epanel1.add(ulname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 180, 30));

        myear5.setBackground(new java.awt.Color(255, 255, 255));
        myear5.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear5.setForeground(new java.awt.Color(10, 37, 68));
        myear5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear5.setText("Contact No");
        epanel1.add(myear5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, -1, -1));

        ufname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        epanel1.add(ufname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 200, 30));

        myear7.setBackground(new java.awt.Color(255, 255, 255));
        myear7.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear7.setForeground(new java.awt.Color(10, 37, 68));
        myear7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear7.setText("Last name");
        epanel1.add(myear7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        myear8.setBackground(new java.awt.Color(255, 255, 255));
        myear8.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear8.setForeground(new java.awt.Color(10, 37, 68));
        myear8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear8.setText("First name");
        epanel1.add(myear8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 120, -1));

        umname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        epanel1.add(umname, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 170, 30));

        myear9.setBackground(new java.awt.Color(255, 255, 255));
        myear9.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear9.setForeground(new java.awt.Color(10, 37, 68));
        myear9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear9.setText("Middle name");
        epanel1.add(myear9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 110, -1));

        uaddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        epanel1.add(uaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 320, 30));

        myear10.setBackground(new java.awt.Color(255, 255, 255));
        myear10.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear10.setForeground(new java.awt.Color(10, 37, 68));
        myear10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear10.setText("Address");
        epanel1.add(myear10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        myear11.setBackground(new java.awt.Color(255, 255, 255));
        myear11.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear11.setForeground(new java.awt.Color(10, 37, 68));
        myear11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear11.setText("Email");
        epanel1.add(myear11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        uemail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        epanel1.add(uemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 200, 30));

        myear12.setBackground(new java.awt.Color(255, 255, 255));
        myear12.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear12.setForeground(new java.awt.Color(10, 37, 68));
        myear12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear12.setText("Password");
        epanel1.add(myear12, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, -1, -1));

        utype.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        utype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Cataloger", "Librarian" }));
        epanel1.add(utype, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 130, 30));

        myear13.setBackground(new java.awt.Color(255, 255, 255));
        myear13.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear13.setForeground(new java.awt.Color(10, 37, 68));
        myear13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear13.setText("Type");
        epanel1.add(myear13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));
        epanel1.add(upassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 140, 170, 30));

        jButton1.setBackground(new java.awt.Color(15, 35, 40));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/save2.png"))); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        epanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 60, 120, 60));

        add(epanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 210));
    }// </editor-fold>//GEN-END:initComponents

    private void addbirthKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addbirthKeyReleased
      
    }//GEN-LAST:event_addbirthKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
SimpleDateFormat sysdate = new SimpleDateFormat("yyyy/MM/dd");                 
        try{
            String aduser[]= new String[8];
           aduser[0]=ulname.getText();
           aduser[1]=ufname.getText();
           aduser[2]=umname.getText();
           aduser[3]=ucontact.getText();
           aduser[4]=uaddress.getText();
           aduser[5]=uemail.getText();
           aduser[6]=utype.getSelectedItem().toString();
           aduser[7]=upassword.getText();
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_bbsystem","root","");
           PreparedStatement ps = conn.prepareStatement("insert into tb_user( stf_lname, stf_fname, stf_mname, stf_contactno, stf_address, stf_email, stf_type, stf_password) values(?,?,?,?,?,?,?,?)");
           ps.setString(1, aduser[0]);
           ps.setString(2, aduser[1]);
           ps.setString(3, aduser[2]);
           ps.setString(4, aduser[3]);
           ps.setString(5, aduser[4]);
           ps.setString(6, aduser[5]);
           ps.setString(7, aduser[6]);
           ps.setString(8, aduser[7]);
           ps.executeUpdate();
          JOptionPane.showMessageDialog(null,"Record Inserted!", "Message", JOptionPane.INFORMATION_MESSAGE);
                 ulname.setText("");
                 ufname.setText("");
                 umname.setText("");
                 ucontact.setText("");
                 uaddress.setText("");
                 uemail.setText("");
                 utype.setSelectedItem("");
                 upassword.setText("");
                 UserForm.tblmodel.setRowCount(0);
                 records();
        }catch(Exception e){
            e.printStackTrace();
        }
                                                                                        
                                                                                           
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel epanel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel myear10;
    private javax.swing.JLabel myear11;
    private javax.swing.JLabel myear12;
    private javax.swing.JLabel myear13;
    private javax.swing.JLabel myear2;
    private javax.swing.JLabel myear5;
    private javax.swing.JLabel myear7;
    private javax.swing.JLabel myear8;
    private javax.swing.JLabel myear9;
    private javax.swing.JTextField uaddress;
    private javax.swing.JTextField ucontact;
    private javax.swing.JTextField uemail;
    private javax.swing.JTextField ufname;
    private javax.swing.JTextField ulname;
    private javax.swing.JTextField umname;
    private javax.swing.JPasswordField upassword;
    private javax.swing.JComboBox utype;
    // End of variables declaration//GEN-END:variables
}
