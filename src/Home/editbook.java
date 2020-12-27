
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


public class editbook extends javax.swing.JPanel {
public static DefaultTableModel tblmodel = new DefaultTableModel();

public editbook() {
        initComponents();
        tblmodel = (DefaultTableModel) BookForm.tb_book.getModel();
        records();
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
 public static String imgPath = ""; 
 public ImageIcon ResizeImage(String ImagePath, byte[] pic){
     ImageIcon MyImage = null;
     if (ImagePath != null){
         MyImage = new ImageIcon (ImagePath);
      } 
     
     else{
         MyImage = new ImageIcon(pic); 
     }
         
     Image img = MyImage.getImage();
     Image newImg = img.getScaledInstance(addimg.getWidth(), addimg.getHeight(), Image.SCALE_SMOOTH);
     ImageIcon image = new ImageIcon(newImg);
     return image;
     
                  
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        epanel1 = new javax.swing.JPanel();
        myear2 = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        edition = new javax.swing.JTextField();
        myear7 = new javax.swing.JLabel();
        myear8 = new javax.swing.JLabel();
        myear10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        author = new javax.swing.JTextField();
        myear14 = new javax.swing.JLabel();
        pages = new javax.swing.JTextField();
        myear15 = new javax.swing.JLabel();
        myear16 = new javax.swing.JLabel();
        mat_type = new javax.swing.JComboBox();
        copyright = new com.toedter.calendar.JYearChooser();
        myear17 = new javax.swing.JLabel();
        isbn = new javax.swing.JTextField();
        myear18 = new javax.swing.JLabel();
        place_pub = new javax.swing.JTextField();
        myear19 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        addimg = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        epanel1.setBackground(new java.awt.Color(255, 255, 255));
        epanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myear2.setBackground(new java.awt.Color(255, 255, 255));
        myear2.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        myear2.setForeground(new java.awt.Color(10, 37, 68));
        myear2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear2.setText("*Please fill in the required fields:");
        epanel1.add(myear2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        title.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        epanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 180, 30));

        edition.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        epanel1.add(edition, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 180, 30));

        myear7.setBackground(new java.awt.Color(255, 255, 255));
        myear7.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear7.setForeground(new java.awt.Color(10, 37, 68));
        myear7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear7.setText("Title");
        epanel1.add(myear7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        myear8.setBackground(new java.awt.Color(255, 255, 255));
        myear8.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear8.setForeground(new java.awt.Color(10, 37, 68));
        myear8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear8.setText("Author");
        epanel1.add(myear8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 60, -1));

        myear10.setBackground(new java.awt.Color(255, 255, 255));
        myear10.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear10.setForeground(new java.awt.Color(10, 37, 68));
        myear10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear10.setText("Edition");
        epanel1.add(myear10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jButton1.setBackground(new java.awt.Color(15, 35, 40));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/statement_1.png"))); // NOI18N
        jButton1.setText("EDIT COPY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        epanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 150, 140, 40));

        author.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        epanel1.add(author, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 180, 30));

        myear14.setBackground(new java.awt.Color(255, 255, 255));
        myear14.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear14.setForeground(new java.awt.Color(10, 37, 68));
        myear14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear14.setText("ISBN");
        epanel1.add(myear14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 40, -1));

