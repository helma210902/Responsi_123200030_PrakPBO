/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author LENOVO
 */
public class lihatbarang_controller {
  
    viewlihat_barang vlb;
    model_barang mb;

    public lihatbarang_controller(viewlihat_barang vlb, model_barang mb) {
        this.vlb = vlb;
        this.mb = mb;
        if (mb.getBanyakData()!=0) {
            String dataBarang[][] = mb.readBarang();
            vlb.tabel.setModel((new JTable(dataBarang, vlb.namaKolom)).getModel());
        }
        else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
        
        vlb.btnKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                viewmain_menu vmm=new viewmain_menu();
                vlb.setVisible(false);
                mainmenu_controller mmc=new mainmenu_controller(vmm);
            }
        });
        
        vlb.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = vlb.tabel.getSelectedRow();                

                String dataterpilih = vlb.tabel.getValueAt(baris, 0).toString();

                System.out.println(dataterpilih);
                viewbanyak_barang vbb=new viewbanyak_barang();
                vlb.setVisible(false);
                banyakbarang_controller bbc=new banyakbarang_controller(vbb,dataterpilih,mb);
                
                                                                            
            }
        }
        );
    }
    
}

