/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhsys.panel.quanly;

import com.nhsys.dao.ThucDonDAO;
import com.nhsys.entity.ThucDon;
import com.nhsys.utils.MsgBox;
import com.nhsys.utils.XImage;
import com.nhsys.utils.mouseEvent;
import java.awt.Image;
import java.io.File;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hai Tran
 */
public class QL_ThucDon extends javax.swing.JPanel {

    public QL_ThucDon() {
        initComponents();
        init();
    }
    //end

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabs = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        lblHinh = new javax.swing.JLabel();
        txtTenMonAn = new javax.swing.JTextField();
        txtMaMonAn = new javax.swing.JTextField();
        txtGiaMon = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        cboLoai = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDSMonAn = new javax.swing.JTable();
        txtTimTenMA = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        cboSearchByCategory = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(249, 244, 244));

        tabs.setBackground(new java.awt.Color(255, 255, 255));
        tabs.setForeground(new java.awt.Color(255, 153, 51));
        tabs.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("THÔNG TIN CƠ BẢN");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Hình ảnh món ăn");

        lblHinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblHinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhMouseClicked(evt);
            }
        });

        txtTenMonAn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTenMonAn.setText("Tên món");
        txtTenMonAn.setBorder(null);
        txtTenMonAn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTenMonAnFocusLost(evt);
            }
        });
        txtTenMonAn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTenMonAnMouseClicked(evt);
            }
        });

        txtMaMonAn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtMaMonAn.setText("Mã món");
        txtMaMonAn.setBorder(null);
        txtMaMonAn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMaMonAnFocusLost(evt);
            }
        });
        txtMaMonAn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMaMonAnMouseClicked(evt);
            }
        });

        txtGiaMon.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtGiaMon.setText("Giá món");
        txtGiaMon.setBorder(null);
        txtGiaMon.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtGiaMonFocusLost(evt);
            }
        });
        txtGiaMon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtGiaMonMouseClicked(evt);
            }
        });
        txtGiaMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaMonActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nhsys/icon/restaurant.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nhsys/icon/coding.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nhsys/icon/price-tag.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nhsys/icon/food.png"))); // NOI18N

        cboLoai.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cboLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Loại", "Món ăn", "Món uống", "Khác" }));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        btnSua.setBackground(new java.awt.Color(255, 153, 51));
        btnSua.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setText("SỬA");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSua);

        btnThem.setBackground(new java.awt.Color(51, 204, 0));
        btnThem.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("THÊM");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel1.add(btnThem);

        btnXoa.setBackground(new java.awt.Color(255, 87, 87));
        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("XÓA");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel1.add(btnXoa);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTenMonAn))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGiaMon))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboLoai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMaMonAn))
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 10, Short.MAX_VALUE)))
                        .addGap(272, 272, 272))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtGiaMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboLoai))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        tabs.addTab("Cập nhật", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tblDSMonAn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã món ăn", "Tên món ăn", "Giá món ăn", "Hình ảnh", "Loại"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDSMonAn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSMonAnMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDSMonAn);

        txtTimTenMA.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTimTenMA.setText("Nhập tên món ăn cần tìm");
        txtTimTenMA.setBorder(null);
        txtTimTenMA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTimTenMAFocusLost(evt);
            }
        });
        txtTimTenMA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTimTenMAMouseClicked(evt);
            }
        });
        txtTimTenMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimTenMAActionPerformed(evt);
            }
        });
        txtTimTenMA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimTenMAKeyReleased(evt);
            }
        });

        cboSearchByCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Món ăn", "Món uống", "Khai vị", "Sashimi", "Cua", "Lẩu", "Súp", "Món Khác" }));
        cboSearchByCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSearchByCategoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTimTenMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99)
                .addComponent(cboSearchByCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtTimTenMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cboSearchByCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabs.addTab("Danh sách món ăn", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblHinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhMouseClicked
        chonAnh();
    }//GEN-LAST:event_lblHinhMouseClicked

    private void txtTenMonAnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenMonAnFocusLost
        // TODO add your handling code here:
        new mouseEvent().clear_text_exit(txtTenMonAn, "Tên món");
    }//GEN-LAST:event_txtTenMonAnFocusLost

    private void txtTenMonAnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTenMonAnMouseClicked
        // TODO add your handling code here:
        new mouseEvent().clear_text_click(txtTenMonAn, "Tên món");
    }//GEN-LAST:event_txtTenMonAnMouseClicked

    private void txtMaMonAnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaMonAnFocusLost
        // TODO add your handling code here:
        new mouseEvent().clear_text_exit(txtMaMonAn, "Mã món");
    }//GEN-LAST:event_txtMaMonAnFocusLost

    private void txtMaMonAnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMaMonAnMouseClicked
        // TODO add your handling code here:
        new mouseEvent().clear_text_click(txtMaMonAn, "Mã món");
    }//GEN-LAST:event_txtMaMonAnMouseClicked

    private void txtGiaMonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGiaMonFocusLost
        // TODO add your handling code here:
        new mouseEvent().clear_text_exit(txtGiaMon, "Giá món");
    }//GEN-LAST:event_txtGiaMonFocusLost

    private void txtGiaMonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGiaMonMouseClicked
        // TODO add your handling code here:
        new mouseEvent().clear_text_click(txtGiaMon, "Giá món");
    }//GEN-LAST:event_txtGiaMonMouseClicked

    private void txtGiaMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaMonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaMonActionPerformed

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked

    }//GEN-LAST:event_btnThemMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (!checkVal()) {
            return;
        }
        insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblDSMonAnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSMonAnMouseClicked
        if (evt.getClickCount() == 2) {
            this.row = tblDSMonAn.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblDSMonAnMouseClicked

    private void txtTimTenMAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimTenMAMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTimTenMAMouseClicked

    private void txtTimTenMAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimTenMAFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTimTenMAFocusLost

    private void txtTimTenMAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimTenMAKeyReleased
        // TODO add your handling code here:
        fillTableByName();
    }//GEN-LAST:event_txtTimTenMAKeyReleased

    private void txtTimTenMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimTenMAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimTenMAActionPerformed

    private void cboSearchByCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSearchByCategoryActionPerformed
        // TODO add your handling code here:
        if (cboSearchByCategory.getSelectedIndex() == 0) {
            fillTable();
        } else {
            fillTableOrderCategory();
        }
    }//GEN-LAST:event_cboSearchByCategoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboLoai;
    private javax.swing.JComboBox<String> cboSearchByCategory;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblHinh;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblDSMonAn;
    private javax.swing.JTextField txtGiaMon;
    private javax.swing.JTextField txtMaMonAn;
    private javax.swing.JTextField txtTenMonAn;
    private javax.swing.JTextField txtTimTenMA;
    // End of variables declaration//GEN-END:variables

    ThucDonDAO dao = new ThucDonDAO();
    JFileChooser fileChooser = new JFileChooser();
    int row = -1;

    void init() {
        tblDSMonAn.setDefaultEditor(Object.class, null);
        this.fillTable(); // đổ dữ liệu nhân viên vào bảng
        this.updateStatus(); // cập nhật trạng thái form
    }

    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblDSMonAn.getModel();
        model.setRowCount(0);
        try {
            List<ThucDon> list = dao.selectAll();
            for (ThucDon nv : list) {
                Object[] row = {
                    nv.getMaMon(),
                    nv.getTenMon(),
                    nv.getGiaTien(),
                    nv.getHinhAnh(),
                    nv.getLoai()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void fillTableByName() {
        String Chuoitimkiem = txtTimTenMA.getText();
        DefaultTableModel model = (DefaultTableModel) tblDSMonAn.getModel();
        model.setRowCount(0);
        try {
            List<ThucDon> list = dao.SearchByDish(Chuoitimkiem);
            for (ThucDon nv : list) {
                Object[] row = {
                    nv.getMaMon(),
                    nv.getTenMon(),
                    nv.getGiaTien(),
                    nv.getHinhAnh(),
                    nv.getLoai()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void fillTableOrderCategory() {
        DefaultTableModel model = (DefaultTableModel) tblDSMonAn.getModel();
        model.setRowCount(0);
        try {
            List<ThucDon> list = dao.selectByCategory(cboSearchByCategory.getSelectedItem().toString());
            for (ThucDon td : list) {
                Object[] row = {
                    td.getMaMon(),
                    td.getTenMon(),
                    td.getGiaTien(),
                    td.getHinhAnh(),
                    td.getLoai(),};
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
            e.printStackTrace();
        }
    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
        // Trạng thái form
        txtMaMonAn.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);
//        btnMoi.setEnabled(edit);
        // Trạng thái điều hướng
    }

    boolean checkVal() {
        if (txtMaMonAn.getText().isEmpty() || txtMaMonAn.getText().equalsIgnoreCase("")) {
            MsgBox.alert(this, "Bạn chưa nhập mã món ăn!");
            return false;
        } else if (txtMaMonAn.getText().length() > 15) {
            MsgBox.alert(this, "Mã món ăn tối đa chỉ 15 ký tự!");
            return false;
        }
        for (int i = 0; i < tblDSMonAn.getRowCount(); i++) {
            if (tblDSMonAn.getValueAt(i, 0).equals(txtMaMonAn.getText())) {
                MsgBox.alert(this, "Mã Món Ăn Này Đã Tồn Tại");
                return false;
            }
        }
        if (txtTenMonAn.getText().isEmpty() || txtTenMonAn.getText().equalsIgnoreCase("")) {
            MsgBox.alert(this, "Bạn chưa nhập tên món ăn!");
            return false;
        }
        if (txtGiaMon.getText().isEmpty() || txtGiaMon.getText().equalsIgnoreCase("")) {
            MsgBox.alert(this, "Bạn chưa nhập giá món ăn!");
            return false;
        }
        try {
            Float.valueOf(txtGiaMon.getText());
        } catch (Exception e) {
            MsgBox.alert(this, "Giá món ăn không đúng định dạng");
            return false;
        }
        if (cboLoai.getSelectedIndex() == 0) {
            MsgBox.alert(this, "Bạn chưa chọn loại món ăn!");
            return false;
        }
        return true;
    }

    void insert() {
        ThucDon td = this.getForm();
        try {
            dao.insert(td); // thêm mới
            this.fillTable(); // đỗ lại bảng
            this.clearForm(); // xóa trắng form
            MsgBox.alert(this, "Thêm mới thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Thêm mới thất bại!");
        }
    }

    void update() {
        ThucDon td = this.getForm();
        try {
            dao.update(td); // cập nhật
            this.fillTable(); // đổ lại bảng
            MsgBox.alert(this, "Cập nhật thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Cập nhật thất bại!");
        }
    }

    void delete() {
        if (MsgBox.confirm(this, "Bạn thực sự muốn xóa nhân viên này?")) {
            try {
                dao.delete(txtMaMonAn.getText());
                this.fillTable();
                this.clearForm();
                MsgBox.alert(this, "Xóa thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Xóa thất bại!");
            }
        }
    }

    void edit() {
        String matd = (String) tblDSMonAn.getValueAt(this.row, 0);
        ThucDon td = dao.selectById(matd);
        this.setForm(td);
        this.updateStatus();
        tabs.setSelectedIndex(0);
    }

    void clearForm() {
        ThucDon td = new ThucDon();
        this.setForm(td);
        this.row = -1;
        this.updateStatus();
        txtMaMonAn.requestFocus();
        cboLoai.setSelectedIndex(0);
    }

    void setForm(ThucDon nv) {
        txtMaMonAn.setText(nv.getMaMon());
        txtTenMonAn.setText(nv.getTenMon());
        txtGiaMon.setText(String.valueOf(nv.getGiaTien()));
        String FileAnh = nv.getHinhAnh();
        if (nv.getHinhAnh() == null) {
            lblHinh.setIcon(null);
        } else {
            lblHinh.setIcon(new ImageIcon(XImage.read(FileAnh).getImage().getScaledInstance(270, 220, java.awt.Image.SCALE_SMOOTH)));
            lblHinh.setToolTipText(FileAnh);
        }
        cboLoai.setSelectedItem(nv.getLoai());
    }

    ThucDon getForm() {
        ThucDon td = new ThucDon();
        td.setMaMon(txtMaMonAn.getText());
        td.setTenMon(txtTenMonAn.getText());
        td.setGiaTien(Float.valueOf(txtGiaMon.getText()));
        if (lblHinh.getToolTipText() != null) {
            td.setHinhAnh(lblHinh.getToolTipText());
        } else {
            td.setHinhAnh("");
        }
        td.setLoai(cboLoai.getSelectedItem().toString());
        return td;
    }

    void chonAnh() {
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            XImage.save(file);
            ImageIcon icon = XImage.read(file.getName());
            System.out.println(icon);
            Image im = icon.getImage();
            ImageIcon iconn = new ImageIcon(im.getScaledInstance(lblHinh.getWidth(), lblHinh.getHeight(), im.SCALE_SMOOTH));
            lblHinh.setIcon(iconn);
            lblHinh.setToolTipText(file.getName());
        }
    }
}
