/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIcomponents;

import container.Blender;
import exceptions.blender.BlenderOverflowException;
import fruits.Apple;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.PROPERTIES;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import liquids.Milk;

/**
 *
 * @author hasan
 */
public class CupSelectorFrame extends javax.swing.JFrame {

    /**
     * Creates new form menuFrame
     */
    int cupSize;
    boolean addMilk = false;
    public CupSelectorFrame() {
        initComponents();
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        milkButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        addMilkYesButton = new javax.swing.JRadioButton();
        addMilkNoButton = new javax.swing.JRadioButton();
        milkLabel = new javax.swing.JLabel();
        noteForMilkLabel = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        CupSizeLabel = new javax.swing.JLabel();
        cupSizeComboBox = new javax.swing.JComboBox<>();
        NumberOfCupsLabel = new javax.swing.JLabel();
        maxNumberOfCups = new javax.swing.JLabel();
        numberOfCupsTextField = new javax.swing.JTextField();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("cocktail");
        setMaximumSize(new java.awt.Dimension(358, 329));
        setMinimumSize(new java.awt.Dimension(358, 329));
        setResizable(false);

        milkButtonGroup.add(addMilkYesButton);
        addMilkYesButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        addMilkYesButton.setText("Yes");
        addMilkYesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMilkYesButtonActionPerformed(evt);
            }
        });

        milkButtonGroup.add(addMilkNoButton);
        addMilkNoButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        addMilkNoButton.setSelected(true);
        addMilkNoButton.setText("No");
        addMilkNoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMilkNoButtonActionPerformed(evt);
            }
        });

        milkLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        milkLabel.setText("Milk?");

        noteForMilkLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        noteForMilkLabel.setText("Note: Milk will take 25% of the Cup Size");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(noteForMilkLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addMilkYesButton)
                        .addGap(18, 18, 18)
                        .addComponent(addMilkNoButton))
                    .addComponent(milkLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(milkLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMilkYesButton)
                    .addComponent(addMilkNoButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(noteForMilkLabel))
        );

        okButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        CupSizeLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        CupSizeLabel.setText("Cup Size");

        cupSizeComboBox.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cupSizeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small", "Medium", "Large" }));
        cupSizeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cupSizeComboBoxActionPerformed(evt);
            }
        });

        NumberOfCupsLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        NumberOfCupsLabel.setText("Number Of Cups");

        maxNumberOfCups.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        maxNumberOfCups.setText("Note: Max number of cups is 12");

        numberOfCupsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberOfCupsTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(maxNumberOfCups, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(CupSizeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(NumberOfCupsLabel)
                                .addGap(20, 20, 20)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numberOfCupsTextField)
                            .addComponent(cupSizeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CupSizeLabel)
                    .addComponent(cupSizeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumberOfCupsLabel)
                    .addComponent(numberOfCupsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(maxNumberOfCups))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(okButton)))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addMilkYesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMilkYesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addMilkYesButtonActionPerformed
  
    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        if(cupSizeComboBox.getSelectedItem().equals("Small")){
            cupSize = 100;
            try
            {
                if(Integer.parseInt(numberOfCupsTextField.getText()) > 12 ||  Integer.parseInt(numberOfCupsTextField.getText()) <= 0 )
                {
                    JOptionPane.showMessageDialog(null, "enter a a vaild choice");
                    numberOfCupsTextField.setText("");
                }
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(null, "Enter a vaild number");
                numberOfCupsTextField.setText("");
            }

        }

        else if(cupSizeComboBox.getSelectedItem().equals("Medium")){
            cupSize = 200;
            try
            {
                if(Integer.parseInt(numberOfCupsTextField.getText()) > 6 ||  Integer.parseInt(numberOfCupsTextField.getText()) <= 0 )
                {
                    JOptionPane.showMessageDialog(null, "enter a a vaild choice");
                    numberOfCupsTextField.setText("");
                }
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(null, "Enter a vaild number");
                numberOfCupsTextField.setText("");
            }

        }

        else{
            cupSize = 400;
            try
            {
                if(Integer.parseInt(numberOfCupsTextField.getText()) > 3 ||  Integer.parseInt(numberOfCupsTextField.getText()) <= 0 )
                {
                    JOptionPane.showMessageDialog(null, "enter a a vaild choice");
                    numberOfCupsTextField.setText("");
                }
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(null, "Enter a vaild number");
                numberOfCupsTextField.setText("");
            }

        }
        ButtonModel selectedButton = milkButtonGroup.getSelection();
        if(selectedButton.equals(addMilkYesButton.getModel())){
            addMilk = true;
        }
        if(!numberOfCupsTextField.getText().equals("")){
        new orderFrame(cupSize, Integer.parseInt(numberOfCupsTextField.getText()), addMilk).setVisible(true);
        dispose();
        }
    }//GEN-LAST:event_okButtonActionPerformed
    
    private void cupSizeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cupSizeComboBoxActionPerformed
           
        if(cupSizeComboBox.getSelectedItem().equals("Small")){
            maxNumberOfCups.setText("Note: Max number of cups is 12");
            
        }
        else if(cupSizeComboBox.getSelectedItem().equals("Medium")){
            maxNumberOfCups.setText("Note: Max number of cups is 6");
            
        }
        else{
            maxNumberOfCups.setText("Note: Max number of cups is 3");
           
        }
    }//GEN-LAST:event_cupSizeComboBoxActionPerformed

    private void numberOfCupsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberOfCupsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberOfCupsTextFieldActionPerformed

    private void addMilkNoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMilkNoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addMilkNoButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CupSelectorFrame().setVisible(true);
            }
        });
    }
    
//    public int getCupSize(){
//        return cupSize;
//    }
//    public int getNumberOfCups(){
//        return numberOfCups;
//    }
                                                                             

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CupSizeLabel;
    private javax.swing.JLabel NumberOfCupsLabel;
    private javax.swing.JRadioButton addMilkNoButton;
    private javax.swing.JRadioButton addMilkYesButton;
    private javax.swing.JComboBox<String> cupSizeComboBox;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel maxNumberOfCups;
    private javax.swing.ButtonGroup milkButtonGroup;
    private javax.swing.JLabel milkLabel;
    private javax.swing.JLabel noteForMilkLabel;
    private javax.swing.JTextField numberOfCupsTextField;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables
}