        pages.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        epanel1.add(pages, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, 180, 30));

        myear15.setBackground(new java.awt.Color(255, 255, 255));
        myear15.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear15.setForeground(new java.awt.Color(10, 37, 68));
        myear15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear15.setText("Pages");
        epanel1.add(myear15, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 50, -1));

        myear16.setBackground(new java.awt.Color(255, 255, 255));
        myear16.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear16.setForeground(new java.awt.Color(10, 37, 68));
        myear16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear16.setText("Copyright");
        epanel1.add(myear16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));

        mat_type.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mat_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Book", "E-Book", "Manuscript", "Maps, Globes, Atlases", "Computer File", "Mixed Material", "Sound Recording", "Video", " " }));
        epanel1.add(mat_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 180, 30));
        epanel1.add(copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 180, 30));

        myear17.setBackground(new java.awt.Color(255, 255, 255));
        myear17.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear17.setForeground(new java.awt.Color(10, 37, 68));
        myear17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear17.setText("Type of Material");
        epanel1.add(myear17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 130, -1));

        isbn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        epanel1.add(isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 180, 30));

        myear18.setBackground(new java.awt.Color(255, 255, 255));
        myear18.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear18.setForeground(new java.awt.Color(10, 37, 68));
        myear18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear18.setText("Place of Publisher");
        epanel1.add(myear18, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 130, -1));

        place_pub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        epanel1.add(place_pub, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, 180, 30));

        myear19.setBackground(new java.awt.Color(255, 255, 255));
        myear19.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        myear19.setForeground(new java.awt.Color(10, 37, 68));
        myear19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myear19.setText("Price");
        epanel1.add(myear19, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 50, -1));

        price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        epanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, 180, 30));

        jButton2.setBackground(new java.awt.Color(10, 37, 68));
        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Browse");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        epanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 110, 120, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        addimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Picture.png"))); // NOI18N
        addimg.setText("No Photo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addimg, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addimg, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        epanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 110, 80));

        add(epanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 210));
    }// </editor-fold>//GEN-END:initComponents

    private void addbirthKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addbirthKeyReleased
      
    }//GEN-LAST:event_addbirthKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        editcopy.titlee.setText(title.getText());
        editcopy.authorr.setText(author.getText());
        BookForm.add.setVisible(false);
        BookForm.copy1.setVisible(false);
        BookForm.edit1.setVisible(true);
        BookForm.copy.setVisible(false);
        BookForm.edit.setVisible(false);
        BookBorrowingSystem.booktitle=title.getText();
        BookBorrowingSystem.isbnn=isbn.getText();
        try {
              BookBorrowingSystem.stm = BookBorrowingSystem.con.createStatement();
              BookBorrowingSystem.rst = BookBorrowingSystem.stm.executeQuery("select * from tb_bookrecords where accession_no='"+BookForm.hint.getText()+"'");
              
              while(BookBorrowingSystem.rst.next()){
                       
                       editcopy.copy.setText(BookBorrowingSystem.rst.getString("copy_number"));
                       editcopy.call.setText(BookBorrowingSystem.rst.getString("call_no"));
                       editcopy.location.setSelectedItem(BookBorrowingSystem.rst.getString("location"));
                       editcopy.funding.setSelectedItem(BookBorrowingSystem.rst.getString("funding_source"));
                       editcopy.status.setSelectedItem(BookBorrowingSystem.rst.getString("status"));
                       
                       
                      
              }
             
       }catch (Exception ee){ee.printStackTrace();}
       BookForm.tb_book.setEnabled(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg", "gif", "png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);

        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            addimg.setIcon(ResizeImage(path,null));
            imgPath = path;
        }
        else if(result ==JFileChooser.CANCEL_OPTION){
            JOptionPane.showMessageDialog(null,"No image selected", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel addimg;
    public static javax.swing.JTextField author;
    public static com.toedter.calendar.JYearChooser copyright;
    public static javax.swing.JTextField edition;
    private javax.swing.JPanel epanel1;
    public static javax.swing.JTextField isbn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JComboBox mat_type;
    private javax.swing.JLabel myear10;
    private javax.swing.JLabel myear14;
    private javax.swing.JLabel myear15;
    private javax.swing.JLabel myear16;
    private javax.swing.JLabel myear17;
    private javax.swing.JLabel myear18;
    private javax.swing.JLabel myear19;
    private javax.swing.JLabel myear2;
    private javax.swing.JLabel myear7;
    private javax.swing.JLabel myear8;
    public static javax.swing.JTextField pages;
    public static javax.swing.JTextField place_pub;
    public static javax.swing.JTextField price;
    public static javax.swing.JTextField title;
    // End of variables declaration//GEN-END:variables
}
