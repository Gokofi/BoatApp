/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf.mavenassignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/*
 * #%L
 * mavenassignment
 * %%
 * Copyright (C) 2017 Debreceni Egyetem
 * %%
 * This program is a free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 1 of the
 * License, or any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */


/**
 * Main class and main menu of the project.
 * @author Kingsley
 */
public class FirstFrame extends javax.swing.JFrame {

    /**
     * Creates new form FirstFrame
     */
    public FirstFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        searchById = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        searchByName = new javax.swing.JButton();
        ADDBUTTON = new javax.swing.JButton();
        showAll = new javax.swing.JButton();
        IDFIELD = new javax.swing.JTextField();
        NAMEFIELD = new javax.swing.JTextField();
        CAPACITYFIELD = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        WarningMessage = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("BOAT ID");

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("BOAT NAME");

        searchById.setText("Search");
        searchById.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByIdActionPerformed(evt);
            }
        });

        jLabel3.setText("BOAT CAPACITY");

        searchByName.setText("Search");
        searchByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByNameActionPerformed(evt);
            }
        });

        ADDBUTTON.setText("Add");
        ADDBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDBUTTONActionPerformed(evt);
            }
        });

        showAll.setText("Show All");
        showAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllActionPerformed(evt);
            }
        });

        IDFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDFIELDActionPerformed(evt);
            }
        });

        CAPACITYFIELD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", " " }));
        CAPACITYFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAPACITYFIELDActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Capacity"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        WarningMessage.setForeground(new java.awt.Color(255, 0, 0));

        jButton1.setText("Remove");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NAMEFIELD)
                            .addComponent(IDFIELD)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(31, 31, 31)
                        .addComponent(CAPACITYFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ADDBUTTON)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateButton)
                        .addGap(41, 41, 41)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchById)
                    .addComponent(searchByName)
                    .addComponent(showAll)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(WarningMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(IDFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchById))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(NAMEFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchByName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(CAPACITYFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(showAll)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ADDBUTTON)
                            .addComponent(jButton1)
                            .addComponent(updateButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(WarningMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void select(){
        
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        //jTable1.setDefaultEditor(Object.class, null);
                
                try{
            String url = "jdbc:derby://localhost:1527/Boat";
            String username = "root";
            String password = "root";
            
            Connection conn = DriverManager.getConnection(url,username,password);
            Statement stmt = conn.createStatement();
            String sql;
            
            sql = "select * from Boat";
            
            ResultSet data = stmt.executeQuery(sql);
            
            while(data.next()){
                String id = data.getString(1);
                String name = data.getString(2);
                String capacity = data.getString(3);
                model.addRow(new Object[]{id,name,capacity});
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error Occured While Connecting to Database!");
        }
    }
    
    /**
     * Removes boat entries from the database or inventory 
     */
    private void deleteFromDB(){
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        try{
            String url = "jdbc:derby://localhost:1527/Boat";
            String username = "root";
            String password = "root";
            
            Connection conn = DriverManager.getConnection(url,username,password);
            Statement stmt = conn.createStatement();
            String sql;
            sql = "delete from Boat where BOAT_ID = '" + model.getValueAt(jTable1.getSelectedRow(), 0)+"'";
            
            int check = stmt.executeUpdate(sql);
            
            if(check!=0){
                JOptionPane.showMessageDialog(null, "Boat Removed");
                select();
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error Occured While Removing from Database!");
        }
    }
    
    /**
     * 
     */
    
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRows().length==0){
            WarningMessage.setText("Alert! You have have to select something");
        }
        else {
            Update update = new Update();
            update.setVisible(true);
            update.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            update.getIdField().setText((String) jTable1.getValueAt(jTable1.getSelectedRow(), 3));
            update.getNameField().setText((String) jTable1.getValueAt(jTable1.getSelectedRow(), 2));
            update.getCAPACITYFIELD().setSelectedItem((String) jTable1.getValueAt(jTable1.getSelectedRow(), 1));
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void searchByIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByIdActionPerformed
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        try{
            String url = "jdbc:derby://localhost:1527/Boat";
            String username = "root";
            String password = "root";

            Connection conn = DriverManager.getConnection(url,username,password);
            java.sql.Statement stmt = conn.createStatement();
            String sql;

            sql = "Select * from Boat where BOAT_ID Like '%" + IDFIELD.getText() +"%'";

            ResultSet data = stmt.executeQuery(sql);

            while(data.next()){
                String id = data.getString(3);
                String name = data.getString(2);
                String capacity = data.getString(1);
                model.addRow(new Object[]{id,name,capacity});
            }
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Occured While Adding!");
        }
    }//GEN-LAST:event_searchByIdActionPerformed

    private void searchByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByNameActionPerformed
        if(!NAMEFIELD.getText().trim().equals("")||!IDFIELD.getText().trim().equals("")){
            DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            try{
                String url = "jdbc:derby://localhost:1527/Boat";
                String username = "root";
                String password = "root";

                Connection conn = DriverManager.getConnection(url,username,password);
                java.sql.Statement stmt = conn.createStatement();
                String sql;

                sql = "Select * from Boat where lower(BOAT_NAME) Like '%" + NAMEFIELD.getText().toLowerCase() +"%'";

                ResultSet data = stmt.executeQuery(sql);

                while(data.next()){
                    String id = data.getString(3);
                    String name = data.getString(2);
                    String capacity = data.getString(1);
                    model.addRow(new Object[]{id,name,capacity});
                }
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error Occured While Adding!");
            }
        }
        else {
            WarningMessage.setText("Alert! You have have to enter something");
        }
    }//GEN-LAST:event_searchByNameActionPerformed

    private void ADDBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDBUTTONActionPerformed

        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        if(!NAMEFIELD.getText().trim().equals("")||!IDFIELD.getText().trim().equals("")){

            try{
                String url = "jdbc:derby://localhost:1527/Boat";
                String username = "root";
                String password = "root";

                Connection conn = DriverManager.getConnection(url,username,password);
                java.sql.Statement stmt = conn.createStatement();
                String sql;

                sql = "INSERT INTO BOAT (BOAT_ID, BOAT_NAME, BOAT_CAPACITY) VALUES('"+ IDFIELD.getText() + "' , '" + NAMEFIELD.getText()+"', '"+CAPACITYFIELD.getSelectedItem()+"')";

                int check = stmt.executeUpdate(sql);

                if(check != 0){//allowed to add to database
                    JOptionPane.showMessageDialog(null, "Boat added to database");
                    IDFIELD.setText(null);
                    NAMEFIELD.setText(null);
                    CAPACITYFIELD.getSelectedIndex();
                    select();
                }
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error Occured While Adding!");
            }

        }else{
            WarningMessage.setText("Alert! You have have to enter something");
        }
    }//GEN-LAST:event_ADDBUTTONActionPerformed

    private void showAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllActionPerformed
        select();
        IDFIELD.setText(null);
        NAMEFIELD.setText(null);

    }//GEN-LAST:event_showAllActionPerformed

    private void IDFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDFIELDActionPerformed

    private void CAPACITYFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAPACITYFIELDActionPerformed

    }//GEN-LAST:event_CAPACITYFIELDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        deleteFromDB();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FirstFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FirstFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDBUTTON;
    private javax.swing.JComboBox CAPACITYFIELD;
    private javax.swing.JTextField IDFIELD;
    private javax.swing.JTextField NAMEFIELD;
    private javax.swing.JLabel WarningMessage;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    private javax.swing.JButton searchById;
    private javax.swing.JButton searchByName;
    private javax.swing.JButton showAll;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
