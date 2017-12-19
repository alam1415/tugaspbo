/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passbyyvalue;

/**
 *
 * @author alam1415
 */
public class Passbyyvalue {
    public static void gantinama(String nama) {
        nama = "rizki baru";
        System.out.println("nama dalam method ganti nama adalah ="+nama);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama = "rizki putri";
        System.out.println("nama awal adalah "+nama);
        gantinama(nama);
        System.out.println("nama terakhir setelah perubahan adalah "+nama);
    }
    
}
