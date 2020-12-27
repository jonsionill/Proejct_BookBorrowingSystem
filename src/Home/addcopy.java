
package Home;


import java.awt.Color;
import java.awt.Image;
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
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


public class addcopy extends javax.swing.JPanel {
public static DefaultTableModel tblmodel = new DefaultTableModel();
   
 public addcopy() {
        initComponents();
        tblmodel = (DefaultTableModel) BookForm.tb_book.getModel();
        //records();
    }
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
 
   
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        epanel1 = new javax.swing.JPanel();
        authorr = new javax.swing.JLabel();
        copy = new javax.swing.JTextField();
        myear7 = new javax.swing.JLabel();
        myear8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        call = new javax.swing.JTextField();
        myear14 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox();
        myear17 = new javax.swing.JLabel();
        myear18 = new javax.swing.JLabel();
        location = new javax.swing.JComboBox();
        funding = new javax.swing.JComboBox();
        titlee = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        epanel1.setBackground(new java.awt.Color(255, 255, 255));
        epanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        authorr.setBackground(new java.awt.Color(255, 255, 255));
        authorr.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        authorr.setForeground(new java.awt.Color(10, 37, 68));
        authorr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        authorr.setText("Author");
        epanel1.add(authorr, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 50, 1140, -1));

        copy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        epanel1.add(copy, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 180, 30));

        myear7.setBackground(new java.awt.Color(255, 255, 255));
        myear7.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear7.setForeground(new java.awt.Color(10, 37, 68));
        myear7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear7.setText("Copy No.");
        epanel1.add(myear7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        myear8.setBackground(new java.awt.Color(255, 255, 255));
        myear8.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear8.setForeground(new java.awt.Color(10, 37, 68));
        myear8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear8.setText("Call No.");
        epanel1.add(myear8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 60, -1));

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
        epanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 140, 120, 60));

        call.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        epanel1.add(call, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 180, 30));

        myear14.setBackground(new java.awt.Color(255, 255, 255));
        myear14.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear14.setForeground(new java.awt.Color(10, 37, 68));
        myear14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear14.setText("Funding Source");
        epanel1.add(myear14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 120, -1));

        status.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Available", "Loaned Out", "Out for Repairs" }));
        epanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 180, 30));

        myear17.setBackground(new java.awt.Color(255, 255, 255));
        myear17.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear17.setForeground(new java.awt.Color(10, 37, 68));
        myear17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear17.setText("Location");
        epanel1.add(myear17, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 90, 20));

        myear18.setBackground(new java.awt.Color(255, 255, 255));
        myear18.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear18.setForeground(new java.awt.Color(10, 37, 68));
        myear18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear18.setText("Status");
        epanel1.add(myear18, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 130, -1));

        location.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        location.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Circulation", "Filipiniana", "General eBook", "Reserve", "Archives", "Dissertation", " " }));
        epanel1.add(location, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, 180, 30));

        funding.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        funding.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Purchased", "Donation", " " }));
        epanel1.add(funding, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 180, 30));

        titlee.setBackground(new java.awt.Color(255, 255, 255));
        titlee.setFont(new java.awt.Font("Segoe UI Semibold", 2, 36)); // NOI18N
        titlee.setForeground(new java.awt.Color(10, 37, 68));
        titlee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlee.setText("Title");
        epanel1.add(titlee, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 10, 1140, -1));

        add(epanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 210));
    }// </editor-fold>//GEN-END:initComponents

    private void addbirthKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addbirthKeyReleased
      
    }//GEN-LAST:event_addbirthKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String title, author;
        int id=0;
        
        //ADD BOOK
        try{
            String adbook[]= new String[6];
           adbook[0]=addbook.title.getText();
           adbook[1]=addbook.author.getText();
           adbook[2]=addbook.edition.getText();
           adbook[3]=addbook.isbn.getText();
           adbook[4]=addbook.mat_type.getSelectedItem().toString();
           adbook[5]=addbook.place_pub.getText();
           int page = Integer.parseInt(addbook.pages.getText());
           Double pri= Double.parseDouble(addbook.price.getText());
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_bbsystem","root","");
           PreparedStatement ps = conn.prepareStatement("insert into tb_book( title, author, edition, isbn, material_type, copyright, place_publisher, pages, price, images) values(?,?,?,?,?,?,?,?,?,?)");
           InputStream img = new FileInputStream(new File(addbook.imgPath));
           ps.setString(1, adbook[0]);
           ps.setString(2, adbook[1]);
           ps.setString(3, adbook[2]);
           ps.setString(4, adbook[3]);
           ps.setString(5, adbook[4]);
           ps.setInt(6, addbook.copyright.getYear());
           ps.setString(7, adbook[5]);
           ps.setInt(8, page);
           ps.setDouble(9, pri);
           ps.setBlob(10, img);
           ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
       
         try {
              BookBorrowingSystem.stm = BookBorrowingSystem.con.createStatement();
              BookBorrowingSystem.rst = BookBorrowingSystem.stm.executeQuery("select * from tb_book where title='"+BookBorrowingSystem.booktitle+"' AND isbn='"+BookBorrowingSystem.isbnn+"'");
              
              while(BookBorrowingSystem.rst.next()){
                       
                       title= BookBorrowingSystem.rst.getString("title");
                       author= BookBorrowingSystem.rst.getString("author");
                       id= BookBorrowingSystem.rst.getInt("book_id");
                                       
                }
       }catch (Exception ee){ee.printStackTrace();}
      
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
           BookForm.tblmodel.setRowCount(0);
           records();
           int ask = JOptionPane.showConfirmDialog(null, "Book Copy Inserted! Add Again?", "Message", JOptionPane.YES_NO_OPTION );
             if(ask==JOptionPane.YES_OPTION){
                 copy.setText("");
                 call.setText("");
                 status.setSelectedIndex(0);
                 location.setSelectedIndex(0);
                 funding.setSelectedIndex(0);
                 status.setSelectedIndex(0);
                 addcopy1.copy.setText(copyno+1+"");
                 addcopy1.copy.setEditable(false);
                 addcopy1.call.setText(callno+"");
                 addcopy1.call.setEditable(false);
                 BookForm.add.setVisible(false);
                 BookForm.copy.setVisible(false);
                 BookForm.copy1.setVisible(true);
             }else{
                ImageIcon ii= new ImageIcon(getClass().getResource("/Image/Picture.png"));
                addbook.addimg.setIcon(ii);
                addbook.title.setText("");
                addbook.author.setText("");
                addbook.edition.setText("");
                addbook.isbn.setText("");
                addbook.mat_type.setSelectedIndex(0);
                addbook.place_pub.setText("");
                addbook.pages.setText("");
                addbook.price.setText("");
                BookForm.add.setVisible(true);
                BookForm.copy.setVisible(false);
                BookForm.copy1.setVisible(false);
             }
 
                 
                
        }catch(Exception e){
            e.printStackTrace();
        }                                                                         
                                                                                           
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel authorr;
    private javax.swing.JTextField call;
    private javax.swing.JTextField copy;
    private javax.swing.JPanel epanel1;
    private javax.swing.JComboBox funding;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox location;
    private javax.swing.JLabel myear14;
    private javax.swing.JLabel myear17;
    private javax.swing.JLabel myear18;
    private javax.swing.JLabel myear7;
    private javax.swing.JLabel myear8;
    private javax.swing.JComboBox status;
    public static javax.swing.JLabel titlee;
    // End of variables declaration//GEN-END:variables
}
