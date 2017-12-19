/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alam1415
 */
public class runbook {
     public static void main(String[] args) {
    buku input = new buku();
    mahasiswa input2 = new mahasiswa();
    peminjaman input3 = new peminjaman();
    
    input2.setNim(1101);
    input2.setNama("alam");
    input2.setAlamat("sidoarjo");
    input.setKode(11102);
    input.setjudul("tidak ada hari");
    input3.peminjaman(input2, input);
    input3.datapeminjaman();

}
}
