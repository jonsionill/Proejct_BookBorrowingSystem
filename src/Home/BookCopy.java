
package Home;


import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;



public class BookCopy extends javax.swing.JInternalFrame {
public static DefaultTableModel tblmodel = new DefaultTableModel();

    public BookCopy() {
    initComponents();
    tblmodel = (DefaultTableModel) tb_bookc.getModel();
    tb_bookc.setAutoResizeMode(tb_bookc.AUTO_RESIZE_OFF);
     records();
    tbheader();
    center();
    TableColumn col = tb_bookc.getColumnModel().getColumn(0);
    col.setPreferredWidth(50);
    col = tb_bookc.getColumnModel().getColumn(1);
    col.setPreferredWidth(200);
    col = tb_bookc.getColumnModel().getColumn(2);
    col.setPreferredWidth(200);
    col = tb_bookc.getColumnModel().getColumn(3);
    col.setPreferredWidth(100);
    col = tb_bookc.getColumnModel().getColumn(4);
    col.setPreferredWidth(200);
    col = tb_bookc.getColumnModel().getColumn(5);
    col.setPreferredWidth(200);
                       
    }
   
public ArrayList<CopyBook> books(){
     ArrayList<CopyBook>books = new ArrayList();
       try {
        String query1 = "SELECT * FROM tb_book order by book_id desc";
        BookBorrowingSystem.rst= BookBorrowingSystem.stm.executeQuery(query1);
        CopyBook bookcopy;
        while(BookBorrowingSystem.rst.next()){
            bookcopy= new CopyBook(BookBorrowingSystem.rst.getInt("book_id"),BookBorrowingSystem.rst.getString("title") ,BookBorrowingSystem.rst.getString("author"), BookBorrowingSystem.rst.getInt("copyright"),BookBorrowingSystem.rst.getString("isbn") ,BookBorrowingSystem.rst.getString("material_type"));
            books.add(bookcopy);
        }
    } catch (Exception ex) {
        
    }
      return books;
       
   }
  
 public void records(){
       ArrayList<CopyBook> list = books();
       Object[] row = new Object[6];
       for(int i=0;i<list.size();i++){
           row[0]=list.get(i).getid();
           row[1]=list.get(i).gettitle();
           row[2]=list.get(i).getauthor();
           row[3]=list.get(i).getcopyright();
           row[4]=list.get(i).getisbn();
           row[5]=list.get(i).gettype();
           tblmodel.addRow(row);
           
       }
       
   } 
 
 //menupage
     public ArrayList<BookMenu> booklist(){
     ArrayList<BookMenu>booklist = new ArrayList();
       try {
        String query1 = "SELECT * FROM tb_bookrecords order by accession_no desc";
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
  
 public void recordsmenu(){
       ArrayList<BookMenu> list = booklist();
       Object[] row = new Object[6];
       for(int i=0;i<list.size();i++){
           row[0]=list.get(i).getid();
           row[1]=list.get(i).gettitle();
           row[2]=list.get(i).getauthor();
           row[3]=list.get(i).getcopyright();
           row[4]=list.get(i).getlocation();
           row[5]=list.get(i).getstatus();
           MenuPage.tblmodel.addRow(row);
           
       }
       
   } 
 
 
  void tbheader(){
    JTableHeader tbhead = tb_bookc.getTableHeader();
    tbhead.setForeground(new Color(15,35,40));
    tbhead.setBackground(new Color(255,255,255));
    tbhead.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
    
  }
 void center(){
     TableColumnModel model = tb_bookc.getColumnModel();
     DefaultTableCellRenderer center = new DefaultTableCellRenderer();
     center.setHorizontalAlignment(JLabel.CENTER);
     model.getColumn(0).setCellRenderer(center);
     model.getColumn(3).setCellRenderer(center);
     model.getColumn(4).setCellRenderer(center);
     model.getColumn(5).setCellRenderer(center);
     
 }
   
  
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_bookc = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        titlee = new javax.swing.JLabel();
        authorr = new javax.swing.JLabel();
        myear7 = new javax.swing.JLabel();
        copy = new javax.swing.JTextField();
        myear8 = new javax.swing.JLabel();
        call = new javax.swing.JTextField();
        myear17 = new javax.swing.JLabel();
        location = new javax.swing.JComboBox();
        myear14 = new javax.swing.JLabel();
        funding = new javax.swing.JComboBox();
        myear18 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        epanel1 = new javax.swing.JPanel();
        epanel2 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(10, 37, 68));
        setBorder(null);
        setClosable(true);
        setForeground(new java.awt.Color(0, 153, 153));
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Book Details");
        setFrameIcon(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_bookc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tb_bookc.setForeground(new java.awt.Color(15, 35, 40));
        tb_bookc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Title", "Author", "Copyright", "ISBN", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_bookc.setFocusable(false);
        tb_bookc.setGridColor(new java.awt.Color(204, 204, 204));
        tb_bookc.setInheritsPopupMenu(true);
        tb_bookc.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tb_bookc.setRowHeight(50);
        tb_bookc.setSelectionBackground(new java.awt.Color(107, 166, 171));
        tb_bookc.setShowVerticalLines(false);
        tb_bookc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_bookcMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tb_bookcMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tb_bookc);
        if (tb_bookc.getColumnModel().getColumnCount() > 0) {
            tb_bookc.getColumnModel().getColumn(0).setResizable(false);
            tb_bookc.getColumnModel().getColumn(1).setResizable(false);
            tb_bookc.getColumnModel().getColumn(2).setResizable(false);
            tb_bookc.getColumnModel().getColumn(3).setResizable(false);
            tb_bookc.getColumnModel().getColumn(4).setResizable(false);
            tb_bookc.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 980, 290));

