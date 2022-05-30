/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author LENOVO
 */
public class edit_controller {
   
    viewinput_barang vib;
    model_barang mb;
    String id;

    public edit_controller(viewinput_barang vib, model_barang mb, String id) {
        this.vib = vib;
        this.mb = mb;
        this.id = id;
        
        String detailBarang[]=mb.detailBarang(id);                                
            vib.tfnama.setText(detailBarang[1]);
            vib.tfmassa.setText(detailBarang[2]);
            vib.tfharga.setText(detailBarang[3]);
        vib.btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                mb.updateData(id,vib.getTfnama(),vib.getTfmassa(),vib.getTfharga());   
                viewlihat_barang vlb=new viewlihat_barang();
                vib.setVisible(false);
                lihatbarang_controller Start=new lihatbarang_controller(vlb, mb);
            }
        });
    }
    
    
} 

