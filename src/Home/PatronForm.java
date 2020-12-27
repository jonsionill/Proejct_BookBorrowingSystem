
package Home;


import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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



public class PatronForm extends javax.swing.JInternalFrame {
public static DefaultTableModel tblmodel = new DefaultTableModel();
GridBagLayout layout = new GridBagLayout();
addpatron add;
editpatron edit;

    public PatronForm() {
    initComponents();
    records();
    tbheader();
    tblmodel = (DefaultTableModel) tb_patron.getModel();
    tb_patron.setAutoResizeMode(tb_patron.AUTO_RESIZE_OFF);
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
    add = new addpatron();
    edit = new editpatron();
    PatronPanel.setLayout(layout);
   GridBagConstraints a = new GridBagConstraints();
   a.gridx = 0;
   a.gridy = 0;
   PatronPanel.add(add, a);
   a.gridx = 0;
   a.gridy = 0;
   PatronPanel.add(edit, a);
   add.setVisible(true);
   edit.setVisible(false);
   setColor(btn_add);
   side.setOpaque(true);
   resetColor(btn_edit);
   line(side1);
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
        epanel1 = new javax.swing.JPanel();
        btn_add = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        side = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        btn_edit = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        side1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btn_delete = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        side2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PatronPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        countrec = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        searchuser = new org.jdesktop.xswingx.JXTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_patron = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        hint = new javax.swing.JLabel();

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

        epanel1.setBackground(new java.awt.Color(15, 35, 40));
        epanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_add.setBackground(new java.awt.Color(15, 35, 40));
        btn_add.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_add.setForeground(new java.awt.Color(102, 102, 102));
        btn_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ADD");

        side.setBackground(new java.awt.Color(255, 255, 255));
        side.setOpaque(false);

        javax.swing.GroupLayout sideLayout = new javax.swing.GroupLayout(side);
        side.setLayout(sideLayout);
        sideLayout.setHorizontalGroup(
            sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        sideLayout.setVerticalGroup(
            sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add.png"))); // NOI18N

        javax.swing.GroupLayout btn_addLayout = new javax.swing.GroupLayout(btn_add);
        btn_add.setLayout(btn_addLayout);
        btn_addLayout.setHorizontalGroup(
            btn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_addLayout.createSequentialGroup()
                .addComponent(side, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(6, 6, 6)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        btn_addLayout.setVerticalGroup(
            btn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(side, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_addLayout.createSequentialGroup()
                .addGroup(btn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btn_addLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(btn_addLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(btn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        epanel1.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 170, 80));

        btn_edit.setBackground(new java.awt.Color(15, 35, 40));
        btn_edit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_editMousePressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("EDIT");

        side1.setBackground(new java.awt.Color(255, 255, 255));
        side1.setOpaque(false);

        javax.swing.GroupLayout side1Layout = new javax.swing.GroupLayout(side1);
        side1.setLayout(side1Layout);
        side1Layout.setHorizontalGroup(
            side1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        side1Layout.setVerticalGroup(
            side1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/edit.png"))); // NOI18N

        javax.swing.GroupLayout btn_editLayout = new javax.swing.GroupLayout(btn_edit);
        btn_edit.setLayout(btn_editLayout);
        btn_editLayout.setHorizontalGroup(
            btn_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_editLayout.createSequentialGroup()
                .addComponent(side1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(9, 9, 9)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        btn_editLayout.setVerticalGroup(
            btn_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(side1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_editLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(btn_editLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(btn_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        epanel1.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 170, 80));

        btn_delete.setBackground(new java.awt.Color(15, 35, 40));
        btn_delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_deleteMousePressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DELETE");

        side2.setBackground(new java.awt.Color(255, 255, 255));
        side2.setOpaque(false);

        javax.swing.GroupLayout side2Layout = new javax.swing.GroupLayout(side2);
        side2.setLayout(side2Layout);
        side2Layout.setHorizontalGroup(
            side2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        side2Layout.setVerticalGroup(
            side2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/delete.png"))); // NOI18N

        javax.swing.GroupLayout btn_deleteLayout = new javax.swing.GroupLayout(btn_delete);
        btn_delete.setLayout(btn_deleteLayout);
        btn_deleteLayout.setHorizontalGroup(
            btn_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_deleteLayout.createSequentialGroup()
                .addComponent(side2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addGap(5, 5, 5)
                .addComponent(jLabel9)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        btn_deleteLayout.setVerticalGroup(
            btn_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(side2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_deleteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(btn_deleteLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(btn_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        epanel1.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 170, 80));

        jPanel1.add(epanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 730));

        jLabel3.setBackground(new java.awt.Color(15, 35, 40));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(15, 35, 40));
        jLabel3.setText("PATRON");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        jLabel2.setBackground(new java.awt.Color(15, 35, 40));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(15, 35, 40));
        jLabel2.setText("FORM");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, -1, -1));

        PatronPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PatronPanelLayout = new javax.swing.GroupLayout(PatronPanel);
        PatronPanel.setLayout(PatronPanelLayout);
        PatronPanelLayout.setHorizontalGroup(
            PatronPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
        );
        PatronPanelLayout.setVerticalGroup(
            PatronPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        jPanel1.add(PatronPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 1140, 210));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel5.setText("No. of Record/s:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        countrec.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jPanel1.add(countrec, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 40, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jLabel4.setText("LIST OF PATRON");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, -1, -1));

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
        jPanel1.add(searchuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 280, 200, 30));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 1100, 290));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Documents\\Image\\line.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 1130, 240));

        hint.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(hint, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 120, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 750));

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

    private void btn_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addMouseClicked
    hint.setText("");
    tb_patron.clearSelection();
    edit.setVisible(false);
    add.setVisible(true);
    side1.setOpaque(false);
    setColor(btn_add);
    resetColor(btn_edit);
    side.setOpaque(true);
    }//GEN-LAST:event_btn_addMouseClicked

    private void btn_editMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editMousePressed
   edit.setVisible(true);
    add.setVisible(false);
    side1.setOpaque(true);
    setColor(btn_edit);
    resetColor(btn_add);
    line(side);
    hint.setText(tb_patron.getValueAt(tb_patron.getSelectedRow(), 0).toString());
       SimpleDateFormat sysdate = new SimpleDateFormat("yyyy/MM/dd");   
        try {
              BookBorrowingSystem.stm = BookBorrowingSystem.con.createStatement();
              BookBorrowingSystem.rst = BookBorrowingSystem.stm.executeQuery("select * from tb_patron where library_id='"+hint.getText()+"'");
              
              while(BookBorrowingSystem.rst.next()){
                       
                       editpatron.plname.setText(BookBorrowingSystem.rst.getString("patron_lname"));
                       editpatron.pfname.setText(BookBorrowingSystem.rst.getString("patron_fname"));
                       editpatron.pmname.setText(BookBorrowingSystem.rst.getString("patron_mname"));
                       editpatron.paddress.setText(BookBorrowingSystem.rst.getString("address"));
                        try {
                editpatron.pbirthdate.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(tb_patron.getValueAt(tb_patron.getSelectedRow(), 3).toString()));
            } catch (ParseException ex) {}
                       editpatron.pcontact.setText(BookBorrowingSystem.rst.getString("contact_no"));
                       editpatron.pemail.setText(BookBorrowingSystem.rst.getString("email_add"));
                      
              }
             
       }catch (Exception ee){ee.printStackTrace();}
    }//GEN-LAST:event_btn_editMousePressed

    private void btn_deleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deleteMousePressed
           try {
                int ask = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this?", "Message", JOptionPane.YES_NO_OPTION );

                if(ask==JOptionPane.YES_OPTION){

                    BookBorrowingSystem.stm.executeUpdate("Delete from tb_patron where library_id= '" + hint.getText() + "'");

                       tblmodel.setRowCount(0);
                       records();
                     try {
            BookBorrowingSystem.stm = BookBorrowingSystem.con.createStatement();
            BookBorrowingSystem.rst = BookBorrowingSystem.stm.executeQuery("select count(library_id) from tb_patron");
            while(BookBorrowingSystem.rst.next()){

               countrec.setText(BookBorrowingSystem.rst.getString("count(library_id)"));
            }
        }catch(Exception ex){}
                    JOptionPane.showMessageDialog(null,"Data Deleted!", "Message", JOptionPane.INFORMATION_MESSAGE);
                    resetColor(btn_delete);
                    line(side2);
                } else {
                    resetColor(btn_delete);
                    line(side2);}

            }catch (Exception e) {}     
    }//GEN-LAST:event_btn_deleteMousePressed

    private void tb_patronMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_patronMouseClicked
        hint.setText(tb_patron.getValueAt(tb_patron.getSelectedRow(), 0).toString());
       SimpleDateFormat sysdate = new SimpleDateFormat("yyyy/MM/dd");   
        try {
              BookBorrowingSystem.stm = BookBorrowingSystem.con.createStatement();
              BookBorrowingSystem.rst = BookBorrowingSystem.stm.executeQuery("select * from tb_patron where library_id='"+hint.getText()+"'");
              
              while(BookBorrowingSystem.rst.next()){
                       
                       editpatron.plname.setText(BookBorrowingSystem.rst.getString("patron_lname"));
                       editpatron.pfname.setText(BookBorrowingSystem.rst.getString("patron_fname"));
                       editpatron.pmname.setText(BookBorrowingSystem.rst.getString("patron_mname"));
                       editpatron.paddress.setText(BookBorrowingSystem.rst.getString("address"));
                        try {
                editpatron.pbirthdate.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(tb_patron.getValueAt(tb_patron.getSelectedRow(), 3).toString()));
            } catch (ParseException ex) {}
                       editpatron.pcontact.setText(BookBorrowingSystem.rst.getString("contact_no"));
                       editpatron.pemail.setText(BookBorrowingSystem.rst.getString("email_add"));
                      
              }
             
       }catch (Exception ee){ee.printStackTrace();}
    }//GEN-LAST:event_tb_patronMouseClicked
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
    private javax.swing.JPanel PatronPanel;
    public static javax.swing.JPanel btn_add;
    private javax.swing.JPanel btn_delete;
    public static javax.swing.JPanel btn_edit;
    public static javax.swing.JLabel countrec;
    public static javax.swing.JPanel epanel1;
    public static javax.swing.JLabel hint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.xswingx.JXTextField searchuser;
    public static javax.swing.JPanel side;
    private javax.swing.JPanel side1;
    private javax.swing.JPanel side2;
    public static javax.swing.JTable tb_patron;
    // End of variables declaration//GEN-END:variables
}
