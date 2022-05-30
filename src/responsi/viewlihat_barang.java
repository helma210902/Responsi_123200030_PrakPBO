/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class viewlihat_barang extends JFrame {
   
    JButton btnKembali = new JButton("Kembali");  
    
    public JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    public Object namaKolom[] = {"Id", "Nama", "Massa", "Harga"};

    public viewlihat_barang() {
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);
        
        setTitle("Data Barang");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(550,500);
        
        add(scrollPane);
        scrollPane.setBounds(20, 20, 480, 300);
              
        add(btnKembali);
        btnKembali.setBounds(20, 420, 90, 20);
        
        
    }   

    public JButton getBtnKembali() {
        return btnKembali;
    }
} 

