/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contronter;

import Class.Loai;
import Model.QuanLyLoaiModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import view.QuanLyLoaiView;

/**
 *
 * @author Administrator
 */
public class QuanLyLoaiContronter {

    private QuanLyLoaiModel model;
    private QuanLyLoaiView view;
    public Loai getLoai() {
        return loai;
    }

    public void setLoai(Loai loai) {
        this.loai = loai;
    }
    private Loai loai;
    
    public  QuanLyLoaiContronter(){};

    public QuanLyLoaiContronter(QuanLyLoaiModel model, QuanLyLoaiView view) {
        this.model = model;
        this.view = view;
        
        view.setVisible(true);
    }

    public void getDulieu() {
        ArrayList<Loai> dsloai = new ArrayList<>();
        dsloai = model.layDSLoai();
        DefaultTableModel tableModel = (DefaultTableModel) view.getGetTbl_Loai().getModel();
        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
        tableModel.addColumn("Ma Loai");
        tableModel.addColumn("Ten Loai");
        for (Loai loai : dsloai) {
            tableModel.addRow(new Object[]{loai.getMaLoai(), loai.getTenLoai()});
            view.getGetTbl_Loai().setModel(tableModel);
        }
    }

    public  void inti(Loai l) {
       loai = l;
        view.getBtnThem().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loai.setMaLoai(view.getTxtMaLoai().getText());
                loai.setTenLoai(view.getTxtTenLoai().getText());

                model.themLoai(loai);
                view.getTxtMaLoai().setText("");
                view.getTxtTenLoai().setText("");
               getDulieu();

            }
        });
        view.getBtnSua().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                Loai loai = new Loai();
                loai.setMaLoai(view.getTxtMaLoai().getText());
                loai.setTenLoai(view.getTxtTenLoai().getText());

                model.themLoai(loai);
                view.getTxtMaLoai().setText("");
                view.getTxtTenLoai().setText("");
                getDulieu();

            }
        });
        
        view.getBtnThoat().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    
    public static void main(String[] args) {
        QuanLyLoaiContronter ql = new QuanLyLoaiContronter();
    }
}