        jLabel3.setBackground(new java.awt.Color(15, 35, 40));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(15, 35, 40));
        jLabel3.setText("Book");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, -1, -1));

        jLabel2.setBackground(new java.awt.Color(15, 35, 40));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(15, 35, 40));
        jLabel2.setText("Copy");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, -1, -1));

        titlee.setBackground(new java.awt.Color(255, 255, 255));
        titlee.setFont(new java.awt.Font("Segoe UI Semibold", 2, 24)); // NOI18N
        titlee.setForeground(new java.awt.Color(10, 37, 68));
        titlee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlee.setText("Title");
        jPanel1.add(titlee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 350, -1));

        authorr.setBackground(new java.awt.Color(255, 255, 255));
        authorr.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        authorr.setForeground(new java.awt.Color(10, 37, 68));
        authorr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        authorr.setText("Author");
        jPanel1.add(authorr, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 350, -1));

        myear7.setBackground(new java.awt.Color(255, 255, 255));
        myear7.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear7.setForeground(new java.awt.Color(10, 37, 68));
        myear7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear7.setText("Copy No.");
        jPanel1.add(myear7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        copy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyActionPerformed(evt);
            }
        });
        jPanel1.add(copy, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 180, 30));

        myear8.setBackground(new java.awt.Color(255, 255, 255));
        myear8.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear8.setForeground(new java.awt.Color(10, 37, 68));
        myear8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear8.setText("Call No.");
        jPanel1.add(myear8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 60, -1));

        call.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(call, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 180, 30));

        myear17.setBackground(new java.awt.Color(255, 255, 255));
        myear17.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear17.setForeground(new java.awt.Color(10, 37, 68));
        myear17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear17.setText("Location");
        jPanel1.add(myear17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 90, 20));

        location.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        location.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Circulation", "Filipiniana", "General eBook", "Reserve", "Archives", "Dissertation", "" }));
        jPanel1.add(location, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 180, 30));

        myear14.setBackground(new java.awt.Color(255, 255, 255));
        myear14.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear14.setForeground(new java.awt.Color(10, 37, 68));
        myear14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear14.setText("Funding Source");
        jPanel1.add(myear14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 120, -1));

        funding.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        funding.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Purchased", "Donation", "" }));
        jPanel1.add(funding, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 180, 30));

        myear18.setBackground(new java.awt.Color(255, 255, 255));
        myear18.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear18.setForeground(new java.awt.Color(10, 37, 68));
        myear18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear18.setText("Status");
        jPanel1.add(myear18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 60, -1));

        status.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Available", "Loaned Out", "Out for Repairs" }));
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 180, 30));

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 120, 60));

        epanel1.setBackground(new java.awt.Color(15, 35, 40));

        javax.swing.GroupLayout epanel1Layout = new javax.swing.GroupLayout(epanel1);
        epanel1.setLayout(epanel1Layout);
        epanel1Layout.setHorizontalGroup(
            epanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1360, Short.MAX_VALUE)
        );
        epanel1Layout.setVerticalGroup(
            epanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
      
    }//GEN-LAST:event_jPanel1MousePressed

    private void tb_bookcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_bookcMouseClicked
        
       int copy_n=0;
       
       try {
              BookBorrowingSystem.stm = BookBorrowingSystem.con.createStatement();
              BookBorrowingSystem.rst = BookBorrowingSystem.stm.executeQuery("select count(book_id) as cb from tb_bookrecords where book_id = '"+ tb_bookc.getValueAt(tb_bookc.getSelectedRow(), 0).toString()+"'" );
              
              while(BookBorrowingSystem.rst.next()){
                       
                       copy_n = BookBorrowingSystem.rst.getInt("cb");
                       
              }
        copy.setText(copy_n+1+"");
         String title ="";
         String author="";
        int id=0; 
        
              BookBorrowingSystem.stm = BookBorrowingSystem.con.createStatement();
              BookBorrowingSystem.rst = BookBorrowingSystem.stm.executeQuery("select * from tb_bookrecords where book_id = '"+ tb_bookc.getValueAt(tb_bookc.getSelectedRow(), 0).toString()+"'");
              
              while(BookBorrowingSystem.rst.next()){
                       
                       title= BookBorrowingSystem.rst.getString("title");
                       author= BookBorrowingSystem.rst.getString("author");
                       id= BookBorrowingSystem.rst.getInt("book_id");
                                       
                }
      titlee.setText(title);
      authorr.setText(author);
              
       }catch (Exception ee){ee.printStackTrace();}
       
    }//GEN-LAST:event_tb_bookcMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int id = Integer.parseInt(tb_bookc.getValueAt(tb_bookc.getSelectedRow(), 0).toString());
        //ADD COPY
        try{
            String adcopy[]= new String[3];
            adcopy[0]=location.getSelectedItem().toString();
            adcopy[1]=funding.getSelectedItem().toString();
            adcopy[2]=status.getSelectedItem().toString();
            int copyno = Integer.parseInt(copy.getText());
            Double callno= Double.parseDouble(call.getText());
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_bbsystem","root","");
            PreparedStatement ps = conn.prepareStatement("insert into tb_bookcopy( book_id, call_no, copy_number, location, funding_source, status) values(?,?,?,?,?,?)");
            ps.setInt(1, id);
            ps.setDouble(2, callno);
            ps.setInt(3, copyno);
            ps.setString(4, adcopy[0]);
            ps.setString(5, adcopy[1]);
            ps.setString(6, adcopy[2]);
            ps.executeUpdate();
            MenuPage.tblmodel.setRowCount(0);
            recordsmenu();
            JOptionPane.showMessageDialog(null, "Book Copy Inserted!", "Message", JOptionPane.INFORMATION_MESSAGE );
            MenuPage.noofrec.setText(MenuPage.tb_menubooks.getRowCount()+"");

        }catch(Exception e){
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_copyActionPerformed

    private void tb_bookcMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_bookcMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_bookcMouseEntered

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel authorr;
    private javax.swing.JTextField call;
    private javax.swing.JTextField copy;
    public static javax.swing.JPanel epanel1;
    public static javax.swing.JPanel epanel2;
    private javax.swing.JComboBox funding;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox location;
    private javax.swing.JLabel myear14;
    private javax.swing.JLabel myear17;
    private javax.swing.JLabel myear18;
    private javax.swing.JLabel myear7;
    private javax.swing.JLabel myear8;
    private javax.swing.JComboBox status;
    public static javax.swing.JTable tb_bookc;
    public static javax.swing.JLabel titlee;
    // End of variables declaration//GEN-END:variables
}
