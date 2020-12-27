
package Home;


import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;



public class PatronFormBorrow extends javax.swing.JInternalFrame {
public static DefaultTableModel tblmodel = new DefaultTableModel();
public static int patron_id= 0;
public static int staff_id= 0;


    public PatronFormBorrow() {
    initComponents();
    tblmodel = (DefaultTableModel) tb_patron.getModel();
    tb_patron.setAutoResizeMode(tb_patron.AUTO_RESIZE_OFF);
    records();
    tbheader();
    TableColumn col = tb_patron.getColumnModel().getColumn(0);
    col.setPreferredWidth(50);
    col = tb_patron.getColumnModel().getColumn(1);
    col.setPreferredWidth(250);
    col = tb_patron.getColumnModel().getColumn(2);
    col.setPreferredWidth(350);
    col = tb_patron.getColumnModel().getColumn(3);
    col.setPreferredWidth(150);
    col = tb_patron.getColumnModel().getColumn(4);
    col.setPreferredWidth(150);
    col = tb_patron.getColumnModel().getColumn(5);
    col.setPreferredWidth(150);
   
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
   
  void tbheader(){
    JTableHeader tbhead = tb_patron.getTableHeader();
    tbhead.setForeground(new Color(15,35,40));
    tbhead.setBackground(new Color(255,255,255));
    tbhead.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
    
    try {
            BookBorrowingSystem.stm = BookBorrowingSystem.con.createStatement();
            BookBorrowingSystem.rst = BookBorrowingSystem.stm.executeQuery("select count(library_id) from tb_patron");
            while(BookBorrowingSystem.rst.next()){

               countrec.setText(BookBorrowingSystem.rst.getString("count(library_id)"));
            }
        }catch(Exception ex){}
        
    
}
 
   
  
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        countrec = new javax.swing.JLabel();
        searchuser = new org.jdesktop.xswingx.JXTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_patron = new javax.swing.JTable();
        hint = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(10, 37, 68));
        setBorder(null);
        setClosable(true);
        setForeground(new java.awt.Color(0, 153, 153));
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Patron Form");
        setFrameIcon(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(15, 35, 40));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(15, 35, 40));
        jLabel3.setText("PATRON");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        jLabel2.setBackground(new java.awt.Color(15, 35, 40));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(15, 35, 40));
        jLabel2.setText("LIST OF");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel5.setText("No. of Record/s:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        countrec.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jPanel1.add(countrec, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 40, 20));

        searchuser.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        searchuser.setPrompt("Search here");
        searchuser.setPromptForeground(new java.awt.Color(102, 102, 102));
        searchuser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchuserFocusLost(evt);
            }
        });
        searchuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                searchuserMousePressed(evt);
            }
        });
        searchuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchuserKeyReleased(evt);
            }
        });
        jPanel1.add(searchuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 200, 30));

        tb_patron.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tb_patron.setForeground(new java.awt.Color(15, 35, 40));
        tb_patron.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Name", "Address", "Birthdate", "Contact No.", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_patron.setFocusable(false);
        tb_patron.setGridColor(new java.awt.Color(204, 204, 204));
        tb_patron.setInheritsPopupMenu(true);
        tb_patron.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tb_patron.setRowHeight(50);
        tb_patron.setSelectionBackground(new java.awt.Color(107, 166, 171));
        tb_patron.setShowVerticalLines(false);
        tb_patron.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_patronMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_patron);
        if (tb_patron.getColumnModel().getColumnCount() > 0) {
            tb_patron.getColumnModel().getColumn(0).setResizable(false);
            tb_patron.getColumnModel().getColumn(1).setResizable(false);
            tb_patron.getColumnModel().getColumn(2).setResizable(false);
            tb_patron.getColumnModel().getColumn(3).setResizable(false);
            tb_patron.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 1100, 230));

        hint.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(hint, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 120, 10));

        jButton1.setBackground(new java.awt.Color(15, 35, 40));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SELECT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 300, 90, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed

    }//GEN-LAST:event_jPanel1MousePressed

    private void searchuserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchuserKeyReleased
        try {
            TableRowSorter<DefaultTableModel> search = new TableRowSorter<>(tblmodel);
            tb_patron.setRowSorter(search);

            if (searchuser.getText().isEmpty()){
                search.setRowFilter(RowFilter.regexFilter(""));
            }
            else {
                search.setRowFilter(RowFilter.regexFilter("(?i)"+"^*"+ searchuser.getText() + "$*" ));
                countrec.setText(tb_patron.getRowCount()+"");
            }
        }catch (Exception er){}
    }//GEN-LAST:event_searchuserKeyReleased

    private void searchuserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchuserMousePressed

    }//GEN-LAST:event_searchuserMousePressed

    private void searchuserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchuserFocusLost

    }//GEN-LAST:event_searchuserFocusLost

    private void tb_patronMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_patronMouseClicked
        hint.setText(tb_patron.getValueAt(tb_patron.getSelectedRow(), 0).toString());
    }//GEN-LAST:event_tb_patronMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String name="";
      String pname="";
      int id =0;
      int pid =0;
        try {
              BookBorrowingSystem.stm = BookBorrowingSystem.con.createStatement();
              BookBorrowingSystem.rst = BookBorrowingSystem.stm.executeQuery("select * from tb_user where stf_id='"+BookBorrowingSystem.staff+"'");
              
              while(BookBorrowingSystem.rst.next()){
                       
                       id = BookBorrowingSystem.rst.getInt("stf_id");
                       name = BookBorrowingSystem.rst.getString("stf_fname") +" "+BookBorrowingSystem.rst.getString("stf_mname")+ " " + BookBorrowingSystem.rst.getString("stf_lname");
              }
              
              BookBorrowingSystem.stm = BookBorrowingSystem.con.createStatement();
              BookBorrowingSystem.rst = BookBorrowingSystem.stm.executeQuery("select * from tb_patron where library_id='"+hint.getText()+"'");
              
              while(BookBorrowingSystem.rst.next()){
                       
                       pid = BookBorrowingSystem.rst.getInt("library_id");
                       pname = BookBorrowingSystem.rst.getString("patron_fname") +" "+BookBorrowingSystem.rst.getString("patron_mname")+ " " + BookBorrowingSystem.rst.getString("patron_lname");
              }
              
           patron_id=pid;
           staff_id=id;
          
              
              Checkoutform.searchpatron.setText(pid+"");
              Checkoutform.patron.setText(pname);
              Checkoutform.stafff.setText(name);
              dispose();
                
       }catch (Exception ee){ee.printStackTrace();}
                
    }//GEN-LAST:event_jButton1ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel countrec;
    public static javax.swing.JLabel hint;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.xswingx.JXTextField searchuser;
    public static javax.swing.JTable tb_patron;
    // End of variables declaration//GEN-END:variables
}
