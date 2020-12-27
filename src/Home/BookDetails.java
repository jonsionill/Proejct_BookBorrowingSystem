
package Home;

import java.awt.GridBagLayout;



public class BookDetails extends javax.swing.JInternalFrame {
GridBagLayout layout = new GridBagLayout();

    public BookDetails() {
    initComponents();   
                       
    }
    

   
 
   
  
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        epanel1 = new javax.swing.JPanel();
        epanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bimage = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        accession = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        callno = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        author = new javax.swing.JLabel();
        edition = new javax.swing.JLabel();
        isbn = new javax.swing.JLabel();
        copyright = new javax.swing.JLabel();
        pub = new javax.swing.JLabel();
        pages = new javax.swing.JLabel();
        copy = new javax.swing.JLabel();
        location = new javax.swing.JLabel();
        source = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        mtype = new javax.swing.JLabel();

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

        jLabel3.setBackground(new java.awt.Color(15, 35, 40));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(15, 35, 40));
        jLabel3.setText("Book");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, -1, -1));

        jLabel2.setBackground(new java.awt.Color(15, 35, 40));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(15, 35, 40));
        jLabel2.setText("Details");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, -1, -1));

        bimage.setText("Image of the book");
        bimage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(bimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 180, 170));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(15, 35, 40));
        jLabel5.setText("Call No:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(15, 35, 40));
        jLabel6.setText("Accession No:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(15, 35, 40));
        jLabel7.setText("Status:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 410, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(15, 35, 40));
        jLabel8.setText("Author:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(15, 35, 40));
        jLabel9.setText("Edition:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(15, 35, 40));
        jLabel10.setText("ISBN:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(15, 35, 40));
        jLabel11.setText("Copyright:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(15, 35, 40));
        jLabel12.setText("Title:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(15, 35, 40));
        jLabel13.setText("Place of Publisher:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 230, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(15, 35, 40));
        jLabel14.setText("No. of Pages:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 260, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(15, 35, 40));
        jLabel15.setText("Copy No: ");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 290, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(15, 35, 40));
        jLabel16.setText("Location:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 320, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(15, 35, 40));
        jLabel17.setText("Funding Source:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 350, -1, -1));

        accession.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        accession.setForeground(new java.awt.Color(15, 35, 40));
        jPanel1.add(accession, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 350, 20));

        status.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        status.setForeground(new java.awt.Color(15, 35, 40));
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 410, 270, 20));

        callno.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        callno.setForeground(new java.awt.Color(15, 35, 40));
        jPanel1.add(callno, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 350, 20));

        title.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        title.setForeground(new java.awt.Color(15, 35, 40));
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 350, 20));

        author.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        author.setForeground(new java.awt.Color(15, 35, 40));
        jPanel1.add(author, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 350, 20));

        edition.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        edition.setForeground(new java.awt.Color(15, 35, 40));
        jPanel1.add(edition, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 350, 20));

        isbn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        isbn.setForeground(new java.awt.Color(15, 35, 40));
        jPanel1.add(isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 350, 20));

        copyright.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        copyright.setForeground(new java.awt.Color(15, 35, 40));
        jPanel1.add(copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 350, 20));

        pub.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        pub.setForeground(new java.awt.Color(15, 35, 40));
        jPanel1.add(pub, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 230, 270, 20));

        pages.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        pages.setForeground(new java.awt.Color(15, 35, 40));
        jPanel1.add(pages, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 260, 270, 20));

        copy.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        copy.setForeground(new java.awt.Color(15, 35, 40));
        jPanel1.add(copy, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 290, 270, 20));

        location.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        location.setForeground(new java.awt.Color(15, 35, 40));
        jPanel1.add(location, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 320, 270, 20));

        source.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        source.setForeground(new java.awt.Color(15, 35, 40));
        jPanel1.add(source, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 350, 270, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(15, 35, 40));
        jLabel18.setText("Price (if purchased):");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 380, -1, -1));

        price.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        price.setForeground(new java.awt.Color(15, 35, 40));
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 380, 270, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(15, 35, 40));
        jLabel19.setText("Material Type:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, -1, -1));

        mtype.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        mtype.setForeground(new java.awt.Color(15, 35, 40));
        jPanel1.add(mtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 350, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
      
    }//GEN-LAST:event_jPanel1MousePressed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel accession;
    public static javax.swing.JLabel author;
    public static javax.swing.JLabel bimage;
    public static javax.swing.JLabel callno;
    public static javax.swing.JLabel copy;
    public static javax.swing.JLabel copyright;
    public static javax.swing.JLabel edition;
    public static javax.swing.JPanel epanel1;
    public static javax.swing.JPanel epanel2;
    public static javax.swing.JLabel isbn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel location;
    public static javax.swing.JLabel mtype;
    public static javax.swing.JLabel pages;
    public static javax.swing.JLabel price;
    public static javax.swing.JLabel pub;
    public static javax.swing.JLabel source;
    public static javax.swing.JLabel status;
    public static javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
