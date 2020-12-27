
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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;



public class Checkoutform extends javax.swing.JInternalFrame {
public static DefaultTableModel tblmodel = new DefaultTableModel();
GridBagLayout layout = new GridBagLayout();
addpatron add;
editpatron edit;
String listar [] = new String[3];

    public Checkoutform() {
    initComponents();   
    tblmodel = (DefaultTableModel) tb_book.getModel();
    tb_book.setAutoResizeMode(tb_book.AUTO_RESIZE_OFF);
    records();
    tbheader();
    TableColumn col = tb_book.getColumnModel().getColumn(0);
    col.setPreferredWidth(50);
    col = tb_book.getColumnModel().getColumn(1);
    col.setPreferredWidth(250);
    col = tb_book.getColumnModel().getColumn(2);
    col.setPreferredWidth(350);
    col = tb_book.getColumnModel().getColumn(3);
    col.setPreferredWidth(150);
    col = tb_book.getColumnModel().getColumn(4);
    col.setPreferredWidth(150);
    col = tb_book.getColumnModel().getColumn(5);
    col.setPreferredWidth(150);
   
    }
    
public ArrayList<BookMenu> booklist(){
     ArrayList<BookMenu>booklist = new ArrayList();
       try {
        String query1 = "SELECT * FROM tb_bookrecords where status ='"+"Available"+"'order by accession_no desc";
        BookBorrowingSystem.rst= BookBorrowingSystem.stm.executeQuery(query1);
        BookMenu bookcopy;
        while(BookBorrowingSystem.rst.next()){
            bookcopy= new BookMenu(BookBorrowingSystem.rst.getInt("accession_no"),BookBorrowingSystem.rst.getString("title") ,BookBorrowingSystem.rst.getString("author"), BookBorrowingSystem.rst.getInt("copyright"),BookBorrowingSystem.rst.getString("location") ,BookBorrowingSystem.rst.getString("status"));
            booklist.add(bookcopy);
        }
    } catch (Exception ex) {
        
    }
      return booklist;
       
   }
  
 public void records(){
       ArrayList<BookMenu> list = booklist();
       Object[] row = new Object[6];
       for(int i=0;i<list.size();i++){
           row[0]=list.get(i).getid();
           row[1]=list.get(i).gettitle();
           row[2]=list.get(i).getauthor();
           row[3]=list.get(i).getcopyright();
           row[4]=list.get(i).getlocation();
           row[5]=list.get(i).getstatus();
           tblmodel.addRow(row);
           
       }
       
   } 
   
  void tbheader(){
    JTableHeader tbhead = tb_book.getTableHeader();
    JTableHeader tbheads = tb_lborrow.getTableHeader();
    tbhead.setForeground(new Color(15,35,40));
    tbheads.setForeground(new Color(15,35,40));
    tbhead.setBackground(new Color(255,255,255));
    tbheads.setBackground(new Color(255,255,255));
    tbhead.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
    tbheads.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
    
    try {
            BookBorrowingSystem.stm = BookBorrowingSystem.con.createStatement();
            BookBorrowingSystem.rst = BookBorrowingSystem.stm.executeQuery("select count(accession_no) from tb_bookrecords");
            while(BookBorrowingSystem.rst.next()){

               countrec.setText(BookBorrowingSystem.rst.getString("count(accession_no)"));
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
        jLabel4 = new javax.swing.JLabel();
        searchuser = new org.jdesktop.xswingx.JXTextField();
        hint = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        searchpatron = new org.jdesktop.xswingx.JXTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        stafff = new javax.swing.JLabel();
        patron = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_book = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_lborrow = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        duedate = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(10, 37, 68));
        setBorder(null);
        setClosable(true);
        setForeground(new java.awt.Color(0, 153, 153));
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Check Out Form");
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
        jLabel3.setText("CHECK OUT");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, -1));

