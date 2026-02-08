package benigui;


public class UserProfileDashboard extends javax.swing.JFrame {

    private String name, email, role;

    // Main Constructor used by Login
    public UserProfileDashboard(String name, String email, String role) {
        initComponents();
        this.name = name;
        this.email = email;
        this.role = role;

        // This puts the real data into the labels
        lblShowName.setText(name);
        lblShowEmail.setText(email);
        lblShowRole.setText(role);
        
        this.setLocationRelativeTo(null);
    }

    // Empty Constructor to fix the error in the main method
    public UserProfileDashboard() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnProceed = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblname2 = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lblShowName = new javax.swing.JLabel();
        lblShowEmail = new javax.swing.JLabel();
        lblShowRole = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnProceed.setBackground(new java.awt.Color(153, 153, 255));
        btnProceed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProceedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProceedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProceedMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter");

        javax.swing.GroupLayout btnProceedLayout = new javax.swing.GroupLayout(btnProceed);
        btnProceed.setLayout(btnProceedLayout);
        btnProceedLayout.setHorizontalGroup(
            btnProceedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        btnProceedLayout.setVerticalGroup(
            btnProceedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(btnProceed, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 150, 30));

        lblname2.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        lblname2.setForeground(new java.awt.Color(102, 102, 255));
        lblname2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblname2.setText("Name:");
        jPanel1.add(lblname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 490, -1));

        lblname.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        lblname.setForeground(new java.awt.Color(102, 102, 255));
        lblname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblname.setText("Name:");
        jPanel1.add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 490, -1));

        lblShowName.setBackground(new java.awt.Color(102, 102, 255));
        lblShowName.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        lblShowName.setForeground(new java.awt.Color(102, 102, 255));
        lblShowName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShowName.setText("Name:");
        jPanel1.add(lblShowName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 490, -1));

        lblShowEmail.setBackground(new java.awt.Color(102, 102, 255));
        lblShowEmail.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        lblShowEmail.setForeground(new java.awt.Color(102, 102, 255));
        lblShowEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShowEmail.setText("Email:");
        jPanel1.add(lblShowEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 490, -1));

        lblShowRole.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        lblShowRole.setForeground(new java.awt.Color(255, 255, 255));
        lblShowRole.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShowRole.setText("Role:");
        jPanel1.add(lblShowRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 150, -1));

        jLabel2.setBackground(new java.awt.Color(102, 102, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageFiles/Profile.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 670));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProceedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProceedMouseClicked
    if (role.equalsIgnoreCase("Admin")) {
        // This will now call the new constructor you just pasted above
        new AdminDashboard(name, email, role).setVisible(true);
    } else {
        new UserDashboard(name, email, role).setVisible(true);
    }
    this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_btnProceedMouseClicked

    private void btnProceedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProceedMouseEntered
// Change to a darker or lighter shade when hovering
    btnProceed.setBackground(new java.awt.Color(204, 204, 255)); 
    // Optional: Change cursor to a hand pointer
    btnProceed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
// TODO add your handling code here:
    }//GEN-LAST:event_btnProceedMouseEntered

    private void btnProceedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProceedMouseExited
    // Change back to the original color (the one you set in Design tab)
    btnProceed.setBackground(new java.awt.Color(153, 153, 255));
    // TODO add your handling code here:
    }//GEN-LAST:event_btnProceedMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserProfileDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserProfileDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserProfileDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserProfileDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserProfileDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnProceed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblShowEmail;
    private javax.swing.JLabel lblShowName;
    private javax.swing.JLabel lblShowRole;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblname2;
    // End of variables declaration//GEN-END:variables
}
