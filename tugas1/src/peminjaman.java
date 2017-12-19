/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alam1415
 */
public class peminjaman {
    public buku dipinjam;
    public mahasiswa anggota;
    public void peminjaman (mahasiswa member, buku book){
    dipinjam=book;
    anggota=member;
    }
    public void datapeminjaman(){
        System.out.println("detail peminjaman buku");
        System.out.println("nim = "+anggota.getNim());
        System.out.println("nama = "+anggota.getNama());
        System.out.println("alamat = "+anggota.getAlamat());
        System.out.println("kodebuku = "+dipinjam.getKode());
        System.out.println("judul buku = "+dipinjam.getJudul());
    
    }
}
