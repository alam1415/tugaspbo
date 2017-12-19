/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendar;

import java.util.Scanner;
 public class Pertanggalan {
    public static void main (String args []){

        Scanner data = new Scanner(System.in);
        Scanner data2 = new Scanner (System.in);
        Scanner data3 = new Scanner (System.in);
        int tanggal, bulan, tahun, modtahun, maxtanggal;

        System.out.print("Input tahun   = ");
        tahun = data . nextInt ();

        modtahun = tahun%4;
        switch(modtahun){
            case 0 :
                     System.out.print("Input bulan   = ");
                     bulan = data2.nextInt();
                     if((bulan==1)||(bulan==3)||(bulan==5)||(bulan==7)||
                        (bulan==8)||(bulan==10)||(bulan==12)){
                            maxtanggal = 31;    
                     }
                     else if((bulan==4)||(bulan==6)||(bulan==9)||
                         (bulan==11)){
                            maxtanggal = 30;
                     }
                     else{
                            maxtanggal = 29;
                     }
                     break;
            default:
                     System.out.print("Input bulan   = ");
                     bulan = data2.nextInt();
                     if((bulan==1)||(bulan==3)||(bulan==5)||(bulan==7)||
                        (bulan==8)||(bulan==10)||(bulan==12)){
                            maxtanggal = 31;    
                     }
                     else if((bulan==4)||(bulan==6)||(bulan==9)||
                        (bulan==11)){
                            maxtanggal = 30;
                     }
                     else{
                            maxtanggal = 28;
                     }
                     break;
        }

        System.out.print("Input tanggal = ");tanggal = data3.nextInt();
        switch(bulan){
            case 1 :
                     if(tanggal>maxtanggal){
                     System.out.println("Maaf, tanggal tidak sesuai.");
                     }
                     else{
                     System.out.println(tanggal+"-januari-"+tahun);
                     }                        
                     break;
            case 2 :
                     if(tanggal>maxtanggal){
                     System.out.println("Maaf, tanggal tidak sesuai.");
                     }
                     else{
                     System.out.println(tanggal+"-februari-"+tahun);    
                     }                        
                     break;
            case 3 :    
                     if(tanggal>maxtanggal){
                     System.out.println("Maaf tanggal tidak sesuai.");
                     }
                     else{
                     System.out.println(tanggal+"-maret-"+tahun);
                     }                        
                     break;
            case 4 :    
                      if(tanggal>maxtanggal){
                      System.out.println("Maaf, tanggal tidak sesuai.");
                      }
                      else{
                      System.out.println(tanggal+"-april-"+tahun);
                      }                        
                      break;
            case 5 :    
                      if(tanggal>maxtanggal){
                      System.out.println("Maaf, tanggal tidak sesuai.");
                      }
                      else{
                      System.out.println(tanggal+"-mei-"+tahun);
                      }                        
                      break;
            case 6 :    
                      if(tanggal>maxtanggal){
                      System.out.println("Maaf, tanggal tidak sesuai.");
                      }
                      else{
                      System.out.println(tanggal+"-juni-"+tahun);
                      }                        
                      break;
             case 7 :    
                       if(tanggal>maxtanggal){
                       System.out.println("Maaf, tanggal tidak sesuai.");
                       }
                       else{
                       System.out.println(tanggal+"-juli-"+tahun);
                       }                        
                       break;
             case 8 :    
                      if(tanggal>maxtanggal){
                      System.out.println("Maaf, tanggal tidak sesuai.");
                      }
                      else{
                      System.out.println(tanggal+"-agustus-"+tahun);
                      }                        
                      break;
              case 9 :    
                      if(tanggal>maxtanggal){
                      System.out.println("Maaf, tanggal tidak sesuai.");
                      }
                      else{
                      System.out.println(tanggal+"-september-"+tahun);
                      }                        
                      break;
              case 10 :    
                       if(tanggal>maxtanggal){
                       System.out.println("Maaf, tanggal tidak sesuai.");
                       }
                       else{
                       System.out.println(tanggal+"-oktober-"+tahun);
                       }                        
                       break;
              case 11 :    
                       if(tanggal>maxtanggal){
                       System.out.println("Maaf, tanggal tidak sesuai.");
                       }
                       else{
                       System.out.println(tanggal+"-november-"+tahun);
                       }                        
                       break;
               case 12 :    
                       if(tanggal>maxtanggal){
                       System.out.println("Maaf, tanggal tidak sesuai.");
                       }
                       else{
                       System.out.println(tanggal+"-desember-"+tahun);
                       }                        
                       break;        
               default :
                       System.out.println("Maaf bulan yang anda input salah.");
                       break;
        }

    }
 }