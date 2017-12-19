/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author alam1415
 */
public class pasien {
    private String nama,alamat;
    private long nmrtlp;
    public void setNama(String nama){
    this.nama=nama;
    }
    public String getNama(){
    return nama;
    }
    public void setAlamat(String alamat){
    this.alamat=alamat;
    }
    public String getAlamat(){
    return alamat;
    }
    public void setNmrtlp(long tlp){
    this.nmrtlp=tlp;
    }
    public long getNmrtlp(){
    return nmrtlp;
    }
}