        jLabel2.setBackground(new java.awt.Color(15, 35, 40));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(15, 35, 40));
        jLabel2.setText("FORM");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel5.setText("No. of Record/s:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        countrec.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jPanel1.add(countrec, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 40, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jLabel4.setText("LIST OF BOOKS TO BORROW");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, -1, -1));

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
        jPanel1.add(searchuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 290, 200, 30));

        hint.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(hint, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 120, 10));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jLabel6.setText("LIST OF AVAILABLE BOOKS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, -1, -1));

        searchpatron.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        searchpatron.setPrompt("Library ID");
        searchpatron.setPromptForeground(new java.awt.Color(102, 102, 102));
        searchpatron.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchpatronFocusLost(evt);
            }
        });
        searchpatron.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                searchpatronMousePressed(evt);
            }
        });
        searchpatron.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchpatronKeyReleased(evt);
            }
        });
        jPanel1.add(searchpatron, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 110, 30));

        jButton1.setBackground(new java.awt.Color(15, 35, 40));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Due date:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 60, 90, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Served by:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 100, 40));

        stafff.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(stafff, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 270, 40));

        patron.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(patron, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 270, 40));

        tb_book.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tb_book.setForeground(new java.awt.Color(15, 35, 40));
        tb_book.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Title", "Author", "Copyright", "Location", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_book.setFocusable(false);
        tb_book.setGridColor(new java.awt.Color(204, 204, 204));
        tb_book.setInheritsPopupMenu(true);
        tb_book.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tb_book.setRowHeight(50);
        tb_book.setSelectionBackground(new java.awt.Color(107, 166, 171));
        tb_book.setShowVerticalLines(false);
        tb_book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_bookMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_book);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 1100, 240));

        tb_lborrow.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tb_lborrow.setForeground(new java.awt.Color(15, 35, 40));
        tb_lborrow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Title", "Author", "Copyright"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_lborrow.setFocusable(false);
        tb_lborrow.setGridColor(new java.awt.Color(204, 204, 204));
        tb_lborrow.setInheritsPopupMenu(true);
        tb_lborrow.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tb_lborrow.setRowHeight(50);
        tb_lborrow.setSelectionBackground(new java.awt.Color(107, 166, 171));
        tb_lborrow.setShowVerticalLines(false);
        tb_lborrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_lborrowMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_lborrow);
        if (tb_lborrow.getColumnModel().getColumnCount() > 0) {
            tb_lborrow.getColumnModel().getColumn(0).setResizable(false);
            tb_lborrow.getColumnModel().getColumn(1).setResizable(false);
            tb_lborrow.getColumnModel().getColumn(2).setResizable(false);
            tb_lborrow.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 770, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Documents\\Image\\line.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 1130, 240));

        jButton2.setBackground(new java.awt.Color(15, 35, 40));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add to List");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 530, 120, 40));

        jButton3.setBackground(new java.awt.Color(15, 35, 40));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Check Out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 210, 120, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Patron:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 60, 40));

        duedate.setDateFormatString("MM/dd/yyyy");
        jPanel1.add(duedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 90, 180, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed

    }//GEN-LAST:event_jPanel1MousePressed

    private void searchuserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchuserKeyReleased
        try {
            TableRowSorter<DefaultTableModel> search = new TableRowSorter<>(tblmodel);
            tb_book.setRowSorter(search);

            if (searchuser.getText().isEmpty()){
                search.setRowFilter(RowFilter.regexFilter(""));
            }
            else {
                search.setRowFilter(RowFilter.regexFilter("(?i)"+"^*"+ searchuser.getText() + "$*" ));
                countrec.setText(tb_book.getRowCount()+"");
            }
        }catch (Exception er){}
    }//GEN-LAST:event_searchuserKeyReleased

    private void searchuserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchuserMousePressed

    }//GEN-LAST:event_searchuserMousePressed

    private void searchuserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchuserFocusLost

    }//GEN-LAST:event_searchuserFocusLost

    private void searchpatronFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchpatronFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_searchpatronFocusLost

    private void searchpatronMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchpatronMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchpatronMousePressed

    private void searchpatronKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchpatronKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_searchpatronKeyReleased

    private void tb_lborrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_lborrowMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_lborrowMouseClicked

    private void tb_bookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_bookMouseClicked
        hint.setText(tb_book.getValueAt(tb_book.getSelectedRow(), 0).toString());
        
    }//GEN-LAST:event_tb_bookMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PatronFormBorrow pfb = new PatronFormBorrow();
        MenuPage.desktop.add(pfb);
        pfb.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       DefaultTableModel model1 = (DefaultTableModel) tb_lborrow.getModel();
        int indexs[] = tb_book.getSelectedRows();
        int limit=tb_lborrow.getRowCount();
        Object[] row = new Object[4];
        
        for (int i =0; i< indexs.length; i++){
            row[0]= tblmodel.getValueAt(indexs[i], 0);
            row[1]= tblmodel.getValueAt(indexs[i], 1);
            row[2]= tblmodel.getValueAt(indexs[i], 2);
            row[3]= tblmodel.getValueAt(indexs[i], 3);
       
            if(limit<=2){
                 tblmodel.removeRow(i);
                 model1.addRow(row);
                 
                 
            }else{
                JOptionPane.showMessageDialog(null, "MAX of 3 books only", "Error", JOptionPane.ERROR_MESSAGE );
            }
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     DefaultTableModel model1 = (DefaultTableModel) tb_lborrow.getModel();
       SimpleDateFormat sysdate = new SimpleDateFormat("yyyy/MM/dd");
       SimpleDateFormat sydate = new SimpleDateFormat("yyyy/MM/dd");
       //String due= sysdate.format(duedate.getDate());  
        Date d = new Date();
        String timee=MenuPage.time.getText();
        String dd="";
       
        try{
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_bbsystem","root","");
           PreparedStatement ps = conn.prepareStatement("insert into tb_loan(stf_id, library_id, release_date, release_time) values(?,?,?,?)");
           ps.setInt(1, PatronFormBorrow.staff_id);
           ps.setInt(2, PatronFormBorrow.patron_id);
           ps.setString(3, sysdate.format(d));
           ps.setString(4, timee);
           ps.executeUpdate();}catch(Exception ee){
            ee.printStackTrace();
        }
        try {
              BookBorrowingSystem.stm = BookBorrowingSystem.con.createStatement();
              BookBorrowingSystem.rst = BookBorrowingSystem.stm.executeQuery("select * from tb_loan where stf_id='"+PatronFormBorrow.staff_id+"' AND library_id='"+PatronFormBorrow.patron_id+"' AND release_date='"+sysdate.format(d)+"' AND release_time='"+timee+"'");
              
              while(BookBorrowingSystem.rst.next()){
                       
                       dd= BookBorrowingSystem.rst.getString("loan_id");
                       
                                       
                }
            
       }catch (Exception ee){ee.printStackTrace();}
    String rec[]=new String[3];
   int limit = tb_lborrow.getRowCount();
   for (int a = 0; a<=2; a++){
       rec[a]=tb_lborrow.getValueAt(a,0).toString();
       try{ 
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_bbsystem","root","");
           PreparedStatement pr = con.prepareStatement("insert into tb_loanbook(accession_no, loan_id ,due_date) values(?,?,?)");
           pr.setString(1, rec[a]);
           pr.setString(2, dd);
           pr.setString(3,sydate.format(duedate.getDate()));
           pr.executeUpdate();
           
          String UpdateQuery = ("UPDATE tb_bookcopy SET status = ? WHERE accession_no ='" + rec[a] + "'");
          PreparedStatement pa = con.prepareStatement(UpdateQuery);
          pa.setString(1, "Loaned Out");
          pa.executeUpdate();}catch(Exception ee){
            ee.printStackTrace();
            
        }
       
   }
    
  JOptionPane.showMessageDialog(null, "Book Borrowed Succesfully!", "Message", JOptionPane.INFORMATION_MESSAGE);
  model1.setRowCount(0);
  dispose();
  BorrowedForm bf = new BorrowedForm();
  MenuPage.desktop.add(bf);
  bf.setVisible(true);
           
    }//GEN-LAST:event_jButton3ActionPerformed
    void setColor(JPanel panel){
     panel.setBackground(new Color(102,102,102));
     
    }
    
    void resetColor(JPanel panel){
     panel.setBackground(new Color(15,35,40));   
    }
    
    void line(JPanel panel){
     panel.setOpaque(false);
   
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel countrec;
    public static com.toedter.calendar.JDateChooser duedate;
    public static javax.swing.JLabel hint;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JLabel patron;
    public static org.jdesktop.xswingx.JXTextField searchpatron;
    private org.jdesktop.xswingx.JXTextField searchuser;
    public static javax.swing.JLabel stafff;
    public static javax.swing.JTable tb_book;
    public static javax.swing.JTable tb_lborrow;
    // End of variables declaration//GEN-END:variables
}
