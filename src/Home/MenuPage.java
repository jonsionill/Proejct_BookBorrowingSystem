
package Home;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

public class MenuPage extends javax.swing.JFrame {
public static DefaultTableModel tblmodel = new DefaultTableModel();
   
    public MenuPage() {
        initComponents();
        tblmodel = (DefaultTableModel) tb_menubooks.getModel();
        tb_menubooks.setAutoResizeMode(tb_menubooks.AUTO_RESIZE_OFF);
        TableColumn col = tb_menubooks.getColumnModel().getColumn(0);
        col.setPreferredWidth(150);
        col = tb_menubooks.getColumnModel().getColumn(1);
        col.setPreferredWidth(200);
        col = tb_menubooks.getColumnModel().getColumn(2);
        col.setPreferredWidth(250);
        col = tb_menubooks.getColumnModel().getColumn(3);
        col.setPreferredWidth(200);
        col = tb_menubooks.getColumnModel().getColumn(4);
        col.setPreferredWidth(200);
        col = tb_menubooks.getColumnModel().getColumn(5);
        col.setPreferredWidth(200);
        records();
        showDate();
        showTime();
        setIcon();
        tbheader();
        center();
        noofrec.setText(tb_menubooks.getRowCount()+"");
    }
         private void setIcon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Image/Help book 3d.png")));
    }
     void showDate() {
     Date d = new Date();
     SimpleDateFormat s = new SimpleDateFormat("MMMM dd, yyyy");
     date.setText(s.format(d));
    }
    
    void showTime(){
    new Timer(0, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent ae) {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
        time.setText(s.format(d));    
        }
    }).start(); 
           
    }
    void tbheader(){
    JTableHeader tbhead = tb_menubooks.getTableHeader();
    tbhead.setForeground(new Color(15,35,40));
    tbhead.setBackground(new Color(255,255,255));
    tbhead.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
    }
    //all
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
   //active 
    public ArrayList<BookMenu> booklists(){
     ArrayList<BookMenu>booklist = new ArrayList();
       try {
        String query1 = "SELECT * FROM tb_bookrecords where status = '"+"Available"+"' order by accession_no desc";
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
 //inactive
     public ArrayList<BookMenu> booklistss(){
     ArrayList<BookMenu>booklist = new ArrayList();
       try {
        String query1 = "SELECT * FROM tb_bookrecords where status = '"+"Loaned Out"+"'OR status= '"+"Out for Repairs"+"' order by accession_no desc";
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
 
 public void record(){
       ArrayList<BookMenu> list = booklists();
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
 
 public void recordss(){
       ArrayList<BookMenu> list = booklistss();
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
 
 public ImageIcon ResizeImage(String ImagePath, byte[] pic){
     ImageIcon MyImage = null;
     if (ImagePath != null){
         MyImage = new ImageIcon (ImagePath);
      } 
     
     else{
         MyImage = new ImageIcon(pic); 
     }
         
     Image img = MyImage.getImage();
     Image newImg = img.getScaledInstance(BookDetails.bimage.getWidth(), BookDetails.bimage.getHeight(), Image.SCALE_SMOOTH);
     ImageIcon image = new ImageIcon(newImg);
     return image;
     
                  
    }
 
 void center(){
     TableColumnModel model = tb_menubooks.getColumnModel();
     DefaultTableCellRenderer center = new DefaultTableCellRenderer();
     center.setHorizontalAlignment(JLabel.CENTER);
     model.getColumn(0).setCellRenderer(center);
     model.getColumn(3).setCellRenderer(center);
     model.getColumn(4).setCellRenderer(center);
     
 }
   
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        date = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        desktop = new javax.swing.JDesktopPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_menubooks = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        hint = new javax.swing.JTextField();
        noofrec = new javax.swing.JLabel();
        searchuser = new org.jdesktop.xswingx.JXTextField();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BBS");
        setLocation(new java.awt.Point(0, 0));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(15, 35, 40));

        date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Time:");

        time.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(857, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 47, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 1370, 77));

        desktop.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(15, 35, 40));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Manage");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Books");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("All");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 90, 30));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Inactive");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 20, 90, 30));

        jButton3.setBackground(new java.awt.Color(51, 255, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Active");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 20, 90, 30));

        tb_menubooks.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tb_menubooks.setForeground(new java.awt.Color(15, 35, 40));
        tb_menubooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Title", "Author", "Copyright", "Status", "Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_menubooks.setFocusable(false);
        tb_menubooks.setGridColor(new java.awt.Color(204, 204, 204));
        tb_menubooks.setInheritsPopupMenu(true);
        tb_menubooks.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tb_menubooks.setRowHeight(50);
        tb_menubooks.setSelectionBackground(new java.awt.Color(107, 166, 171));
        tb_menubooks.setShowVerticalLines(false);
        tb_menubooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_menubooksMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_menubooks);
        if (tb_menubooks.getColumnModel().getColumnCount() > 0) {
            tb_menubooks.getColumnModel().getColumn(0).setResizable(false);
            tb_menubooks.getColumnModel().getColumn(1).setResizable(false);
            tb_menubooks.getColumnModel().getColumn(2).setResizable(false);
            tb_menubooks.getColumnModel().getColumn(3).setResizable(false);
            tb_menubooks.getColumnModel().getColumn(4).setResizable(false);
            tb_menubooks.getColumnModel().getColumn(5).setResizable(false);
        }

        jButton4.setBackground(new java.awt.Color(255, 153, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("View details");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        hint.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        hint.setForeground(new java.awt.Color(255, 255, 255));
        hint.setBorder(null);

        noofrec.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

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
        searchuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchuserActionPerformed(evt);
            }
        });
        searchuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchuserKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("No. of Record/s : ");

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desktopLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noofrec, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(703, 703, 703)
                        .addComponent(searchuser, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(desktopLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(hint, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchuser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(desktopLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(noofrec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desktopLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(hint, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        desktop.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(hint, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(noofrec, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(searchuser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 620));

        jMenu3.setBorder(null);
        jMenu3.setText("System");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem2.setText("User");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem1.setForeground(new java.awt.Color(255, 0, 0));
        jMenuItem1.setText("Log-out");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Patron");

        jMenuItem3.setText("Add New Patron");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuBar2.add(jMenu4);

        jMenu1.setText("Book");

        jMenuItem5.setText("Add Book");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem8.setText("Add Book Copy");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem7.setText("Check In");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem4.setText("Check Out");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar2.add(jMenu1);

        jMenu2.setBorder(null);
        jMenu2.setText("About");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem6.setText("About Us");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar2.add(jMenu2);

        setJMenuBar(jMenuBar2);

        setSize(new java.awt.Dimension(1386, 767));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
      JOptionPane.showMessageDialog(null, "Walang Tayo!", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     int reply= JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?","Message",JOptionPane.YES_NO_OPTION);

        if(reply==JOptionPane.YES_OPTION){
            dispose();
             HomePage hom= new HomePage();
             hom.show();
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    BookDetails bd = new BookDetails();
    desktop.add(bd);
    bd.setVisible(true);
    String bookarray[] = new String[9];
    int idarray[] = new int[4];
    double call_no=0; 
    double price=0;
    try{
        BookBorrowingSystem.stm = BookBorrowingSystem.con.createStatement();
        BookBorrowingSystem.rst = BookBorrowingSystem.stm.executeQuery("select * from tb_bookrecords where accession_no = '"+ hint.getText()+"'");
              
              while(BookBorrowingSystem.rst.next()){
                       
                       idarray[0] = BookBorrowingSystem.rst.getInt("accession_no");
                       bookarray[0] = BookBorrowingSystem.rst.getString("title");
                       bookarray[1] = BookBorrowingSystem.rst.getString("author");
                       bookarray[2] = BookBorrowingSystem.rst.getString("edition");
                       bookarray[3] = BookBorrowingSystem.rst.getString("isbn");
                       idarray[1] = BookBorrowingSystem.rst.getInt("copyright");
                       bookarray[4] = BookBorrowingSystem.rst.getString("material_type");
                       call_no = BookBorrowingSystem.rst.getDouble("call_no");
                       bookarray[5] = BookBorrowingSystem.rst.getString("place_publisher");
                       idarray[2] = BookBorrowingSystem.rst.getInt("pages");
                       idarray[3] = BookBorrowingSystem.rst.getInt("copy_number");
                       bookarray[6] = BookBorrowingSystem.rst.getString("location");
                       bookarray[7] = BookBorrowingSystem.rst.getString("funding_source");
                       price = BookBorrowingSystem.rst.getDouble("price");
                       bookarray[8] = BookBorrowingSystem.rst.getString("status");
                       BookDetails.bimage.setIcon(ResizeImage(null, BookBorrowingSystem.rst.getBytes("images"))); 
              }
              
             BookDetails.accession.setText(idarray[0]+"");
             BookDetails.title.setText(bookarray[0]);
             BookDetails.author.setText(bookarray[1]);
             BookDetails.edition.setText(bookarray[2]);
             BookDetails.isbn.setText(bookarray[3]);
             BookDetails.copyright.setText(idarray[1]+"");
             BookDetails.mtype.setText(bookarray[4]);
             BookDetails.callno.setText(call_no+"");
             BookDetails.pub.setText(bookarray[5]);
             BookDetails.pages.setText(idarray[2]+"");
             BookDetails.copy.setText(idarray[3]+"");
             BookDetails.location.setText(bookarray[6]);
             BookDetails.source.setText(bookarray[7]);
             BookDetails.price.setText(price+"");
             BookDetails.status.setText(bookarray[8]);
             
    } catch (Exception ee){ee.printStackTrace();}
    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tb_menubooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_menubooksMouseClicked
    hint.setText(tb_menubooks.getValueAt(tb_menubooks.getSelectedRow(), 0).toString());      
    }//GEN-LAST:event_tb_menubooksMouseClicked

    private void searchuserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchuserFocusLost

    }//GEN-LAST:event_searchuserFocusLost

    private void searchuserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchuserMousePressed
        
    }//GEN-LAST:event_searchuserMousePressed

    private void searchuserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchuserKeyReleased
        try {
            TableRowSorter<DefaultTableModel> search = new TableRowSorter<>(tblmodel);
            tb_menubooks.setRowSorter(search);

            if (searchuser.getText().isEmpty()){
                search.setRowFilter(RowFilter.regexFilter(""));
            }
            else {
                search.setRowFilter(RowFilter.regexFilter("(?i)"+"^*"+ searchuser.getText() + "$*" ));
                noofrec.setText(tb_menubooks.getRowCount()+"");
            }
        }catch (Exception er){}
    }//GEN-LAST:event_searchuserKeyReleased

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
  BorrowedForm bf = new BorrowedForm();
  MenuPage.desktop.add(bf);
  bf.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       UserForm uf = new UserForm();
       desktop.add(uf);
       uf.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       PatronForm pf = new PatronForm();
       desktop.add(pf);
       pf.setVisible(true);      
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       BookForm bf = new BookForm();
       desktop.add(bf);
       bf.setVisible(true); 
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
       BookCopy bc = new BookCopy();
       desktop.add(bc);
       bc.setVisible(true);
       
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       try {
        BookBorrowingSystem.rst = BookBorrowingSystem.stm.executeQuery("SELECT * FROM tb_bookrecords where status = '"+"Available"+"' order by accession_no desc");
        tblmodel.setRowCount(0);
        record();}
       catch(Exception e){
           
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       tblmodel.setRowCount(0);
       records();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       tblmodel.setRowCount(0);
       recordss();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void searchuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchuserActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       Checkoutform co = new Checkoutform();
       desktop.add(co);
       co.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
   
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel date;
    public static javax.swing.JDesktopPane desktop;
    private javax.swing.JTextField hint;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel noofrec;
    private org.jdesktop.xswingx.JXTextField searchuser;
    public static javax.swing.JTable tb_menubooks;
    public static javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
