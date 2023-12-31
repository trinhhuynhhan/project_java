/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import Class.Loai;
import Class.SanPham;
import Model.QuanLySanPhamModel;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class QuanLySanPhamView extends javax.swing.JFrame {

    /**
     * Creates new form QuanLySanPhamView
     */
    public QuanLySanPhamView() {
        initComponents();
         ButtonGroup radio = new ButtonGroup();
        radio.add(jRadioButton1);
        radio.add(jRadioButton2);
        getDulieu();
    }
public void getDulieu(){
    ArrayList<SanPham> dsSP = new ArrayList<SanPham>();
        dsSP = QuanLySanPhamModel.layDSSanPham();
        DefaultTableModel tableModel = (DefaultTableModel) getTableSP.getModel();
        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
        tableModel.addColumn("Mã Sản Phảm");
        tableModel.addColumn("Tên Sản Phảm");
        tableModel.addColumn("Giá Sản Phảm");
        tableModel.addColumn("Số Lượng");
        tableModel.addColumn("Mã Loại");
        
        for (SanPham sp : dsSP) {
            tableModel.addRow(new Object[]{sp.getMaSP(), sp.getTenSP(),String.valueOf(sp.getGiaSP()),String.valueOf(sp.getSoLuong()),sp.getMaLoai()});
            getTableSP.setModel(tableModel);
        }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnThemSP = new javax.swing.JButton();
        btnSuaSP = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnTimKiemSP = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        txtTenSP = new javax.swing.JTextField();
        txtGiaSP = new javax.swing.JTextField();
        txtSoLuongSP = new javax.swing.JTextField();
        txtMaLoaiSP = new javax.swing.JTextField();
        txtTimKiem = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        getTableSP = new javax.swing.JTable();
        btnXoaSP1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        jTextField5.setText("jTextField5");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Sản Phẩm Điện Thoại");

        btnThemSP.setBackground(new java.awt.Color(255, 51, 0));
        btnThemSP.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        btnThemSP.setForeground(new java.awt.Color(255, 255, 255));
        btnThemSP.setText("Thêm");
        btnThemSP.setBorder(null);
        btnThemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSPActionPerformed(evt);
            }
        });

        btnSuaSP.setBackground(new java.awt.Color(255, 51, 0));
        btnSuaSP.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        btnSuaSP.setForeground(new java.awt.Color(255, 255, 255));
        btnSuaSP.setText("Sửa");
        btnSuaSP.setBorder(null);
        btnSuaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaSPActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(255, 51, 0));
        btnThoat.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setText("Thoát");
        btnThoat.setBorder(null);
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnTimKiemSP.setBackground(new java.awt.Color(255, 51, 0));
        btnTimKiemSP.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        btnTimKiemSP.setForeground(new java.awt.Color(255, 255, 255));
        btnTimKiemSP.setText("Tìm Kiếm ");
        btnTimKiemSP.setBorder(null);
        btnTimKiemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemSPActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel1.setText("Mã Sản Phảm :");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel2.setText("Tên Sản Phẩm  :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel4.setText("Giá  Sản Phảm : ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel5.setText("Số Lượng Sản Phẩm :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel6.setText("Mã Loại :");

        txtMaSP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtTenSP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtGiaSP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtSoLuongSP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtMaLoaiSP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtTimKiem.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel7.setText("Thông Tin :");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel8.setText("Trịnh Huỳnh Hàn _ 21211TT3511");

        jLabel9.setText("______________________________");

        jLabel10.setText("_________________________________");

        getTableSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        getTableSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getTableSPMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(getTableSP);

        btnXoaSP1.setBackground(new java.awt.Color(255, 51, 0));
        btnXoaSP1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        btnXoaSP1.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaSP1.setText("Xóa");
        btnXoaSP1.setBorder(null);
        btnXoaSP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaSP1ActionPerformed(evt);
            }
        });

        jRadioButton1.setText("Theo Ma Theo Ten");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Theo Tên");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel11.setText("Sắp xếp: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtMaSP, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                .addComponent(txtTenSP)
                                .addComponent(txtGiaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtMaLoaiSP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                .addComponent(txtSoLuongSP, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1)
                            .addComponent(jLabel11))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTimKiemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSuaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(btnThemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(btnXoaSP1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtGiaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtSoLuongSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTimKiemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtMaLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSuaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jRadioButton1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnThemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnXoaSP1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaSPActionPerformed
         SanPham sp = new SanPham(txtMaSP.getText(), txtTenSP.getText(),Double.parseDouble( txtGiaSP.getText()),Integer.parseInt(txtSoLuongSP.getText()),txtMaLoaiSP.getText());
         
        if (QuanLySanPhamModel.suaSP(sp) == true) {
            QuanLySanPhamModel.suaSP(sp);
        }
        getDulieu();
         txtMaSP.setText(null);
        txtTenSP.setText(null);
        txtGiaSP.setText(null);
         txtSoLuongSP.setText(null);
          txtMaLoaiSP.setText(null);
          
         
         
    }//GEN-LAST:event_btnSuaSPActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
      this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnThemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSPActionPerformed
         SanPham sp = new SanPham(txtMaSP.getText(), txtTenSP.getText(),Double.parseDouble( txtGiaSP.getText()),Integer.parseInt(txtSoLuongSP.getText()),txtMaLoaiSP.getText());
         
        if (QuanLySanPhamModel.themSP(sp) == true) {
            QuanLySanPhamModel.themSP(sp);
        }
        getDulieu();
        txtMaSP.setText(null);
        txtTenSP.setText(null);
        txtGiaSP.setText(null);
        txtSoLuongSP.setText(null);
        txtMaLoaiSP.setText(null);
    }//GEN-LAST:event_btnThemSPActionPerformed

    private void btnXoaSP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSP1ActionPerformed
        SanPham sp = new SanPham(txtMaSP.getText(), txtTenSP.getText(),Double.parseDouble( txtGiaSP.getText()),Integer.parseInt(txtSoLuongSP.getText()),txtMaLoaiSP.getText());
         
        if (QuanLySanPhamModel.xoaSP(txtMaSP.getText())== true) {
           
           getDulieu();
           txtMaSP.setText(null);
        txtTenSP.setText(null);
        txtGiaSP.setText(null);
        txtSoLuongSP.setText(null);
        txtMaLoaiSP.setText(null);
        }
        else {
            System.out.println("aaa");
        }
        
    }//GEN-LAST:event_btnXoaSP1ActionPerformed

    private void btnTimKiemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemSPActionPerformed
         ArrayList<SanPham> ar = QuanLySanPhamModel.timKiem(txtTimKiem.getText());
        if (ar.size() >0) {
             DefaultTableModel tableModel = (DefaultTableModel) getTableSP.getModel();
        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
        tableModel.addColumn("Ma San Pham");
        tableModel.addColumn("Ten San Pham");
         tableModel.addColumn(" Gia");
          tableModel.addColumn("So luong");
           tableModel.addColumn("Ma Loai");
        for (SanPham sanPham : ar) {
            tableModel.addRow(new Object[]{sanPham.getMaSP(), sanPham.getTenSP(), String.valueOf(sanPham.getGiaSP()),String.valueOf(sanPham.getSoLuong()),sanPham.getMaLoai()});
            getTableSP.setModel(tableModel);
            txtTimKiem.setText(null);
       sanPham.toString();
        }
        
        }else{
            JOptionPane.showMessageDialog(this,"Ma không Tồn Tại");
        }
            
    }//GEN-LAST:event_btnTimKiemSPActionPerformed

    private void getTableSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getTableSPMouseClicked
       int dong = getTableSP.getSelectedRow();
        getDulieu();
        QuanLySanPhamModel ql = new QuanLySanPhamModel();
        SanPham sp = new SanPham();
        sp = ql.layDSSanPham().get(dong);
        getDulieu();
        txtMaSP.setText(sp.getMaSP());
        txtTenSP.setText(sp.getTenSP());
        txtGiaSP.setText(String.valueOf(sp.getGiaSP()));
        txtSoLuongSP.setText(String.valueOf(sp.getSoLuong()));
        txtMaLoaiSP.setText(sp.getMaLoai());
    }//GEN-LAST:event_getTableSPMouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        QuanLyDienThoaiView ql = new QuanLyDienThoaiView();
    DefaultTableModel tableModel = (DefaultTableModel) getTableSP.getModel();
        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
         tableModel.addColumn("Ma San Pham");
        tableModel.addColumn("Ten San Pham");
         tableModel.addColumn(" Gia");
          tableModel.addColumn("So luong");
           tableModel.addColumn("Ma Loai");
        for (SanPham ar : QuanLySanPhamModel.sapXepTheoLoaiRoiTheoTen()) {
             tableModel.addRow(new Object[]{ar.getMaSP(), ar.getTenSP(), String.valueOf(ar.getGiaSP()),String.valueOf(ar.getSoLuong()),ar.getMaLoai()});
//        getTbl_Loai.setModel(tableModel);
//        txtTimKiem.setText(null);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        QuanLyDienThoaiView ql = new QuanLyDienThoaiView();
    DefaultTableModel tableModel = (DefaultTableModel) getTableSP.getModel();
        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
         tableModel.addColumn("Ma San Pham");
        tableModel.addColumn("Ten San Pham");
         tableModel.addColumn(" Gia");
          tableModel.addColumn("So luong");
           tableModel.addColumn("Ma Loai");
        for (SanPham ar : QuanLySanPhamModel.sapXepTangTheoTenSP()) {
             tableModel.addRow(new Object[]{ar.getMaSP(), ar.getTenSP(), String.valueOf(ar.getGiaSP()),String.valueOf(ar.getSoLuong()),ar.getMaLoai()});
//        getTbl_Loai.setModel(tableModel);
//        txtTimKiem.setText(null);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLySanPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLySanPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLySanPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLySanPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLySanPhamView().setVisible(true);
            }
        });
    }

    public JTable getGetTableSP() {
        return getTableSP;
    }

    

    public JButton getBtnThoat() {
        return btnThoat;
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaSP;
    private javax.swing.JButton btnThemSP;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimKiemSP;
    private javax.swing.JButton btnXoaSP1;
    private javax.swing.JTable getTableSP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField txtGiaSP;
    private javax.swing.JTextField txtMaLoaiSP;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtSoLuongSP;
    private javax.swing.JTextField txtTenSP;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnSuaSP() {
        return btnSuaSP;
    }

    public void setBtnSuaSP(JButton btnSuaSP) {
        this.btnSuaSP = btnSuaSP;
    }

    public JButton getBtnThemSP() {
        return btnThemSP;
    }

    public void setBtnThemSP(JButton btnThemSP) {
        this.btnThemSP = btnThemSP;
    }

    public JButton getBtnTimKiemSP() {
        return btnTimKiemSP;
    }

    public void setBtnTimKiemSP(JButton btnTimKiemSP) {
        this.btnTimKiemSP = btnTimKiemSP;
    }

    public JButton getBtnXoaSP() {
        return btnThoat;
    }

    public void setBtnXoaSP(JButton btnXoaSP) {
        this.btnThoat = btnXoaSP;
    }


    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JTextField getjTextField2() {
        return jTextField2;
    }

    public void setjTextField2(JTextField jTextField2) {
        this.jTextField2 = jTextField2;
    }

    public JTextField getjTextField5() {
        return jTextField5;
    }

    public void setjTextField5(JTextField jTextField5) {
        this.jTextField5 = jTextField5;
    }

    public JTextField getTxtGiaSP() {
        return txtGiaSP;
    }

    public void setTxtGiaSP(JTextField txtGiaSP) {
        this.txtGiaSP = txtGiaSP;
    }

    public JTextField getTxtMaLoaiSP() {
        return txtMaLoaiSP;
    }

    public void setTxtMaLoaiSP(JTextField txtMaLoaiSP) {
        this.txtMaLoaiSP = txtMaLoaiSP;
    }

    public JTextField getTxtMaSP() {
        return txtMaSP;
    }

    public void setTxtMaSP(JTextField txtMaSP) {
        this.txtMaSP = txtMaSP;
    }

    public JTextField getTxtSoLuongSP() {
        return txtSoLuongSP;
    }

    public void setTxtSoLuongSP(JTextField txtSoLuongSP) {
        this.txtSoLuongSP = txtSoLuongSP;
    }

    public JTextField getTxtTenSP() {
        return txtTenSP;
    }

    public void setTxtTenSP(JTextField txtTenSP) {
        this.txtTenSP = txtTenSP;
    }

    public JTextField getTxtTimKiem() {
        return txtTimKiem;
    }

    public void setTxtTimKiem(JTextField txtTimKiem) {
        this.txtTimKiem = txtTimKiem;
    }
}
