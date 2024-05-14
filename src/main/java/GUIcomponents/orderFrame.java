/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIcomponents;

import basaeclasses.Ingredient;
import colors.RGB;
import container.*;
import exceptions.blender.*;
import fruits.*;
import liquids.Milk;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import GUIcomponents.*;
import interfaces.MyLogger;
import javax.swing.JOptionPane;
import java.io.*;
import javax.swing.ButtonModel;
import loggers.FileLogger;

public class orderFrame extends javax.swing.JFrame {
    private int cupSize;
    private int numberOfCups;
    private boolean milkAdd;
    private String apple, banana, mango, peach, strawberry, milkvolume;
    private Blender blender = new Blender();
    private MyLogger fileLogger = new FileLogger("history.log");
    
    public orderFrame(int cupSize, int numberOfCups, boolean milkAdd) {
        this.cupSize = cupSize;
        this.numberOfCups = numberOfCups;
        this.milkAdd = milkAdd;
        initComponents();
        if(milkAdd){
            try {
                Milk milk = new Milk(numberOfCups*cupSize*0.25, numberOfCups*cupSize*0.25);
                blender.addIngredient(milk, cupSize, numberOfCups);
                milkvolume = "Milk " + milk.getVolumeInMilliLiter() + "ml";
                viewInList();
            } catch (BlenderOverflowException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                fileLogger.log(ex.getMessage());
            }
        }
        capacityTextBox.setText("" + (numberOfCups*cupSize - blender.getVolumeInMilliLiter()));
        fileLogger.log("================================\n" + "Order details :");
        if(cupSize == 100)
        {
            fileLogger.log("Cup Size: Small");
            cupSizeLabel.setText("Cup Size: Small");
        }
        else if(cupSize == 200)
        {
            cupSizeLabel.setText("Cup Size: Medium");
            fileLogger.log("Cup Size: Medium");
        }
        else
        {
            cupSizeLabel.setText("Cup Size: Large");
            fileLogger.log("Cup Size: Large");
        }
        numberOfCupsLabel.setText("Number Of Cups: " + numberOfCups);
        fileLogger.log("Number Of Cups: " + numberOfCups);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        milkButtonsGruop = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        blenderContentsList = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        capacityLabel = new javax.swing.JLabel();
        capacityTextBox = new javax.swing.JTextField();
        blenderVolumeLabel = new javax.swing.JLabel();
        totalCaloriesLabel = new javax.swing.JLabel();
        blenderVolumeTextBox = new javax.swing.JTextField();
        blenderCaloriesTextBox = new javax.swing.JTextField();
        mixtureColorLabel = new javax.swing.JLabel();
        mixtureColorTextBox = new javax.swing.JTextField();
        pourButton = new javax.swing.JButton();
        blendButton = new javax.swing.JButton();
        finishButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        fruitsList = new javax.swing.JList<>();
        addButton = new javax.swing.JButton();
        ingToAddLabel1 = new javax.swing.JLabel();
        howManySpinner = new javax.swing.JSpinner();
        newOrderButton = new javax.swing.JButton();
        cupSizeLabel = new javax.swing.JLabel();
        numberOfCupsLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(362, 515, 362, 515));
        setMaximumSize(new java.awt.Dimension(36212, 53170));
        setMinimumSize(new java.awt.Dimension(100, 105));
        setResizable(false);

        blenderContentsList.setBorder(javax.swing.BorderFactory.createTitledBorder("Blender contents"));
        blenderContentsList.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        blenderContentsList.setToolTipText("Blender Contents");
        jScrollPane2.setViewportView(blenderContentsList);

        capacityLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        capacityLabel.setText("Remaining capacity");

