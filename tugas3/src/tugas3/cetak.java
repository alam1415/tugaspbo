/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author alam1415
 */
public class cetak extends orang {
    void setNama(){
        System.out.println("namanya adalah "+nama);
    }
    void setUmur(){
        System.out.println("umurnya "+umur+" tahun");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cetak x = new cetak();
        x.setNama();
        x.setUmur();

   
    }
    
}
