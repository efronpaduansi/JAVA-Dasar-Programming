/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javajoptionpane;
import javax.swing.JOptionPane;

/**
 *
 * @author efronpds
 */
public class JavaJOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String inputNama = JOptionPane.showInputDialog("Masukan Nama :");
        String inputAlamat = JOptionPane.showInputDialog("Masukan alamat :");
        
        JOptionPane.showMessageDialog(null, " Nama Anda " + inputNama + "\n Alamat : " + inputAlamat);
        
        
        
    }
    
}
