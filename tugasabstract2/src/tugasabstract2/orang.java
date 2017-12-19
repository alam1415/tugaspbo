/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasabstract2;

/**
 *
 * @author alam1415
 */
public class orang {
        String nama = "alam", nama2 = "saya";
    
    int umur= 20, umur2 = 30;
    
}
class pegawai extends orang{
    double gaji = 20.0000;
    int nip = 1001;
void naikGaji(){
    System.out.println("gaji anda naik 10%");
}
void slipGaji(){
    System.out.println("nip ="+nip);
    System.out.println("nama = "+nama2);
    System.out.println("umur = "+umur2);
    System.out.println("gaji sekarang = "+gaji);
    naikGaji();
}
}
class mahasiswa extends orang{
    long nim = 3130016014l;
    int masaStudi = 7;
    double ip = 3.50;
    void cetakIP(){
        System.out.println("nim = "+nim);
        System.out.println("nama = "+nama);
        System.out.println("umur = "+umur);
        System.out.println("masa studi = "+masaStudi);
        System.out.println("total IP = "+ip);
    }

}
