
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


public class editpatron extends javax.swing.JPanel {
public static DefaultTableModel tblmodel = new DefaultTableModel();
   
    public editpatron() {
        initComponents();
        tblmodel = (DefaultTableModel) PatronForm.tb_patron.getModel();
        records();
    }
     public ArrayList<PatronDetails> patronlist(){
     ArrayList<PatronDetails>patronflist = new ArrayList();
       try {
        String query1 = "SELECT * FROM tb_patron order by library_id desc";
        BookBorrowingSystem.rst= BookBorrowingSystem.stm.executeQuery(query1);
        PatronDetails patron;
        while(BookBorrowingSystem.rst.next()){
            patron= new PatronDetails(BookBorrowingSystem.rst.getInt("library_id"), BookBorrowingSystem.rst.getString("patron_lname") + ", " + BookBorrowingSystem.rst.getString("patron_fname") + " " + BookBorrowingSystem.rst.getString("patron_mname"), BookBorrowingSystem.rst.getString("address"), BookBorrowingSystem.rst.getString("birthdate"), BookBorrowingSystem.rst.getString("contact_no"), BookBorrowingSystem.rst.getString("email_add"));
            patronflist.add(patron);
        }
    } catch (Exception ex) {
        Logger.getLogger(UserForm1.class.getName()).log(Level.SEVERE, null, ex);
    }
      return patronflist;
       
   }
  
 public void records(){
       ArrayList<PatronDetails> list = patronlist();
       Object[] row = new Object[6];
       for(int i=0;i<list.size();i++){
           row[0]=list.get(i).getid();
           row[1]=list.get(i).getname();           
           row[2]=list.get(i).getaddress();
           row[3]=list.get(i).getbirthdate();
           row[4]=list.get(i).getcontact();
           row[5]=list.get(i).getemail();
          tblmodel.addRow(row);
           
       }
 }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        epanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        pemail = new javax.swing.JTextField();
        myear11 = new javax.swing.JLabel();
        pcontact = new javax.swing.JTextField();
        myear5 = new javax.swing.JLabel();
        pbirthdate = new com.toedter.calendar.JDateChooser();
        plname = new javax.swing.JTextField();
        myear7 = new javax.swing.JLabel();
        myear10 = new javax.swing.JLabel();
        myear2 = new javax.swing.JLabel();
        myear8 = new javax.swing.JLabel();
        pfname = new javax.swing.JTextField();
        myear9 = new javax.swing.JLabel();
        pmname = new javax.swing.JTextField();
        myear14 = new javax.swing.JLabel();
        paddress = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        epanel1.setBackground(new java.awt.Color(255, 255, 255));
        epanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        epanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 120, 120, 60));

        pemail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        epanel1.add(pemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 200, 30));

        myear11.setBackground(new java.awt.Color(255, 255, 255));
        myear11.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear11.setForeground(new java.awt.Color(10, 37, 68));
        myear11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear11.setText("Email");
        epanel1.add(myear11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, -1, -1));

        pcontact.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        epanel1.add(pcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 150, 30));

        myear5.setBackground(new java.awt.Color(255, 255, 255));
        myear5.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear5.setForeground(new java.awt.Color(10, 37, 68));
        myear5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear5.setText("Contact No");
        epanel1.add(myear5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));

        pbirthdate.setDateFormatString("MM/dd/yyyy");
        epanel1.add(pbirthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 180, 30));

        plname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        epanel1.add(plname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 180, 30));

        myear7.setBackground(new java.awt.Color(255, 255, 255));
        myear7.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear7.setForeground(new java.awt.Color(10, 37, 68));
        myear7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear7.setText("Last name");
        epanel1.add(myear7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        myear10.setBackground(new java.awt.Color(255, 255, 255));
        myear10.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear10.setForeground(new java.awt.Color(10, 37, 68));
        myear10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear10.setText("Birthdate");
        epanel1.add(myear10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        myear2.setBackground(new java.awt.Color(255, 255, 255));
        myear2.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        myear2.setForeground(new java.awt.Color(10, 37, 68));
        myear2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear2.setText("*Please fill in the required fields:");
        epanel1.add(myear2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        myear8.setBackground(new java.awt.Color(255, 255, 255));
        myear8.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear8.setForeground(new java.awt.Color(10, 37, 68));
        myear8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear8.setText("First name");
        epanel1.add(myear8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 120, -1));

        pfname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        epanel1.add(pfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 200, 30));

        myear9.setBackground(new java.awt.Color(255, 255, 255));
        myear9.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear9.setForeground(new java.awt.Color(10, 37, 68));
        myear9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear9.setText("Middle name");
        epanel1.add(myear9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 110, -1));

        pmname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        epanel1.add(pmname, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 170, 30));

        myear14.setBackground(new java.awt.Color(255, 255, 255));
        myear14.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear14.setForeground(new java.awt.Color(10, 37, 68));
        myear14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear14.setText("Address");
        epanel1.add(myear14, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, -1, -1));

        paddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        epanel1.add(paddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 320, 30));

        add(epanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 210));
    }// </editor-fold>//GEN-END:initComponents

    private void addbirthKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addbirthKeyReleased
      
    }//GEN-LAST:event_addbirthKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SimpleDateFormat sysdate = new SimpleDateFormat("yyyy-MM-dd");    
        try{
          String eduser[]= new String[7];
           eduser[0]=plname.getText();
           eduser[1]=pfname.getText();
           eduser[2]=pmname.getText();
           eduser[3]=paddress.getText();
           eduser[4]=sysdate.format(pbirthdate.getDate());
           eduser[5]=pcontact.getText();
           eduser[6]=pemail.getText();
          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_bbsystem","root","");
          String UpdateQuery = ("UPDATE tb_patron SET patron_lname = ?, patron_fname = ?, patron_mname = ?, address = ?, birthdate = ?, contact_no = ?, email_add = ? WHERE library_id =" + PatronForm.hint.getText() + "");
          PreparedStatement ps = conn.prepareStatement(UpdateQuery);
           ps.setString(1, eduser[0]);
           ps.setString(2, eduser[1]);
           ps.setString(3, eduser[2]);
           ps.setString(4, eduser[3]);
           ps.setString(5, eduser[4]);
           ps.setString(6, eduser[5]);
           ps.setString(7, eduser[6]);
           ps.executeUpdate();
          JOptionPane.showMessageDialog(null,"Record Updated!", "Message", JOptionPane.INFORMATION_MESSAGE);
                 plname.setText("");
                 pfname.setText("");
                 pmname.setText("");
                 pcontact.setText("");
                 paddress.setText("");
                 pemail.setText("");
                 pbirthdate.setCalendar(null);
                 PatronForm.tblmodel.setRowCount(0);
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
    private javax.swing.JLabel myear14;
    private javax.swing.JLabel myear2;
    private javax.swing.JLabel myear5;
    private javax.swing.JLabel myear7;
    private javax.swing.JLabel myear8;
    private javax.swing.JLabel myear9;
    public static javax.swing.JTextField paddress;
    public static com.toedter.calendar.JDateChooser pbirthdate;
    public static javax.swing.JTextField pcontact;
    public static javax.swing.JTextField pemail;
    public static javax.swing.JTextField pfname;
    public static javax.swing.JTextField plname;
    public static javax.swing.JTextField pmname;
    // End of variables declaration//GEN-END:variables
}
