/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class inputbarang_controller {
    
    viewinput_barang viewinputbarang;
    model_barang modelbarang;

    public inputbarang_controller(viewinput_barang viewinputbarang, model_barang modelbarang) {
        this.viewinputbarang = viewinputbarang;
        this.modelbarang = modelbarang;
        
        viewinputbarang.btnKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                viewmain_menu viewmainmenu =new viewmain_menu();
                viewinputbarang.setVisible(false);
                mainmenu_controller Start=new mainmenu_controller(viewmainmenu);
            }
        });
        
        viewinputbarang.btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(viewinputbarang.getTfnama().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Namanya Tidak Boleh Kosong");
                }
                else if(viewinputbarang.getTfharga()==0){
                    JOptionPane.showMessageDialog(null, "Harganya Tidak Boleh Kosong");
                }
                else if(viewinputbarang.getTfmassa()==0){
                    JOptionPane.showMessageDialog(null, "Massanya Tidak Boleh Kosong");
                }
                else if(viewinputbarang.getTfharga()<0){
                    JOptionPane.showMessageDialog(null, "Harganya Harus Positif");
                }
                else if(viewinputbarang.getTfmassa()<0){
                    JOptionPane.showMessageDialog(null, "Massanya Harus Positif");
                }
                else{
                    modelbarang.insertData(viewinputbarang.getTfnama(), viewinputbarang.getTfmassa(), viewinputbarang.getTfharga());
                }
                
            }
        });
        
        viewinputbarang.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                viewinputbarang.tfnama.setText("");
                viewinputbarang.tfmassa.setText("");
                viewinputbarang.tfharga.setText("");
            }
        });
    }
}
