//Matthew Buys
package companysharesapp;

public class HomeUI extends javax.swing.JFrame {

    public HomeUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        screen = new javax.swing.JLabel();
        movePanel = new javax.swing.JPanel();
        addNewShareholderBtn = new javax.swing.JButton();
        minBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        shareholdersBtn = new javax.swing.JButton();
        shareValueHistoryBtn = new javax.swing.JButton();
        newShareTransactionsBtn = new javax.swing.JButton();
        transactionHistoryBtn = new javax.swing.JButton();
        helpBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Company Share Management");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        screen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/companysharesapp/HomeUI.png"))); // NOI18N
        getContentPane().add(screen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 627));

        movePanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                movePanelMouseDragged(evt);
            }
        });
        movePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                movePanelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout movePanelLayout = new javax.swing.GroupLayout(movePanel);
        movePanel.setLayout(movePanelLayout);
        movePanelLayout.setHorizontalGroup(
            movePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        movePanelLayout.setVerticalGroup(
            movePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(movePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 70));

        addNewShareholderBtn.setText("add new shareholder");
        getContentPane().add(addNewShareholderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 320, 230));

        minBtn.setText("jButton1");
        minBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minBtnActionPerformed(evt);
            }
        });
        getContentPane().add(minBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 10, 50, 50));

        exitBtn.setText("jButton1");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, 60, 50));

        shareholdersBtn.setText("jButton1");
        getContentPane().add(shareholdersBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 310, 220));

        shareValueHistoryBtn.setText("jButton1");
        getContentPane().add(shareValueHistoryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 100, 320, 230));

        newShareTransactionsBtn.setText("jButton1");
        getContentPane().add(newShareTransactionsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 320, 230));

        transactionHistoryBtn.setText("jButton1");
        getContentPane().add(transactionHistoryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 310, 230));

        helpBtn.setText("jButton1");
        getContentPane().add(helpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 370, 320, 230));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void movePanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movePanelMouseDragged
        //https://www.youtube.com/watch?v=lGCkMyxriqk
        int x = evt.getXOnScreen();     
        int y = evt.getYOnScreen();
        this.setLocation(x-mX, y-mY);
    }//GEN-LAST:event_movePanelMouseDragged

    private void minBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minBtnActionPerformed
        this.setState(HomeUI.ICONIFIED);
    }//GEN-LAST:event_minBtnActionPerformed
    int mX;int mY;
    private void movePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movePanelMousePressed
        //https://www.youtube.com/watch?v=lGCkMyxriqk
        mX = evt.getX();
        mY = evt.getY();
    }//GEN-LAST:event_movePanelMousePressed

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
            java.util.logging.Logger.getLogger(HomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewShareholderBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton helpBtn;
    private javax.swing.JButton minBtn;
    private javax.swing.JPanel movePanel;
    private javax.swing.JButton newShareTransactionsBtn;
    private javax.swing.JLabel screen;
    private javax.swing.JButton shareValueHistoryBtn;
    private javax.swing.JButton shareholdersBtn;
    private javax.swing.JButton transactionHistoryBtn;
    // End of variables declaration//GEN-END:variables
}
