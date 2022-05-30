/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

/**
 *
 * @author LENOVO
 */
public class Responsi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        viewmain_menu vmm=new viewmain_menu ();
        mainmenu_controller mmc=new mainmenu_controller(vmm);
    }
    
}
