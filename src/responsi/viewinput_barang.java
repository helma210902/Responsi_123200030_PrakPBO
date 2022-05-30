/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;
import javax.swing.*;
/**
 *
 * @author LENOVO
 */
public class viewinput_barang extends JFrame{
  
    JLabel ljudul = new JLabel("Input Barang");
    JLabel lnama = new JLabel("Nama");
    JLabel lmassa = new JLabel("Massa(gr)");
    JLabel lharga = new JLabel("Harga Satuan");
    
    JTextField tfnama = new JTextField();
    JTextField tfmassa = new JTextField();
    JTextField tfharga = new JTextField();
    
    JButton btnSubmit = new JButton("Submit");
    JButton btnReset = new JButton("Reset");
    JButton btnKembali = new JButton("Kembali");

    public viewinput_barang() {
        setTitle("Main Menu");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(200,200);
        
        add(ljudul);
        ljudul.setBounds(10, 10, 80, 20);
        
        add(lnama);
        lnama.setBounds(10, 30, 80, 20);
        add(tfnama);
        tfnama.setBounds(90, 30, 80, 20);
        
        add(lmassa);
        lmassa.setBounds(10, 50, 80, 20);
        add(tfmassa);
        tfmassa.setBounds(90, 50, 80, 20);
        
        add(lharga);
        lharga.setBounds(10, 70, 80, 20);
        add(tfharga);
        tfharga.setBounds(90, 70, 80, 20);
        
        add(btnSubmit);
        btnSubmit.setBounds(10, 100, 80, 20);
        
        add(btnReset);
        btnReset.setBounds(90, 100, 80, 20);
        
        add(btnKembali);
        btnKembali.setBounds(10, 130, 160, 20);
    }
    
    
    
}

