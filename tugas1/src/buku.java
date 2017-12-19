/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alam1415
 */
public class buku {
     protected String judulbuku;
    protected int kodebuku;
    
    public void setKode(int kodebuku){
    this.kodebuku=kodebuku;
    }
    public int getKode(){
    return kodebuku;
    }
    public void setjudul(String judulbuku){
    this.judulbuku=judulbuku;
    }
    public String getJudul(){
    return judulbuku;
    }
    
}
