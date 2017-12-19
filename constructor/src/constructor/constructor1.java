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
public class constructor1 {
    String nama;
    int nim;
    public constructor1(){
    nim = 0;
    nama = "";
    }
    public constructor1 (String m, int n){
    nim = n;
    nama = m;
    }
    public void info (){
        System.out.println("nama = "+this.nama);
        System.out.println("nim = "+this.nim);
    }
    public static void main(String[] args) {
        constructor1 a = new constructor1();
        a.info();
        constructor1 b = new constructor1("alam",111);
        b.info();
    }
    
}
