/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author LENOVO
 */
public class viewbanyak_barang extends JFrame {
    JLabel lNama = new JLabel("Nama  : ");
    JLabel lMassa = new JLabel("Massa  : ");
    JLabel lHarga = new JLabel("Harga Satuan : ");  
    JLabel ltot = new JLabel("Banyak  : ");      
    
    public JLabel l2Nama = new JLabel();
    public JLabel l2Massa = new JLabel();
    public JLabel l2Harga = new JLabel(); 
    JTextField tftot = new JTextField();
   
    
    JButton btnEdit = new JButton("Edit");   
    JButton btnKembali = new JButton("Kembali");   
    JButton btnHapus = new JButton("Hapus");
    JButton btnTotHarga = new JButton("Total Harga");   

    public viewbanyak_barang() {    
        
        setTitle("Data");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(300,400);       
        
       add(lNama);
        lNama.setBounds(60, 60, 90, 20);
        add(l2Nama);
        l2Nama.setBounds(110, 60, 120, 20);
        
        add(lMassa);
        lMassa.setBounds(60, 100, 90, 20);
        add(l2Massa);
        l2Massa.setBounds(110, 100, 120, 20);
        
        add(lHarga);
        lHarga.setBounds(60, 140, 90, 20);
        add(l2Harga);
        l2Harga.setBounds(150, 140, 120, 20);         
        
        add(ltot);
        ltot.setBounds(60, 180, 90, 20);
        add(tftot);
        tftot.setBounds(120, 180, 120, 20);
        
        add(btnTotHarga);
        btnTotHarga.setBounds(110, 220, 90, 20);
        
        add(btnEdit);
        btnEdit.setBounds(50, 290, 90, 20);
        
        add(btnKembali);
        btnKembali.setBounds(110, 320, 90, 20);
                     
        
        add(btnHapus);
        btnHapus.setBounds(160, 290, 90, 20);
                
    }   

    public JTextField getTftot() {
        return tftot;
    }
    
}

