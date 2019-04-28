/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebastian Byczkowski
 */
public class PopcornApp extends javax.swing.JFrame {

    /**
     * Creates new form PopcornApp
     */
    public PopcornApp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        selectFlavor = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        selectColor = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        mixColor = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        addGift = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ordDetail = new javax.swing.JTextArea();
        submitOrder = new javax.swing.JButton();
        gMessage = new javax.swing.JTextField();
        sizeGallon = new javax.swing.JSpinner();
        selectFlavor2 = new javax.swing.JComboBox<>();
        secflav = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("YOYO'S POPCORN STORE");

        jLabel2.setText("Popcorn Flavor:");

        selectFlavor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select flavor", "Plain", "Cheese", "Caramel" }));
        selectFlavor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFlavorActionPerformed(evt);
            }
        });

        jLabel3.setText("Tin Color:");

        selectColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select color", "Red", "Green", "Blue" }));
        selectColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectColorActionPerformed(evt);
            }
        });

        jLabel4.setText("Tin Size (Gallons):");

        mixColor.setText("Yes");
        mixColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mixColorActionPerformed(evt);
            }
        });

        jLabel5.setText("Mix Popcorn Flavors:");

        jLabel7.setText("A Gift?:");

        addGift.setText("Yes");
        addGift.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGiftActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("                               Order Details"));

        ordDetail.setColumns(20);
        ordDetail.setLineWrap(true);
        ordDetail.setRows(5);
        ordDetail.setWrapStyleWord(true);
        jScrollPane2.setViewportView(ordDetail);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        submitOrder.setText("Create Order");
        submitOrder.setEnabled(false);
        submitOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitOrderActionPerformed(evt);
            }
        });

        gMessage.setBorder(javax.swing.BorderFactory.createTitledBorder("                 Gift Message"));
        gMessage.setEnabled(false);
        gMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gMessageActionPerformed(evt);
            }
        });

        sizeGallon.setModel(new javax.swing.SpinnerNumberModel(0, 0, 3, 1));
        sizeGallon.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sizeGallonStateChanged(evt);
            }
        });

        selectFlavor2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plain", "Cheese", "Caramel" }));
        selectFlavor2.setEnabled(false);
        selectFlavor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFlavor2ActionPerformed(evt);
            }
        });

        secflav.setText("2nd Flavor:");
        secflav.setEnabled(false);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(selectFlavor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(sizeGallon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(selectColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(63, 63, 63)
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(mixColor))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(67, 67, 67)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(addGift))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(secflav)
                                        .addGap(18, 18, 18)
                                        .addComponent(selectFlavor2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(gMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(46, 46, 46)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(submitOrder)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(212, 212, 212))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(59, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(selectFlavor2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(selectFlavor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(selectColor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sizeGallon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(mixColor))
                                .addGap(18, 18, 18)
                                .addComponent(secflav)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addGift)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(submitOrder)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectFlavorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFlavorActionPerformed
    boolean isFlavorSelected, isColorSelected,isQty;
     
     isFlavorSelected = selectFlavor.getSelectedIndex() != 0;
     isColorSelected = selectColor.getSelectedIndex() != 0;
     isQty = (int)sizeGallon.getValue() > 0;
     
     if(isFlavorSelected && isColorSelected && isQty){
         submitOrder.setEnabled(true);
     }
     else submitOrder.setEnabled(false); 
    }//GEN-LAST:event_selectFlavorActionPerformed

    private void mixColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mixColorActionPerformed
if(mixColor.isSelected()){
            selectFlavor2.setEnabled(true);
            secflav.setEnabled(true);
        }else{
            selectFlavor2.setEnabled(false);
            secflav.setEnabled(false);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_mixColorActionPerformed

    private void addGiftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGiftActionPerformed
        if(addGift.isSelected()){
            gMessage.setEnabled(true);
        }else{
            gMessage.setEnabled(false);
        }          // TODO add your handling code here:
    }//GEN-LAST:event_addGiftActionPerformed

    private void gMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gMessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gMessageActionPerformed

    private void selectColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectColorActionPerformed
    boolean isFlavorSelected, isColorSelected, isQty;
     
     isFlavorSelected = selectFlavor.getSelectedIndex() != 0;
     isColorSelected = selectColor.getSelectedIndex() != 0;
     isQty = (int)sizeGallon.getValue() > 0;
     
     if(isFlavorSelected && isColorSelected && isQty){
         submitOrder.setEnabled(true);
     }
     else submitOrder.setEnabled(false);
    }//GEN-LAST:event_selectColorActionPerformed

    private void sizeGallonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sizeGallonStateChanged
    boolean isFlavorSelected, isColorSelected,isQty;
     
     isFlavorSelected = selectFlavor.getSelectedIndex() != 0;
     isColorSelected = selectColor.getSelectedIndex() != 0;
     isQty = (int)sizeGallon.getValue() > 0;
     
     if(isFlavorSelected && isColorSelected && isQty){
         submitOrder.setEnabled(true);
     }
     else submitOrder.setEnabled(false);
    }//GEN-LAST:event_sizeGallonStateChanged

    private void selectFlavor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFlavor2ActionPerformed

    }//GEN-LAST:event_selectFlavor2ActionPerformed

    private void submitOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitOrderActionPerformed
        String flavor, flavor2, color, giftMessage;
        int size;
        double price = 0.0;

        boolean gift, mix;

        gift = addGift.isSelected();
        mix = mixColor.isSelected();
        giftMessage = gMessage.getText();
        size = (int)sizeGallon.getValue();
        if(size == 1){
            price += 23.95;
        }else if(size == 2){
            price += 30.95;
        }else if(size == 3){
            price += 39.95;
        }

        flavor = selectFlavor.getSelectedItem().toString();
        flavor2 = selectFlavor2.getSelectedItem().toString();
        color = selectColor.getSelectedItem().toString();
        Popcorn one = new Popcorn(flavor, flavor2, color, size, giftMessage, mix, gift, price);
        ordDetail.append(one.toString());
    }//GEN-LAST:event_submitOrderActionPerformed

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
            java.util.logging.Logger.getLogger(PopcornApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopcornApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopcornApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopcornApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PopcornApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox addGift;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JTextField gMessage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBox mixColor;
    private javax.swing.JTextArea ordDetail;
    private javax.swing.JLabel secflav;
    private javax.swing.JComboBox<String> selectColor;
    private javax.swing.JComboBox<String> selectFlavor;
    private javax.swing.JComboBox<String> selectFlavor2;
    private javax.swing.JSpinner sizeGallon;
    private javax.swing.JButton submitOrder;
    // End of variables declaration//GEN-END:variables
}
