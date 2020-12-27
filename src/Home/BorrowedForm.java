
package Home;


import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;



public class BorrowedForm extends javax.swing.JInternalFrame {
GridBagLayout layout = new GridBagLayout();
public static DefaultTableModel tblmodel = new DefaultTableModel();

    public BorrowedForm() {
    initComponents();
    tblmodel = (DefaultTableModel) tb_borrowed.getModel();
    tb_borrowed.setAutoResizeMode(tb_borrowed.AUTO_RESIZE_OFF);
    TableColumn col = tb_borrowed.getColumnModel().getColumn(0);
    col.setPreferredWidth(50);
    col = tb_borrowed.getColumnModel().getColumn(1);
    col.setPreferredWidth(250);
    col = tb_borrowed.getColumnModel().getColumn(2);
    col.setPreferredWidth(350);
    col = tb_borrowed.getColumnModel().getColumn(3);
    col.setPreferredWidth(150);
    col = tb_borrowed.getColumnModel().getColumn(4);
    col.setPreferredWidth(150);
    col = tb_borrowed.getColumnModel().getColumn(5);
    col.setPreferredWidth(150);
    col = tb_borrowed.getColumnModel().getColumn(6);
    col.setPreferredWidth(150);
    records();
    tbheader();
    center();
                       
    }
 //all   
public ArrayList<BorrowedBooks> booklist(){
     ArrayList<BorrowedBooks>booklist = new ArrayList();
       try {
        String query1 = "SELECT * FROM tb_borrowed order by loanbook_id desc";
        BookBorrowingSystem.rst= BookBorrowingSystem.stm.executeQuery(query1);
       BorrowedBooks bookcopy;
        while(BookBorrowingSystem.rst.next()){
            bookcopy= new BorrowedBooks(BookBorrowingSystem.rst.getInt("loanbook_id"),BookBorrowingSystem.rst.getString("patron_lname")+", " +BookBorrowingSystem.rst.getString("patron_fname")+" "+ BookBorrowingSystem.rst.getString("patron_mname"),BookBorrowingSystem.rst.getString("title") ,BookBorrowingSystem.rst.getString("author"),BookBorrowingSystem.rst.getString("release_date") ,BookBorrowingSystem.rst.getString("due_date"),BookBorrowingSystem.rst.getString("date_return"));
            booklist.add(bookcopy);
        }
    } catch (Exception ex) {
        
    }
      return booklist;
       
   }
  
 public void records(){
       ArrayList<BorrowedBooks> list = booklist();
       Object[] row = new Object[7];
       for(int i=0;i<list.size();i++){
           row[0]=list.get(i).getid();
           row[1]=list.get(i).getname();
           row[2]=list.get(i).gettitle();
           row[3]=list.get(i).getauthor();
           row[4]=list.get(i).getdateborrowed();
           row[5]=list.get(i).getduedate();
           row[6]=list.get(i).getdatereturned();
           tblmodel.addRow(row);
           
       }
       
   } 
 //checked out
 public ArrayList<BorrowedBooks> booklists(){
     ArrayList<BorrowedBooks>booklist = new ArrayList();
       try {
        String query1 = "SELECT * FROM tb_borrowed where status='"+"Loaned Out"+"' order by loanbook_id desc";
        BookBorrowingSystem.rst= BookBorrowingSystem.stm.executeQuery(query1);
       BorrowedBooks bookcopy;
        while(BookBorrowingSystem.rst.next()){
            bookcopy= new BorrowedBooks(BookBorrowingSystem.rst.getInt("loanbook_id"),BookBorrowingSystem.rst.getString("patron_lname")+", " +BookBorrowingSystem.rst.getString("patron_fname")+" "+ BookBorrowingSystem.rst.getString("patron_mname"),BookBorrowingSystem.rst.getString("title") ,BookBorrowingSystem.rst.getString("author"),BookBorrowingSystem.rst.getString("release_date") ,BookBorrowingSystem.rst.getString("due_date"),BookBorrowingSystem.rst.getString("date_return"));
            booklist.add(bookcopy);
        }
    } catch (Exception ex) {
        
    }
      return booklist;
       
   }
  
 public void recordss(){
       ArrayList<BorrowedBooks> list = booklists();
       Object[] row = new Object[7];
       for(int i=0;i<list.size();i++){
           row[0]=list.get(i).getid();
           row[1]=list.get(i).getname();
           row[2]=list.get(i).gettitle();
           row[3]=list.get(i).getauthor();
           row[4]=list.get(i).getdateborrowed();
           row[5]=list.get(i).getduedate();
           row[6]=list.get(i).getdatereturned();
           tblmodel.addRow(row);
           
       }
       
   } 
  
