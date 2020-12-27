
package Home;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;




public class UserForm1 extends javax.swing.JInternalFrame {


   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btn_add = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        side = new javax.swing.JPanel();
        btn_delete = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        side2 = new javax.swing.JPanel();
        btn_edit = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        side1 = new javax.swing.JPanel();
        btn_home = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        hint = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_user = new javax.swing.JTable();
        searchuser = new org.jdesktop.xswingx.JXTextField();
        countrec = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        epanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(10, 37, 68));
        setBorder(null);
        setClosable(true);
        setForeground(new java.awt.Color(0, 153, 153));
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("User Form");
        setFrameIcon(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(10, 37, 68));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_add.setBackground(new java.awt.Color(10, 37, 68));
        btn_add.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ADD");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N

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

        javax.swing.GroupLayout btn_addLayout = new javax.swing.GroupLayout(btn_add);
        btn_add.setLayout(btn_addLayout);
        btn_addLayout.setHorizontalGroup(
            btn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_addLayout.createSequentialGroup()
                .addComponent(side, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        btn_addLayout.setVerticalGroup(
            btn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_addLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(btn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(side, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 170, 80));

        btn_delete.setBackground(new java.awt.Color(10, 37, 68));
        btn_delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_deleteMousePressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DELETE");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.png"))); // NOI18N

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

        javax.swing.GroupLayout btn_deleteLayout = new javax.swing.GroupLayout(btn_delete);
        btn_delete.setLayout(btn_deleteLayout);
        btn_deleteLayout.setHorizontalGroup(
            btn_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_deleteLayout.createSequentialGroup()
                .addComponent(side2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(29, 29, 29)
                .addComponent(jLabel9)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        btn_deleteLayout.setVerticalGroup(
            btn_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(side2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_deleteLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(btn_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9))
                .addGap(20, 20, 20))
        );

        jPanel4.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 170, 80));

        btn_edit.setBackground(new java.awt.Color(10, 37, 68));
        btn_edit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_editMousePressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("EDIT");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/edit.png"))); // NOI18N

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

        javax.swing.GroupLayout btn_editLayout = new javax.swing.GroupLayout(btn_edit);
        btn_edit.setLayout(btn_editLayout);
        btn_editLayout.setHorizontalGroup(
            btn_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_editLayout.createSequentialGroup()
                .addComponent(side1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(29, 29, 29)
                .addComponent(jLabel11)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        btn_editLayout.setVerticalGroup(
            btn_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(side1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_editLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(btn_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11))
                .addGap(20, 20, 20))
        );

        jPanel4.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 170, 80));

        btn_home.setBackground(new java.awt.Color(10, 37, 68));
        btn_home.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_homeMousePressed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("HOME");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N

        javax.swing.GroupLayout btn_homeLayout = new javax.swing.GroupLayout(btn_home);
        btn_home.setLayout(btn_homeLayout);
        btn_homeLayout.setHorizontalGroup(
            btn_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_homeLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel15)
                .addGap(26, 26, 26)
                .addComponent(jLabel14)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        btn_homeLayout.setVerticalGroup(
            btn_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_homeLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(btn_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel4.add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 170, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/line.png"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 229, 15));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 250, 510));

        jPanel2.setBackground(new java.awt.Color(10, 37, 68));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("USER FORM");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 239, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 120));

        hint.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(hint, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 150, 20));

        tb_user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        tb_user.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        tb_user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Contact No.", "Address", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_user.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tb_user.setFocusable(false);
        tb_user.setGridColor(new java.awt.Color(255, 255, 255));
        tb_user.setRowHeight(20);
        tb_user.setRowMargin(0);
        tb_user.setSelectionBackground(new java.awt.Color(0, 204, 204));
        tb_user.setSelectionForeground(new java.awt.Color(10, 37, 68));
        tb_user.getTableHeader().setReorderingAllowed(false);
        tb_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_userMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_user);
        if (tb_user.getColumnModel().getColumnCount() > 0) {
            tb_user.getColumnModel().getColumn(0).setResizable(false);
            tb_user.getColumnModel().getColumn(0).setPreferredWidth(1);
            tb_user.getColumnModel().getColumn(1).setResizable(false);
            tb_user.getColumnModel().getColumn(2).setResizable(false);
            tb_user.getColumnModel().getColumn(3).setResizable(false);
            tb_user.getColumnModel().getColumn(3).setPreferredWidth(1);
            tb_user.getColumnModel().getColumn(4).setResizable(false);
            tb_user.getColumnModel().getColumn(4).setPreferredWidth(1);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 1060, 280));

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
        jPanel1.add(searchuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 290, 200, 30));

        countrec.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jPanel1.add(countrec, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 40, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel5.setText("No. of Record/s:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));

        epanel1.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout epanel1Layout = new javax.swing.GroupLayout(epanel1);
        epanel1.setLayout(epanel1Layout);
        epanel1Layout.setHorizontalGroup(
            epanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1110, Short.MAX_VALUE)
        );
        epanel1Layout.setVerticalGroup(
            epanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        jPanel1.add(epanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 1110, 280));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jLabel1.setText("LIST OF USER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addMouseClicked
       /* adduser au= new adduser();
        MenuPage.desktop.add(au);
        au.setVisible(true);
        setColor(btn_add);
        side.setOpaque(true);
        line(side1);
        line(side2);
        resetColor(btn_edit);
        resetColor(btn_delete);
        //edit.setVisible(false);
        add.setVisible(true);
        BookBorrowingSystem.btn=2;     */
    }//GEN-LAST:event_btn_addMouseClicked

    private void btn_editMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editMousePressed
        /*if(BookBorrowingSystem.btn==2){
        MenuPage.desktop.remove(1);
        setColor(btn_edit);
        side1.setOpaque(true);
        line(side);
        line(side2);
        resetColor(btn_add);
        resetColor(btn_delete);
        //edit.setVisible(true);
        add.setVisible(false);
        BookBorrowingSystem.btn=3;      
        }
        else{
         setColor(btn_edit);
        side1.setOpaque(true);
        line(side);
        line(side2);
        resetColor(btn_add);
        resetColor(btn_delete);
        //edit.setVisible(true);
        add.setVisible(false);
        BookBorrowingSystem.btn=3;        
        }*/
                                 
    }//GEN-LAST:event_btn_editMousePressed

    private void btn_deleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deleteMousePressed
        /*if(ELMS.btn==24){
        ELMS.btn=23;
        Home.desktop.remove(1);
        setColor(btn_delete);
        side2.setOpaque(true);
        line(side);
        line(side1);
        resetColor(btn_edit);
        resetColor(btn_add);
        edit.setVisible(false);
        date.setVisible(true);
        add.setVisible(false);}
        else{
         ELMS.btn=23;
         setColor(btn_delete);
        side2.setOpaque(true);
        line(side);
        line(side1);
        resetColor(btn_edit);
        resetColor(btn_add);
        edit.setVisible(false);
        date.setVisible(true);
        add.setVisible(false);
        }
       
        if (hint.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Select the record to delete.","Message" ,JOptionPane.INFORMATION_MESSAGE);
            resetColor(btn_delete);
            line(side2);
        }
        else{
            ELMS.recno = Integer.parseInt(tb_user.getValueAt(tb_user.getSelectedRow(), 0).toString());

            try {
                int ask = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this?", "Message", JOptionPane.YES_NO_OPTION );

                if(ask==JOptionPane.YES_OPTION){

                    ELMS.stm.executeUpdate("Delete from tb_employee where employee_id= '" + ELMS.recno + "'");

                       tblmodel.setRowCount(0);
                       records();
                       employeepanel.datepanel.pname.setText("NAME");
                       employeepanel.datepanel.pbday.setText("Birthdate");
                       employeepanel.datepanel.pgen.setText("Gender");
                       employeepanel.datepanel.padd.setText("Address");
                       employeepanel.datepanel.pmail.setText("Email");
                       employeepanel.datepanel.pno.setText("Mobile #");
                       ImageIcon ii= new ImageIcon(getClass().getResource("/image/Picture.png"));
                       employeepanel.datepanel.datepic.setIcon(ii);
                     try {
            ELMS.stm = ELMS.con.createStatement();
            ELMS.rst = ELMS.stm.executeQuery("select count(employee_id) from tb_employee");
            while(ELMS.rst.next()){

               countrec.setText(ELMS.rst.getString("count(employee_id)"));
            }
        }catch(Exception ex){}
                    JOptionPane.showMessageDialog(null,"Data Deleted!", "Message", JOptionPane.INFORMATION_MESSAGE);
                    resetColor(btn_delete);
                    line(side2);
                } else {
                    resetColor(btn_delete);
                    line(side2);}

            }catch (Exception e) {}
        }*/
    }//GEN-LAST:event_btn_deleteMousePressed

    private void searchuserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchuserKeyReleased
       /*  try {
            TableRowSorter<DefaultTableModel> search = new TableRowSorter<>(tblmodel);
            tb_user.setRowSorter(search);

            if (searchuser.getText().isEmpty()){
                search.setRowFilter(RowFilter.regexFilter(""));
               }
            else {
                search.setRowFilter(RowFilter.regexFilter("(?i)"+"^*"+ searchuser.getText() + "$*" ));
                countrec.setText(tb_user.getRowCount()+"");
            }
        }catch (Exception er){}*/
    }//GEN-LAST:event_searchuserKeyReleased

    private void tb_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_userMouseClicked
        /*tb_user.setSelectionBackground(new Color(0,204,204));
        hint.setText(tb_user.getValueAt(tb_user.getSelectedRow(), 0).toString());
        SimpleDateFormat s = new SimpleDateFormat("MMMM dd, yyyy");
         countrec.setText(tb_user.getRowCount()+"");
       if(ELMS.btn==24 || ELMS.btn==23 || ELMS.btn==22 || ELMS.btn==25 || ELMS.btn==3 || ELMS.btn==7){ 
      if(ELMS.btn==24){  
       Home.desktop.remove(1);
       String p1 = "";
        String p2 = "";
        String p3 = "";
        String p4 = "";
        String p5 = "";
        String p6 = "";
        String p7 = "";
        String p8 = "";
        String p9 = ""; 
       try {
            ELMS.stm = ELMS.con.createStatement();
            ELMS.rst = ELMS.stm.executeQuery("select * from tb_employee where employee_id= '" + hint.getText() + "'");
            while(ELMS.rst.next()){

                   
                    p1 = ELMS.rst.getString("lastname");
                    p2 = ELMS.rst.getString("firstname");
                    p3 = ELMS.rst.getString("middlename");
                    p4 = s.format(ELMS.rst.getDate("birthdate"));
                    p5 = ELMS.rst.getString("gender");
                    p6 = ELMS.rst.getString("address");
                    p7 = ELMS.rst.getString("mobileno");
                    p8 = ELMS.rst.getString("email");
                    datepanel.datepic.setIcon(ResizeImage(null, ELMS.rst.getBytes("images")));
                    
            }
        }catch(Exception ex){}
        
        datepanel.pname.setText(p1 + ", " + p2 + " " + p3 );
        datepanel.pbday.setText(p4);
        datepanel.pgen.setText(p5);
        datepanel.padd.setText(p6);
        datepanel.pmail.setText(p8);
        datepanel.pno.setText(p7);
        resetColor(btn_add);
        line(side);
        ELMS.btn=25;}
      else{
        String p1 = "";
        String p2 = "";
        String p3 = "";
        String p4 = "";
        String p5 = "";
        String p6 = "";
        String p7 = "";
        String p8 = "";
        String p9 = "";    
      try {
            ELMS.stm = ELMS.con.createStatement();
            ELMS.rst = ELMS.stm.executeQuery("select * from tb_employee where employee_id= '" + hint.getText() + "'");
            while(ELMS.rst.next()){

                   
                    p1 = ELMS.rst.getString("lastname");
                    p2 = ELMS.rst.getString("firstname");
                    p3 = ELMS.rst.getString("middlename");
                    p4 = s.format(ELMS.rst.getDate("birthdate"));
                    p5 = ELMS.rst.getString("gender");
                    p6 = ELMS.rst.getString("address");
                    p7 = ELMS.rst.getString("mobileno");
                    p8 = ELMS.rst.getString("email");
                    datepanel.datepic.setIcon(ResizeImage(null, ELMS.rst.getBytes("images")));
                    
            }
        }catch(Exception ex){}
        
        datepanel.pname.setText(p1 + ", " + p2 + " " + p3 );
        datepanel.pbday.setText(p4);
        datepanel.pgen.setText(p5);
        datepanel.padd.setText(p6);
        datepanel.pmail.setText(p8);
        datepanel.pno.setText(p7);
       }}
        
       else if (ELMS.btn==4 || ELMS.btn==5 || ELMS.btn==6){
               
            String c1="";
            String c2="";
            String c3="";
            String c4="";
            String c5="";
            String c6="";
            String c7="";
            String c8="";
            String c9="";
            String c10="";
            String c11="";
            String c12="";
            String c13="";
            String c14="";
            String c15="";
            String c16="";
            String c17="";
            String c18="";
            String c19="";
            String c20="";
            
            java.sql.Timestamp hiredate= null;
            try {
                ELMS.stm = ELMS.con.createStatement();
                ELMS.rst = ELMS.stm.executeQuery("select * from tb_employee where employee_id= '" + hint.getText() + "'");

                while(ELMS.rst.next()){

                    c1 = ELMS.rst.getString("employee_id");
                    c2 = ELMS.rst.getString("lastname");
                    c3 = ELMS.rst.getString("firstname");
                    c4 = ELMS.rst.getString("middlename");
                    c5 = ELMS.rst.getString("nationality");
                    c6 = ELMS.rst.getString("birthdate");
                    c7 = ELMS.rst.getString("gender");
                    c8 = ELMS.rst.getString("address");
                    c9 = ELMS.rst.getString("department");
                    c10 = ELMS.rst.getString("position");
                    c11 = ELMS.rst.getString("salary");
                    c12 = ELMS.rst.getString("supervisor_name");
                    hiredate = ELMS.rst.getTimestamp("hiredate");
                    c14 = ELMS.rst.getString("mobileno");
                    c15 = ELMS.rst.getString("email");
                    c16 = ELMS.rst.getString("marital_status");
                    c17 = ELMS.rst.getString("username");
                    c18 = ELMS.rst.getString("password");
                    c19 = ELMS.rst.getString("grade");
                    c20 = ELMS.rst.getString("steps");
                    editemployee.editimg.setIcon(ResizeImage(null, ELMS.rst.getBytes("images")));

                }
            }catch(Exception ex){

            }
            editemployee.editid.setText(c1);
            editemployee.editlast.setText(c2);
            editemployee.editlast.setBackground(Color.white);
            editemployee.editfirst.setText(c3);
            editemployee.editfirst.setBackground(Color.white);
            editemployee.editmid.setText(c4);
            editemployee.editmid.setBackground(Color.white);
            editemployee.editnatio.setText(c5);
            editemployee.editnatio.setBackground(Color.white);
            try {
                editemployee.editbirth.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(tb_user.getValueAt(tb_user.getSelectedRow(), 3).toString()));
            } catch (ParseException ex) {}
           editemployee.editgen.setSelectedItem(c7);
           editemployee.editgen.setBackground(Color.white);
           editemployee.editad.setText(c8);
           editemployee.editad.setBackground(Color.white);
           editemployee.editdept.setSelectedItem(c9);
           editemployee.editdept.setBackground(Color.white);
           editemployee.edithire.setDate(hiredate);
           editemployee.edithire.setBackground(Color.white);
           editemployee.editpos.setSelectedItem(c10);
           editemployee.editpos.setBackground(Color.white);
           editemployee.addsal.setText(c11);
           editemployee.editsup.setText(c12);
           editemployee.editsup.setBackground(Color.white);
           editemployee.editmob.setText(c14);
           editemployee.editmob.setBackground(Color.white);
           editemployee.editem.setText(c15);
           editemployee.editem.setBackground(Color.white);
           editemployee.editstat.setSelectedItem(c16);
           editemployee.editstat.setBackground(Color.white);
           editemployee.edituser.setText(c17);
           editemployee.edituser.setBackground(Color.white);
           editemployee.editpass.setText(c18);
           editemployee.editpass.setBackground(Color.white);
           editemployee.addgr.setSelectedItem(c19);
           editemployee.addst.setSelectedItem(c20);
           editemployee.addgr.setBackground(Color.white);
           editemployee.addst.setBackground(Color.white);
           

        }*/
       
        
       
    }//GEN-LAST:event_tb_userMouseClicked

    private void searchuserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchuserFocusLost
       
    }//GEN-LAST:event_searchuserFocusLost

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
      /*tb_user.setSelectionBackground(new Color(255,255,255));
       UserForm.hint.setText("");
                            editid.setText("");
                            editlast.setText("");
                            editlast.setBackground(new Color(255,255,255));
                            editfirst.setText("");
                            editfirst.setBackground(new Color(255,255,255));
                            editmid.setText("");
                            editmid.setBackground(new Color(255,255,255));
                            editnatio.setText("");
                            editnatio.setBackground(new Color(255,255,255));
                            editbirth.setCalendar(null);
                            editbirth.setBackground(new Color(255,255,255));
                            editgen.setSelectedIndex(0);
                            editgen.setBackground(new Color(255,255,255));
                            editad.setText("");
                            editad.setBackground(new Color(255,255,255));
                            editdept.setSelectedIndex(0);
                            editdept.setBackground(new Color(255,255,255));
                            editpos.setSelectedIndex(0);
                            editpos.setBackground(new Color(255,255,255));
                            addsal.setText("");
                            editsup.setText("");
                            editsup.setBackground(new Color(255,255,255));
                            edithire.setCalendar(null);
                            edithire.setBackground(new Color(255,255,255));
                            editmob.setText("");
                            editmob.setBackground(new Color(255,255,255));
                            editem.setText("");
                            editem.setBackground(new Color(255,255,255));
                            editstat.setSelectedIndex(0);
                            editstat.setBackground(new Color(255,255,255));
                            edituser.setText("");
                            edituser.setBackground(new Color(255,255,255));
                            editpass.setText("");
                            editpass.setBackground(new Color(255,255,255));
                            addgr.setSelectedIndex(0);
                            addst.setSelectedIndex(0);
                            ImageIcon ii= new ImageIcon(getClass().getResource("/image/Picture.png"));
                            editimg.setIcon(ii);
                            datepanel.pname.setText("NAME");
                            datepanel.pbday.setText("Birthdate");
                            datepanel.pgen.setText("Gender");
                            datepanel.padd.setText("Address");
                            datepanel.pmail.setText("Email");
                            datepanel.pno.setText("Mobile #");
                            datepanel.datepic.setIcon(ii);
                            tblmodel.setRowCount(0);
                            records();*/
    }//GEN-LAST:event_jPanel1MousePressed

    private void searchuserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchuserMousePressed
       /* tb_user.setSelectionBackground(new Color(255,255,255));
       UserForm.hint.setText("");
                            editid.setText("");
                            editlast.setText("");
                            editlast.setBackground(new Color(255,255,255));
                            editfirst.setText("");
                            editfirst.setBackground(new Color(255,255,255));
                            editmid.setText("");
                            editmid.setBackground(new Color(255,255,255));
                            editnatio.setText("");
                            editnatio.setBackground(new Color(255,255,255));
                            editbirth.setCalendar(null);
                            editbirth.setBackground(new Color(255,255,255));
                            editgen.setSelectedIndex(0);
                            editgen.setBackground(new Color(255,255,255));
                            editad.setText("");
                            editad.setBackground(new Color(255,255,255));
                            editdept.setSelectedIndex(0);
                            editdept.setBackground(new Color(255,255,255));
                            editpos.setSelectedIndex(0);
                            editpos.setBackground(new Color(255,255,255));
                            addsal.setText("");
                            editsup.setText("");
                            editsup.setBackground(new Color(255,255,255));
                            edithire.setCalendar(null);
                            edithire.setBackground(new Color(255,255,255));
                            editmob.setText("");
                            editmob.setBackground(new Color(255,255,255));
                            editem.setText("");
                            editem.setBackground(new Color(255,255,255));
                            editstat.setSelectedIndex(0);
                            editstat.setBackground(new Color(255,255,255));
                            edituser.setText("");
                            edituser.setBackground(new Color(255,255,255));
                            editpass.setText("");
                            editpass.setBackground(new Color(255,255,255));
                            addgr.setSelectedIndex(0);
                            addst.setSelectedIndex(0);
                            ImageIcon ii= new ImageIcon(getClass().getResource("/image/Picture.png"));
                            editimg.setIcon(ii);
                            datepanel.pname.setText("NAME");
                            datepanel.pbday.setText("Birthdate");
                            datepanel.pgen.setText("Gender");
                            datepanel.padd.setText("Address");
                            datepanel.pmail.setText("Email");
                            datepanel.pno.setText("Mobile #");
                            datepanel.datepic.setIcon(ii);*/
    }//GEN-LAST:event_searchuserMousePressed

    private void btn_homeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMousePressed
/*
        if(ELMS.btn==4 || ELMS.btn==23 || ELMS.btn==22 || ELMS.btn==3 || ELMS.btn==25 || ELMS.btn==7 || ELMS.btn==6  || ELMS.btn==5){
            dispose();
        }
        else if(ELMS.btn==24 || ELMS.btn==8){
            Home.desktop.removeAll();

        }*/

    }//GEN-LAST:event_btn_homeMousePressed

  /*  void setColor(JPanel panel){
     panel.setBackground(new Color(22,55,92));
     
    }
    
    void resetColor(JPanel panel){
     panel.setBackground(new Color(10,37,68));   
    }
    
    void line(JPanel panel){
     panel.setOpaque(false);
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel btn_add;
    private javax.swing.JPanel btn_delete;
    public static javax.swing.JPanel btn_edit;
    private javax.swing.JPanel btn_home;
    public static javax.swing.JLabel countrec;
    public static javax.swing.JPanel epanel1;
    public static javax.swing.JLabel hint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.xswingx.JXTextField searchuser;
    public static javax.swing.JPanel side;
    private javax.swing.JPanel side1;
    private javax.swing.JPanel side2;
    public static javax.swing.JTable tb_user;
    // End of variables declaration//GEN-END:variables
}
