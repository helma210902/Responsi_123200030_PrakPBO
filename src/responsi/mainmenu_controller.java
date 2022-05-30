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
public class mainmenu_controller {
    viewmain_menu viewmainmenu;

    public mainmenu_controller(viewmain_menu vmm) {
        this.viewmainmenu = vmm;
        
        viewmainmenu.btnTambah.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                model_barang modelbarang = new model_barang();
                viewinput_barang inputbarang= new viewinput_barang();
                viewmainmenu.setVisible(false);
                inputbarang_controller inputbarangController=new inputbarang_controller(inputbarang,modelbarang);
            }
        });
        
        viewmainmenu.btnLihat.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                model_barang modelbarang = new model_barang();
                viewlihat_barang lihatbarang= new viewlihat_barang();
                viewmainmenu.setVisible(false);
                lihatbarang_controller lihatbarang_controller=new lihatbarang_controller(lihatbarang,modelbarang);
            }
        });
    }
    
    
    
}