  void tbheader(){
    JTableHeader tbhead = tb_borrowed.getTableHeader();
    tbhead.setForeground(new Color(15,35,40));
    tbhead.setBackground(new Color(255,255,255));
    tbhead.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
    
    try {
            BookBorrowingSystem.stm = BookBorrowingSystem.con.createStatement();
            BookBorrowingSystem.rst = BookBorrowingSystem.stm.executeQuery("select count(loanbook_id) from tb_borrowed");
            while(BookBorrowingSystem.rst.next()){

               countrec.setText(BookBorrowingSystem.rst.getString("count(loanbook_id)"));
            }
        }catch(Exception ex){}
        
    
}
   void count(){
       try {
            BookBorrowingSystem.stm = BookBorrowingSystem.con.createStatement();
            BookBorrowingSystem.rst = BookBorrowingSystem.stm.executeQuery("select count(loanbook_id) from tb_borrowed where status = '"+"Loaned Out"+"'order by loanbook_id desc");
            while(BookBorrowingSystem.rst.next()){

               BorrowedForm.countrec.setText(BookBorrowingSystem.rst.getString("count(loanbook_id)"));
            }
        }catch(Exception ex){}
  } 
   void count1(){
       try {
            BookBorrowingSystem.stm = BookBorrowingSystem.con.createStatement();
            BookBorrowingSystem.rst = BookBorrowingSystem.stm.executeQuery("select count(loanbook_id) from tb_borrowed");
            while(BookBorrowingSystem.rst.next()){

               countrec.setText(BookBorrowingSystem.rst.getString("count(loanbook_id)"));
            }
        }catch(Exception ex){}
        
  } 
   
 
   void center(){
     TableColumnModel model = tb_borrowed.getColumnModel();
     DefaultTableCellRenderer center = new DefaultTableCellRenderer();
     center.setHorizontalAlignment(JLabel.CENTER);
     model.getColumn(0).setCellRenderer(center);
     model.getColumn(1).setCellRenderer(center);
     model.getColumn(2).setCellRenderer(center);
     model.getColumn(3).setCellRenderer(center);
     model.getColumn(4).setCellRenderer(center);
     model.getColumn(5).setCellRenderer(center);
     model.getColumn(6).setCellRenderer(center);
     
 }
  
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        epanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        epanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        countrec = new javax.swing.JLabel();
        searchuser = new org.jdesktop.xswingx.JXTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_borrowed = new javax.swing.JTable();
        hint = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        searchpatron = new org.jdesktop.xswingx.JXTextField();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        patron = new javax.swing.JLabel();

        setBackground(new java.awt.Color(10, 37, 68));
        setBorder(null);
        setClosable(true);
        setForeground(new java.awt.Color(0, 153, 153));
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Book Borrowed");
        setFrameIcon(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        epanel1.setBackground(new java.awt.Color(15, 35, 40));
        epanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(0, 153, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("All");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        epanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 50, 90, 30));

        jButton4.setBackground(new java.awt.Color(255, 102, 102));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Checked Out");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        epanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 50, 120, 30));

