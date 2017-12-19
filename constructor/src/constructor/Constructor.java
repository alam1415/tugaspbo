/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author alam1415
 */
public class Constructor {
    private int nim;
    private String nama;
    public Constructor(String m, int n){
    this.nim = n;
    this.nama = m;
    }
    public void info(){
        System.out.println("nama = "+this.nama);
        System.out.println("nim = "+this.nim);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Constructor input = new Constructor("alam",1111);
        input.info();
    }
    
}
