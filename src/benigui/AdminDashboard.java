
package benigui;

import net.proteanit.sql.DbUtils;

public class AdminDashboard extends javax.swing.JFrame {

    
    

public AdminDashboard() {
        initComponents(); // This is already there (it builds the UI)
        loadBooks();      // <--- PASTE IT HERE: This runs right after the UI is built
    
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBooks = new javax.swing.JTable();
        deletebttn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        addbttn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        updatebttn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDescription = new javax.swing.JTextArea();
        jTitle = new javax.swing.JTextField();
        jGenre = new javax.swing.JTextField();
        jAuthor = new javax.swing.JTextField();
        logoutBttn = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Dashboard");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(900, 650));
        setPreferredSize(new java.awt.Dimension(474, 569));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setDoubleBuffered(false);
        jPanel1.setMaximumSize(new java.awt.Dimension(880, 610));
        jPanel1.setMinimumSize(new java.awt.Dimension(880, 610));
        jPanel1.setPreferredSize(new java.awt.Dimension(880, 610));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Book Title", "Author", "Genre", "Description"
            }
        ));
        tblBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblBooks.setGridColor(new java.awt.Color(204, 204, 255));
        tblBooks.setInheritsPopupMenu(true);
        tblBooks.setPreferredSize(new java.awt.Dimension(375, 80));
        tblBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBooksMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblBooks);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 490, 320));

        deletebttn.setBackground(new java.awt.Color(153, 153, 255));
        deletebttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebttnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deletebttnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deletebttnMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Delete");

        javax.swing.GroupLayout deletebttnLayout = new javax.swing.GroupLayout(deletebttn);
        deletebttn.setLayout(deletebttnLayout);
        deletebttnLayout.setHorizontalGroup(
            deletebttnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(deletebttnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(deletebttnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        deletebttnLayout.setVerticalGroup(
            deletebttnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(deletebttnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(deletebttnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(deletebttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 100, 30));

        addbttn.setBackground(new java.awt.Color(153, 153, 255));
        addbttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbttnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addbttnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addbttnMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("add");

        javax.swing.GroupLayout addbttnLayout = new javax.swing.GroupLayout(addbttn);
        addbttn.setLayout(addbttnLayout);
        addbttnLayout.setHorizontalGroup(
            addbttnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addbttnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        addbttnLayout.setVerticalGroup(
            addbttnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addbttnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(addbttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 100, 30));

        updatebttn.setBackground(new java.awt.Color(153, 153, 255));
        updatebttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatebttnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updatebttnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updatebttnMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("update");

        javax.swing.GroupLayout updatebttnLayout = new javax.swing.GroupLayout(updatebttn);
        updatebttn.setLayout(updatebttnLayout);
        updatebttnLayout.setHorizontalGroup(
            updatebttnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatebttnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        updatebttnLayout.setVerticalGroup(
            updatebttnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatebttnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(updatebttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 100, 30));

        jDescription.setColumns(20);
        jDescription.setRows(5);
        jScrollPane1.setViewportView(jDescription);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 320, 110));

        jTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTitleActionPerformed(evt);
            }
        });
        jPanel1.add(jTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 320, 30));

        jGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGenreActionPerformed(evt);
            }
        });
        jPanel1.add(jGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 320, 30));

        jAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAuthorActionPerformed(evt);
            }
        });
        jPanel1.add(jAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 320, 30));

        logoutBttn.setBackground(new java.awt.Color(153, 153, 255));
        logoutBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBttnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutBttnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutBttnMouseExited(evt);
            }
        });
        logoutBttn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Logout");
        logoutBttn.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 170, 30));

        jPanel1.add(logoutBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 520, 170, 30));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Description:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 320, -1));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Title:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 320, -1));

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Genre:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 320, -1));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Author:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 320, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageFiles/ADminnn.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTitleActionPerformed

    private void jAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAuthorActionPerformed

    private void jGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGenreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jGenreActionPerformed

    private void addbttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbttnMouseClicked
String title = jTitle.getText();
    String author = jAuthor.getText();
    String genre = jGenre.getText();
    String desc = jDescription.getText(); // NEW: Get description

    String sql = "INSERT INTO books (title, author, genre, description) VALUES (?, ?, ?, ?)";

    try (java.sql.Connection con = BeniGUI.connectDB();
         java.sql.PreparedStatement pst = con.prepareStatement(sql)) {
        
        pst.setString(1, title);
        pst.setString(2, author);
        pst.setString(3, genre);
        pst.setString(4, desc); // NEW: Bind description
        pst.executeUpdate();
        
        loadBooks(); // Refresh table to see the new column data
        clearFields();
    } catch (Exception e) {
        System.out.println("Add Error: " + e.getMessage());
    }
    }//GEN-LAST:event_addbttnMouseClicked

    private void addbttnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbttnMouseEntered
   addbttn.setBackground(new java.awt.Color(204,204,255));
    
    // 3. Optional: Change cursor to hand
    addbttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        // TODO add your handling code here:
    }//GEN-LAST:event_addbttnMouseEntered

    private void deletebttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebttnMouseClicked
int row = tblBooks.getSelectedRow();
    
    // Safety Check: If no row is selected, row will be -1
    if (row == -1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please select a book to delete!");
        return;
    }

    try {
        // Get the title from the selected row (Column 0)
        String title = tblBooks.getValueAt(row, 0).toString();
        
        int confirm = javax.swing.JOptionPane.showConfirmDialog(this, 
                "Delete '" + title + "'?", "Confirm", javax.swing.JOptionPane.YES_NO_OPTION);
        
        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
            String sql = "DELETE FROM books WHERE title = ?";
            try (java.sql.Connection con = benigui.BeniGUI.connectDB();
                 java.sql.PreparedStatement pst = con.prepareStatement(sql)) {
                
                pst.setString(1, title);
                pst.executeUpdate();
                
                javax.swing.JOptionPane.showMessageDialog(this, "Deleted successfully!");
                
                // IMPORTANT: Clear selection before reloading
                tblBooks.clearSelection();
                loadBooks(); 
            }
        }
    } catch (Exception e) {
        System.out.println("Delete Error: " + e.getMessage());
    
    }


        // TODO add your handling code here:
    }//GEN-LAST:event_deletebttnMouseClicked

    private void updatebttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatebttnMouseClicked
int selectedRow = tblBooks.getSelectedRow();

    if (selectedRow == -1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Select a book from the table to update.");
        return;
    }

    // 1. We get the Title from Column 0 to identify WHICH book to update
    String originalTitle = tblBooks.getValueAt(selectedRow, 0).toString();
    
    // 2. Get the new values from your text fields
    String newTitle = jTitle.getText().trim();
    String newAuthor = jAuthor.getText().trim();
    String newGenre = jGenre.getText().trim();
    String newDesc = jDescription.getText().trim();

    // 3. Update query using the original title as the anchor
    String sql = "UPDATE books SET title = ?, author = ?, genre = ?, description = ? WHERE title = ?";

    try (java.sql.Connection con = BeniGUI.connectDB();
         java.sql.PreparedStatement pst = con.prepareStatement(sql)) {

        pst.setString(1, newTitle);
        pst.setString(2, newAuthor);
        pst.setString(3, newGenre);
        pst.setString(4, newDesc);
        pst.setString(5, originalTitle); // The "WHERE" clause

        pst.executeUpdate();
        javax.swing.JOptionPane.showMessageDialog(this, "Book Updated Successfully!");
        
        loadBooks();
        clearFields();

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Update Error: " + e.getMessage());
    }
    }//GEN-LAST:event_updatebttnMouseClicked

    private void updatebttnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatebttnMouseEntered
                                      
    System.out.println("Mouse has entered the UPDATE button!"); 
    // Use setBackground for JPanels
    updatebttn.setBackground(new java.awt.Color(204,204,255)); 

    }//GEN-LAST:event_updatebttnMouseEntered

    private void updatebttnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatebttnMouseExited
                              // Reset to the original light purple color shown in your screenshot
    updatebttn.setBackground(new java.awt.Color(153,153,255)); 
      // TODO add your handling code here:
    }//GEN-LAST:event_updatebttnMouseExited

    private void addbttnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbttnMouseExited
// Resets to the original light color (from your screenshot)
    addbttn.setBackground(new java.awt.Color(153, 153, 255));
    }//GEN-LAST:event_addbttnMouseExited

    private void deletebttnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebttnMouseExited
  deletebttn.setBackground(new java.awt.Color(153,153,255));
  // TODO add your handling code here:
    }//GEN-LAST:event_deletebttnMouseExited

    private void deletebttnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebttnMouseEntered
   deletebttn.setBackground(new java.awt.Color(204,204,255));
    
    // 3. Optional: Change cursor to hand
    deletebttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        // TODO add your handling code here:
    }//GEN-LAST:event_deletebttnMouseEntered

    private void tblBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBooksMouseClicked
int row = tblBooks.getSelectedRow();
    
    if (row != -1) {
        try {
            // We start at 0 because Title is the first column in your SQL SELECT
            Object title  = tblBooks.getValueAt(row, 0); 
            Object author = tblBooks.getValueAt(row, 1);
            Object genre  = tblBooks.getValueAt(row, 2);
            Object desc   = tblBooks.getValueAt(row, 3); // Description is now index 3

            jTitle.setText(title != null ? title.toString() : "");
            jAuthor.setText(author != null ? author.toString() : "");
            jGenre.setText(genre != null ? genre.toString() : "");
            jDescription.setText(desc != null ? desc.toString() : "");
            
        } catch (Exception e) {
            System.out.println("Selection Error: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_tblBooksMouseClicked

    private void logoutBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBttnMouseClicked
// 1. Confirm with the user
    int confirm = javax.swing.JOptionPane.showConfirmDialog(this, 
            "Are you sure you want to logout?", "Logout", 
            javax.swing.JOptionPane.YES_NO_OPTION);

    if (confirm == javax.swing.JOptionPane.YES_OPTION) {
        // 2. Open the Login Form
        new LoginForm().setVisible(true);
        
        // 3. Close the current Admin Dashboard
        this.dispose();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_logoutBttnMouseClicked

    private void logoutBttnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBttnMouseEntered
                                       
    logoutBttn.setBackground(new java.awt.Color(204,204,255)); // Dark Purple
    logoutBttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutBttnMouseEntered

    private void logoutBttnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBttnMouseExited
// Reset to your original light color (e.g., Light Purple/Blue)
    logoutBttn.setBackground(new java.awt.Color(153, 153, 255));
    // TODO add your handling code here:
    }//GEN-LAST:event_logoutBttnMouseExited

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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addbttn;
    private javax.swing.JPanel deletebttn;
    private javax.swing.JTextField jAuthor;
    private javax.swing.JTextArea jDescription;
    private javax.swing.JTextField jGenre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTitle;
    private javax.swing.JPanel logoutBttn;
    private javax.swing.JTable tblBooks;
    private javax.swing.JPanel updatebttn;
    // End of variables declaration//GEN-END:variables

public void loadBooks() {
// We use LIMIT 15, but ensure the column names match your DB exactly
    // Note: SQLite is case-sensitive for column names sometimes!
    String sql = "SELECT title, author, genre, Description FROM books LIMIT 15";
    
    try (java.sql.Connection con = benigui.BeniGUI.connectDB();
         java.sql.PreparedStatement pst = con.prepareStatement(sql);
         java.sql.ResultSet rs = pst.executeQuery()) {
        
        // DO NOT put rs.next() or a while loop before this line
        tblBooks.setModel(DbUtils.resultSetToTableModel(rs));
        
    } catch (Exception e) {
        // This will print the EXACT error to your NetBeans console
        System.out.println("Admin Table Error: " + e.getMessage());
    }
}

private void clearFields() {
    // This empties all the text fields after an action
    jTitle.setText("");
    jAuthor.setText("");
    jGenre.setText("");
    jDescription.setText("");
    
    // Optional: Returns the cursor to the Title box for the next entry
    jTitle.requestFocus();
    
    // Optional: Deselects any row currently highlighted in the table
    tblBooks.clearSelection();
}
}