        jPanel1.add(epanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 110));

        epanel2.setBackground(new java.awt.Color(15, 35, 40));

        javax.swing.GroupLayout epanel2Layout = new javax.swing.GroupLayout(epanel2);
        epanel2.setLayout(epanel2Layout);
        epanel2Layout.setHorizontalGroup(
            epanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1360, Short.MAX_VALUE)
        );
        epanel2Layout.setVerticalGroup(
            epanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        jPanel1.add(epanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, -1, -1));

        jLabel3.setBackground(new java.awt.Color(15, 35, 40));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(15, 35, 40));
        jLabel3.setText("Book Borrowed");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, -1, -1));

        jLabel2.setBackground(new java.awt.Color(15, 35, 40));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(15, 35, 40));
        jLabel2.setText("List of");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel5.setText("No. of Record/s:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        countrec.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jPanel1.add(countrec, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 40, 20));

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
        jPanel1.add(searchuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 210, 200, 30));

        tb_borrowed.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tb_borrowed.setForeground(new java.awt.Color(15, 35, 40));
        tb_borrowed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Name", "Title", "Author", "Date Borrowed", "Due Date", "Date Returned"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_borrowed.setFocusable(false);
        tb_borrowed.setGridColor(new java.awt.Color(204, 204, 204));
        tb_borrowed.setInheritsPopupMenu(true);
        tb_borrowed.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tb_borrowed.setRowHeight(50);
        tb_borrowed.setSelectionBackground(new java.awt.Color(107, 166, 171));
        tb_borrowed.setShowVerticalLines(false);
        tb_borrowed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_borrowedMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_borrowed);
        if (tb_borrowed.getColumnModel().getColumnCount() > 0) {
            tb_borrowed.getColumnModel().getColumn(0).setResizable(false);
            tb_borrowed.getColumnModel().getColumn(1).setResizable(false);
            tb_borrowed.getColumnModel().getColumn(2).setResizable(false);
            tb_borrowed.getColumnModel().getColumn(3).setResizable(false);
            tb_borrowed.getColumnModel().getColumn(4).setResizable(false);
            tb_borrowed.getColumnModel().getColumn(5).setResizable(false);
            tb_borrowed.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 1260, 240));

        hint.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(hint, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 120, 10));

        jButton1.setBackground(new java.awt.Color(15, 35, 40));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Check In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 200, 110, 40));

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
        jPanel1.add(searchpatron, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 170, 150, 30));

        jButton2.setBackground(new java.awt.Color(15, 35, 40));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 170, -1, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Patron:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 60, 40));

        patron.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(patron, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 270, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
      
    }//GEN-LAST:event_jPanel1MousePressed

    private void searchuserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchuserFocusLost

    }//GEN-LAST:event_searchuserFocusLost

    private void searchuserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchuserMousePressed

    }//GEN-LAST:event_searchuserMousePressed

    private void searchuserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchuserKeyReleased
        try {
            TableRowSorter<DefaultTableModel> search = new TableRowSorter<>(tblmodel);
            tb_borrowed.setRowSorter(search);

            if (searchuser.getText().isEmpty()){
                search.setRowFilter(RowFilter.regexFilter(""));
            }
            else {
                search.setRowFilter(RowFilter.regexFilter("(?i)"+"^*"+ searchuser.getText() + "$*" ));
                countrec.setText(tb_borrowed.getRowCount()+"");
            }
        }catch (Exception er){}
    }//GEN-LAST:event_searchuserKeyReleased

    private void tb_borrowedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_borrowedMouseClicked
        hint.setText(tb_borrowed.getValueAt(tb_borrowed.getSelectedRow(), 0).toString());

    }//GEN-LAST:event_tb_borrowedMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       SimpleDateFormat sysdate = new SimpleDateFormat("yyyy/MM/dd");
        Date d = new Date();
        String timee=MenuPage.time.getText();
        String dd="";
       try{ 
            BookBorrowingSystem.stm = BookBorrowingSystem.con.createStatement();
              BookBorrowingSystem.rst = BookBorrowingSystem.stm.executeQuery("select * from tb_loanbook where loanbook_id='"+hint.getText()+"'");
              
              while(BookBorrowingSystem.rst.next()){
                       
                       dd= BookBorrowingSystem.rst.getString("accession_no");
              }
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_bbsystem","root","");         
          String UpdateQuery = ("UPDATE tb_loanbook SET date_return = ?, time_return = ? WHERE loanbook_id ='" + hint.getText() + "'");
          PreparedStatement pa = con.prepareStatement(UpdateQuery);
          pa.setString(1, sysdate.format(d));
          pa.setString(2, timee);
          pa.executeUpdate();
          
          String UpdateQuery1 = ("UPDATE tb_bookcopy SET status = ? WHERE accession_no ='" + dd + "'");
          PreparedStatement ps = con.prepareStatement(UpdateQuery1);
          ps.setString(1, "Available");
          ps.executeUpdate();
       
           JOptionPane.showMessageDialog(null, "The book is now available", "Message", JOptionPane.INFORMATION_MESSAGE);
           tblmodel.setRowCount(0);
           records();
       }catch(Exception ee){
            ee.printStackTrace();
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchpatronFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchpatronFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_searchpatronFocusLost

    private void searchpatronMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchpatronMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchpatronMousePressed

    private void searchpatronKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchpatronKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_searchpatronKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PatronFormReturn pfr = new PatronFormReturn();
        MenuPage.desktop.add(pfr);
        pfr.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        tblmodel.setRowCount(0);
        records();
        count1();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        tblmodel.setRowCount(0);
        recordss();
        count();
    }//GEN-LAST:event_jButton4ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel countrec;
    public static javax.swing.JPanel epanel1;
    public static javax.swing.JPanel epanel2;
    public static javax.swing.JLabel hint;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel patron;
    public static org.jdesktop.xswingx.JXTextField searchpatron;
    private org.jdesktop.xswingx.JXTextField searchuser;
    public static javax.swing.JTable tb_borrowed;
    // End of variables declaration//GEN-END:variables
}
