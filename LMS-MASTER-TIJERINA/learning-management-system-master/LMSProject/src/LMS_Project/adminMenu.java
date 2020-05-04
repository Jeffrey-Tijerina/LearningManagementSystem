package LMS_Project;

import javax.swing.JOptionPane;

public class adminMenu extends javax.swing.JFrame
{
    admin admin = new admin("jeffrey", "admin",007);
    addStudent addMenu = new addStudent();
    
    public adminMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAdminLogout = new javax.swing.JButton();
        btnViewStudent = new javax.swing.JButton();
        btnAddStudent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Menu");
        setBackground(new java.awt.Color(0, 150, 240));
        setPreferredSize(new java.awt.Dimension(500, 200));

        jPanel1.setBackground(new java.awt.Color(0, 150, 240));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("ADMIN"));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 200));

        btnAdminLogout.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnAdminLogout.setText("Log Out");
        btnAdminLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminLogoutActionPerformed(evt);
            }
        });

        btnViewStudent.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnViewStudent.setText("View All Students");
        btnViewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStudentActionPerformed(evt);
            }
        });

        btnAddStudent.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnAddStudent.setText("Enroll a Student");
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdminLogout)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(351, Short.MAX_VALUE)
                        .addComponent(btnViewStudent))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAddStudent)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddStudent, btnViewStudent});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnViewStudent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(btnAddStudent)
                .addGap(14, 14, 14)
                .addComponent(btnAdminLogout))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Admin Menu");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Admin Logout Button
    private void btnAdminLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminLogoutActionPerformed

        initializeadd();
       setVisible(false);
    }//GEN-LAST:event_btnAdminLogoutActionPerformed

    //AddStudent Button
    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
        
        addMenu = new addStudent();
        addMenu.setVisible(true);
    }//GEN-LAST:event_btnAddStudentActionPerformed

    public void initializeadd()
    {
        //functionality to add a new student
        if(addMenu.tempStudent != null)
        ////////////////////////////////////////////////////////
        {
            if(!admin.students.contains(addMenu.tempStudent))
            {
                admin.students.add(addMenu.tempStudent);
            }
        }
    }

    //View Student
    private void btnViewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStudentActionPerformed
    
     
        initializeadd();
        
        // views all students and covers "null" student scenarios
        if(admin.students.isEmpty()){
            JOptionPane.showMessageDialog(null, "No students found in records");
        }
        //else to view students//
        else
        {
            viewAllMenu viewAll = new viewAllMenu();
            viewAll.initializeAdmin(admin);
            viewAll.addtoTable(admin);
            viewAll.setVisible(true);
        }
        
    }//GEN-LAST:event_btnViewStudentActionPerformed


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
            java.util.logging.Logger.getLogger(adminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnAdminLogout;
    private javax.swing.JButton btnViewStudent;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
