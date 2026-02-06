package benigui;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class RegistrationForm extends javax.swing.JFrame {

    public RegistrationForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AccountType = new javax.swing.JLabel();
        comboRole = new javax.swing.JComboBox<>();
        JRegisterBttn = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create New Account");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AccountType.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        AccountType.setForeground(new java.awt.Color(255, 255, 255));
        AccountType.setText("SELECT ROLE:");
        jPanel1.add(AccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 130, -1));

        comboRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User", " ", " " }));
        comboRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRoleActionPerformed(evt);
            }
        });
        jPanel1.add(comboRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 190, -1));

        JRegisterBttn.setText("REGISTER");
        JRegisterBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRegisterBttnActionPerformed(evt);
            }
        });
        jPanel1.add(JRegisterBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 150, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 190, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NEW USERNAME:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 190, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NEW PASSWORD:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONFIRM PASSWORD:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, 20));
        jPanel1.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 190, -1));

        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 150, -1));

        jButton3.setText("BACK TO LOGIN");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 390, -1));

        jLabel4.setBackground(new java.awt.Color(255, 204, 204));
        jLabel4.setForeground(new java.awt.Color(255, 204, 204));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageFiles/Manhwa Register.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JRegisterBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRegisterBttnActionPerformed
String username = jTextField1.getText().trim();
    String password = new String(jPasswordField1.getPassword());
    String confirm = new String(jPasswordField2.getPassword());
    String selectedRole = comboRole.getSelectedItem().toString();

    // 1. Validation: Ensure no empty fields and matching passwords
    if (username.isEmpty() || password.isEmpty() || selectedRole.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "All fields are required!");
        return;
    }

    if (!password.equals(confirm)) {
        JOptionPane.showMessageDialog(this, "Passwords do not match!");
        return;
    }

    // 2. Single Database Operation
    String sql = "INSERT INTO users (username, password, role) VALUES (?, ?, ?)";

    try (Connection con = BeniGUI.connectDB(); // Uses your SQLite connection
         PreparedStatement pst = con.prepareStatement(sql)) {
        
        pst.setString(1, username);
        pst.setString(2, password);
        pst.setString(3, selectedRole);
        
        pst.executeUpdate();
        
        JOptionPane.showMessageDialog(this, "Registration Successful! You can now log in.");
        
        // 3. Switch to Login Screen
        new LoginForm().setVisible(true);
        this.dispose();

    } catch (SQLException e) {
        // If username is a PRIMARY KEY, this catches duplicates
        JOptionPane.showMessageDialog(this, "Error: Username might already be taken.\n" + e.getMessage());
    }

    }//GEN-LAST:event_JRegisterBttnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        new LoginForm().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void comboRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboRoleActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new RegistrationForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccountType;
    private javax.swing.JButton JRegisterBttn;
    private javax.swing.JComboBox<String> comboRole;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}