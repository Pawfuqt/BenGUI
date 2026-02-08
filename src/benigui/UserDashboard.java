
package benigui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;


public final class UserDashboard extends javax.swing.JFrame {


   // These variables allow the dashboard to "remember" who logged in
    String name, email, role;

    public UserDashboard(String name, String email, String role) {
        initComponents();
        this.name = name;
        this.email = email;
        this.role = role;
        
        // Your existing method to load the database table
        loadBooks(); 
    }
    
    // You also need an empty constructor to prevent errors in the main method
    public UserDashboard() {
        initComponents();          // Loads the full list
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        lblRatingDisplay = new javax.swing.JLabel();
        BReco = new javax.swing.JLabel();
        logoutbttn = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBooks = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRecs = new javax.swing.JTable();
        clearSearchBttn = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnSubmitRating = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        comboRating = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(880, 610));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Rate (1-10)");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(681, 400, 130, -1));
        getContentPane().add(lblRatingDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 380, -1));

        BReco.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 16)); // NOI18N
        BReco.setForeground(new java.awt.Color(255, 255, 255));
        BReco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BReco.setText("BOOK RECOMMENDATION");
        getContentPane().add(BReco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 320, -1));

        logoutbttn.setBackground(new java.awt.Color(153, 153, 255));
        logoutbttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutbttnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutbttnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutbttnMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Logout");

        javax.swing.GroupLayout logoutbttnLayout = new javax.swing.GroupLayout(logoutbttn);
        logoutbttn.setLayout(logoutbttnLayout);
        logoutbttnLayout.setHorizontalGroup(
            logoutbttnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );
        logoutbttnLayout.setVerticalGroup(
            logoutbttnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutbttnLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        getContentPane().add(logoutbttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 380, 40));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Search:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));

        txtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchMouseClicked(evt);
            }
        });
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 380, -1));

        tblBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblBooks);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 380, 190));

        tblRecs.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblRecs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane2.setViewportView(tblRecs);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 320, 210));

        clearSearchBttn.setBackground(new java.awt.Color(153, 153, 240));
        clearSearchBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearSearchBttnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearSearchBttnMouseEntered(evt);
            }
        });
        clearSearchBttn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Clear");
        clearSearchBttn.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 110, 30));

        getContentPane().add(clearSearchBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 110, 30));

        btnSubmitRating.setBackground(new java.awt.Color(153, 153, 255));
        btnSubmitRating.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubmitRatingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSubmitRatingMouseEntered(evt);
            }
        });
        btnSubmitRating.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Submit");
        btnSubmitRating.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 110, 30));

        getContentPane().add(btnSubmitRating, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 110, 30));

        comboRating.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        comboRating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRatingActionPerformed(evt);
            }
        });
        getContentPane().add(comboRating, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, 130, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageFiles/User.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
                                  
    String input = txtSearch.getText().trim();
    
    // The '%' signs allow the database to find partial matches 
    // (e.g., 'Har' will find 'Harry Potter')
    String sql = "SELECT title, author, genre, rating FROM books " +
                 "WHERE title LIKE ? OR author LIKE ? OR genre LIKE ?";

    try (java.sql.Connection con = BeniGUI.connectDB();
         java.sql.PreparedStatement pst = con.prepareStatement(sql)) {
        
        // We set the same input for all three '?' placeholders
        pst.setString(1, "%" + input + "%");
        pst.setString(2, "%" + input + "%");
        pst.setString(3, "%" + input + "%");
        
        java.sql.ResultSet rs = pst.executeQuery();
        
        // This line updates your JTable visually
        tblBooks.setModel(DbUtils.resultSetToTableModel(rs));
        
    } catch (Exception e) {
        System.out.println("Filter Error: " + e.getMessage());
    
    }//GEN-LAST:event_txtSearchKeyReleased
    }
    private void clearSearchBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearSearchBttnMouseClicked
// 1. Empty the search text field
    txtSearch.setText("");
    
    // 2. Reload the full table (calling your existing load method)
    loadBooks(); 
    
    // 3. Clear the selection and labels
    tblBooks.clearSelection();
    lblRatingDisplay.setText("Select a book to see details.");
    
    // 4. Return cursor focus to the search box
    txtSearch.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_clearSearchBttnMouseClicked

    private void clearSearchBttnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearSearchBttnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_clearSearchBttnMouseEntered

    private void btnSubmitRatingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitRatingMouseClicked
// 1. Get the selected row from the main search table
    int row = tblBooks.getSelectedRow();

    if (row == -1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please select a book from the list first!");
        return;
    }

    // 2. Get the Title (Col 0) and the value from your JComboBox (comboRating)
    String title = tblBooks.getValueAt(row, 0).toString();
    String ratingValue = comboRating.getSelectedItem().toString();

    // 3. Update the database
    String sql = "UPDATE books SET rating = ? WHERE title = ?";

    try (java.sql.Connection con = benigui.BeniGUI.connectDB();
         java.sql.PreparedStatement pst = con.prepareStatement(sql)) {
        
        pst.setInt(1, Integer.parseInt(ratingValue));
        pst.setString(2, title);
        
        pst.executeUpdate();
        
        javax.swing.JOptionPane.showMessageDialog(this, "Rating saved for " + title);

        // 4. Refresh both tables so the user sees the changes instantly
        loadBooks();           // Updates the main search results
        loadRecommendations(); // Updates the Top Rated leaderboard (tblRecs)
        
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Update Error: " + e.getMessage());
    }        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubmitRatingMouseClicked

    private void btnSubmitRatingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitRatingMouseEntered
                                           
    // Changes cursor to a hand pointer when hovering
    btnSubmitRating.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubmitRatingMouseEntered

    private void comboRatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRatingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboRatingActionPerformed

    private void txtSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseClicked
                                      
    // Make the table appear
    jScrollPane1.setVisible(true);
    
    // Optional: Refresh the frame layout to ensure the table draws correctly
    this.revalidate();
    this.repaint();
       // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchMouseClicked

    private void logoutbttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbttnMouseClicked
// 1. Ask for confirmation (optional but professional)
    int confirm = javax.swing.JOptionPane.showConfirmDialog(this, 
            "Are you sure you want to logout?", "Logout", 
            javax.swing.JOptionPane.YES_NO_OPTION);

    if (confirm == javax.swing.JOptionPane.YES_OPTION) {
        // 2. Open the Login Form
        new LoginForm().setVisible(true);
        
        // 3. Close the current User Dashboard
        this.dispose();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_logoutbttnMouseClicked

    private void logoutbttnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbttnMouseEntered
   logoutbttn.setBackground(new java.awt.Color(204,204,255));
    
    // 3. Optional: Change cursor to hand
    logoutbttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutbttnMouseEntered

    private void logoutbttnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbttnMouseExited
   logoutbttn.setBackground(new java.awt.Color(153,153,255));
  // TODO add your handling code here:
    }//GEN-LAST:event_logoutbttnMouseExited

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
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDashboard().setVisible(true);
            }
            
        });
        
    }
// PLACE THIS AT THE BOTTOM OF THE CLASS
    public void loadRecommendations() {
// Change LIMIT 5 to LIMIT 8
    String sql = "SELECT title, rating FROM books ORDER BY rating DESC LIMIT 8";
    
    try (java.sql.Connection con = benigui.BeniGUI.connectDB();
         java.sql.PreparedStatement pst = con.prepareStatement(sql);
         java.sql.ResultSet rs = pst.executeQuery()) {
        
        // This updates your tblRecs with the top 8 results
        tblRecs.setModel(DbUtils.resultSetToTableModel(rs));
        
    } catch (Exception e) {
        System.out.println("Recommendation Error: " + e.getMessage());
    }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BReco;
    private javax.swing.JPanel btnSubmitRating;
    private javax.swing.JPanel clearSearchBttn;
    private javax.swing.JComboBox<String> comboRating;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblRatingDisplay;
    private javax.swing.JPanel logoutbttn;
    private javax.swing.JTable tblBooks;
    private javax.swing.JTable tblRecs;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    public void loadBooks() {

    // REMOVE "LIMIT 5" from here
    String sql = "SELECT title, author, genre, rating FROM books"; 
    
    try (Connection con = benigui.BeniGUI.connectDB();
         PreparedStatement pst = con.prepareStatement(sql);
         ResultSet rs = pst.executeQuery()) {
        
        tblBooks.setModel(DbUtils.resultSetToTableModel(rs));
        
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
}
    }