        capacityTextBox.setEditable(false);
        capacityTextBox.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        capacityTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capacityTextBoxActionPerformed(evt);
            }
        });

        blenderVolumeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        blenderVolumeLabel.setText("Current volume");

        totalCaloriesLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalCaloriesLabel.setText("Total calories");

        blenderVolumeTextBox.setEditable(false);
        blenderVolumeTextBox.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        blenderCaloriesTextBox.setEditable(false);
        blenderCaloriesTextBox.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        mixtureColorLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mixtureColorLabel.setText("Mixture color");

        mixtureColorTextBox.setEditable(false);
        mixtureColorTextBox.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        pourButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pourButton.setText("Pour");
        pourButton.setEnabled(false);
        pourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pourButtonActionPerformed(evt);
            }
        });

        blendButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        blendButton.setText("Blend");
        blendButton.setEnabled(false);
        blendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blendButtonActionPerformed(evt);
            }
        });

        finishButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        finishButton.setText("Finish");
        finishButton.setEnabled(false);
        finishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishButtonActionPerformed(evt);
            }
        });

        fruitsList.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fruit menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        fruitsList.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        fruitsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Apple", "Banana", "Mango", "Peach", "Strawberry" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        fruitsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        fruitsList.setSelectedIndex(0);
        jScrollPane3.setViewportView(fruitsList);

        addButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        ingToAddLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ingToAddLabel1.setText("How many?");

        howManySpinner.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        howManySpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        howManySpinner.setEditor(new javax.swing.JSpinner.NumberEditor(howManySpinner, ""));

        newOrderButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        newOrderButton.setText("New Order");
        newOrderButton.setEnabled(false);
        newOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newOrderButtonActionPerformed(evt);
            }
        });

        cupSizeLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cupSizeLabel.setText("Cup Size :");

        numberOfCupsLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        numberOfCupsLabel.setText("Number of Cups:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(capacityLabel)
                                    .addComponent(mixtureColorLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(blenderVolumeTextBox)
                                            .addComponent(capacityTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(blendButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pourButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(blenderCaloriesTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(newOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(mixtureColorTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(finishButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(blenderVolumeLabel)
                                    .addComponent(totalCaloriesLabel))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ingToAddLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(howManySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cupSizeLabel)
                            .addComponent(numberOfCupsLabel))
                        .addGap(57, 57, 57)))
                .addGap(9, 9, 9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ingToAddLabel1)
                            .addComponent(howManySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cupSizeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(numberOfCupsLabel)
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capacityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(capacityTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blendButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blenderVolumeTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blenderVolumeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pourButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blenderCaloriesTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalCaloriesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newOrderButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mixtureColorTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mixtureColorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finishButton))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newOrderButtonActionPerformed
        new CupSelectorFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_newOrderButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        howMany = (int) howManySpinner.getValue();
        if(fruitsList.getSelectedValue().equals("Apple")){
            howManySpinner.setValue(1);
            try 
            {
                for(int i = 0; i < howMany; i++)
                {
                    blender.addIngredient(new Apple(), cupSize, numberOfCups);
                    appleCount++;
                }
                fileLogger.log(howMany + " appeles added successfully");
            } 
            catch (BlenderOverflowException ex) 
            {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                fileLogger.log(ex.getMessage());
                fileLogger.log(howMany + " appeles added successfully");
            }
            apple = "Apple " + appleCount;
            viewInList();

        }
        else if(fruitsList.getSelectedValue().equals("Banana")){
            howManySpinner.setValue(1);
            try 
            {
                for(int i = 0; i < howMany; i++)
                {
                    blender.addIngredient(new Banana(), cupSize, numberOfCups);
                    bananaCount++;
                }
                fileLogger.log(howMany + " bananas added successfully");
            } 
            catch (BlenderOverflowException ex) 
            {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                fileLogger.log(ex.getMessage());
                fileLogger.log(howMany + " bananas added successfully");
            }
            banana = "Banana " + bananaCount;
            viewInList();
        }
        else if(fruitsList.getSelectedValue().equals("Mango")){
            howManySpinner.setValue(1);
            try 
            {
                for(int i = 0; i < howMany; i++)
                {
                    blender.addIngredient(new Mango(), cupSize, numberOfCups);
                    mangoCount++;
                }
                fileLogger.log(howMany + " mangos added successfully");
            } 
            catch (BlenderOverflowException ex) 
            {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                fileLogger.log(ex.getMessage());
                fileLogger.log(howMany + " mangos added successfully");
            }
            mango = "Mango " + mangoCount;
            viewInList();
        }
        else if(fruitsList.getSelectedValue().equals("Peach"))
        {
            howManySpinner.setValue(1);
            try
            {
                for(int i = 0; i < howMany; i++)
                {
                    blender.addIngredient(new Peach(), cupSize, numberOfCups);
                    peachCount++;
                }
                fileLogger.log(howMany + " peaches added successfully");
            } 
            catch (BlenderOverflowException ex) 
            {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                fileLogger.log(ex.getMessage());
                fileLogger.log(howMany + " peaches added successfully");
            }
            peach = "Peach " + peachCount;
            viewInList();
        }
        else
        {
            howManySpinner.setValue(1);
            try 
            {
                for(int i = 0; i < howMany; i++)
                {
                    blender.addIngredient(new Strawberry(), cupSize, numberOfCups);
                    strawberryCount++;
                }
                fileLogger.log(howMany + " strawberries added successfully");
            } 
            catch (BlenderOverflowException ex) 
            {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                fileLogger.log(ex.getMessage());
                fileLogger.log(howMany + " strawberries added successfully");
            }
            strawberry = "Strawberry " + strawberryCount;
            viewInList();
        }
        if(cupSize*numberOfCups - blender.getVolumeInMilliLiter() < 10)
            addButton.setEnabled(false);

        capacityTextBox.setText("" + (cupSize*numberOfCups - blender.getVolumeInMilliLiter()));
        blenderVolumeTextBox.setText("" + blender.getVolumeInMilliLiter());
        blenderCaloriesTextBox.setText("" + blender.getTotalAmountOfCalories());
        blendButton.setEnabled(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void finishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishButtonActionPerformed
        dispose();
        JOptionPane.showMessageDialog(null, "Thank you for ordering from us\n We hope to see you again soon :) ");
        fileLogger.log("Thank you for ordering from us\n We hope to see you again soon :)\n ");
        System.exit(0);
    }//GEN-LAST:event_finishButtonActionPerformed

    private void blendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blendButtonActionPerformed

        try 
        {
            blender.blend();
            pourButton.setEnabled(true);
            blendButton.setEnabled(false);
        } 
        catch (EmptyBlenderException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
             fileLogger.log(ex.getMessage());
        }
        mixtureColorTextBox.setText(blender.getColor());
    }//GEN-LAST:event_blendButtonActionPerformed

    private void pourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pourButtonActionPerformed
        try
        {
            blender.pour(numberOfCups, cupSize);
            JOptionPane.showMessageDialog(null, "================================\n"
                                       + "number of cups: " + numberOfCups + "\n"
                                       + "calories per cup: " + ((double)blender.getTotalAmountOfCalories()/numberOfCups) +"\n"+ blender.getInfo());
            fileLogger.log(blender.getInfo());
            blender.clearIngredients();
            clearList();
            capacityTextBox.setText("");
            blenderCaloriesTextBox.setText("");
            blenderVolumeTextBox.setText("");
            mixtureColorTextBox.setText("");
            appleCount = bananaCount = mangoCount = peachCount = strawberryCount = 0;
            apple = banana = peach = mango = strawberry = "";
            addButton.setEnabled(false);
            blendButton.setEnabled(false);
            pourButton.setEnabled(false);
            newOrderButton.setEnabled(true);
            finishButton.setEnabled(true);

        } 
        catch (EmptyBlenderException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            fileLogger.log(ex.getMessage());
        } 
        catch (NotBlendedException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            fileLogger.log(ex.getMessage());
        }
    }//GEN-LAST:event_pourButtonActionPerformed

    private void capacityTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capacityTextBoxActionPerformed

    }//GEN-LAST:event_capacityTextBoxActionPerformed

    int appleCount = 0, bananaCount = 0, mangoCount = 0, peachCount = 0, strawberryCount = 0, howMany;
    void viewInList() {
        String [] names = {milkvolume, apple, banana, mango, peach, strawberry};
        blenderContentsList.setListData(names);
    }
    void clearList(){
        String [] empty = {""};
        blenderContentsList.setListData(empty);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new orderFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton blendButton;
    private javax.swing.JTextField blenderCaloriesTextBox;
    private javax.swing.JList<String> blenderContentsList;
    private javax.swing.JLabel blenderVolumeLabel;
    private javax.swing.JTextField blenderVolumeTextBox;
    private javax.swing.JLabel capacityLabel;
    private javax.swing.JTextField capacityTextBox;
    private javax.swing.JLabel cupSizeLabel;
    private javax.swing.JButton finishButton;
    private javax.swing.JList<String> fruitsList;
    private javax.swing.JSpinner howManySpinner;
    private javax.swing.JLabel ingToAddLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.ButtonGroup milkButtonsGruop;
    private javax.swing.JLabel mixtureColorLabel;
    private javax.swing.JTextField mixtureColorTextBox;
    private javax.swing.JButton newOrderButton;
    private javax.swing.JLabel numberOfCupsLabel;
    private javax.swing.JButton pourButton;
    private javax.swing.JLabel totalCaloriesLabel;
    // End of variables declaration//GEN-END:variables
}
